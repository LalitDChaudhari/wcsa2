package takesScreenShotDynamically;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
@Listeners(CustomListner.class)
public class TestFlipkart1test extends BaseTest {
 
  @BeforeMethod
  public void setUp()
  {
	  initialization();
	  
  }
  
  
  
  @Test
  public void TestFlipkart1() 
  {
	 Assert.fail(); 
  }
  
  @Test
  public void TestFlipkart2() 
  {
	 Assert.fail(); 
  }
  
  @Test
  public void TestFlipkart3() 
  {
	 Assert.fail(); 
  }
  
  @Test
  public void TestFlipkart4() 
  {
	 Assert.fail(); 
  }
  
  @Test
  public void TestFlipkart5() 
  {
	 Assert.fail(); 
  }
  @Test
  public void TestFlipkart6() 
  {
	 Assert.fail(); 
  }

  @AfterMethod
  public void tearDown() 
  {
	  driver.close();
  }

}