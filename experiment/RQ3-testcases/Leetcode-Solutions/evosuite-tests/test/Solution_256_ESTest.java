/*
 * This file was automatically generated by EvoSuite
 * Mon May 02 10:47:56 GMT 2022
 */


import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Solution_256_ESTest extends Solution_256_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Solution_256 solution_256_0 = new Solution_256();
      int int0 = solution_256_0.minCut("d");
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Solution_256 solution_256_0 = new Solution_256();
      // Undeclared exception!
      try { 
        solution_256_0.minCut((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("Solution_256", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Solution_256 solution_256_0 = new Solution_256();
      // Undeclared exception!
      try { 
        solution_256_0.minCut("");
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("Solution_256", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Solution_256 solution_256_0 = new Solution_256();
      int int0 = solution_256_0.minCut("[P4Q3}qqZ:DLawH\"*");
      assertEquals(15, int0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Solution_256 solution_256_0 = new Solution_256();
      int int0 = solution_256_0.minCut("+kC5fpMr(m&M<tTg#U");
      assertEquals(17, int0);
  }
}