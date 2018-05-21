package junitTesting;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ additionTest.class, countXTest.class, multiplicationTest.class, squareTest.class,
		subtractionTest.class })
public class AllTests {

}
