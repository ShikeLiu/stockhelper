package cn.lsk.stockhelper.domain.dto;

public class SohuHisDTO {
	private String code;   //股票代码
	private String date;   //日期
	private String oPrice;  //开盘价
	private String cPrice;   //收盘价
	private String changePrice;   //价格变换量
	private String changePercent;  //涨跌比
	private String lPrice;    //最低价
	private String hPrice;    //最高价
	private String totalRoundlot;   //总手 单位手
	private String turnover;   //成交量 单位万
	private String turnoverRate; //换手率 
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getoPrice() {
		return oPrice;
	}
	public void setoPrice(String oPrice) {
		this.oPrice = oPrice;
	}
	public String getcPrice() {
		return cPrice;
	}
	public void setcPrice(String cPrice) {
		this.cPrice = cPrice;
	}
	public String getChangePrice() {
		return changePrice;
	}
	public void setChangePrice(String changePrice) {
		this.changePrice = changePrice;
	}
	public String getChangePercent() {
		return changePercent;
	}
	public void setChangePercent(String changePercent) {
		this.changePercent = changePercent;
	}
	public String getlPrice() {
		return lPrice;
	}
	public void setlPrice(String lPrice) {
		this.lPrice = lPrice;
	}
	public String gethPrice() {
		return hPrice;
	}
	public void sethPrice(String hPrice) {
		this.hPrice = hPrice;
	}
	public String getTotalRoundlot() {
		return totalRoundlot;
	}
	public void setTotalRoundlot(String totalRoundlot) {
		this.totalRoundlot = totalRoundlot;
	}
	public String getTurnover() {
		return turnover;
	}
	public void setTurnover(String turnover) {
		this.turnover = turnover;
	}
	public String getTurnoverRate() {
		return turnoverRate;
	}
	public void setTurnoverRate(String turnoverRate) {
		this.turnoverRate = turnoverRate;
	}
	@Override
	public String toString() {
		return "SohuHisDTO [code=" + code + ", date=" + date + ", oPrice=" + oPrice + ", cPrice=" + cPrice
				+ ", changePrice=" + changePrice + ", changePercent=" + changePercent + ", lPrice=" + lPrice
				+ ", hPrice=" + hPrice + ", totalRoundlot=" + totalRoundlot + ", turnover=" + turnover
				+ ", turnoverRate=" + turnoverRate + "]";
	}
	
	
	
	
}
