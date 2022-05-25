/*
 * This file was automatically generated by EvoSuite
 * Mon May 02 09:55:26 GMT 2022
 */


import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Solution_45_ESTest extends Solution_45_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Solution_45 solution_45_0 = new Solution_45();
      // Undeclared exception!
      try { 
        solution_45_0.compressString((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("Solution_45", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Solution_45 solution_45_0 = new Solution_45();
      String string0 = solution_45_0.compressString("ooo");
      assertEquals("o3", string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Solution_45 solution_45_0 = new Solution_45();
      String string0 = solution_45_0.compressString("GBQ{BLEX&");
      assertEquals("GBQ{BLEX&", string0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Solution_45 solution_45_0 = new Solution_45();
      String string0 = solution_45_0.compressString("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Solution_45 solution_45_0 = new Solution_45();
      String string0 = solution_45_0.compressString("oo");
      assertEquals("oo", string0);
  }
}