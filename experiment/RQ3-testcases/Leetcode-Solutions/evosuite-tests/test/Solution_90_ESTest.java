/*
 * This file was automatically generated by EvoSuite
 * Mon May 02 11:24:00 GMT 2022
 */


import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Solution_90_ESTest extends Solution_90_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Solution_90 solution_90_0 = new Solution_90();
      boolean boolean0 = solution_90_0.canConstruct("z", 1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Solution_90 solution_90_0 = new Solution_90();
      // Undeclared exception!
      try { 
        solution_90_0.canConstruct((String) null, 900);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Solution_90 solution_90_0 = new Solution_90();
      // Undeclared exception!
      try { 
        solution_90_0.canConstruct("Solution_90", 1);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Solution_90 solution_90_0 = new Solution_90();
      boolean boolean0 = solution_90_0.canConstruct("", 1408);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Solution_90 solution_90_0 = new Solution_90();
      boolean boolean0 = solution_90_0.canConstruct("zqz", 1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Solution_90 solution_90_0 = new Solution_90();
      boolean boolean0 = solution_90_0.canConstruct("zqz", (-629));
      assertFalse(boolean0);
  }
}