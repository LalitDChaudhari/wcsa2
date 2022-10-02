package testngpack;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Sumo {
  @Test
  public void method1()
  {
	  Reporter.log("method1 executed",true);
  }
}
