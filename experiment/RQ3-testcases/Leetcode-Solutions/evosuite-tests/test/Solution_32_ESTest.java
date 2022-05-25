/*
 * This file was automatically generated by EvoSuite
 * Mon May 02 09:35:05 GMT 2022
 */


import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Solution_32_ESTest extends Solution_32_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Solution_32 solution_32_0 = new Solution_32();
      int int0 = solution_32_0.strToInt("8WIL)pk_:S~euRzH");
      assertEquals(8, int0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Solution_32 solution_32_0 = new Solution_32();
      int int0 = solution_32_0.strToInt("-8,FZA`G`!<|B57^sm");
      assertEquals((-8), int0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Solution_32 solution_32_0 = new Solution_32();
      // Undeclared exception!
      try { 
        solution_32_0.strToInt((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("Solution_32", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Solution_32 solution_32_0 = new Solution_32();
      int int0 = solution_32_0.strToInt("dxiA9b#wW");
      assertEquals(0, int0);
  }
}