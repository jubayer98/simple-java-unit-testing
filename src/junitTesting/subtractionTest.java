package junitTesting;

import static org.junit.Assert.*;

import org.junit.Test;

public class subtractionTest {

	@Test
	public void test() {
		testing Jtest = new testing();  
		double output = Jtest.subtraction(6.0, 5.5);
		assertEquals(.5, output, 0);
	}

}
