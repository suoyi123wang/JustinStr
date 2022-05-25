/*
 * This file was automatically generated by EvoSuite
 * Mon May 02 11:33:14 GMT 2022
 */


import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Solution_89_ESTest extends Solution_89_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Solution_89 solution_89_0 = new Solution_89();
      String string0 = solution_89_0.longestPrefix("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Solution_89 solution_89_0 = new Solution_89();
      String string0 = solution_89_0.longestPrefix("Hsw0>I3~{)M7[");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Solution_89 solution_89_0 = new Solution_89();
      // Undeclared exception!
      try { 
        solution_89_0.longestPrefix((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("Solution_89", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Solution_89 solution_89_0 = new Solution_89();
      String string0 = solution_89_0.longestPrefix("=0.:(>#=");
      assertEquals("=", string0);
  }
}
