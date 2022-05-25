/*
 * This file was automatically generated by EvoSuite
 * Mon May 02 09:43:38 GMT 2022
 */


import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Solution_100_ESTest extends Solution_100_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Solution_100 solution_100_0 = new Solution_100();
      // Undeclared exception!
      try { 
        solution_100_0.maxNumberOfBalloons((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("Solution_100", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Solution_100 solution_100_0 = new Solution_100();
      int int0 = solution_100_0.maxNumberOfBalloons("Solution_100");
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Solution_100 solution_100_0 = new Solution_100();
      int int0 = solution_100_0.maxNumberOfBalloons("Q`bP#a}");
      assertEquals(0, int0);
  }
}