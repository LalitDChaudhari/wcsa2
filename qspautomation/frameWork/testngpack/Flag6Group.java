package testngpack;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag6Group {
  @Test(groups = "FUNCTIONAL")
  public void ft1()
  {
	  Reporter.log("Functional test case 1",true);
  }
  
  @Test(groups = "INTEGRATION")
  public void It1()
  {
	  Reporter.log("Integration test case 1",true);
  }
  
  @Test(groups = "SMOKE")
  public void St1()
  {
	  Reporter.log("Smoke test case 1",true);
  }
  
  //----------------------------------------------------------------------------------------//
  
  @Test(groups = "FUNCTIONAL")
  public void ft2()
  {
	  Reporter.log("Functional test case 2",true);
  }
  
  @Test(groups = "INTEGRATION")
  public void It2()
  {
	  Reporter.log("Integration test case 2",true);
  }
  
  @Test(groups = "SMOKE")
  public void St2()
  {
	  Reporter.log("Smoke test case 2",true);
  }
  
  //----------------------------------------------------------------------------------------//

  @Test(groups = "FUNCTIONAL")
  public void ft3()
  {
	  Reporter.log("Functional test case 3",true);
  }
  
  @Test(groups = "INTEGRATION")
  public void It3()
  {
	  Reporter.log("Integration test case 3",true);
  }
  
  @Test(groups = "SMOKE")
  public void St3()
  {
	  Reporter.log("Smoke test case 3",true);
  }
  
  //----------------------------------------------------------------------------------------//
  @Test(groups = "FUNCTIONAL")
  public void ft4()
  {
	  Reporter.log("Functional test case 4",true);
  }
  
  @Test(groups = "INTEGRATION")
  public void It4()
  {
	  Reporter.log("Integration test case 4",true);
  }
  
  @Test(groups = "SMOKE")
  public void St4()
  {
	  Reporter.log("Smoke test case 4",true);
  }
  
  //----------------------------------------------------------------------------------------//
  @Test(groups = "FUNCTIONAL")
  public void ft5()
  {
	  Reporter.log("Functional test case 5",true);
  }
  
  @Test(groups = "INTEGRATION")
  public void It5()
  {
	  Reporter.log("Integration test case 5",true);
  }
  
  @Test(groups = "SMOKE")
  public void St5()
  {
	  Reporter.log("Smoke test case 5",true);
  }
  
  //----------------------------------------------------------------------------------------//
  @Test(groups = "FUNCTIONAL")
  public void ft6()
  {
	  Reporter.log("Functional test case 6",true);
  }
  
  @Test(groups = "INTEGRATION")
  public void It6()
  {
	  Reporter.log("Integration test case 6",true);
  }
  
  @Test(groups = "SMOKE")
  public void St6()
  {
	  Reporter.log("Smoke test case 6",true);
  }
  
  //----------------------------------------------------------------------------------------//

}
