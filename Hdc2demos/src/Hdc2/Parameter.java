package Hdc2;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameter {
  @Parameters ({"tester", "locations"})
  @Test
  public void primemembership(String tester, String locations) {
	  System.out.println("code for prime");
	  System.out.println("executed by, "+tester);
	  System.out.println("executed by ," +locations);
	  }
	@Test
	public void renewal() {
		System.out.println("code for renewal");
	}
	@Parameters({"tester", "locations"})
	@Test
	public void termination(String tester, String locations) {
		System.out.println("code for termination");
		System.out.println("executed by, "+tester);
		System.out.println("executed by ," +locations);
	
}
}

