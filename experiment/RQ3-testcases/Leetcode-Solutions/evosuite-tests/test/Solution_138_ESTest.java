/*
 * This file was automatically generated by EvoSuite
 * Mon May 02 10:43:39 GMT 2022
 */


import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Solution_138_ESTest extends Solution_138_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Solution_138 solution_138_0 = new Solution_138();
      String string0 = solution_138_0.pushDominoes("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Solution_138 solution_138_0 = new Solution_138();
      // Undeclared exception!
      try { 
        solution_138_0.pushDominoes((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("Solution_138", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Solution_138 solution_138_0 = new Solution_138();
      String string0 = solution_138_0.pushDominoes("L5qK<L\f6|w:p<x");
      assertEquals("L5qK<L\f6|w:p<x", string0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Solution_138 solution_138_0 = new Solution_138();
      String string0 = solution_138_0.pushDominoes("?.LgD{ZvGX~");
      assertEquals("?.LgD{ZvGX~", string0);
  }
}
