package jun23NG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class classtest {
  @Test
  public void f() {
	  System.out.println("cons class");
  }
  @BeforeClass
  public void beforeClass() {
	  System.out.println("bef class");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("aft class");
  }

}
