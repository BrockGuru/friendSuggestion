package com.trademanagement;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.friendsuggestion.TradeManagementApplication;

@SpringBootTest(classes = TradeManagementApplication.class)
class LeaveApplicationTests {

	String expect="good";
	@Test
	void contextLoads() {
		assertEquals("good",expect);
	}

}
