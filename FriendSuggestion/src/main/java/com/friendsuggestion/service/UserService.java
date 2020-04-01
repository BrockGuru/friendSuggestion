package com.friendsuggestion.service;

import com.friendsuggestion.dto.UserRequestDTO;
import com.friendsuggestion.dto.UserResponseDTO;

public interface UserService {
	public UserResponseDTO addUser(UserRequestDTO userRequestDTO);

}
