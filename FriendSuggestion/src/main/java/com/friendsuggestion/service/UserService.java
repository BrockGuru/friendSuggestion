package com.friendsuggestion.service;

import com.friendsuggestion.dto.FriendRequestDTO;
import com.friendsuggestion.dto.FriendResponseDTO;
import com.friendsuggestion.dto.UserRequestDTO;
import com.friendsuggestion.dto.UserResponseDTO;
import com.friendsuggestion.exception.FriendNotFoundException;
import com.friendsuggestion.exception.UserNotFoundException;

public interface UserService {
	public UserResponseDTO addUser(UserRequestDTO userRequestDTO);
	public FriendResponseDTO addFriend(FriendRequestDTO friendRequestDTO) throws UserNotFoundException, FriendNotFoundException;

}
