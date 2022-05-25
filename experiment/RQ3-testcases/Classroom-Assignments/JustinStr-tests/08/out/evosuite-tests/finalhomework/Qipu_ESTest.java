/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 30 08:39:42 GMT 2022
 */

package finalhomework;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import finalhomework.Qipu;
import finalhomework.Stone;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Qipu_ESTest extends Qipu_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Qipu qipu0 = new Qipu();
      int[][] intArray0 = qipu0.lastStone(5);
      assertEquals(2, intArray0.length);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Qipu qipu0 = new Qipu();
      qipu0.regret(114);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Qipu qipu0 = new Qipu();
      qipu0.cancel(3);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Qipu qipu0 = new Qipu();
      qipu0.qipuArray = null;
      // Undeclared exception!
      try { 
        qipu0.regret((-1));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("finalhomework.Qipu", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Qipu qipu0 = new Qipu();
      qipu0.qipuArray = null;
      // Undeclared exception!
      try { 
        qipu0.lastStone(2994);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("finalhomework.Qipu", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Qipu qipu0 = new Qipu();
      qipu0.qipuArray = null;
      // Undeclared exception!
      try { 
        qipu0.cancel(0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("finalhomework.Qipu", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Qipu qipu0 = new Qipu();
      // Undeclared exception!
      try { 
        qipu0.addStone((Stone) null, "9>.-3-s`uE>`wx{");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"9>.\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Qipu qipu0 = new Qipu();
      // Undeclared exception!
      try { 
        qipu0.addStone((Stone) null, "9-3-s`uE>wzx{");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("finalhomework.Qipu", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Qipu qipu0 = new Qipu();
      // Undeclared exception!
      try { 
        qipu0.addStone((Stone) null, "zF\",=9l");
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1
         //
         verifyException("finalhomework.Qipu", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Qipu qipu0 = new Qipu();
      Stone stone0 = new Stone((-3298), 996);
      qipu0.addStone(stone0, "9-CAs`1u~>`wj!<{");
      assertEquals(996, stone0.getY());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Qipu qipu0 = new Qipu();
      // Undeclared exception!
      try { 
        qipu0.lastStone(0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("finalhomework.Qipu", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Qipu qipu0 = new Qipu();
      // Undeclared exception!
      try { 
        qipu0.regret((-1));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -2
         //
         verifyException("finalhomework.Qipu", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Qipu qipu0 = new Qipu();
      // Undeclared exception!
      try { 
        qipu0.cancel(0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("finalhomework.Qipu", e);
      }
  }
}