/*
 * This file was automatically generated by EvoSuite
 * Mon May 02 11:37:58 GMT 2022
 */


import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Solution_275_ESTest extends Solution_275_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Solution_275 solution_275_0 = new Solution_275();
      String string0 = solution_275_0.addStrings("$W>j.ur", "$W>j.ur");
      assertEquals("1-6-197112", string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Solution_275 solution_275_0 = new Solution_275();
      String string0 = solution_275_0.multiply("4U\")PD", "$W>j.ur");
      assertEquals("17456135406-97543333-340", string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Solution_275 solution_275_0 = new Solution_275();
      String string0 = solution_275_0.addStrings("", "");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Solution_275 solution_275_0 = new Solution_275();
      // Undeclared exception!
      solution_275_0.multiply("433333333333333333-933333333333333333-333333333333333333-0133333333333333333-933333333333333333-333333333333333333-133333333333333333-213333333333333333-333333333333333333-62309180808935474902226244993050802453-433333407704240651", "433333333333333333-933333333333333333-333333333333333333-0133333333333333333-933333333333333333-333333333333333333-133333333333333333-213333333333333333-333333333333333333-62309180808935474902226244993050802453-433333407704240651");
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Solution_275 solution_275_0 = new Solution_275();
      // Undeclared exception!
      try { 
        solution_275_0.multiply((String) null, "A:X(rD)cD~z");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Solution_275 solution_275_0 = new Solution_275();
      // Undeclared exception!
      try { 
        solution_275_0.addStrings("0", (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("Solution_275", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Solution_275 solution_275_0 = new Solution_275();
      String string0 = solution_275_0.addStrings("Rm'eIE:XI',t[m@P ", "17456135406-97543333-340");
      assertEquals("1745617553-1521796-6620256-", string0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Solution_275 solution_275_0 = new Solution_275();
      String string0 = solution_275_0.addStrings("A:X(rD)cD~z", "0");
      assertEquals("18402-802-3854", string0);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      Solution_275 solution_275_0 = new Solution_275();
      String string0 = solution_275_0.multiply("", "0");
      assertEquals("0", string0);
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      Solution_275 solution_275_0 = new Solution_275();
      String string0 = solution_275_0.multiply("0", "");
      assertEquals("0", string0);
  }
}