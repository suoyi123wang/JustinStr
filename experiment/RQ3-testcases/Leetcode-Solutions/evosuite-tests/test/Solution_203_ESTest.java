/*
 * This file was automatically generated by EvoSuite
 * Mon May 02 08:39:55 GMT 2022
 */


import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Arrays;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Solution_203_ESTest extends Solution_203_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Solution_203 solution_203_0 = new Solution_203();
      solution_203_0.insert("rf");
      String[] stringArray0 = new String[1];
      stringArray0[0] = "rf";
      List<String> list0 = solution_203_0.findAllConcatenatedWordsInADict(stringArray0);
      assertTrue(list0.contains("rf"));
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Solution_203 solution_203_0 = new Solution_203();
      String[] stringArray0 = new String[1];
      stringArray0[0] = "9";
      // Undeclared exception!
      try { 
        solution_203_0.findAllConcatenatedWordsInADict(stringArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -40
         //
         verifyException("Solution_203", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Solution_203 solution_203_0 = new Solution_203();
      boolean[] booleanArray0 = new boolean[12];
      boolean boolean0 = solution_203_0.dfs("", 1, booleanArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Solution_203 solution_203_0 = new Solution_203();
      String[] stringArray0 = new String[0];
      List<String> list0 = solution_203_0.findAllConcatenatedWordsInADict(stringArray0);
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Solution_203 solution_203_0 = new Solution_203();
      // Undeclared exception!
      try { 
        solution_203_0.insert((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("Solution_203", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Solution_203 solution_203_0 = new Solution_203();
      // Undeclared exception!
      try { 
        solution_203_0.insert("Solution_20");
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -14
         //
         verifyException("Solution_203", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Solution_203 solution_203_0 = new Solution_203();
      String[] stringArray0 = new String[1];
      // Undeclared exception!
      try { 
        solution_203_0.findAllConcatenatedWordsInADict(stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("Solution_203", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Solution_203 solution_203_0 = new Solution_203();
      // Undeclared exception!
      try { 
        solution_203_0.dfs((String) null, 1, (boolean[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("Solution_203", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Solution_203 solution_203_0 = new Solution_203();
      boolean[] booleanArray0 = new boolean[4];
      // Undeclared exception!
      try { 
        solution_203_0.dfs("t@l.2:X>B:eX", 26, booleanArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 26
         //
         verifyException("Solution_203", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Solution_203 solution_203_0 = new Solution_203();
      solution_203_0.insert("f");
      solution_203_0.insert("f");
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Solution_203 solution_203_0 = new Solution_203();
      solution_203_0.insert("f");
      boolean[] booleanArray0 = new boolean[4];
      boolean boolean0 = solution_203_0.dfs("f", 0, booleanArray0);
      assertTrue(Arrays.equals(new boolean[] {true, false, false, false}, booleanArray0));
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Solution_203 solution_203_0 = new Solution_203();
      solution_203_0.insert("f");
      boolean[] booleanArray0 = new boolean[4];
      boolean boolean0 = solution_203_0.dfs("fi=qx<KXBk1v", 0, booleanArray0);
      assertTrue(Arrays.equals(new boolean[] {true, true, false, false}, booleanArray0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Solution_203 solution_203_0 = new Solution_203();
      boolean[] booleanArray0 = new boolean[2];
      boolean boolean0 = solution_203_0.dfs("", 0, booleanArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Solution_203 solution_203_0 = new Solution_203();
      String[] stringArray0 = new String[7];
      stringArray0[0] = "";
      stringArray0[1] = "Solution_203";
      stringArray0[2] = "${{ZnRyK*P-";
      stringArray0[3] = "3[gErU=RVLvv|d[|Z#l";
      stringArray0[4] = "";
      stringArray0[5] = "az~4!p_73L";
      stringArray0[6] = "a";
      // Undeclared exception!
      try { 
        solution_203_0.findAllConcatenatedWordsInADict(stringArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 29
         //
         verifyException("Solution_203", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Solution_203 solution_203_0 = new Solution_203();
      boolean[] booleanArray0 = new boolean[4];
      Trie2 trie2_0 = new Trie2();
      solution_203_0.Trie2 = trie2_0;
      Trie2[] trie2Array0 = new Trie2[7];
      trie2Array0[5] = trie2_0;
      trie2_0.children = trie2Array0;
      boolean boolean0 = solution_203_0.dfs("f", 0, booleanArray0);
      assertTrue(Arrays.equals(new boolean[] {true, false, false, false}, booleanArray0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Solution_203 solution_203_0 = new Solution_203();
      boolean[] booleanArray0 = new boolean[4];
      booleanArray0[1] = true;
      boolean boolean0 = solution_203_0.dfs("pxaFBy]))m#aju-aSQ", 1, booleanArray0);
      assertTrue(Arrays.equals(new boolean[] {false, true, false, false}, booleanArray0));
      assertFalse(boolean0);
  }
}
