package cn.tjuscs.st;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class TestLab1 {

	Lab1 lab;
	
	@Before
	public void setUp(){
		lab = new Lab1();
	}
	
	@Test
	public void test(){
		
		assertEquals(true, lab.sum(100));
		
	}
	
}
