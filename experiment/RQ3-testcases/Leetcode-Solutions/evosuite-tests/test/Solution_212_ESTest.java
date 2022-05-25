/*
 * This file was automatically generated by EvoSuite
 * Mon May 02 09:15:35 GMT 2022
 */


import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Solution_212_ESTest extends Solution_212_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Solution_212 solution_212_0 = new Solution_212();
      int int0 = solution_212_0.strongPasswordChecker("");
      assertEquals(6, int0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Solution_212 solution_212_0 = new Solution_212();
      int int0 = solution_212_0.strongPasswordChecker(")D!+KX");
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Solution_212 solution_212_0 = new Solution_212();
      int int0 = solution_212_0.strongPasswordChecker("UGpw_");
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Solution_212 solution_212_0 = new Solution_212();
      // Undeclared exception!
      try { 
        solution_212_0.strongPasswordChecker((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("Solution_212", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Solution_212 solution_212_0 = new Solution_212();
      int int0 = solution_212_0.strongPasswordChecker("6p");
      assertEquals(4, int0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Solution_212 solution_212_0 = new Solution_212();
      int int0 = solution_212_0.strongPasswordChecker("9o<TRD=gFJ-MSwbSSKa");
      assertEquals(0, int0);
  }
}
