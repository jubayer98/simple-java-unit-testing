package junitTesting;

import static org.junit.Assert.*;

import org.junit.Test;

public class countXTest {

	@Test
	public void test() {
		testing Jtest = new testing();
		int output = Jtest.countX("Xoom");
		assertEquals(1 , output);
	}
}
