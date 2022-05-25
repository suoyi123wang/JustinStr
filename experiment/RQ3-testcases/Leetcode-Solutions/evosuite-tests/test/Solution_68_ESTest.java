/*
 * This file was automatically generated by EvoSuite
 * Mon May 02 11:01:19 GMT 2022
 */


import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Solution_68_ESTest extends Solution_68_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Solution_68 solution_68_0 = new Solution_68();
      // Undeclared exception!
      try { 
        solution_68_0.restoreString("4JChoT@", (int[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("Solution_68", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Solution_68 solution_68_0 = new Solution_68();
      int[] intArray0 = new int[8];
      intArray0[0] = (-867);
      // Undeclared exception!
      try { 
        solution_68_0.restoreString("j5A8P(bw", intArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -867
         //
         verifyException("Solution_68", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Solution_68 solution_68_0 = new Solution_68();
      int[] intArray0 = new int[8];
      String string0 = solution_68_0.restoreString("l6q3", intArray0);
      assertEquals("3\u0000\u0000\u0000", string0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Solution_68 solution_68_0 = new Solution_68();
      int[] intArray0 = new int[4];
      String string0 = solution_68_0.restoreString("", intArray0);
      assertEquals("", string0);
  }
}
