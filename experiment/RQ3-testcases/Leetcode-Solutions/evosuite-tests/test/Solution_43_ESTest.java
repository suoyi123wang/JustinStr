/*
 * This file was automatically generated by EvoSuite
 * Mon May 02 09:52:13 GMT 2022
 */


import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Solution_43_ESTest extends Solution_43_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Solution_43 solution_43_0 = new Solution_43();
      String string0 = solution_43_0.replaceSpace("F?+Dw kFn1\"A~j+ U)z");
      assertEquals("F?+Dw%20kFn1\"A~j+%20U)z", string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Solution_43 solution_43_0 = new Solution_43();
      String string0 = solution_43_0.replaceSpace("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Solution_43 solution_43_0 = new Solution_43();
      // Undeclared exception!
      try { 
        solution_43_0.replaceSpace((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("Solution_43", e);
      }
  }
}
