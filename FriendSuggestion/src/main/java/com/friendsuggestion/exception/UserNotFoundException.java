package com.friendsuggestion.exception;

public class UserNotFoundException extends Exception {
private static final long serialVersionUID = 1L;
public static final long STATUS_CODE=5000;

public UserNotFoundException(String username) {
	super("No such user found :"+username);
	
}

public static long getStatusCode() {
	return STATUS_CODE;
}


}
