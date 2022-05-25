/*
 * This file was automatically generated by EvoSuite
 * Mon May 02 08:43:42 GMT 2022
 */


import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Solution_289_ESTest extends Solution_289_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Solution_289 solution_289_0 = new Solution_289();
      String string0 = solution_289_0.longestPalindrome("9X7A3&;kb;p#<?");
      assertEquals("9", string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Solution_289 solution_289_0 = new Solution_289();
      String string0 = solution_289_0.longestPalindrome("ST");
      assertEquals("S", string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Solution_289 solution_289_0 = new Solution_289();
      // Undeclared exception!
      try { 
        solution_289_0.longestPalindrome((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("Solution_289", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Solution_289 solution_289_0 = new Solution_289();
      String string0 = solution_289_0.longestPalindrome("y{::[}Z;7_NN}@");
      assertEquals("::", string0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Solution_289 solution_289_0 = new Solution_289();
      String string0 = solution_289_0.longestPalindrome("");
      assertEquals("", string0);
  }
}
