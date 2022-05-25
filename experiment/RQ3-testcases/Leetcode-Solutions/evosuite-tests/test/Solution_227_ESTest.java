/*
 * This file was automatically generated by EvoSuite
 * Mon May 02 09:31:52 GMT 2022
 */


import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.LinkedList;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Solution_227_ESTest extends Solution_227_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Solution_227 solution_227_0 = new Solution_227();
      boolean boolean0 = solution_227_0.isPalindrome("*. ?#fSzC;)PN", 97, (-3477));
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Solution_227 solution_227_0 = new Solution_227();
      String[] stringArray0 = new String[1];
      stringArray0[0] = "y";
      List<List<Integer>> list0 = solution_227_0.palindromePairs(stringArray0);
      assertTrue(list0.isEmpty());
      
      solution_227_0.insert("", (-2057));
      List<List<Integer>> list1 = solution_227_0.palindromePairs(stringArray0);
      assertEquals(2, list1.size());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Solution_227 solution_227_0 = new Solution_227();
      String[] stringArray0 = new String[4];
      stringArray0[0] = "";
      stringArray0[1] = "i";
      stringArray0[2] = "i";
      stringArray0[3] = "i";
      List<List<Integer>> list0 = solution_227_0.palindromePairs(stringArray0);
      assertEquals(8, list0.size());
      
      int int0 = solution_227_0.findWord("", 0, (-609));
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Solution_227 solution_227_0 = new Solution_227();
      String[] stringArray0 = new String[4];
      stringArray0[0] = "";
      stringArray0[1] = "";
      stringArray0[2] = "";
      stringArray0[3] = "";
      List<List<Integer>> list0 = solution_227_0.palindromePairs(stringArray0);
      assertEquals(3, list0.size());
      
      int int0 = solution_227_0.findWord("", 1739, (-102));
      assertEquals(3, int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Solution_227 solution_227_0 = new Solution_227();
      String[] stringArray0 = new String[6];
      stringArray0[0] = "";
      stringArray0[1] = "eVN!d0]7F'";
      LinkedList<Solution_227.Node> linkedList0 = new LinkedList<Solution_227.Node>();
      Solution_227.Node solution_227_Node0 = solution_227_0.new Node();
      int[] intArray0 = new int[5];
      intArray0[4] = (-1402);
      solution_227_Node0.ch = intArray0;
      linkedList0.add(solution_227_Node0);
      solution_227_0.tree = (List<Solution_227.Node>) linkedList0;
      // Undeclared exception!
      try { 
        solution_227_0.palindromePairs(stringArray0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: -1402, Size: 2
         //
         verifyException("java.util.LinkedList", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Solution_227 solution_227_0 = new Solution_227();
      String[] stringArray0 = new String[1];
      stringArray0[0] = "H";
      // Undeclared exception!
      try { 
        solution_227_0.palindromePairs(stringArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -25
         //
         verifyException("Solution_227", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Solution_227 solution_227_0 = new Solution_227();
      // Undeclared exception!
      try { 
        solution_227_0.isPalindrome("", 1, 4682);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Solution_227 solution_227_0 = new Solution_227();
      // Undeclared exception!
      try { 
        solution_227_0.isPalindrome((String) null, 1335, 1739);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("Solution_227", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Solution_227 solution_227_0 = new Solution_227();
      String[] stringArray0 = new String[4];
      // Undeclared exception!
      try { 
        solution_227_0.insert(stringArray0[1], (-1));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("Solution_227", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Solution_227 solution_227_0 = new Solution_227();
      // Undeclared exception!
      try { 
        solution_227_0.insert("", 0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Solution_227 solution_227_0 = new Solution_227();
      // Undeclared exception!
      try { 
        solution_227_0.findWord((String) null, 26, 26);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("Solution_227", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Solution_227 solution_227_0 = new Solution_227();
      String[] stringArray0 = new String[0];
      solution_227_0.palindromePairs(stringArray0);
      // Undeclared exception!
      try { 
        solution_227_0.findWord("Solution_227", 0, 0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -14
         //
         verifyException("Solution_227", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Solution_227 solution_227_0 = new Solution_227();
      String[] stringArray0 = new String[1];
      stringArray0[0] = "i";
      solution_227_0.palindromePairs(stringArray0);
      // Undeclared exception!
      try { 
        solution_227_0.findWord("i", (-340), 0);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Solution_227 solution_227_0 = new Solution_227();
      String[] stringArray0 = new String[6];
      stringArray0[0] = "";
      stringArray0[1] = "";
      stringArray0[2] = "";
      stringArray0[3] = "";
      stringArray0[4] = "";
      stringArray0[5] = "";
      List<List<Integer>> list0 = solution_227_0.palindromePairs(stringArray0);
      assertEquals(5, list0.size());
      
      int int0 = solution_227_0.findWord("Solution_227$Node", 0, 1);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Solution_227 solution_227_0 = new Solution_227();
      // Undeclared exception!
      try { 
        solution_227_0.findWord((String) null, (-2363), (-4930));
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Solution_227 solution_227_0 = new Solution_227();
      boolean boolean0 = solution_227_0.isPalindrome("tw", 0, 1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Solution_227 solution_227_0 = new Solution_227();
      String[] stringArray0 = new String[2];
      stringArray0[0] = "";
      stringArray0[1] = "";
      solution_227_0.palindromePairs(stringArray0);
      // Undeclared exception!
      try { 
        solution_227_0.insert("r_aOF*^0),zE[wz", (-1272));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -2
         //
         verifyException("Solution_227", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Solution_227 solution_227_0 = new Solution_227();
      String[] stringArray0 = new String[4];
      stringArray0[0] = "";
      stringArray0[1] = "i";
      stringArray0[2] = "i";
      stringArray0[3] = "i";
      solution_227_0.palindromePairs(stringArray0);
      solution_227_0.insert("i", (-2888));
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Solution_227 solution_227_0 = new Solution_227();
      boolean boolean0 = solution_227_0.isPalindrome("tKtRcnV6J{", 0, 2);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Solution_227 solution_227_0 = new Solution_227();
      String[] stringArray0 = new String[1];
      stringArray0[0] = "";
      solution_227_0.palindromePairs(stringArray0);
      String[] stringArray1 = new String[1];
      stringArray1[0] = "i";
      List<List<Integer>> list0 = solution_227_0.palindromePairs(stringArray1);
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Solution_227 solution_227_0 = new Solution_227();
      String[] stringArray0 = new String[6];
      stringArray0[0] = "w";
      stringArray0[1] = "w";
      stringArray0[2] = "trw";
      stringArray0[3] = "trw";
      stringArray0[4] = "w";
      stringArray0[5] = "w";
      List<List<Integer>> list0 = solution_227_0.palindromePairs(stringArray0);
      assertEquals(3, list0.size());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Solution_227 solution_227_0 = new Solution_227();
      String[] stringArray0 = new String[6];
      // Undeclared exception!
      try { 
        solution_227_0.palindromePairs(stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("Solution_227", e);
      }
  }
}