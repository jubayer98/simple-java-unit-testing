package junitTesting;

import static org.junit.Assert.*;

import org.junit.Test;

public class additionTest {

	@Test
	public void test() {
		testing Jtest = new testing();
		int output = Jtest.addition(5, 6);
		assertEquals(11, output);
	}
}
