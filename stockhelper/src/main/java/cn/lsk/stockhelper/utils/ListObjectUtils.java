package cn.lsk.stockhelper.utils;

import java.text.ParseException;
import java.util.Date;
import java.util.List;

import cn.lsk.stockhelper.domain.DayPrice;


public class ListObjectUtils {
	
	/**
	 * 根据日期获取 list 的index
	 * 
	 *
	 */
	public static Integer getIndexOfListDayPriceDTOFromDate(List<DayPrice> dayPrices , Date date) throws ParseException{
		date = DateUtils.getOnlyDay(date);
		Integer k = null;
		for (int i = dayPrices.size()-1; i >= 0; i--) {
			if(date!=null&&date.equals(DateUtils.getOnlyDay(dayPrices.get(i).getTime()))){
				k = i;
				break;
			}
		}
		return k;	
	}
	
	/**
	 * 根据日期获取 map 的index
	 * 
	 *
	 */
	public static Integer getkeyOfMapDayPriceDTOFromDate(List<DayPrice> dayPrices , Date date) throws ParseException{
		date = DateUtils.getOnlyDay(date);
		Integer k = null;
		for (int i = dayPrices.size()-1; i >= 0; i--) {
			if(date!=null&&date.equals(DateUtils.getOnlyDay(dayPrices.get(i).getTime()))){
				k = i;
				break;
			}
		}
		return k;	
	}
	
	

}
