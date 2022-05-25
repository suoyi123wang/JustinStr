/*
 * This file was automatically generated by EvoSuite
 * Thu May 12 09:57:28 GMT 2022
 */

package com.google.javascript.refactoring;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.javascript.jscomp.jarjar.com.google.common.collect.ImmutableBiMap;
import com.google.javascript.jscomp.jarjar.com.google.common.collect.ImmutableList;
import com.google.javascript.jscomp.jarjar.com.google.common.collect.SetMultimap;
import com.google.javascript.refactoring.ApplySuggestedFixes;
import com.google.javascript.refactoring.AutoValue_CodeReplacement;
import com.google.javascript.refactoring.CodeReplacement;
import com.google.javascript.refactoring.SuggestedFix;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.ServiceLoader;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class ApplySuggestedFixes_ESTest extends ApplySuggestedFixes_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedHashSet<AutoValue_CodeReplacement> linkedHashSet0 = new LinkedHashSet<AutoValue_CodeReplacement>(1073741824, 1073741824);
      ImmutableList<CodeReplacement> immutableList0 = ImmutableList.sortedCopyOf((Comparator<? super CodeReplacement>) comparator0, (Iterable<? extends CodeReplacement>) linkedHashSet0);
      String string0 = ApplySuggestedFixes.applyCodeReplacements(immutableList0, "Q)?9?");
      assertEquals("Q)?9?", string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      AutoValue_CodeReplacement autoValue_CodeReplacement0 = new AutoValue_CodeReplacement(0, 340, "filenameToCodeMap missing code for file: ", "ejinn`6cYK(");
      ImmutableList<CodeReplacement> immutableList0 = ImmutableList.of((CodeReplacement) autoValue_CodeReplacement0, (CodeReplacement) autoValue_CodeReplacement0, (CodeReplacement) autoValue_CodeReplacement0, (CodeReplacement) autoValue_CodeReplacement0, (CodeReplacement) autoValue_CodeReplacement0, (CodeReplacement) autoValue_CodeReplacement0);
      String string0 = ApplySuggestedFixes.applyCodeReplacements(immutableList0, "filenameToCodeMap missing code for file: ");
      assertEquals("filenameToCodeMap missing code for file: ", string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      Class<AutoValue_CodeReplacement> class0 = AutoValue_CodeReplacement.class;
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      ServiceLoader<AutoValue_CodeReplacement> serviceLoader0 = ServiceLoader.load(class0, classLoader0);
      ImmutableList<AutoValue_CodeReplacement> immutableList0 = ImmutableList.sortedCopyOf((Comparator<? super AutoValue_CodeReplacement>) comparator0, (Iterable<? extends AutoValue_CodeReplacement>) serviceLoader0);
      ImmutableList<CodeReplacement> immutableList1 = ImmutableList.copyOf((Collection<? extends CodeReplacement>) immutableList0);
      String string0 = ApplySuggestedFixes.applyCodeReplacements(immutableList1, "");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      AutoValue_CodeReplacement autoValue_CodeReplacement0 = new AutoValue_CodeReplacement((-1490), 0, "',F?", "");
      ImmutableList<AutoValue_CodeReplacement> immutableList0 = ImmutableList.of(autoValue_CodeReplacement0, autoValue_CodeReplacement0, autoValue_CodeReplacement0, autoValue_CodeReplacement0, autoValue_CodeReplacement0, autoValue_CodeReplacement0, autoValue_CodeReplacement0, autoValue_CodeReplacement0, autoValue_CodeReplacement0);
      LinkedHashSet<CodeReplacement> linkedHashSet0 = new LinkedHashSet<CodeReplacement>(immutableList0);
      // Undeclared exception!
      try { 
        ApplySuggestedFixes.applyCodeReplacements(linkedHashSet0, "com.google.javascript.refactoring.ApplySuggestedFixes$ReplacementMap");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Found overlap between code replacements:
         // java.lang.String@0000000008
         //
         verifyException("com.google.javascript.jscomp.jarjar.com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      SuggestedFix suggestedFix0 = mock(SuggestedFix.class, new ViolatedAssumptionAnswer());
      doReturn((ImmutableList) null).when(suggestedFix0).getAlternatives();
      SuggestedFix suggestedFix1 = mock(SuggestedFix.class, new ViolatedAssumptionAnswer());
      ImmutableList<SuggestedFix> immutableList0 = ImmutableList.of(suggestedFix0, suggestedFix0, suggestedFix1, suggestedFix1);
      ImmutableBiMap<String, String> immutableBiMap0 = ImmutableBiMap.of("p49:lQrQ;88kl]NG", "`", "", "", ")^L2O6~Z", "$gR*xzwkvA", "com.google.javascript.refactoring.ApplySuggestedFixes", "Found overlap between code replacements:\n%s");
      // Undeclared exception!
      try { 
        ApplySuggestedFixes.applyAllSuggestedFixChoicesToCode(immutableList0, immutableBiMap0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.refactoring.ApplySuggestedFixes", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      LinkedList<SuggestedFix> linkedList0 = new LinkedList<SuggestedFix>();
      HashSet<SuggestedFix> hashSet0 = new HashSet<SuggestedFix>(linkedList0);
      SuggestedFix suggestedFix0 = mock(SuggestedFix.class, new ViolatedAssumptionAnswer());
      doReturn((SetMultimap) null).when(suggestedFix0).getReplacements();
      hashSet0.add(suggestedFix0);
      // Undeclared exception!
      try { 
        ApplySuggestedFixes.applySuggestedFixesToFiles(hashSet0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.refactoring.ApplySuggestedFixes", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      ArrayList<SuggestedFix> arrayList0 = new ArrayList<SuggestedFix>();
      ImmutableList<SuggestedFix> immutableList0 = ImmutableList.sortedCopyOf((Comparator<? super SuggestedFix>) comparator0, (Iterable<? extends SuggestedFix>) arrayList0);
      ApplySuggestedFixes.applySuggestedFixesToFiles(immutableList0);
      assertEquals(0, immutableList0.size());
  }
}
