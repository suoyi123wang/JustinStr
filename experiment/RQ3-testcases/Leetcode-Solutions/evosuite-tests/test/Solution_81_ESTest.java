/*
 * This file was automatically generated by EvoSuite
 * Mon May 02 11:02:23 GMT 2022
 */


import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Solution_81_ESTest extends Solution_81_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Solution_81 solution_81_0 = new Solution_81();
      int int0 = solution_81_0.maxPower("");
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Solution_81 solution_81_0 = new Solution_81();
      // Undeclared exception!
      try { 
        solution_81_0.maxPower((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("Solution_81", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Solution_81 solution_81_0 = new Solution_81();
      int int0 = solution_81_0.maxPower("om<<*?:s;Xi[j6}I%");
      assertEquals(2, int0);
  }
}
