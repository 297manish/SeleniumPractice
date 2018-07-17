package retryScenarios;

import org.testng.Assert;
import org.testng.annotations.Test;

public class test {

	@Test
	public void a(){
		System.out.println("a started");
		Assert.assertTrue(true);
		System.out.println("a stopped");
	}
	
	@Test
	public void b(){
		System.out.println("b started");
		Assert.assertTrue(false);
		System.out.println("b stopped");
	}
	
	@Test
	public void c(){
		System.out.println("c started");
		Assert.assertTrue(true);
		System.out.println("c stopped");
	}
	
	@Test
	public void d(){
		System.out.println("d started");
		Assert.assertTrue(false);
		System.out.println("d stopped");
	}
}
