/*
 * This file was automatically generated by EvoSuite
 * Mon May 02 11:06:46 GMT 2022
 */


import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Solution_267_ESTest extends Solution_267_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Solution_267 solution_267_0 = new Solution_267();
      int int0 = solution_267_0.minDistance("", "QUK]UDJ's!E");
      assertEquals(11, int0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Solution_267 solution_267_0 = new Solution_267();
      // Undeclared exception!
      try { 
        solution_267_0.minDistance("QUK]UDJ's!E", (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("Solution_267", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Solution_267 solution_267_0 = new Solution_267();
      int int0 = solution_267_0.minDistance("yDKYYu~t)/'L", "yDKYYu~t)/'L");
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Solution_267 solution_267_0 = new Solution_267();
      int int0 = solution_267_0.minDistance("yDKYYu~t)/'L", "f ^+#");
      assertEquals(12, int0);
  }
}