package testngpack;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestMethod2 {
	
	//series EXECUTION
  @Test
  public void method1()
  {
	  Reporter.log("method1 ",true);
  }
  
  @Test
  public void method2()
  {
	  Reporter.log("method2 ",true);
  }
}