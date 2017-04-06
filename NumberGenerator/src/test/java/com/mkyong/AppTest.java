package com.mkyong;

import org.junit.Test;

import junit.framework.Assert;


public class AppTest {
	@Test
	public void testLengthOfTheUniqueKey() {

		App obj = new App();
		Assert.assertEquals(36, obj.generateUniqueKey().length());
	}

}
