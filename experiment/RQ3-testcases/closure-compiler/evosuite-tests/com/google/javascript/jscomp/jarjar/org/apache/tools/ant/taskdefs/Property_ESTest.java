/*
 * This file was automatically generated by EvoSuite
 * Thu May 12 10:01:50 GMT 2022
 */

package com.google.javascript.jscomp.jarjar.org.apache.tools.ant.taskdefs;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.javascript.jscomp.jarjar.org.apache.tools.ant.Project;
import com.google.javascript.jscomp.jarjar.org.apache.tools.ant.taskdefs.Available;
import com.google.javascript.jscomp.jarjar.org.apache.tools.ant.taskdefs.Property;
import com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.Path;
import com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.Reference;
import java.io.File;
import java.net.URL;
import java.util.Properties;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.net.MockURL;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Property_ESTest extends Property_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Property property0 = new Property(false);
      property0.addProperty("CZ", "H[0pWBWFIs?f-");
      assertFalse(property0.getPrefixValues());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Property property0 = new Property();
      Project project0 = new Project();
      property0.setProject(project0);
      property0.setEnvironment("Msz0z'R,'Gv8IEt");
      property0.addText("yNmax-I+");
      property0.execute();
      assertFalse(property0.getPrefixValues());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Property property0 = new Property();
      Available available0 = new Available();
      Path path0 = available0.createClasspath();
      property0.setClasspath(path0);
      assertFalse(property0.getPrefixValues());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Property property0 = new Property();
      URL uRL0 = MockURL.getHttpExample();
      property0.setUrl(uRL0);
      assertFalse(property0.getPrefixValues());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Property property0 = new Property();
      MockFile mockFile0 = new MockFile("Loading Environment ", "Loading Environment ");
      property0.setFile(mockFile0);
      assertFalse(property0.getPrefixValues());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Property property0 = new Property(true);
      // Undeclared exception!
      try { 
        property0.setLocation((File) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.jarjar.org.apache.tools.ant.taskdefs.Property", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Project project0 = new Project();
      Property property0 = new Property();
      property0.addProperty("@", project0);
      assertFalse(property0.getPrefixValues());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Property property0 = new Property();
      property0.setValue((Object) property0);
      String string0 = property0.getValue();
      assertFalse(property0.getPrefixValues());
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Property property0 = new Property(true);
      URL uRL0 = MockURL.getHttpExample();
      property0.url = uRL0;
      property0.getUrl();
      assertFalse(property0.getPrefixValues());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Property property0 = new Property();
      property0.setRuntime("KHYY`y/");
      String string0 = property0.getRuntime();
      assertFalse(property0.getPrefixValues());
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Property property0 = new Property();
      property0.setResource("No Project specified.");
      String string0 = property0.getResource();
      assertNotNull(string0);
      assertFalse(property0.getPrefixValues());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Property property0 = new Property(true, (Project) null);
      assertFalse(property0.getPrefixValues());
      
      property0.setPrefixValues(true);
      boolean boolean0 = property0.getPrefixValues();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Property property0 = new Property(true);
      property0.setPrefix("B%");
      String string0 = property0.getPrefix();
      assertFalse(property0.getPrefixValues());
      assertEquals("B%.", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Property property0 = new Property();
      property0.name = "!@f<F3i.";
      String string0 = property0.getName();
      assertNotNull(string0);
      assertFalse(property0.getPrefixValues());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Property property0 = new Property(true);
      MockFile mockFile0 = new MockFile("Loading Environment ", "Loading Environment ");
      property0.file = (File) mockFile0;
      property0.getFile();
      assertFalse(property0.getPrefixValues());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Property property0 = new Property(true);
      MockFile mockFile0 = new MockFile((File) null, "Loading Environment ");
      property0.file = (File) mockFile0;
      property0.getFile();
      assertFalse(property0.getPrefixValues());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Property property0 = new Property(true);
      property0.env = "(j(%;WJR@:)B5S|~%";
      String string0 = property0.getEnvironment();
      assertFalse(property0.getPrefixValues());
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Property property0 = new Property();
      property0.createClasspath();
      property0.getClasspath();
      assertFalse(property0.getPrefixValues());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Property property0 = new Property();
      Available available0 = new Available();
      Path path0 = available0.createClasspath();
      property0.classpath = path0;
      // Undeclared exception!
      try { 
        property0.setClasspath(path0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // This data type contains a circular reference.
         //
         verifyException("com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.DataType", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Property property0 = new Property();
      URL uRL0 = MockURL.getHttpExample();
      try { 
        property0.loadUrl(uRL0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // org.evosuite.runtime.mock.java.lang.MockThrowable: Could not find: www.someFakeButWellFormedURL.org
         //
         verifyException("com.google.javascript.jscomp.jarjar.org.apache.tools.ant.taskdefs.Property", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Property property0 = new Property();
      // Undeclared exception!
      try { 
        property0.loadUrl((URL) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.net.MockURL", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Property property0 = new Property();
      // Undeclared exception!
      try { 
        property0.loadRuntime((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Property property0 = new Property();
      // Undeclared exception!
      try { 
        property0.loadFile((File) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.jarjar.org.apache.tools.ant.taskdefs.Property", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Property property0 = new Property();
      // Undeclared exception!
      try { 
        property0.loadEnvironment((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Property property0 = new Property();
      // Undeclared exception!
      try { 
        property0.addText("ktg4h:aty|+EB*j~R0L");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.jarjar.org.apache.tools.ant.taskdefs.Property", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Property property0 = new Property(true);
      // Undeclared exception!
      try { 
        property0.addProperty((String) null, (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Hashtable", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Project project0 = new Project();
      Property property0 = new Property(true, project0);
      // Undeclared exception!
      try { 
        property0.addProperty("@", (Object) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Hashtable", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Property property0 = new Property();
      // Undeclared exception!
      try { 
        property0.addProperties((Properties) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.jarjar.org.apache.tools.ant.taskdefs.Property", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Property property0 = new Property(true);
      boolean boolean0 = property0.getPrefixValues();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Property property0 = new Property();
      property0.getPrefix();
      assertFalse(property0.getPrefixValues());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Property property0 = new Property();
      property0.getValue();
      assertFalse(property0.getPrefixValues());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Property property0 = new Property(true);
      property0.loadEnvironment("You must specify value, location or refid with the name attribute");
      assertFalse(property0.getPrefixValues());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Property property0 = new Property(false);
      property0.setPrefix("Z3$+6tnKB]!a!:c");
      property0.loadEnvironment("q*sLNd+-esy2)");
      assertEquals("Z3$+6tnKB]!a!:c.", property0.getPrefix());
      assertFalse(property0.getPrefixValues());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Property property0 = new Property();
      Properties properties0 = new Properties();
      properties0.put(properties0, property0);
      property0.addProperties(properties0);
      assertFalse(property0.getPrefixValues());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Property property0 = new Property();
      property0.loadRuntime("B%.");
      assertFalse(property0.getPrefixValues());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Property property0 = new Property();
      Project project0 = new Project();
      property0.setProject(project0);
      property0.setEnvironment("project has not been set.");
      property0.execute();
      assertFalse(property0.getPrefixValues());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Project project0 = new Project();
      Property property0 = new Property();
      property0.setProject(project0);
      property0.createClasspath();
      // Undeclared exception!
      try { 
        property0.loadResource((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Project project0 = new Project();
      Property property0 = new Property();
      property0.setProject(project0);
      property0.createClasspath();
      property0.loadResource("Unable to find property file: ");
      assertFalse(property0.getPrefixValues());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Property property0 = new Property();
      // Undeclared exception!
      try { 
        property0.loadResource(".");
       //  fail("Expecting exception: RuntimeException");
       // Unstable assertion
      } catch(RuntimeException e) {
         //
         // java.util.InvalidPropertiesFormatException: org.xml.sax.SAXParseException; lineNumber: 1; columnNumber: 1; Content is not allowed in prolog.
         //
         verifyException("com.google.javascript.jscomp.jarjar.org.apache.tools.ant.taskdefs.Property", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Property property0 = new Property();
      property0.createClasspath();
      // Undeclared exception!
      try { 
        property0.loadResource("Unable to find property file: ");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.jarjar.org.apache.tools.ant.taskdefs.Property", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Property property0 = new Property();
      MockFile mockFile0 = new MockFile((File) null, "G(hLZpJNs]^");
      property0.loadFile(mockFile0);
      assertFalse(property0.getPrefixValues());
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Property property0 = new Property(false);
      Project project0 = new Project();
      File file0 = project0.getBaseDir();
      try { 
        property0.loadFile(file0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // java.io.IOException: Is a directory
         //
         verifyException("com.google.javascript.jscomp.jarjar.org.apache.tools.ant.taskdefs.Property", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Property property0 = new Property();
      Project project0 = new Project();
      property0.setProject(project0);
      property0.setEnvironment("Msz0z'R,'`Gv8IEt");
      property0.setPrefix("Msz0z'R,'`Gv8IEt");
      try { 
        property0.execute();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Prefix is only valid when loading from a url, file or resource
         //
         verifyException("com.google.javascript.jscomp.jarjar.org.apache.tools.ant.taskdefs.Property", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Property property0 = new Property();
      Project project0 = new Project();
      property0.setProject(project0);
      try { 
        property0.execute();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // You must specify url, file, resource, environment or runtime when not using the name attribute
         //
         verifyException("com.google.javascript.jscomp.jarjar.org.apache.tools.ant.taskdefs.Property", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Project project0 = new Project();
      Property property0 = new Property();
      property0.setResource("@");
      property0.setProject(project0);
      property0.execute();
      assertFalse(property0.getPrefixValues());
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Project project0 = new Project();
      Property property0 = new Property();
      URL uRL0 = MockURL.getFileExample();
      property0.url = uRL0;
      property0.setProject(project0);
      // Undeclared exception!
      try { 
        property0.execute();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.net.URL", e);
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Property property0 = new Property();
      // Undeclared exception!
      try { 
        property0.execute();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // project has not been set
         //
         verifyException("com.google.javascript.jscomp.jarjar.org.apache.tools.ant.taskdefs.Property", e);
      }
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Property property0 = new Property();
      String string0 = property0.toString();
      assertFalse(property0.getPrefixValues());
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      Property property0 = new Property();
      property0.createClasspath();
      property0.createClasspath();
      assertFalse(property0.getPrefixValues());
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      Property property0 = new Property(false);
      Path path0 = property0.createClasspath();
      property0.setClasspath(path0);
      assertFalse(property0.getPrefixValues());
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      Property property0 = new Property();
      property0.setPrefix(".");
      assertEquals(".", property0.getPrefix());
      assertFalse(property0.getPrefixValues());
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      Property property0 = new Property();
      property0.setPrefix((String) null);
      assertFalse(property0.getPrefixValues());
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      Property property0 = new Property();
      Object object0 = new Object();
      property0.setValue(object0);
      property0.addText("");
      assertFalse(property0.getPrefixValues());
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      Property property0 = new Property(false);
      property0.setValue((Object) null);
      assertFalse(property0.getPrefixValues());
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      Property property0 = new Property();
      Project project0 = new Project();
      File file0 = project0.getBaseDir();
      property0.setLocation(file0);
      String string0 = property0.toString();
      assertFalse(property0.getPrefixValues());
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      Property property0 = new Property();
      property0.getRuntime();
      assertFalse(property0.getPrefixValues());
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      Property property0 = new Property();
      property0.getUrl();
      assertFalse(property0.getPrefixValues());
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      Property property0 = new Property();
      property0.setValue("!Lxh^*Z/#");
      assertFalse(property0.getPrefixValues());
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      Property property0 = new Property();
      property0.getClasspath();
      assertFalse(property0.getPrefixValues());
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      Property property0 = new Property();
      property0.getFile();
      assertFalse(property0.getPrefixValues());
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      Property property0 = new Property(true);
      MockFile mockFile0 = new MockFile("totalMemory");
      property0.setBasedir(mockFile0);
      assertFalse(property0.getPrefixValues());
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      Property property0 = new Property();
      property0.getResource();
      assertFalse(property0.getPrefixValues());
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      Property property0 = new Property(true);
      Reference reference0 = new Reference((Project) null, "NAEMc;'*Ev");
      property0.setRefid(reference0);
      assertFalse(property0.getPrefixValues());
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      Property property0 = new Property();
      property0.setName("m");
      Project project0 = new Project();
      property0.setProject(project0);
      try { 
        property0.execute();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // You must specify value, location or refid with the name attribute
         //
         verifyException("com.google.javascript.jscomp.jarjar.org.apache.tools.ant.taskdefs.Property", e);
      }
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      Property property0 = new Property();
      Project project0 = new Project();
      Reference reference0 = new Reference(project0, "@");
      property0.setClasspathRef(reference0);
      assertFalse(property0.getPrefixValues());
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      Property property0 = new Property(true);
      property0.getRefid();
      assertFalse(property0.getPrefixValues());
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      Property property0 = new Property();
      property0.getName();
      assertFalse(property0.getPrefixValues());
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      Property property0 = new Property();
      Project project0 = new Project();
      property0.setProject(project0);
      property0.addText("yNmax-I+");
      property0.addText("@");
      assertFalse(property0.getPrefixValues());
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      Property property0 = new Property(true);
      property0.setRelative(false);
      assertFalse(property0.getPrefixValues());
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      Project project0 = new Project();
      Property property0 = new Property();
      property0.setProject(project0);
      property0.setRuntime("@");
      property0.execute();
      assertFalse(property0.getPrefixValues());
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      Property property0 = new Property();
      property0.setUserProperty(false);
      assertFalse(property0.getPrefixValues());
  }

  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      Property property0 = new Property();
      assertFalse(property0.getPrefixValues());
      
      property0.setPrefixValues(true);
      assertTrue(property0.getPrefixValues());
  }

  @Test(timeout = 4000)
  public void test72()  throws Throwable  {
      Property property0 = new Property(false);
      property0.getEnvironment();
      assertFalse(property0.getPrefixValues());
  }

  @Test(timeout = 4000)
  public void test73()  throws Throwable  {
      Property property0 = new Property();
      property0.setValue((Object) property0);
      // Undeclared exception!
      try { 
        property0.addText("d");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // can't combine nested text with value attribute
         //
         verifyException("com.google.javascript.jscomp.jarjar.org.apache.tools.ant.taskdefs.Property", e);
      }
  }
}