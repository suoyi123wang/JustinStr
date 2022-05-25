/*
 * This file was automatically generated by EvoSuite
 * Mon May 02 10:25:23 GMT 2022
 */


import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Solution_245_ESTest extends Solution_245_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Solution_245 solution_245_0 = new Solution_245();
      // Undeclared exception!
      try { 
        solution_245_0.startsWith((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("Solution_245", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Solution_245 solution_245_0 = new Solution_245();
      // Undeclared exception!
      try { 
        solution_245_0.startsWith("74@4/UIBRj1=yc");
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -42
         //
         verifyException("Solution_245", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Solution_245 solution_245_0 = new Solution_245();
      // Undeclared exception!
      try { 
        solution_245_0.search((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("Solution_245", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Solution_245 solution_245_0 = new Solution_245();
      // Undeclared exception!
      try { 
        solution_245_0.search("@CU");
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -33
         //
         verifyException("Solution_245", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Solution_245 solution_245_0 = new Solution_245();
      // Undeclared exception!
      try { 
        solution_245_0.insert((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("Solution_245", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Solution_245 solution_245_0 = new Solution_245();
      // Undeclared exception!
      try { 
        solution_245_0.insert("Solution_245");
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -14
         //
         verifyException("Solution_245", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Solution_245 solution_245_0 = new Solution_245();
      boolean boolean0 = solution_245_0.startsWith("bt&");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Solution_245 solution_245_0 = new Solution_245();
      boolean boolean0 = solution_245_0.search("");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Solution_245 solution_245_0 = new Solution_245();
      solution_245_0.insert("m");
      boolean boolean0 = solution_245_0.search("m");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Solution_245 solution_245_0 = new Solution_245();
      boolean boolean0 = solution_245_0.search("bt&");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Solution_245 solution_245_0 = new Solution_245();
      solution_245_0.insert("m");
      solution_245_0.insert("m");
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Solution_245 solution_245_0 = new Solution_245();
      solution_245_0.insert("avf");
      boolean boolean0 = solution_245_0.startsWith("avf");
      assertTrue(boolean0);
  }
}
