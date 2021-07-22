package jun24NG;

import org.testng.annotations.Test;

public class priority {
  @Test(priority=4)
  public void arrie() {
	  System.out.println("arr");
  }
  
  @Test(priority=2)
  public void cirie() {
	  System.out.println("cir");
  }
  
  @Test(priority=3)
  public void illieo() {
	  System.out.println("il");
  }
  
  @Test(priority=1)
  public void yikkie() {
	  System.out.println("yik");
  }
}
