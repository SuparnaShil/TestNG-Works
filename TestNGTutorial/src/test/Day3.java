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
@Test@Parameters ({"NewURL"})
public void loanFinalkk(String urlName)

{
	System.out.println("Hello from final loan day 3");
	System.out.println(urlName);
}
@Test(dependsOnMethods= {"loanFinalww","loanFinall"})
public void loanFinalw()

{
	System.out.println("Hello from final loan day 3   11111");
}

@Parameters ({"URL","pass"})
@Test
public void loanFinalww(String urlName,String password)

	{
		System.out.println("Hello from final2 loan day 3   22222");
		System.out.println(urlName);
		System.out.println(password);
	}
}
