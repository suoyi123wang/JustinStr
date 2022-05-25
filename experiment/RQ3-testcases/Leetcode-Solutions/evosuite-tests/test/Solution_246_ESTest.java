/*
 * This file was automatically generated by EvoSuite
 * Mon May 02 10:22:08 GMT 2022
 */


import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Solution_246_ESTest extends Solution_246_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Solution_246 solution_246_0 = new Solution_246();
      boolean boolean0 = solution_246_0.isIsomorphic("s`Gc'+ R]&!?Zf7Q{Y1", "$yT\"Z,-|Ojlj.+M4TE");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Solution_246 solution_246_0 = new Solution_246();
      boolean boolean0 = solution_246_0.isIsomorphic("Solution_246", "BQd_Dc}cV{gAs5{q");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Solution_246 solution_246_0 = new Solution_246();
      // Undeclared exception!
      try { 
        solution_246_0.isIsomorphic("P9)8Seuk!KS\"C?mMg", "");
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Solution_246 solution_246_0 = new Solution_246();
      // Undeclared exception!
      try { 
        solution_246_0.isIsomorphic("s`Gc'+ R]&!?Zf7Q{Y1", (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("Solution_246", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Solution_246 solution_246_0 = new Solution_246();
      boolean boolean0 = solution_246_0.isIsomorphic("dGhE^`/L^)ZXw", "BQd_Dc}cV{gAs5{q");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Solution_246 solution_246_0 = new Solution_246();
      boolean boolean0 = solution_246_0.isIsomorphic("Solution_246", "R9h?tS)G@");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Solution_246 solution_246_0 = new Solution_246();
      boolean boolean0 = solution_246_0.isIsomorphic("Solution_246", "Solution_246");
      assertTrue(boolean0);
  }
}
