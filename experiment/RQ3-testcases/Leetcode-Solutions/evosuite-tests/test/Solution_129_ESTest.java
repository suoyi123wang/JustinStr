/*
 * This file was automatically generated by EvoSuite
 * Mon May 02 10:16:44 GMT 2022
 */


import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Solution_129_ESTest extends Solution_129_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Solution_129 solution_129_0 = new Solution_129();
      String[] stringArray0 = new String[9];
      stringArray0[0] = "+WLqZr~17)+}`S?L5";
      stringArray0[1] = "";
      stringArray0[2] = "";
      stringArray0[3] = "Solution_129";
      // Undeclared exception!
      try { 
        solution_129_0.findAndReplacePattern(stringArray0, "_hf&)EUFfI%5");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("Solution_129", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Solution_129 solution_129_0 = new Solution_129();
      String[] stringArray0 = new String[0];
      List<String> list0 = solution_129_0.findAndReplacePattern(stringArray0, "*.@7 *^$gug");
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Solution_129 solution_129_0 = new Solution_129();
      // Undeclared exception!
      try { 
        solution_129_0.match(":ZJMg.", "");
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Solution_129 solution_129_0 = new Solution_129();
      // Undeclared exception!
      try { 
        solution_129_0.match((String) null, "");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("Solution_129", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Solution_129 solution_129_0 = new Solution_129();
      String[] stringArray0 = new String[1];
      stringArray0[0] = ".";
      // Undeclared exception!
      try { 
        solution_129_0.findAndReplacePattern(stringArray0, "");
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Solution_129 solution_129_0 = new Solution_129();
      boolean boolean0 = solution_129_0.match("SCoJuK\"#YFp{<*", "rx9`mny-y(Ee7?T.|]O");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Solution_129 solution_129_0 = new Solution_129();
      boolean boolean0 = solution_129_0.match("", "");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Solution_129 solution_129_0 = new Solution_129();
      boolean boolean0 = solution_129_0.match("*.@7 *^$gug", "I0!q~W/o1$");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      Solution_129 solution_129_0 = new Solution_129();
      String[] stringArray0 = new String[1];
      stringArray0[0] = "w.sv*bPq";
      List<String> list0 = solution_129_0.findAndReplacePattern(stringArray0, "w.sv*bPq");
      assertTrue(list0.contains("w.sv*bPq"));
  }
}
