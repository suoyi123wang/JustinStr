/*
 * This file was automatically generated by EvoSuite
 * Mon May 02 11:21:53 GMT 2022
 */


import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Solution_261_ESTest extends Solution_261_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Solution_261 solution_261_0 = new Solution_261();
      int int0 = solution_261_0.numDistinct("B0)61JH-Co<_WZn<GS&", "`M");
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Solution_261 solution_261_0 = new Solution_261();
      int int0 = solution_261_0.numDistinct("IX9XhwI}8A*Y#zrFs", "");
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Solution_261 solution_261_0 = new Solution_261();
      // Undeclared exception!
      try { 
        solution_261_0.numDistinct("", (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("Solution_261", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Solution_261 solution_261_0 = new Solution_261();
      int int0 = solution_261_0.numDistinct("ync$<9`#Qe`<Q", "ync$<9`#Qe`<Q");
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Solution_261 solution_261_0 = new Solution_261();
      int int0 = solution_261_0.numDistinct("", "iCz_=OW6|+]NbOG,&");
      assertEquals(0, int0);
  }
}
