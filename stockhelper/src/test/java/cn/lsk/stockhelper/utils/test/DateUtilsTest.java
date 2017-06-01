package cn.lsk.stockhelper.utils.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


import org.junit.Test;


import cn.lsk.stockhelper.utils.DateUtils;


public class DateUtilsTest {
	//private static Logger logger = Logger.getLogger(DateUtilsTest.class.getName());
	  
	@Test
	public void DateAddDaysTest(){
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date date = new Date();
		System.out.println(sdf.format(date));
		System.out.println(date.getTime());
		Date date1=DateUtils.dateAddTime(date, 3*24*3600*1000L);	
		System.out.println(sdf.format(date1));
		System.out.println(date1.getTime());		
	}
	
	@Test
	public void DateAddTimeTest1() throws ParseException{
		System.out.println("DateAddDaysTest1----------");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date date = sdf.parse("2017-02-27");
		System.out.println(sdf.format(date));
		System.out.println(date.getTime());
		Date date1=DateUtils.dateAddTime(date, 3*24*3600*1000L);	
		System.out.println(sdf.format(date1));
		System.out.println(date1.getTime());		
	}
	
	@Test
	public void DateAddDaysTest2() throws ParseException{
		System.out.println("DateAddDaysTest2----------");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date date = sdf.parse("2017-02-27");
		System.out.println(sdf.format(date));
		System.out.println(date.getTime());
		Date date1=DateUtils.dateAddTime(date,3);	
		System.out.println(sdf.format(date1));
		System.out.println(date1.getTime());		
	}
	
	@Test
	public void DateMinusDaysTest2() throws ParseException{
		System.out.println("DateAddDaysTest2----------");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date date = sdf.parse("2017-03-01");
		System.out.println(sdf.format(date));
		System.out.println(date.getTime());
		Date date1=DateUtils.dateMinusTime(date,3);	
		System.out.println(sdf.format(date1));
		System.out.println(date1.getTime());		
	}
	@Test
	public void getOnlyDayTest() throws ParseException{
		Date date = new Date();
		Date date1= DateUtils.getOnlyDay(date);
		System.out.println(date1.toString());
	}
	
	@Test
	public void dateMinusDateTest1() throws ParseException{
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date date1 = sdf.parse("2017-02-27");
		System.out.println(DateUtils.dateMinusDate(date, date1));
	}
	@Test
	public void dateMinusDateTest2() throws ParseException{
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date date1 = sdf.parse("2017-05-30");
		System.out.println(DateUtils.dateMinusDate(date1, date));
	}
	@Test
	public void dateMinusDateTest3() throws ParseException{
		Date date = new Date();
		Date date1= DateUtils.getOnlyDay(date);
		System.out.println(date1.toString());
	}
	@Test
	public void dateMinusDateTest4() throws ParseException{
		Date date = new Date();
		Date date1= DateUtils.getOnlyDay(date);
		System.out.println(date1.toString());
	}
	
	

}
