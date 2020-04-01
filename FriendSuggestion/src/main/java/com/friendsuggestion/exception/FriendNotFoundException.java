package com.friendsuggestion.exception;

public class FriendNotFoundException extends Exception {
private static final long serialVersionUID = 1L;
public static final long STATUS_CODE=5001;

public FriendNotFoundException(String username) {
	super("User you are searching is not found :"+username);
	
}

public static long getStatusCode() {
	return STATUS_CODE;
}


}
