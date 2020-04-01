package com.friendsuggestion.restcontroller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.friendsuggestion.dto.FriendRequestDTO;
import com.friendsuggestion.dto.FriendResponseDTO;
import com.friendsuggestion.dto.SuggestionResponseDTO;
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
	/*
	 * @GetMapping(value ="/friends") public
	 * ResponseEntity<List<SuggestionResponseDTO>>suggestFriend(@Valid @RequestParam
	 * (name = "username")String username) { List<SuggestionResponseDTO>
	 * response=userService.suggestFriend(username); return new
	 * ResponseEntity<>(response,HttpStatus.OK);
	 * 
	 * }
	 */
	

}
