package java_exercise;

import junit.framework.Assert;

import org.junit.Test;

public class CalculateTest {

	@Test
	public void testAdd() {
		Calculate c = new Calculate();
		
		int a=1;
		int b=1;
		int result = c.add(a, b);
		Assert.assertEquals(2, result);
		
		a=1;
		b=2;
		result = c.add(a, b);
		Assert.assertEquals(3, result);
	}

}
