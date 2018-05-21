package junitTesting;

import static org.junit.Assert.*;

import org.junit.Test;

public class squareTest {

	@Test
	public void test() {
		testing Jtest = new testing();
		int output = Jtest.square(5);
		assertEquals(20, output);
	}

}
