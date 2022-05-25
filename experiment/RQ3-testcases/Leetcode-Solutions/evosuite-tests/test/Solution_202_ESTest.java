/*
 * This file was automatically generated by EvoSuite
 * Mon May 02 08:42:36 GMT 2022
 */


import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Solution_202_ESTest extends Solution_202_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Solution_202 solution_202_0 = new Solution_202();
      String[] stringArray0 = new String[7];
      stringArray0[0] = "1*tY 5mT";
      // Undeclared exception!
      try { 
        solution_202_0.findMaxForm(stringArray0, 181, 181);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -6
         //
         verifyException("Solution_202", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Solution_202 solution_202_0 = new Solution_202();
      String[] stringArray0 = new String[5];
      stringArray0[0] = "";
      // Undeclared exception!
      try { 
        solution_202_0.findMaxForm(stringArray0, 0, 1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("Solution_202", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Solution_202 solution_202_0 = new Solution_202();
      String[] stringArray0 = new String[0];
      int int0 = solution_202_0.findMaxForm(stringArray0, 930, 0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Solution_202 solution_202_0 = new Solution_202();
      // Undeclared exception!
      try { 
        solution_202_0.getZerosOnes((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("Solution_202", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Solution_202 solution_202_0 = new Solution_202();
      String[] stringArray0 = new String[1];
      stringArray0[0] = "";
      // Undeclared exception!
      solution_202_0.findMaxForm(stringArray0, 1885, 1885);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Solution_202 solution_202_0 = new Solution_202();
      String[] stringArray0 = new String[1];
      // Undeclared exception!
      try { 
        solution_202_0.findMaxForm(stringArray0, (-1322), (-1322));
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("Solution_202", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Solution_202 solution_202_0 = new Solution_202();
      // Undeclared exception!
      try { 
        solution_202_0.getZerosOnes("POr]H#ou:`g$");
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 32
         //
         verifyException("Solution_202", e);
      }
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Solution_202 solution_202_0 = new Solution_202();
      int[] intArray0 = solution_202_0.getZerosOnes("");
      assertEquals(2, intArray0.length);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      Solution_202 solution_202_0 = new Solution_202();
      String[] stringArray0 = new String[9];
      stringArray0[0] = "";
      stringArray0[1] = "";
      stringArray0[2] = "YNHxeDjJ1h2U'|";
      // Undeclared exception!
      try { 
        solution_202_0.findMaxForm(stringArray0, 2, 2);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 41
         //
         verifyException("Solution_202", e);
      }
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      Solution_202 solution_202_0 = new Solution_202();
      String[] stringArray0 = new String[5];
      stringArray0[0] = "";
      stringArray0[1] = "";
      stringArray0[2] = "";
      stringArray0[3] = "";
      stringArray0[4] = "";
      int int0 = solution_202_0.findMaxForm(stringArray0, 0, 0);
      assertEquals(5, int0);
  }
}
