/*
 * This file was automatically generated by EvoSuite
 * Mon May 02 11:43:20 GMT 2022
 */


import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Solution_152_ESTest extends Solution_152_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Solution_152 solution_152_0 = new Solution_152();
      boolean boolean0 = solution_152_0.rotateString("", "Solution_152");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Solution_152 solution_152_0 = new Solution_152();
      // Undeclared exception!
      try { 
        solution_152_0.rotateString((String) null, (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("Solution_152", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Solution_152 solution_152_0 = new Solution_152();
      boolean boolean0 = solution_152_0.rotateString("Solution_152", "Solution_152");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Solution_152 solution_152_0 = new Solution_152();
      boolean boolean0 = solution_152_0.rotateString(")^j3fqF*s$e", "");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Solution_152 solution_152_0 = new Solution_152();
      boolean boolean0 = solution_152_0.rotateString("L.wZNP\"xRsv", ")^j3fqF*s$e");
      assertFalse(boolean0);
  }
}