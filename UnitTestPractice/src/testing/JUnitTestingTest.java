package testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class JUnitTestingTest {

	@Test
	void test() {
		JUnitTesting testObject = new JUnitTesting();
		
		//Square Method Testing
		assertEquals(25, testObject.square(5));
		assertEquals(0, testObject.square(0));
		assertEquals(16, testObject.square(-4));
		assertEquals(9, testObject.square(3));
		assertEquals(1, testObject.square(1));
		
		//add Method Testing
		assertEquals(12, testObject.add(5,7));
		assertEquals(-2, testObject.add(5,-7));
		assertEquals(-12, testObject.add(-5,-7));
		assertEquals(0, testObject.add(0,0));
		assertEquals(40, testObject.add(34,6));
		
		//count method Testing
		assertEquals(2, testObject.count("Hello", 'l'));
		assertEquals(3, testObject.count("Hello World", 'l'));
	}

}
