package cn.lsk.stockhelper.utils;

import java.text.ParseException;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;

import cn.lsk.stockhelper.domain.AverageLine;
import cn.lsk.stockhelper.domain.DayPrice;

public class MovingLineUtils {
	private static Logger logger = Logger.getLogger(MovingLineUtils.class); 
	/**
	 * 创建某一日的均线
	 * @param date  当前日期
	 * @param dayPrices 均线内日期集合
	 * @param days 均线天数
	 * @return 均线值
	 * @throws ParseException 
	 */
	public static Double creatAverageLine(Date date, List<DayPrice> dayPrices, int days) throws ParseException {
		if(dayPrices!=null&&dayPrices.size()>days){
			if (days==0){
				return 0D;
			}else if (days<0) {
				logger.info("-----days不能为负数-----");
				return null;
			}else {
				double totalPrice = 0;
				for(int i=0;  i<=days; i++){
					Date fDate = DateUtils.dateMinusTime(DateUtils.getOnlyDay(date), i);
					int k = ListObjectUtils.getIndexOfListDayPriceDTOFromDate(dayPrices, fDate);
					totalPrice += dayPrices.get(k).getEndPrice();
				}
				return totalPrice/days;
			}
			
		}else{
			logger.info("----价格信息不足，无法计算均线-----");
			return null;
		}
		
	}
	
	/**
	 * 创建某一区间的均线   
	 * @param startDate
	 * @param endDate
	 * @param dayPrices
	 * @param days
	 * @return
	 * @throws ParseException 
	 */
	public Map<Date, Double> createMovingLine(Date startDate, Date endDate, List<DayPrice> dayPrices, int days) throws ParseException{
		int i = DateUtils.dateMinusDate(endDate, startDate)+1;
		Map<Date, Double> map = new HashMap<Date, Double>();
		Double  AM = 0D;
		Date date = DateUtils.getOnlyDay(startDate);
		int changeDay = 0;
		while(i>0){
			date = DateUtils.dateAddTime(date, changeDay);
			AM = creatAverageLine(date, dayPrices, days);
			map.put(date, AM);
		}
		return map;
	}
}
