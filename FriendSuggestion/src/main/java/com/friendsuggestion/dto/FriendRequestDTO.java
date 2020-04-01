package com.friendsuggestion.dto;

import java.io.Serializable;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class FriendRequestDTO implements Serializable{
	private static final long serialVersionUID = 1L;
	@NotNull
	@NotBlank
	private String userName;
	@NotNull
	@NotBlank
	private String friendName;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getFriendName() {
		return friendName;
	}

	public void setFriendName(String friendName) {
		this.friendName = friendName;
	}

}
