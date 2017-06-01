package cn.lsk.stockhelper.domain;

import java.util.Date;
import java.util.List;

public class MovingLine {
	private List<AverageLine> movingLine;
	private Date startDate;
	private Date endDate;
	
	public List<AverageLine> getMovingLine() {
		return movingLine;
	}
	public void setMovingLine(List<AverageLine> movingLine) {
		this.movingLine = movingLine;
	}

	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

}
