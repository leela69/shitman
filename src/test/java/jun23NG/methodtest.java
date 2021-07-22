package jun23NG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class methodtest {
  @Test
  public void f() {
	  System.out.println("cons meth");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("bef meth");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("aft meth");
  }

}
