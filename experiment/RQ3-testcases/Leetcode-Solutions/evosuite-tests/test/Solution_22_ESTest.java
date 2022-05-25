/*
 * This file was automatically generated by EvoSuite
 * Mon May 02 09:16:39 GMT 2022
 */


import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Solution_22_ESTest extends Solution_22_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Solution_22 solution_22_0 = new Solution_22();
      // Undeclared exception!
      solution_22_0.checkInclusion("usM`WA:", "'HW*lO7.vYFN!");
//      try {
//        solution_22_0.checkInclusion("usM`WA:", "'HW*lO7.vYFN!");
//        fail("Expecting exception: ArrayIndexOutOfBoundsException");
//
//      } catch(ArrayIndexOutOfBoundsException e) {
//         //
//         // -58
//         //
//         verifyException("Solution_22", e);
//      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Solution_22 solution_22_0 = new Solution_22();
      // Undeclared exception!
      solution_22_0.checkInclusion("lcpe'j`w+]U=b h}]k", "lcpe'j`w+]U=b h}]k");
//      try {
//        solution_22_0.checkInclusion("lcpe'j`w+]U=b h}]k", "lcpe'j`w+]U=b h}]k");
//        fail("Expecting exception: ArrayIndexOutOfBoundsException");
//
//      } catch(ArrayIndexOutOfBoundsException e) {
//         //
//         // -58
//         //
//         verifyException("Solution_22", e);
//      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Solution_22 solution_22_0 = new Solution_22();
      // Undeclared exception!
      solution_22_0.checkInclusion((String) null, (String) null);
//      try {
//        solution_22_0.checkInclusion((String) null, (String) null);
//        fail("Expecting exception: NullPointerException");
//
//      } catch(NullPointerException e) {
//         //
//         // no message in exception (getMessage() returned null)
//         //
//         verifyException("Solution_22", e);
//      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Solution_22 solution_22_0 = new Solution_22();
      // Undeclared exception!
      solution_22_0.checkInclusion("m", "znn,RO!d,N");
//      try {
//        solution_22_0.checkInclusion("m", "znn,RO!d,N");
//        fail("Expecting exception: ArrayIndexOutOfBoundsException");
//
//      } catch(ArrayIndexOutOfBoundsException e) {
//         //
//         // -53
//         //
//         verifyException("Solution_22", e);
//      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Solution_22 solution_22_0 = new Solution_22();
      boolean boolean0 = solution_22_0.checkInclusion("t", "m");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Solution_22 solution_22_0 = new Solution_22();
      boolean boolean0 = solution_22_0.checkInclusion("", "");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Solution_22 solution_22_0 = new Solution_22();
      boolean boolean0 = solution_22_0.checkInclusion("XN5y/#$>'b-!\"=4j#^.", "tz-N");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Solution_22 solution_22_0 = new Solution_22();
      boolean boolean0 = solution_22_0.checkInclusion("b", "elb");
      assertTrue(boolean0);
  }
}