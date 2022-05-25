/*
 * This file was automatically generated by EvoSuite
 * Mon May 02 09:25:17 GMT 2022
 */


import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Solution_172_ESTest extends Solution_172_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Solution_172 solution_172_0 = new Solution_172();
      boolean boolean0 = solution_172_0.checkValidString("*");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Solution_172 solution_172_0 = new Solution_172();
      solution_172_0.checkValidString("18&8LZW{~txv5Uw");
      solution_172_0.checkValidString("18&8LZW{~txv5Uw");
      solution_172_0.checkValidString("18&8LZW{~txv5Uw");
      solution_172_0.checkValidString("18&8LZW{~txv5Uw");
      solution_172_0.checkValidString("F2i($-i0Fnh!K");
      solution_172_0.checkValidString("F2i($-i0Fnh!K");
      solution_172_0.checkValidString("2G7Q+~3tvG9I\"f^8T@S");
      solution_172_0.checkValidString("F2i($-i0Fnh!K");
      solution_172_0.checkValidString("2G7Q+~3tvG9I\"f^8T@S");
      solution_172_0.checkValidString("R&2VmBQKwS!Q(XAR@\"");
      solution_172_0.checkValidString("R&2VmBQKwS!Q(XAR@\"");
      solution_172_0.checkValidString("2G7Q+~3tvG9I\"f^8T@S");
      // Undeclared exception!
      solution_172_0.checkValidString("5<=#z]u%t>OmJ");
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Solution_172 solution_172_0 = new Solution_172();
      // Undeclared exception!
      try { 
        solution_172_0.checkValidString((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("Solution_172", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Solution_172 solution_172_0 = new Solution_172();
      // Undeclared exception!
      try { 
        solution_172_0.checkValidString("");
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("Solution_172", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Solution_172 solution_172_0 = new Solution_172();
      boolean boolean0 = solution_172_0.checkValidString(".mw*bTF5|)(W)n");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Solution_172 solution_172_0 = new Solution_172();
      boolean boolean0 = solution_172_0.checkValidString("XVJI<}$()*Q\"");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Solution_172 solution_172_0 = new Solution_172();
      boolean boolean0 = solution_172_0.checkValidString("/d=P(*4Kr7P4:hwk-3b");
      assertFalse(boolean0);
  }
}
