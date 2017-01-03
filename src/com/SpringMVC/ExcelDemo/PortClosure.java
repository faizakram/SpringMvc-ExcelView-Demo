package com.SpringMVC.ExcelDemo;

public class PortClosure {
	private String date;
	private String from;
	private String to;
	private String noOfHours;
	private String reason;
	
	public PortClosure(String date, String from, String to, String noOfHours, String reason) {
		super();
		this.date = date;
		this.from = from;
		this.to = to;
		this.noOfHours = noOfHours;
		this.reason = reason;
	}
	@Override
	public String toString() {
		return "Book [date=" + date + ", from=" + from + ", to=" + to + ", noOfHours=" + noOfHours + ", reason="
				+ reason + "]";
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public String getNoOfHours() {
		return noOfHours;
	}
	public void setNoOfHours(String noOfHours) {
		this.noOfHours = noOfHours;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}

	

}