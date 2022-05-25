/*
 * This file was automatically generated by EvoSuite
 * Thu May 12 10:00:02 GMT 2022
 */

package com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.resources;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.javascript.jscomp.jarjar.org.apache.tools.ant.Project;
import com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.Reference;
import com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.Resource;
import com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.resources.FileResource;
import com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.resources.MultiRootFileSet;
import java.io.File;
import java.util.Iterator;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class MultiRootFileSet_ESTest extends MultiRootFileSet_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      MultiRootFileSet multiRootFileSet0 = new MultiRootFileSet();
      FileResource fileResource0 = new FileResource();
      fileResource0.setName("");
      multiRootFileSet0.addConfiguredBaseDir(fileResource0);
      // Undeclared exception!
      try { 
        multiRootFileSet0.toString();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.AbstractFileSet", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      MultiRootFileSet multiRootFileSet0 = new MultiRootFileSet();
      Project project0 = new Project();
      FileResource fileResource0 = new FileResource(project0, "");
      multiRootFileSet0.addConfiguredBaseDir(fileResource0);
      // Undeclared exception!
      try { 
        multiRootFileSet0.iterator();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.AbstractFileSet", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      MultiRootFileSet multiRootFileSet0 = new MultiRootFileSet();
      // Undeclared exception!
      try { 
        multiRootFileSet0.addConfiguredBaseDir((FileResource) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.resources.MultiRootFileSet", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      MultiRootFileSet multiRootFileSet0 = new MultiRootFileSet();
      String string0 = multiRootFileSet0.toString();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      MultiRootFileSet multiRootFileSet0 = new MultiRootFileSet();
      Reference reference0 = new Reference((Project) null, "@");
      multiRootFileSet0.setRefid(reference0);
      // Undeclared exception!
      try { 
        multiRootFileSet0.size();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // No Project specified
         //
         verifyException("com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.DataType", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      MultiRootFileSet multiRootFileSet0 = new MultiRootFileSet();
      multiRootFileSet0.size();
      Iterator<Resource> iterator0 = multiRootFileSet0.iterator();
      assertNotNull(iterator0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      MultiRootFileSet multiRootFileSet0 = new MultiRootFileSet();
      Reference reference0 = new Reference((Project) null, "'%*uA(\"%");
      multiRootFileSet0.setRefid(reference0);
      // Undeclared exception!
      try { 
        multiRootFileSet0.iterator();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // No Project specified
         //
         verifyException("com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.DataType", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      MultiRootFileSet multiRootFileSet0 = new MultiRootFileSet();
      Reference reference0 = new Reference((Project) null, "@");
      multiRootFileSet0.setRefid(reference0);
      // Undeclared exception!
      try { 
        multiRootFileSet0.clone();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // No Project specified
         //
         verifyException("com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.DataType", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      MultiRootFileSet multiRootFileSet0 = new MultiRootFileSet();
      Object object0 = multiRootFileSet0.clone();
      assertNotSame(object0, multiRootFileSet0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      MultiRootFileSet multiRootFileSet0 = new MultiRootFileSet();
      FileResource fileResource0 = new FileResource();
      multiRootFileSet0.addConfiguredBaseDir(fileResource0);
      // Undeclared exception!
      try { 
        multiRootFileSet0.setRefid((Reference) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // You must not specify more than one attribute when using refid
         //
         verifyException("com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.DataType", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      MultiRootFileSet multiRootFileSet0 = new MultiRootFileSet();
      FileResource fileResource0 = new FileResource();
      Reference reference0 = new Reference((Project) null, "@");
      multiRootFileSet0.setRefid(reference0);
      // Undeclared exception!
      try { 
        multiRootFileSet0.addConfiguredBaseDir(fileResource0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // You must not specify nested elements when using refid
         //
         verifyException("com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.DataType", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      MultiRootFileSet multiRootFileSet0 = new MultiRootFileSet();
      FileResource fileResource0 = new FileResource((File) null, "");
      multiRootFileSet0.addConfiguredBaseDir(fileResource0);
      // Undeclared exception!
      try { 
        multiRootFileSet0.size();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.AbstractFileSet", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      MultiRootFileSet multiRootFileSet0 = new MultiRootFileSet();
      // Undeclared exception!
      try { 
        multiRootFileSet0.setBaseDirs("$;W\"Mh,w}1H");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.resources.MultiRootFileSet", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      MultiRootFileSet multiRootFileSet0 = new MultiRootFileSet();
      multiRootFileSet0.setBaseDirs("");
      assertTrue(multiRootFileSet0.getErrorOnMissingDir());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      MultiRootFileSet multiRootFileSet0 = new MultiRootFileSet();
      multiRootFileSet0.setBaseDirs((String) null);
      assertEquals(5, multiRootFileSet0.getMaxLevelsOfSymlinks());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      MultiRootFileSet multiRootFileSet0 = new MultiRootFileSet();
      Reference reference0 = new Reference((Project) null, "@");
      multiRootFileSet0.setRefid(reference0);
      // Undeclared exception!
      try { 
        multiRootFileSet0.setBaseDirs("@");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // You must not specify more than one attribute when using refid
         //
         verifyException("com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.DataType", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      MultiRootFileSet multiRootFileSet0 = new MultiRootFileSet();
      multiRootFileSet0.setBaseDirs(",");
      assertTrue(multiRootFileSet0.getErrorOnMissingDir());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      MultiRootFileSet multiRootFileSet0 = new MultiRootFileSet();
      Reference reference0 = new Reference((Project) null, "@");
      multiRootFileSet0.setRefid(reference0);
      // Undeclared exception!
      try { 
        multiRootFileSet0.setCache(false);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // You must not specify more than one attribute when using refid
         //
         verifyException("com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.DataType", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      MultiRootFileSet multiRootFileSet0 = new MultiRootFileSet();
      multiRootFileSet0.setCache(false);
      int int0 = multiRootFileSet0.size();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      MultiRootFileSet multiRootFileSet0 = new MultiRootFileSet();
      Reference reference0 = new Reference((Project) null, "@");
      multiRootFileSet0.setRefid(reference0);
      MultiRootFileSet.SetType multiRootFileSet_SetType0 = MultiRootFileSet.SetType.both;
      // Undeclared exception!
      try { 
        multiRootFileSet0.setType(multiRootFileSet_SetType0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // You must not specify more than one attribute when using refid
         //
         verifyException("com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.DataType", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      MultiRootFileSet multiRootFileSet0 = new MultiRootFileSet();
      MultiRootFileSet.SetType multiRootFileSet_SetType0 = MultiRootFileSet.SetType.dir;
      multiRootFileSet0.setType(multiRootFileSet_SetType0);
      assertTrue(multiRootFileSet0.isFilesystemOnly());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      MultiRootFileSet multiRootFileSet0 = new MultiRootFileSet();
      Project project0 = new Project();
      Reference reference0 = new Reference(project0, "Gr1*ndO/4!tQ$n&w");
      multiRootFileSet0.setRefid(reference0);
      // Undeclared exception!
      try { 
        multiRootFileSet0.toString();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // No Project specified
         //
         verifyException("com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.DataType", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      MultiRootFileSet multiRootFileSet0 = new MultiRootFileSet();
      boolean boolean0 = multiRootFileSet0.isFilesystemOnly();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      MultiRootFileSet multiRootFileSet0 = new MultiRootFileSet();
      // Undeclared exception!
      try { 
        multiRootFileSet0.setDir((File) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // MultiRootFileSet doesn't support the dir attribute
         //
         verifyException("com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.resources.MultiRootFileSet", e);
      }
  }
}
