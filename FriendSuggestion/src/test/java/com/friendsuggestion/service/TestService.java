package com.friendsuggestion.service;

import static org.hamcrest.CoreMatchers.nullValue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import com.friendsuggestion.dto.UserRequestDTO;
import com.friendsuggestion.entity.User;
import com.friendsuggestion.repository.UserFriendRepository;
import com.friendsuggestion.repository.UserRepository;
import com.friendsuggestion.service.impl.UserServiceImpl;

@RunWith(MockitoJUnitRunner.class)
public class TestService {
	@Mock
	private UserRepository userRepository;
	@Mock
	private UserFriendRepository userFriendRepository;
	@InjectMocks
	private UserServiceImpl userServiceImpl;
	private User user=null;
	private UserRequestDTO UserRequestDTO=null;
	@Test
	public void setup()
	{
		user=new User();
		user.setUserId(1L);
		user.setUsername("guru");	
		user.setFullName("chandru");
		user.setGender("gender");
		UserRequestDTO=new UserRequestDTO();
		UserRequestDTO.setUsername("guru");
		UserRequestDTO.setFullname("chandru");
		UserRequestDTO.setGender("male");
	}
	@Test
	public void testAdd()
	{
		Mockito.when(userRepository.save(user)).thenReturn(user);
		userServiceImpl.addUser(UserRequestDTO);
		assertEquals(user.getUsername(), UserRequestDTO.getUsername());
		
	}

}
