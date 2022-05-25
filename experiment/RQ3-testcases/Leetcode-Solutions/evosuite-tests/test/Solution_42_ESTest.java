/*
 * This file was automatically generated by EvoSuite
 * Mon May 02 09:54:22 GMT 2022
 */


import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Solution_42_ESTest extends Solution_42_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Solution_42 solution_42_0 = new Solution_42();
      solution_42_0.toCharType('\u0017');
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Solution_42 solution_42_0 = new Solution_42();
      solution_42_0.toCharType('i');
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Solution_42 solution_42_0 = new Solution_42();
      boolean boolean0 = solution_42_0.isNumber("9XuQkw53ztij1'x|K$");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Solution_42 solution_42_0 = new Solution_42();
      boolean boolean0 = solution_42_0.isNumber(".0.GJ]TU|z[XF3}|!L");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Solution_42 solution_42_0 = new Solution_42();
      // Undeclared exception!
      try { 
        solution_42_0.isNumber((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("Solution_42", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Solution_42 solution_42_0 = new Solution_42();
      solution_42_0.toCharType(' ');
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Solution_42 solution_42_0 = new Solution_42();
      solution_42_0.toCharType('+');
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Solution_42 solution_42_0 = new Solution_42();
      solution_42_0.toCharType('-');
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Solution_42 solution_42_0 = new Solution_42();
      solution_42_0.toCharType('.');
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Solution_42 solution_42_0 = new Solution_42();
      solution_42_0.toCharType('4');
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Solution_42 solution_42_0 = new Solution_42();
      boolean boolean0 = solution_42_0.isNumber("-");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Solution_42 solution_42_0 = new Solution_42();
      solution_42_0.toCharType('E');
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Solution_42 solution_42_0 = new Solution_42();
      solution_42_0.toCharType('e');
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Solution_42 solution_42_0 = new Solution_42();
      boolean boolean0 = solution_42_0.isNumber("+.1");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Solution_42 solution_42_0 = new Solution_42();
      boolean boolean0 = solution_42_0.isNumber("1.");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Solution_42 solution_42_0 = new Solution_42();
      boolean boolean0 = solution_42_0.isNumber("2");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Solution_42 solution_42_0 = new Solution_42();
      boolean boolean0 = solution_42_0.isNumber("1 ");
      assertTrue(boolean0);
  }
}
