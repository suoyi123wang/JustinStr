/*
 * This file was automatically generated by EvoSuite
 * Mon May 02 09:27:32 GMT 2022
 */


import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Solution_290_ESTest extends Solution_290_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Solution_290 solution_290_0 = new Solution_290();
      int int0 = solution_290_0.lengthOfLongestSubstring("");
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Solution_290 solution_290_0 = new Solution_290();
      // Undeclared exception!
      try { 
        solution_290_0.lengthOfLongestSubstring((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("Solution_290", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Solution_290 solution_290_0 = new Solution_290();
      int int0 = solution_290_0.lengthOfLongestSubstring("#I!!mhGIh(K!gbc");
      assertEquals(9, int0);
  }
}
