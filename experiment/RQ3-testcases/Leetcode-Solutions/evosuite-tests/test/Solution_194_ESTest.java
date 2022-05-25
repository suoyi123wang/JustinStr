/*
 * This file was automatically generated by EvoSuite
 * Mon May 02 10:11:16 GMT 2022
 */


import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.ConcurrentModificationException;
import java.util.LinkedList;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Solution_194_ESTest extends Solution_194_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Solution_194 solution_194_0 = new Solution_194();
      LinkedList<String> linkedList0 = new LinkedList<String>();
      List<String> list0 = linkedList0.subList(0, 0);
      linkedList0.add("");
      // Undeclared exception!
      try { 
        solution_194_0.findLongestWord("", list0);
        fail("Expecting exception: ConcurrentModificationException");
      
      } catch(ConcurrentModificationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.SubList", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Solution_194 solution_194_0 = new Solution_194();
      // Undeclared exception!
      try { 
        solution_194_0.findLongestWord("<,`UL@G49ipK.X", (List<String>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("Solution_194", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Solution_194 solution_194_0 = new Solution_194();
      LinkedList<String> linkedList0 = new LinkedList<String>();
      linkedList0.add("hd A!c-");
      linkedList0.add("");
      String string0 = solution_194_0.findLongestWord("hd A!c-", linkedList0);
      assertEquals("hd A!c-", string0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Solution_194 solution_194_0 = new Solution_194();
      LinkedList<String> linkedList0 = new LinkedList<String>();
      linkedList0.add("Q,\"3U%rh");
      String string0 = solution_194_0.findLongestWord("m#^f", linkedList0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Solution_194 solution_194_0 = new Solution_194();
      LinkedList<String> linkedList0 = new LinkedList<String>();
      linkedList0.add("");
      String string0 = solution_194_0.findLongestWord("E", linkedList0);
      assertEquals("", string0);
  }
}