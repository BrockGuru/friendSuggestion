package com.friendsuggestion.dto;

import java.io.Serializable;

public class SuggestionResponseDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	private String username;
	private String fullName;
	private String male;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getMale() {
		return male;
	}

	public void setMale(String male) {
		this.male = male;
	}

}
