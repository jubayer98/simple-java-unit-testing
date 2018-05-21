package junitTesting;

import static org.junit.Assert.*;

import org.junit.Test;

public class multiplicationTest {

	@Test
	public void test() {
		testing Jtest = new testing();
		double output = Jtest.multiplication(5, 6);
		assertEquals(31, output, 0);
	}

}
