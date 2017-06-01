package cn.lsk.stockhelper.utils;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.log4j.Logger;
import org.junit.experimental.theories.Theories;



public class DateUtils {
	private static Logger logger = Logger.getLogger(DateUtils.class);
	/**
	 * 时间加减天数
	 * @param date
	 * @param time
	 * @return
	 */
	public static Date dateAddTime(Date date, long time){		
		long currentTime = date.getTime();
		currentTime += time;
		Date newDate = new Date(currentTime); 
		return newDate;		
	}
	public static Date dateAddTime(Date date, int days){		
		long currentTime = date.getTime();
		long time = days*24*3600*1000L;
		currentTime += time;
		Date newDate = new Date(currentTime); 
		return newDate;		
	}
	
	public static Date dateMinusTime(Date date, long time){		
		long currentTime = date.getTime();
		currentTime -= time;
		Date newDate = new Date(currentTime); 
		return newDate;		
	}
	public static Date dateMinusTime(Date date, int days){		
		long currentTime = date.getTime();
		long time = days*24*3600*1000L;
		currentTime -= time;
		Date newDate = new Date(currentTime); 
		return newDate;		
	}
	/**
	 * 只获取年月日
	 * @param date
	 * @return
	 * @throws ParseException
	 */
	public static Date getOnlyDay(Date date) throws ParseException{
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		date = sdf.parse(sdf.format(date));
		return date;	
	}
	/**
	 * 两个日期相加减,精确到天
	 * @param startDate
	 * @param endDate
	 * @return 精确到天
	 * @throws ParseException 
	 */
	
	public static Integer dateMinusDate(Date startDate, Date endDate) throws ParseException{
		Integer day;
		long startTime = DateUtils.getOnlyDay(startDate).getTime();
		long endTime = DateUtils.getOnlyDay(endDate).getTime();
		logger.info(startTime+"-----"+endTime);
		if(endTime-startTime<0){
			throw new RuntimeException("-----结束时间 在开始时间之前-----");
		}
		else {
			Long minusTime = endTime-startTime;
			day = (int) (minusTime/(24*3600*1000));
			return day;
		}	
	}

}
