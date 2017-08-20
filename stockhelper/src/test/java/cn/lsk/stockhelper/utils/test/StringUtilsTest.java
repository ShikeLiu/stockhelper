package cn.lsk.stockhelper.utils.test;

import org.junit.Test;

import cn.lsk.stockhelper.utils.HttpUtils;
import cn.lsk.stockhelper.utils.StringUtils;

public class StringUtilsTest {
//	@Test
//	public void countTest(){
//		String s = "http://q.stock.sohu.com/hisHq?code=cn_300667,code=cn_601766,cn_000002&start=20170621&end=20170621";
//		String a = HttpUtils.httpRequestToString(s, "GET");
//		System.out.println(a);
//		System.out.println(a.substring(0, 26));
//		System.out.println(StringUtils.count(a, "hq"));
//	}
	
	@Test
	public void splitToSingleStockTest(){
		String s = "http://q.stock.sohu.com/hisHq?code=cn_300667,code=cn_601766,cn_000002&start=20170619&end=20170621";
		String a = HttpUtils.httpRequestToString(s, "GET");
		System.out.println(StringUtils.splitToSingleStock(a).get(1));
	}
	@Test
	public void stringToSingleDayTest(){
		String s = "http://q.stock.sohu.com/hisHq?code=cn_300667,code=cn_601766,cn_000002&start=20170619&end=20170621";
		String a = HttpUtils.httpRequestToString(s, "GET");
		System.out.println(StringUtils.stringToSingleDay(StringUtils.splitToSingleStock(a).get(0)).get(0));
		System.out.println(StringUtils.stringToSingleDay(StringUtils.splitToSingleStock(a).get(0)).get(1));
		System.out.println(StringUtils.stringToSingleDay(StringUtils.splitToSingleStock(a).get(0)).get(2));
		System.out.println(StringUtils.stringToSingleDay(StringUtils.splitToSingleStock(a).get(0)).size());

	}
	@Test
	public void stringToSingleDayTest1(){
		String s = "http://q.stock.sohu.com/hisHq?code=cn_300667,code=cn_601766,cn_000002&start=20170619&end=20170621";
		String a = HttpUtils.httpRequestToString(s, "GET");
//		System.out.println(StringUtils.sohuHisString(StringUtils.stringToSingleDay(StringUtils.splitToSingleStock(a).get(0)).get(0)).toString());
//		System.out.println(StringUtils.sohuHisSingleDay(StringUtils.stringToSingleDay(StringUtils.splitToSingleStock(a).get(0)).get(0)).get(0));
//		System.out.println(StringUtils.sohuHisSingleDay(StringUtils.stringToSingleDay(StringUtils.splitToSingleStock(a).get(0)).get(0)).get(1));
//		System.out.println(StringUtils.sohuHisSingleDay(StringUtils.stringToSingleDay(StringUtils.splitToSingleStock(a).get(0)).get(0)).get(2));
//		System.out.println(StringUtils.sohuHisSingleDay(StringUtils.stringToSingleDay(StringUtils.splitToSingleStock(a).get(0)).get(0)).get(3));
//		System.out.println(StringUtils.sohuHisSingleDay(StringUtils.stringToSingleDay(StringUtils.splitToSingleStock(a).get(0)).get(0)).siz());

	}


}
