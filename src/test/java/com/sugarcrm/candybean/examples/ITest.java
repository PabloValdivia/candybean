package com.sugarcrm.candybean.examples;

import org.junit.After;
import org.junit.Before;

public interface ITest {
	
	@Before
	public void setUp() throws Exception;
	
	@After
	public void tearDown() throws Exception;

}
