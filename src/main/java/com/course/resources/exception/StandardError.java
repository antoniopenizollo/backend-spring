package com.course.resources.exception;

import java.io.Serializable;

public class StandardError implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private Integer status;
	private String msg;
	private Long timeStamLong;
	public StandardError(Integer status, String msg, Long timeStamLong) {
		super();
		this.status = status;
		this.msg = msg;
		this.timeStamLong = timeStamLong;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public Long getTimeStamLong() {
		return timeStamLong;
	}
	public void setTimeStamLong(Long timeStamLong) {
		this.timeStamLong = timeStamLong;
	}
	
	
}
