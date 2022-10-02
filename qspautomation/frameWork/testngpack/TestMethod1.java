package testngpack;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestMethod1 {
	
	//PARALLERL EXECUTION
  @Test
  public void method1()
  {
	  Reporter.log("method1 "+Thread.currentThread().getId(),true);
  }
  
  @Test
  public void method2()
  {
	  Reporter.log("method2 "+Thread.currentThread().getId(),true);
  }
}