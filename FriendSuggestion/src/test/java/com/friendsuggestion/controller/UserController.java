package com.friendsuggestion.controller;


import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;


import com.friendsuggestion.dto.UserRequestDTO;
import com.friendsuggestion.dto.UserResponseDTO;
import com.friendsuggestion.service.UserService;
import com.friendsuggestion.service.impl.UserServiceImpl;

@RunWith(MockitoJUnitRunner.class)
public class UserController {
	@Mock
	private UserService UserService;
	@InjectMocks
	private UserServiceImpl userServiceImpl;
	private UserRequestDTO UserRequestDTO=null;
	private UserResponseDTO userResponseDTO=null;
	@Before
	public void setup()
	{
		UserRequestDTO=new UserRequestDTO();
		UserRequestDTO.setFullname("guru");
		UserRequestDTO.setGender("male");
		UserRequestDTO.setUsername("chandru");
		userResponseDTO.setMessage("added sucessfully");
	}
	@Test
	public void tesAddUser()
	{
		Mockito.when(UserService.addUser(UserRequestDTO)).thenReturn(userResponseDTO);
		UserResponseDTO response=userServiceImpl.addUser(UserRequestDTO);
		assertEquals(response.getStatusCode(),"added sucessfully" );
	}

}
