package cn.lsk.stockhelper.utils.test;

import org.junit.Test;

import cn.lsk.stockhelper.utils.HttpUtils;


public class HttpUtilTest {
	
	@Test
	public void httpToStringTest(){
		String s = "http://hq.sinajs.cn/list=sh601006,sz000002";
		System.out.println(HttpUtils.httpRequestToString(s, "GET"));
	}	
	
	@Test
	public void httpToJSONTest(){
		String s = "http://q.stock.sohu.com/hisHq?code=cn_601766,cn_000002&start=20170621&end=20170621";
		System.out.println(HttpUtils.httpRequestToString(s, "GET"));
	}
	@Test
	public void httpToJSOTest2(){
		String s = "http://q.stock.sohu.com/hisHq?code=cn_300667,code=cn_300398,cn_000002&start=20170622&end=20170622";
		System.out.println(HttpUtils.httpRequestToString(s, "GET"));
	}
}
