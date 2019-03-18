package cn.tjuscs.st;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class TestCalculate {

	Calculate cal;
	
	@Before
	public void setUp(){
		cal = new Calculate();
	}
	
	@Test
	public void testAdd(){
		assertEquals(6, cal.add(2, 3));
	}
	
	@Test
	public void testDivide(){
		assertEquals(2,cal.divide(10, 0));
	}
}
