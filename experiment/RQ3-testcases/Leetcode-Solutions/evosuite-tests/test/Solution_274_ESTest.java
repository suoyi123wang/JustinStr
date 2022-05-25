/*
 * This file was automatically generated by EvoSuite
 * Mon May 02 11:41:12 GMT 2022
 */


import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Solution_274_ESTest extends Solution_274_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Solution_274 solution_274_0 = new Solution_274();
      boolean boolean0 = solution_274_0.isMatch("\"ggb6<TNyk-h8w4q", "'");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Solution_274 solution_274_0 = new Solution_274();
      // Undeclared exception!
      try { 
        solution_274_0.isMatch((String) null, "*{%X5&[?]v@");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("Solution_274", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Solution_274 solution_274_0 = new Solution_274();
      boolean boolean0 = solution_274_0.isMatch("(W!BR`}Ke$uP(X&oJ\"", "*{%X5&[?]v@");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Solution_274 solution_274_0 = new Solution_274();
      boolean boolean0 = solution_274_0.isMatch("**Wui_", "**Wui_");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Solution_274 solution_274_0 = new Solution_274();
      boolean boolean0 = solution_274_0.isMatch("[HE|{,GS|22y", "");
      assertFalse(boolean0);
  }
}