package com.friendsuggestion.dto;

import java.io.Serializable;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class UserRequestDTO implements Serializable{
	private static final long serialVersionUID = 1L;
	@NotNull
	@NotEmpty
	private String username;
	@NotNull
	@NotEmpty
	private String fullname;
	@NotNull
	@NotEmpty
	private String gender;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

}
