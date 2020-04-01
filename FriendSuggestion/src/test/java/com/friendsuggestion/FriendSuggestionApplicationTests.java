package com.friendsuggestion;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.friendsuggestion.FriendSuggestionApplication;

@SpringBootTest(classes = FriendSuggestionApplication.class)
class FriendSuggestionApplicationTests {

	String expect="good";
	@Test
	void contextLoads() {
		assertEquals("good",expect);
	}

}
