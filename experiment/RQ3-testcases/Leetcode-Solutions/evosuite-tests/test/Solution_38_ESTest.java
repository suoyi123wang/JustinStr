/*
 * This file was automatically generated by EvoSuite
 * Mon May 02 09:51:09 GMT 2022
 */


import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Solution_38_ESTest extends Solution_38_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Solution_38 solution_38_0 = new Solution_38();
      // Undeclared exception!
      try { 
        solution_38_0.firstUniqChar((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("Solution_38", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Solution_38 solution_38_0 = new Solution_38();
      char char0 = solution_38_0.firstUniqChar("Gq5s_`qG9:");
      assertEquals('5', char0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Solution_38 solution_38_0 = new Solution_38();
      char char0 = solution_38_0.firstUniqChar("y}q");
      assertEquals('y', char0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Solution_38 solution_38_0 = new Solution_38();
      char char0 = solution_38_0.firstUniqChar("");
      assertEquals(' ', char0);
  }
}
