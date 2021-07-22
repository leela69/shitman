package jun24NG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class test {
  @Test
  public void f() {
	  System.out.println("cons");
  }
  
  @Test
  public void f1() {
	  System.out.println("cons1");
  }
  
  @Test
  public void f2() {
	  System.out.println("cons2");
  }
  
  @BeforeTest
  public void beforeTest() {
	  System.out.println("bef test");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("aft test");
  }
  
  @BeforeClass
  public void beforeClass() {
	  System.out.println("before class");
  }
  @AfterClass
  public void afterClass() {
	  System.out.println("after class");
  }
  
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("before meth "); 
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("after meth ");
  }
}
