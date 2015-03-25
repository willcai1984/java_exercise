package java_exercise;

import static org.junit.Assert.*;
import junit.framework.Assert;

import org.junit.Test;

public class HelloWorldTest {

	@Test
	public void testAdd() {
		HelloWorld h = new HelloWorld();
		
		int a=1;
		int b=1;
		int result = h.add(a, b);
		Assert.assertEquals(2, result);
		
		a=1;
		b=2;
		result = h.add(a, b);
		Assert.assertEquals(3, result);
		
		
	}

}
