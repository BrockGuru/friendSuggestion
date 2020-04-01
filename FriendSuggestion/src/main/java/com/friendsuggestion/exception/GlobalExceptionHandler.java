package com.friendsuggestion.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.friendsuggestion.dto.ExceptionResponseDTO;

@ControllerAdvice
public class GlobalExceptionHandler {
	@ExceptionHandler(FriendNotFoundException.class)
	public ResponseEntity<ExceptionResponseDTO>FriendNotFoundException(FriendNotFoundException msg)
	{
		ExceptionResponseDTO exceptionResponseDTO=new ExceptionResponseDTO();
		exceptionResponseDTO.setMessage(msg.getMessage());
		exceptionResponseDTO.setStatuscode(FriendNotFoundException.getStatusCode());
		return new ResponseEntity<>(exceptionResponseDTO,HttpStatus.OK);
		
	}
	@ExceptionHandler(UserNotFoundException.class)
	public ResponseEntity<ExceptionResponseDTO>UserNotFoundException(UserNotFoundException msg)
	{
		ExceptionResponseDTO exceptionResponseDTO=new ExceptionResponseDTO();
		exceptionResponseDTO.setMessage(msg.getMessage());
		exceptionResponseDTO.setStatuscode(FriendNotFoundException.getStatusCode());
		return new ResponseEntity<>(exceptionResponseDTO,HttpStatus.OK);
		
	}

}
