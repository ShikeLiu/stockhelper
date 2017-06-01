package cn.lsk.stockhelper.utils;

import java.text.ParseException;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;

import cn.lsk.stockhelper.domain.AverageLine;
import cn.lsk.stockhelper.domain.dto.DayPriceDTO;

public class MovingLineUtils {
	private static Logger logger = Logger.getLogger(MovingLineUtils.class); 
	/**
	 * 
	 * @param date  当前日期
	 * @param dayPrices 均线内日期集合
	 * @param days 均线天数
	 * @return 均线值
	 */
	public static Double creatAverageLine(Date date, List<DayPriceDTO> dayPrices, int days) {
		Double averageLine;
		Double totalPrice = 0D;
		//找出days对应的i
		int i;
		for ( i = dayPrices.size()-1; i >=0; i--) {
			if(dayPrices.get(i).getTime().equals(date))
			break;
		}
		//价格日期是否小于均线日期
		if(i+1<days){
			logger.info("-----价格日期小于均线日期-------");
			return null;
		}
		else {
			while(days>0){
				days--;
				totalPrice+=dayPrices.get(i).getEndPrice();
				i--;
			}
			averageLine = totalPrice/days;
			return averageLine;
		}
		
	}
	
	/**
	 * 
	 * @param startDate
	 * @param endDate
	 * @param dayPrices
	 * @param days
	 * @return
	 * @throws ParseException 
	 */
	public Map<Date, AverageLine> createMovingLine(Date startDate, Date endDate, List<DayPriceDTO> dayPrices, int days) throws ParseException{
		Map<Date, AverageLine> map = new HashMap<>();
		int i = DateUtils.dateMinusDate(endDate, startDate);
		return map;
		
	}
}
