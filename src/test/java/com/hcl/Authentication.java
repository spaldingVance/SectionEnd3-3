package com.hcl;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.hcl.login.Login;
@SpringBootTest
public class Authentication {

	@Test
	public void testingValidLogin1() throws Exception{
		Login log = new Login();
		assertEquals(true,log.authentication("Mark", "pass"));
	}

	@Test
	public void testingValidLogin2() {
		Login log = new Login();
		assertTrue(log.authentication("Jane", "pass"));
	}

	@Test
	public void testingValidLogin3() {
		Login log = new Login();
		assertTrue(log.authentication("Brad", "pass"));
	}

	@Test
	public void testingInvalidLogin1() {
		Login log = new Login();
		assertFalse(log.authentication("Mark", "1234"));
	}

	@Test
	public void testingInvalidLogin2() {
		Login log = new Login();
		assertFalse(log.authentication("Jane", "1234"));
	}

	@Test
	public void testingInvalidLogin3() {
		Login log = new Login();
		assertFalse(log.authentication("Brad", "1234"));
	}

	@Test
	public void testingInvalidLogin4() {
		Login log = new Login();
		assertFalse(log.authentication("Tim", "qwer"));
	}
	
	@Test
	public void testingInvalidLogin5() {
		Login log = new Login();
		assertFalse(log.authentication("Sally", "pass"));
	}

	@Test
	public void testingInvalidLogin6() {
		Login log = new Login();
		assertFalse(log.authentication("johnny", "4321"));
	}

}