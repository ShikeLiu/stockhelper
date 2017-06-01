package cn.lsk.stockhelper.domain.dto;

import java.util.Date;

public class TimePriceDTO {
	
	private CompanyDTO company;
	private Date day;
	private Double price;
	
	public CompanyDTO getCompany() {
		return company;
	}
	public void setCompany(CompanyDTO company) {
		this.company = company;
	}
	public Date getDay() {
		return day;
	}
	public void setDay(Date day) {
		this.day = day;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}

}
