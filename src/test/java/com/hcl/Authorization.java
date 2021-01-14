package com.hcl;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.hcl.login.Login;

@SpringBootTest
public class Authorization {
	
	@Test
	public void testingAdmin1() {
		 Login log = new Login();
		String uname = "Mark";
		assertEquals(false, log.authorization(uname));
	}
	@Test
	public void testingAdmin2() {
		 Login log = new Login();
		String uname = "Jane";
		assertEquals(true, log.authorization(uname));
	}
	@Test
	public void testingAdmin3() {
		 Login log = new Login();
		String uname = "Brad";
		assertEquals(false, log.authorization(uname));
	}

	@Test
	public void testingNonExistingUser() {
		 Login log = new Login();
		String uname = "Sally";
		assertFalse(log.authorization(uname));
	}

}