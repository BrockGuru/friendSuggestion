package com.friendsuggestion.dto;

public class ExceptionResponseDTO {
	private String message;
	private Long statuscode;
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Long getStatuscode() {
		return statuscode;
	}
	public void setStatuscode(Long statuscode) {
		this.statuscode = statuscode;
	}
	
	

}
