package jun23NG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class meth_cla_test {
  @Test
  public void f() {
	  System.out.println("cons");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("bef meth");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("aft meth");
  }
  @Test
  public void f1() {
	  System.out.println("cons2");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("bef cla");
  }

  @Test
  public void f2() {
	  System.out.println("cons3");
  }
  @AfterClass
  public void afterClass() {
	  System.out.println("aft cla");
  }
}
