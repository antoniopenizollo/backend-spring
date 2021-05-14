package com.course.resources.exception;

import java.io.Serializable;

public class StandardError implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private Long timestamLong;
	private Integer status;
	private String error;
	private String message;
	private String path;
	
	public StandardError(Long timestamLong, Integer status, String error, String message, String path) {
		this.timestamLong = timestamLong;
		this.status = status;
		this.error = error;
		this.message = message;
		this.path = path;
	}
	
	public Long getTimestamLong() {
		return timestamLong;
	}
	
	public void setTimestamLong(Long timestamLong) {
		this.timestamLong = timestamLong;
	}
	
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	
	public String getError() {
		return error;
	}
	public void setError(String error) {
		this.error = error;
	}
	
	public String getMessage() {
		return message;
	}
	
	public void setMessage(String message) {
		this.message = message;
	}
	public String getPath() {
		return path;
	}
	
	public void setPath(String path) {
		this.path = path;
	}
}
