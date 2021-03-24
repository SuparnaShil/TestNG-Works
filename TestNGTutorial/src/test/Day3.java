package test;

import org.testng.annotations.DataProvider;
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

@Test(dataProvider="getData")
public void login(String us, String ps)    //data provider class send data here
	{
	System.out.println(us);
	System.out.println(ps);
	}

@DataProvider
public Object[][] getData()
	{
		//dataset 1st combination  - username password -good credit history
		//dataset 2nd combination - username password -no credit history
		//dataset 3rd combination - fraudline history
	
	
		Object[][] data = new Object[3][2];   //3 combination 2 values for each combination
		
		//1st set
		data[0][0]="Fristname";
		data[0][1]="pass1";
		
		//2nd set
		data[1][0]="Secondname";
		data[1][1]="pass2";
		
		//3rd set
		data[2][0]="Thirdname";
		data[2][1]="pass3";
		
		return data;
	}



















}



