package com.friendsuggestion.dto;

import org.springframework.beans.factory.annotation.Value;

public class UserResponseDTO {
	@Value("${app.usersuccessmessage}")
	private String message;
	@Value("${app.usersuccesscode}")
	private Integer statusCode;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Integer getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(Integer statusCode) {
		this.statusCode = statusCode;
	}

}
