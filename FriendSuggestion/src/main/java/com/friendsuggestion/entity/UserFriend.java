package com.friendsuggestion.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "userFriend")
public class UserFriend {
	@Column(name="userFriend_Id")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long userFriendId;
	@Column(name = "user_Id")
	private Long user_id;
	@Column(name="friend_Id")
	private Long friendId;

	public Long getUserFriendId() {
		return userFriendId;
	}

	public void setUserFriendId(Long userFriendId) {
		this.userFriendId = userFriendId;
	}

	

	public Long getUser_id() {
		return user_id;
	}

	public void setUser_id(Long user_id) {
		this.user_id = user_id;
	}

	public Long getFriendId() {
		return friendId;
	}

	public void setFriendId(Long friendId) {
		this.friendId = friendId;
	}

	

}
