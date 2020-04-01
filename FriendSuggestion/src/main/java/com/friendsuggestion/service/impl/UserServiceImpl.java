package com.friendsuggestion.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.friendsuggestion.constant.Constant;
import com.friendsuggestion.dto.UserRequestDTO;
import com.friendsuggestion.dto.UserResponseDTO;
import com.friendsuggestion.entity.User;
import com.friendsuggestion.repository.UserRepository;
import com.friendsuggestion.service.UserService;
@Service
public class UserServiceImpl implements UserService{
@Autowired
private UserRepository UserRepository;


	@Override
	public UserResponseDTO addUser(UserRequestDTO userRequestDTO) {
		User user=new User();
		user.setUsername(userRequestDTO.getUsername());
		user.setFullName(userRequestDTO.getFullname());
		user.setGender(userRequestDTO.getGender());
		UserRepository.save(user);
		UserResponseDTO responseDTO=new UserResponseDTO();
		responseDTO.setMessage(Constant.SUCCESS_MESSAGE);
		responseDTO.setStatusCode(Constant.SUCCESS_CODE);
		return responseDTO;
	}

}
