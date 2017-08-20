package cn.lsk.stockhelper.utils;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import cn.lsk.stockhelper.domain.dto.SohuHisDTO;

public class StringUtils {
	
	/**
	 * 将调用接口返回的字符串封装为 sohuHisDTO 的List集合
	 * @param s
	 * @return
	 */
	public  static List<SohuHisDTO> sohuHisString (String s){
		SohuHisDTO sohu = null;
		List<SohuHisDTO> l = new ArrayList<>();
		List<String> stockList = new ArrayList<>();
		stockList = StringUtils.splitToSingleStock(s);
		List<String> singleDayStockList = new ArrayList<>();
		for (int i = 0; i < stockList.size(); i++) {
			singleDayStockList = StringUtils.stringToSingleDay(stockList.get(i));
			for (int j = 0; j < singleDayStockList.size(); j++) {
				sohu = StringUtils.stringToSohu(singleDayStockList.get(j));
				l.add(sohu);
			}
		}
		return l;
	}
	
	/**
	 * 将返回的字符串拆分成list集合，其中每个元素就是每个股票
	 * @param srr
	 * @return
	 */
	public static List<String> splitToSingleStock(String s){
		String a = null;
		List<String> b = new ArrayList<>();
 		Pattern p = Pattern.compile("\\{.*?\\}");
		Matcher m = p.matcher(s);
		while(m.find()){
			a=m.group().replaceAll("\\{","").replaceAll("\\}", "");
			b.add(a);
		}
		return b;
	}
	/**
	 * 将每个股票返回的拆分成每天的数据 
	 * @param s list。get[i]
	 * @return
	 */
	public static List<String> stringToSingleDay(String s){
		
		List<String> b = new ArrayList<>();
		String c = null;
	//	String a = s.substring(1, s.length()-1);
		Pattern p = Pattern.compile("\\[.*?\\]");
		Matcher m = p.matcher(s);
		while(m.find()){
			c = m.group().replaceAll("\\[", "").replaceAll("\\]", "")+",\""+s.substring(s.length()-7,s.length()-1)+"\"";
			b.add(c);
		}
		return b;	
	}
	
	/**
	 * 将每个单日单股的字符串值封装到对象中
	 * @param s
	 * @return
	 */
	public static SohuHisDTO stringToSohu(String s){
		List<String> b = new ArrayList<>();
		String c = null;
		Pattern p = Pattern.compile("\".*?\"");
		Matcher m = p.matcher(s);
		while(m.find()){
			c = m.group().replaceAll("\"", "").replaceAll("\"", "");
			b.add(c);
		}
		SohuHisDTO sohu = new SohuHisDTO();
		sohu.setDate(b.get(0));
		sohu.setoPrice(b.get(1));
		sohu.setcPrice(b.get(2));
		sohu.setChangePrice(b.get(3));
		sohu.setChangePercent(b.get(4));
		sohu.setlPrice(b.get(5));
		sohu.sethPrice(b.get(6));
		sohu.setTotalRoundlot(b.get(7));
		sohu.setTurnover(b.get(8));
		sohu.setTurnoverRate(b.get(9));
		sohu.setCode(b.get(10));
		return sohu;	
	}
	
//	public static int count(String a, String b){
//		int alength = a.length();
//		int blength = b.length();
//		int length = alength - a.replaceAll(a, b).length(); 
//		return length/blength;
//		
//	}
//	
//	public static void main(String[] args) {
//		String s = "http://q.stock.sohu.com/hisHq?code=cn_300667&start=20170621&end=20170621";
//		String a = HttpUtils.httpRequestToString(s, "GET");
//		System.out.println(a);
//		System.out.println(a.substring(0, 26));
//		System.out.println(StringUtils.count(a, "hq"));
//	}

}
