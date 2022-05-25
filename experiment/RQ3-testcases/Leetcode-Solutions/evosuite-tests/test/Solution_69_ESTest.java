/*
 * This file was automatically generated by EvoSuite
 * Mon May 02 11:00:16 GMT 2022
 */


import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Solution_69_ESTest extends Solution_69_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Solution_69 solution_69_0 = new Solution_69();
      int int0 = solution_69_0.minInsertions("");
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Solution_69 solution_69_0 = new Solution_69();
      // Undeclared exception!
      try { 
        solution_69_0.minInsertions((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("Solution_69", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Solution_69 solution_69_0 = new Solution_69();
      int int0 = solution_69_0.minInsertions("+c)8DBrNr{>(\";q%>(");
      assertEquals(30, int0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Solution_69 solution_69_0 = new Solution_69();
      int int0 = solution_69_0.minInsertions("Ho{UyNZO!vFZ=N");
      assertEquals(28, int0);
  }
}
