package com.friendsuggestion.restcontroller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.friendsuggestion.dto.FriendRequestDTO;
import com.friendsuggestion.dto.FriendResponseDTO;
import com.friendsuggestion.dto.UserRequestDTO;
import com.friendsuggestion.dto.UserResponseDTO;
import com.friendsuggestion.exception.FriendNotFoundException;
import com.friendsuggestion.exception.UserNotFoundException;
import com.friendsuggestion.service.UserService;

@RestController
@RequestMapping("/users")
public class UserRestController {
	@Autowired
	private UserService userService;
	@PostMapping(value ="/user")
	public ResponseEntity<UserResponseDTO>addUser(@Valid @RequestBody UserRequestDTO userRequestDTO)
	{
		UserResponseDTO response=userService.addUser(userRequestDTO);
		return new ResponseEntity<>(response,HttpStatus.OK);
		
	}
	@PostMapping(value ="/friends")
	public ResponseEntity<FriendResponseDTO>addFriend(@Valid @RequestBody FriendRequestDTO friendRequestDTO) throws UserNotFoundException, FriendNotFoundException
	{
		FriendResponseDTO response=userService.addFriend(friendRequestDTO);
		return new ResponseEntity<>(response,HttpStatus.OK);
		
	}
	

}
