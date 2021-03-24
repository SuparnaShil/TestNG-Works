package test;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners implements ITestListener{     //click on ITestListeners java file to get methods

	public void onTestStart(ITestResult result) {
	    // not implemented
	  }
	
	public void onTestSuccess(ITestResult result) {
	    // not implemented
		System.out.println("Listener executed successfully");
	  }
	public void onTestFailure(ITestResult result) {
	    // not implemented
		System.out.println("Listener execution failed" +"  "+ result.getName());
	  }
	
}
 
