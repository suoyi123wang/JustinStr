/*
 * This file was automatically generated by EvoSuite
 * Mon May 02 09:38:19 GMT 2022
 */


import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Solution_31_ESTest extends Solution_31_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Solution_31 solution_31_0 = new Solution_31();
      // Undeclared exception!
      try { 
        solution_31_0.patternMatching((String) null, "lj|RM6l^2`");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("Solution_31", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Solution_31 solution_31_0 = new Solution_31();
      boolean boolean0 = solution_31_0.patternMatching("&aa%s,1", "&aa%s,1");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Solution_31 solution_31_0 = new Solution_31();
      boolean boolean0 = solution_31_0.patternMatching("&aU6aU(%s<xY12", "z}");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Solution_31 solution_31_0 = new Solution_31();
      boolean boolean0 = solution_31_0.patternMatching("&aU6aU(", "( P0=|(+8HgaSU");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Solution_31 solution_31_0 = new Solution_31();
      boolean boolean0 = solution_31_0.patternMatching("Solution_31", "Solution_31");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Solution_31 solution_31_0 = new Solution_31();
      boolean boolean0 = solution_31_0.patternMatching("[EWDd6a(i90F$", "\"h)w\"6dz=C/#(5+/L");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Solution_31 solution_31_0 = new Solution_31();
      boolean boolean0 = solution_31_0.patternMatching("", "Solution_31");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Solution_31 solution_31_0 = new Solution_31();
      boolean boolean0 = solution_31_0.patternMatching("e9NEa'?d>*g4?[vK", "");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      Solution_31 solution_31_0 = new Solution_31();
      boolean boolean0 = solution_31_0.patternMatching("a", "a");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      Solution_31 solution_31_0 = new Solution_31();
      boolean boolean0 = solution_31_0.patternMatching("", "");
      assertTrue(boolean0);
  }
}