package jun24NG;

import org.testng.annotations.Test;

public class dependson {
  @Test
  public void arrie() {
	  System.out.println("arr");
  }
  
  @Test
  public void cirie() {
	  System.out.println("cir");
  }
  
  @Test(dependsOnMethods="cirie")
  public void illieo() {
	  System.out.println("il");
  }
  
  @Test
  public void yikkie() {
	  System.out.println("yik");
  }
}
