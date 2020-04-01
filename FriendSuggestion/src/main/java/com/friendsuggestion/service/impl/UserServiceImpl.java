package com.friendsuggestion.service.impl;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.friendsuggestion.constant.Constant;
import com.friendsuggestion.dto.FriendRequestDTO;
import com.friendsuggestion.dto.FriendResponseDTO;
import com.friendsuggestion.dto.UserRequestDTO;
import com.friendsuggestion.dto.UserResponseDTO;
import com.friendsuggestion.entity.User;
import com.friendsuggestion.entity.UserFriend;
import com.friendsuggestion.exception.FriendNotFoundException;
import com.friendsuggestion.exception.UserNotFoundException;
import com.friendsuggestion.repository.UserFriendRepository;
import com.friendsuggestion.repository.UserRepository;
import com.friendsuggestion.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserRepository UserRepository;
	@Autowired
	private UserFriendRepository userFriendRepository;
	Logger log = LoggerFactory.getLogger(UserServiceImpl.class);

	@Override
	public UserResponseDTO addUser(UserRequestDTO userRequestDTO) {
		User user = new User();
		user.setUsername(userRequestDTO.getUsername());
		user.setFullName(userRequestDTO.getFullname());
		user.setGender(userRequestDTO.getGender());
		UserRepository.save(user);
		log.info("the user added Successfully");
		UserResponseDTO responseDTO = new UserResponseDTO();
		responseDTO.setMessage(Constant.SUCCESS_MESSAGE);
		responseDTO.setStatusCode(Constant.SUCCESS_CODE);
		return responseDTO;
	}

	@Override
	public FriendResponseDTO addFriend(FriendRequestDTO friendRequestDTO)
			throws UserNotFoundException, FriendNotFoundException {
		User user = UserRepository.findByUsername(friendRequestDTO.getUserName());
		if (user == null) {
			log.error("the user is not found");
			throw new UserNotFoundException(friendRequestDTO.getUserName());
		}
		User userFriend = UserRepository.findByUsername(friendRequestDTO.getFriendName());
		if (userFriend == null) {
			log.error("searching friend is not found");
			throw new FriendNotFoundException(friendRequestDTO.getFriendName());
		}
		UserFriend friend = new UserFriend();
		friend.setUser_id(user.getUserId());
		friend.setFriendId(userFriend.getUserId());
		userFriendRepository.save(friend);
		log.info("the friend added Successfully");
		FriendResponseDTO friendResponseDTO = new FriendResponseDTO();
		friendResponseDTO.setMessage(Constant.FRIEND_SUCCESS_MESSAGE);
		friendResponseDTO.setStatusCode(Constant.FRIEND_SUCCESS_CODE);

		return friendResponseDTO;
	}

}
