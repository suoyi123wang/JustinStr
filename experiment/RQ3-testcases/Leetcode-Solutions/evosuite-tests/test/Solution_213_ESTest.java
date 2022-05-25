/*
 * This file was automatically generated by EvoSuite
 * Mon May 02 09:12:21 GMT 2022
 */


import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Solution_213_ESTest extends Solution_213_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Solution_213 solution_213_0 = new Solution_213();
      String string0 = solution_213_0.addStrings("", "");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Solution_213 solution_213_0 = new Solution_213();
      // Undeclared exception!
      try { 
        solution_213_0.addStrings((String) null, (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("Solution_213", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Solution_213 solution_213_0 = new Solution_213();
      String string0 = solution_213_0.addStrings("*c", " jslOInlX0");
      assertEquals("1-0533418391", string0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Solution_213 solution_213_0 = new Solution_213();
      String string0 = solution_213_0.addStrings("Klk1>lG", "Klk1>lG");
      assertEquals("67186046", string0);
  }
}
