package cn.lsk.stockhelper.domain;

import java.util.Date;
import java.util.List;

import cn.lsk.stockhelper.domain.dto.DayPriceDTO;

public class AverageLine {
	private Date date;
	private double averageLine;
	
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	

	public double getAverageLine() {
		return averageLine;
	}
	public void setAverageLine(double averageLine) {
		this.averageLine = averageLine;
	}

	

}
