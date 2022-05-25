/*
 * This file was automatically generated by EvoSuite
 * Mon May 02 10:50:04 GMT 2022
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
public class Solution_255_ESTest extends Solution_255_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      LinkedList<String> linkedList0 = new LinkedList<String>();
      List<String> list0 = linkedList0.subList(0, 0);
      linkedList0.add("F7v8M 9/CFkoeX,Is");
      Solution_255 solution_255_0 = new Solution_255();
      // Undeclared exception!
      try { 
        solution_255_0.wordBreak("F7v8M 9/CFkoeX,Is", list0);
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
      Solution_255 solution_255_0 = new Solution_255();
      LinkedList<String> linkedList0 = new LinkedList<String>();
      // Undeclared exception!
      try { 
        solution_255_0.wordBreak((String) null, linkedList0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("Solution_255", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Solution_255 solution_255_0 = new Solution_255();
      LinkedList<String> linkedList0 = new LinkedList<String>();
      linkedList0.add("FP");
      boolean boolean0 = solution_255_0.wordBreak("FP", linkedList0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Solution_255 solution_255_0 = new Solution_255();
      LinkedList<String> linkedList0 = new LinkedList<String>();
      boolean boolean0 = solution_255_0.wordBreak("6fkA&D\u0004a1HP5`Ov", linkedList0);
      assertFalse(boolean0);
  }
}