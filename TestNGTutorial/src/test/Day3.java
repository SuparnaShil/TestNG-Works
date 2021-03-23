package test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day3 {
	
	@Test(groups={"smoke"})
	public void loanFinall()

	{
		System.out.println("Hello from final loan day 3 smoke group");
	}
	
@Test
public void loanFinalk()

	{
		System.out.println("Hello from final loan day 3");
	}
@Test
public void loanFinalkk()

{
	System.out.println("Hello from final loan day 3");
}
@Test(dependsOnMethods= {"loanFinalww","loanFinall"})
public void loanFinalw()

{
	System.out.println("Hello from final loan day 3   11111");
}

@Parameters ({"URL"})
@Test
public void loanFinalww(String urlName)

	{
		System.out.println("Hello from final2 loan day 3   22222");
		System.out.println(urlName);
	}
}
