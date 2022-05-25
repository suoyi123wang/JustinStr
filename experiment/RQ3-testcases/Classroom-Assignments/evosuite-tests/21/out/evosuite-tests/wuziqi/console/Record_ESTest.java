/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 30 09:03:08 GMT 2022
 */

package wuziqi.console;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.File;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.io.PrintWriter;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockPrintWriter;
import org.junit.runner.RunWith;
import wuziqi.console.Record;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Record_ESTest extends Record_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Record record0 = new Record();
      String string0 = record0.IObodytranslator("\u9707\u7237");
      assertEquals("1\u7237", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Record record0 = new Record();
      MockFile mockFile0 = new MockFile("&Q)ZQ", "4");
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter("o ");
      String[][] stringArray0 = new String[3][7];
      String[] stringArray1 = new String[7];
      stringArray1[0] = "I|E}1^8KCThNs?<E";
      stringArray1[1] = "&Q)ZQ";
      stringArray0[0] = stringArray1;
      try { 
        record0.IOrecorder(stringArray0, mockFile0, mockPrintWriter0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Record record0 = new Record();
      int int0 = record0.binarytodecimal("0");
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Record record0 = new Record();
      String string0 = record0.IObodytranslator("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Record record0 = new Record();
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter("?'h*BC+K0Fd+9k*:3");
      // Undeclared exception!
      try { 
        record0.recordcloser("close", mockPrintWriter0);
        fail("Expecting exception: System.SystemExitException");
      
      } catch(System.SystemExitException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.System", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Record record0 = new Record();
      // Undeclared exception!
      try { 
        record0.binarytodecimal("");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Record record0 = new Record();
      // Undeclared exception!
      try { 
        record0.IOtitletranslator((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Record record0 = new Record();
      // Undeclared exception!
      try { 
        record0.IObodytranslator((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Record record0 = new Record();
      String string0 = record0.IOtitletranslator("\u9707\u7237");
      assertNotNull(string0);
      assertEquals("B", string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Record record0 = new Record();
      String string0 = record0.IObodytranslator("Z");
      assertEquals("+ ", string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Record record0 = new Record();
      String string0 = record0.IObodytranslator("Y");
      assertEquals("o ", string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Record record0 = new Record();
      String string0 = record0.IObodytranslator("X");
      assertEquals("\u25CF ", string0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Record record0 = new Record();
      String string0 = record0.IOtitletranslator("D");
      assertNotNull(string0);
      assertEquals("defend", string0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Record record0 = new Record();
      String string0 = record0.IOtitletranslator("B");
      assertEquals("balance", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Record record0 = new Record();
      String string0 = record0.IOtitletranslator("A");
      assertEquals("attack", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Record record0 = new Record();
      String string0 = record0.IOtitletranslator("\u6770\u54E5");
      assertEquals("W", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Record record0 = new Record();
      String string0 = record0.IOtitletranslator("\u9738\u6C14");
      assertEquals("Y", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Record record0 = new Record();
      String string0 = record0.IOtitletranslator("\u5A01\u6B66");
      assertEquals("G", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Record record0 = new Record();
      String string0 = record0.IOtitletranslator("\u6770");
      assertNotNull(string0);
      assertEquals("AI", string0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Record record0 = new Record();
      String string0 = record0.IOtitletranslator("\u9707");
      assertEquals("human", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Record record0 = new Record();
      String string0 = record0.IOtitletranslator("vfb[GHhNc/i");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Record record0 = new Record();
      // Undeclared exception!
      try { 
        record0.recordcloser("close", (PrintWriter) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("wuziqi.console.Record", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Record record0 = new Record();
      record0.recordcloser("B", (PrintWriter) null);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Record record0 = new Record();
      MockFile mockFile0 = new MockFile("1G(x8R38y-/?i~QXj1");
      String[][] stringArray0 = new String[1][2];
      String[] stringArray1 = new String[1];
      stringArray1[0] = "1G(x8R38y-/?i~QXj1";
      stringArray0[0] = stringArray1;
      try { 
        record0.IOrecorder(stringArray0, mockFile0, (PrintWriter) null);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1
         //
         verifyException("wuziqi.console.Record", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Record record0 = new Record();
      String[][] stringArray0 = new String[4][7];
      String[] stringArray1 = new String[7];
      stringArray1[0] = "o ";
      stringArray0[0] = stringArray1;
      try { 
        record0.IOrecorder(stringArray0, (File) null, (PrintWriter) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("wuziqi.console.Record", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Record record0 = new Record();
      String[][] stringArray0 = new String[1][2];
      String[] stringArray1 = new String[4];
      stringArray1[0] = "\u25CF ";
      stringArray0[0] = stringArray1;
      File file0 = MockFile.createTempFile("MasHc]uZ|yt{J)O", "i=w$(NNVic'N,wLK");
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter(" W.VaD}xp_Iya2TPn");
      try { 
        record0.IOrecorder(stringArray0, file0, mockPrintWriter0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Record record0 = new Record();
      String[][] stringArray0 = new String[2][9];
      String[] stringArray1 = new String[2];
      stringArray1[0] = "+ ";
      stringArray0[0] = stringArray1;
      try { 
        record0.IOrecorder(stringArray0, (File) null, (PrintWriter) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("wuziqi.console.Record", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Record record0 = new Record();
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter("c_FN");
      record0.IOtitle("", 0.01, "", (-1.0), "c_FN", "3qzkcK7jevC$", (File) null, mockPrintWriter0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Record record0 = new Record();
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter(pipedOutputStream0, true);
      record0.IOtitle("Ep%", 1.0, "Ep%", 1.0, "", "Ep%", (File) null, mockPrintWriter0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Record record0 = new Record();
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream(pipedInputStream0);
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter(pipedOutputStream0, true);
      record0.IOtitle("wuziqi.console.Record", 100.0, "g+cOOrba-? f`NWK", 100.0, "+ ", "g+cOOrba-? f`NWK", (File) null, mockPrintWriter0);
      assertEquals(32, pipedInputStream0.available());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Record record0 = new Record();
      MockFile mockFile0 = new MockFile("B");
      try { 
        record0.IOtitle("B", (-1.0), "B", 29.03387265, "B", "B", mockFile0, (PrintWriter) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("wuziqi.console.Record", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Record record0 = new Record();
      try { 
        record0.IOtitle("Y", 1816.80141, "\u9738\u6C14", 1816.80141, "Y", "", (File) null, (PrintWriter) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("wuziqi.console.Record", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Record record0 = new Record();
      MockFile mockFile0 = new MockFile(":G&A=X_yoRLP");
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter("XIW&@Yt;,Np49");
      record0.IOtitle(";1/TH4<", (-1.0), "human", (-1.0), "G", "Y", mockFile0, mockPrintWriter0);
      assertFalse(mockFile0.exists());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Record record0 = new Record();
      try { 
        record0.IOtitle("human", 611.519494687, "human", 611.519494687, "human", "human", (File) null, (PrintWriter) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("wuziqi.console.Record", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Record record0 = new Record();
      try { 
        record0.IOtitle("<hJ)&s[p<T", (-2366.227833232878), "<hJ)&s[p<T", 0.01, "vfb[GHhNc/i", "W", (File) null, (PrintWriter) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("wuziqi.console.Record", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Record record0 = new Record();
      int int0 = record0.binarytodecimal("1");
      assertEquals(1, int0);
  }
}