package testngpack;

import org.testng.annotations.Test;
import org.testng.Reporter;
import org.testng.annotations.BeforeTest;

public class Demo {
  @Test
  public void a() {
	  Reporter.log("HI I am from method a",true);
  }
  
}
