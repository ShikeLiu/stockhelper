package cn.lsk.stockhelper.domain.dto;

import java.util.Date;

public class DayPriceDTO {
	
	private CompanyDTO company;
	private Date time;
	private Double beginPrice;
	private Double endPrice;
	private Double hightestPrice;
	private Double lowestPrice;
	//日涨跌幅
	private Double dayPricePercent;
	//成交量
	private Long dayTurnover;
	
	public CompanyDTO getCompany() {
		return company;
	}
	public void setCompany(CompanyDTO company) {
		this.company = company;
	}
	public Date getTime() {
		return time;
	}
	public void setTime(Date time) {
		this.time = time;
	}
	public Double getBeginPrice() {
		return beginPrice;
	}
	public void setBeginPrice(Double beginPrice) {
		this.beginPrice = beginPrice;
	}
	public Double getEndPrice() {
		return endPrice;
	}
	public void setEndPrice(Double endPrice) {
		this.endPrice = endPrice;
	}
	public Double getHightestPrice() {
		return hightestPrice;
	}
	public void setHightestPrice(Double hightestPrice) {
		this.hightestPrice = hightestPrice;
	}
	public Double getLowestPrice() {
		return lowestPrice;
	}
	public void setLowestPrice(Double lowestPrice) {
		this.lowestPrice = lowestPrice;
	}
	public Double getDayPricePercent() {
		return dayPricePercent;
	}
	public void setDayPricePercent(Double dayPricePercent) {
		this.dayPricePercent = dayPricePercent;
	}
	public Long getDayTurnover() {
		return dayTurnover;
	}
	public void setDayTurnover(Long dayTurnover) {
		this.dayTurnover = dayTurnover;
	}
	
}
	
	