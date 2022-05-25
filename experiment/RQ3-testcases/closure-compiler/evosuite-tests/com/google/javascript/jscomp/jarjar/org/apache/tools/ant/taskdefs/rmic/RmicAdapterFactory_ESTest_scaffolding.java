/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Thu May 12 10:08:52 GMT 2022
 */

package com.google.javascript.jscomp.jarjar.org.apache.tools.ant.taskdefs.rmic;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class RmicAdapterFactory_ESTest_scaffolding {

  @org.junit.Rule
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.taskdefs.rmic.RmicAdapterFactory"; 
    org.evosuite.runtime.GuiSupport.initialize(); 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfThreads = 100; 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfIterationsPerLoop = 10000; 
    org.evosuite.runtime.RuntimeSettings.mockSystemIn = true; 
    org.evosuite.runtime.RuntimeSettings.sandboxMode = org.evosuite.runtime.sandbox.Sandbox.SandboxMode.RECOMMENDED; 
    org.evosuite.runtime.sandbox.Sandbox.initializeSecurityManagerForSUT(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.init();
    setSystemProperties();
    initializeClasses();
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
  } 

  @AfterClass
  public static void clearEvoSuiteFramework(){ 
    Sandbox.resetDefaultSecurityManager(); 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
  } 

  @Before
  public void initTestCase(){ 
    threadStopper.storeCurrentThreads();
    threadStopper.startRecordingTime();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().initHandler(); 
    org.evosuite.runtime.sandbox.Sandbox.goingToExecuteSUTCode(); 
    setSystemProperties(); 
    org.evosuite.runtime.GuiSupport.setHeadless(); 
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
    org.evosuite.runtime.agent.InstrumentingAgent.activate(); 
  } 

  @After
  public void doneWithTestCase(){ 
    threadStopper.killAndJoinClientThreads();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().safeExecuteAddedHooks(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.reset(); 
    resetClasses(); 
    org.evosuite.runtime.sandbox.Sandbox.doneWithExecutingSUTCode(); 
    org.evosuite.runtime.agent.InstrumentingAgent.deactivate(); 
    org.evosuite.runtime.GuiSupport.restoreHeadlessMode(); 
  } 

  public static void setSystemProperties() {
 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
    java.lang.System.setProperty("sun.boot.class.path", "/home/panlj/jdk1.8.0_161/jre/lib/resources.jar:/home/panlj/jdk1.8.0_161/jre/lib/rt.jar:/home/panlj/jdk1.8.0_161/jre/lib/sunrsasign.jar:/home/panlj/jdk1.8.0_161/jre/lib/jsse.jar:/home/panlj/jdk1.8.0_161/jre/lib/jce.jar:/home/panlj/jdk1.8.0_161/jre/lib/charsets.jar:/home/panlj/jdk1.8.0_161/jre/lib/jfr.jar:/home/panlj/jdk1.8.0_161/jre/classes"); 
    java.lang.System.setProperty("user.dir", "/home/wangmiaomiao/testData/findBugs/compiler/ssh"); 
    java.lang.System.setProperty("java.io.tmpdir", "/tmp"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(RmicAdapterFactory_ESTest_scaffolding.class.getClassLoader() ,
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.PathTokenizer",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.SubBuildListener",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.TaskContainer",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.selectors.SizeSelector",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.selectors.ExtendSelector",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.taskdefs.condition.Os",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.selectors.BaseExtendSelector",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.selectors.OrSelector",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.ResourceFactory",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.selectors.SelectorContainer",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.Path",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.resources.selectors.ResourceSelector",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.selectors.SelectSelector",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.PatternSet",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.BuildEvent",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.RuntimeConfigurable",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.CommandlineJava",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.FilterSetCollection",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.taskdefs.Rmic$ImplementationSpecificArgument",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.selectors.BaseSelectorContainer",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.selectors.AndSelector",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.ResourceCollection",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.taskdefs.condition.HasMethod",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.PatternSet$PatternFileNameEntry",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.resources.FileProvider",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.taskdefs.condition.AntVersion",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.CommandlineJava$ExecutableType",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.util.IdentityStack",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.taskdefs.condition.Condition",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.AntClassLoader",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.FileSet",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.resources.AppendableResourceCollection",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.util.facade.FacadeTaskHelper",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.PatternSet$InvertedPatternSet",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.selectors.NoneSelector",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.Executor",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.Commandline",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.selectors.PresentSelector",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.Location",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.Task",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.taskdefs.rmic.RmicAdapter",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.util.ClasspathUtils",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.taskdefs.Available",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.Commandline$Argument",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.input.InputHandler",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.util.JavaEnvUtils",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.selectors.NotSelector",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.FilterSet",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.BuildException",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.util.DeweyDecimal",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.selectors.DifferentSelector",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.Reference",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.Mapper",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.FileScanner",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.Target",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.DirectoryScanner",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.selectors.TypeSelector",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.taskdefs.rmic.SunRmic",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.selectors.DepthSelector",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.PatternSet$NameEntry",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.taskdefs.rmic.WLRmic",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.EnumeratedAttribute",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.Assertions",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.FilterSet$OnMissing",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.selectors.DateSelector",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.taskdefs.UpToDate",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.CommandlineJava$SysProperties",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.taskdefs.rmic.ForkingSunRmic",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.selectors.FileSelector",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.resources.FileResource",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.taskdefs.MatchingTask",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.selectors.modifiedselector.ModifiedSelector",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.selectors.ContainsRegexpSelector",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.zip.ZipLong",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.taskdefs.rmic.RmicAdapterFactory",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.taskdefs.rmic.XNewRmic",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.resources.FailFast",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.taskdefs.rmic.DefaultRmicAdapter",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.util.VectorSet",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.FileList",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.AbstractFileSet",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.Environment",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.selectors.SelectorScanner",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.Project",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.resources.Union",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.UnknownElement",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.Environment$Variable",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.taskdefs.Available$FileDir",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.taskdefs.Rmic",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.ProjectComponent",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.selectors.ExtendFileSelector",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.selectors.DependSelector",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.selectors.BaseSelector",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.util.FileNameMapper",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.selectors.FilenameSelector",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.selectors.MajoritySelector",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.Path$PathElement",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.resources.BaseResourceCollectionContainer",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.util.FileUtils",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.Resource",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.taskdefs.rmic.KaffeRmic",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.Project$AntRefTable",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.PropertySet",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.Parameterizable",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.BuildListener",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.util.FileUtils$1",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.input.DefaultInputHandler",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.DirSet",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.selectors.ContainsSelector",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.taskdefs.ExecuteStreamHandler",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.DataType",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.selectors.MappingSelector",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.resources.Appendable",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.util.facade.ImplementationSpecificArgument",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.resources.Touchable"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(RmicAdapterFactory_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.taskdefs.rmic.RmicAdapterFactory",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.taskdefs.rmic.DefaultRmicAdapter",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.taskdefs.rmic.KaffeRmic",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.taskdefs.condition.Os",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.util.FileUtils",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.util.DeweyDecimal",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.util.JavaEnvUtils",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.ProjectComponent",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.Task",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.taskdefs.MatchingTask",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.taskdefs.Rmic",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.Location",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.DataType",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.AbstractFileSet",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.FileSet",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.PatternSet",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.util.facade.FacadeTaskHelper",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.selectors.BaseSelector",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.selectors.BaseSelectorContainer",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.selectors.SelectSelector",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.selectors.NoneSelector",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.taskdefs.rmic.SunRmic",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.TaskAdapter",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.UnknownElement",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.RuntimeConfigurable",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.Project",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.taskdefs.Available",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.Path$PathElement",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.resources.BaseResourceCollectionContainer",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.resources.Union",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.resources.FailFast",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.PathTokenizer",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.Path",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.BuildException",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.taskdefs.rmic.WLRmic",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.taskdefs.Checksum",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.EnumeratedAttribute",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.taskdefs.Checksum$FormatElement",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.taskdefs.UpToDate",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.selectors.ExtendSelector",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.CommandlineJava",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.Commandline",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.Environment",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.CommandlineJava$SysProperties",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.AntFilterReader",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.taskdefs.condition.HasMethod",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.taskdefs.rmic.ForkingSunRmic",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.taskdefs.rmic.XNewRmic",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.Target",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.selectors.BaseExtendSelector",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.selectors.SizeSelector",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.Comparison",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.taskdefs.condition.AntVersion",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.filters.BaseFilterReader",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.filters.BaseParamFilterReader",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.filters.ConcatFilter",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.filters.PrefixLines",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.Project$AntRefTable",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.FilterSet",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.FilterSet$OnMissing",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.FilterSetCollection",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.input.DefaultInputHandler",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.BuildEvent",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.Mapper",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.DirSet",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.selectors.MajoritySelector",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.selectors.NotSelector",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.taskdefs.condition.ResourceContains",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.selectors.MappingSelector",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.selectors.DifferentSelector",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.selectors.modifiedselector.ModifiedSelector",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.selectors.OrSelector",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.filters.SortFilter",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.resources.FileResourceIterator",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.Resource",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.resources.FileResource",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.filters.LineContainsRegExp",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.filters.ExpandProperties",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.PatternSet$NameEntry",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.taskdefs.rmic.DefaultRmicAdapter$RmicFileNameMapper",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.selectors.ContainsRegexpSelector",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.selectors.ExecutableSelector",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.Reference",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.Commandline$Argument",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.ComponentHelper",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.PropertyHelper$1",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.PropertyHelper$2",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.PropertyHelper",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.property.ParseProperties",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.helper.SingleCheckExecutor",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.helper.DefaultExecutor",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.ArchiveFileSet",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.ZipFileSet",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.CommandlineJava$ExecutableType",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.selectors.PresentSelector",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.DirectoryScanner",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.selectors.DepthSelector",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.TarFileSet",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.selectors.ContainsSelector",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.taskdefs.Available$FileDir",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.selectors.ReadableSelector",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.selectors.WritableSelector",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.ProjectHelper",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.selectors.FilenameSelector",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.PatternSet$PatternFileNameEntry",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.util.ContainerMapper",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.util.CompositeMapper",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.util.facade.ImplementationSpecificArgument",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.taskdefs.Rmic$ImplementationSpecificArgument",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.PropertySet",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.selectors.DateSelector",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.TimeComparison",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.selectors.AndSelector",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.AntTypeDefinition",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.DefaultDefinitions",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.taskdefs.AntlibDefinition",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.taskdefs.DefBase",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.taskdefs.Definer",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.taskdefs.Typedef",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.taskdefs.Definer$OnError",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.util.ClasspathUtils",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.util.ClasspathUtils$Delegate",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.zip.ZipLong",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.AntClassLoader",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.util.VectorSet",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.AntClassLoader$ResourceEnumeration",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.IntrospectionHelper",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.IntrospectionHelper$AttributeSetter",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.IntrospectionHelper$3",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.IntrospectionHelper$2",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.resources.selectors.ResourceSelectorContainer",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.resources.Restrict",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.taskdefs.Checksum$FileUnion",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.resources.AbstractResourceCollectionWrapper",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.resources.LazyResourceCollectionWrapper",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.resources.Restrict$1",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.resources.selectors.Type$FileDir",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.resources.selectors.Type",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.selectors.DependSelector",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.selectors.TypeSelector",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.filters.TokenFilter",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.filters.FixCrLfFilter",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.filters.FixCrLfFilter$AddAsisRemove",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.filters.FixCrLfFilter$CrLf",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.selectors.PosixGroupSelector",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.FileList",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.util.ChainedMapper",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.Parameter",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.IntrospectionHelper$NestedCreator",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.IntrospectionHelper$CreateNestedCreator",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.IntrospectionHelper$12",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.IntrospectionHelper$7",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.IntrospectionHelper$5",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.IntrospectionHelper$10",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.input.PropertyFileInputHandler",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.Description",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.dispatch.DispatchUtils",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.selectors.SymlinkSelector",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.util.GlobPatternMapper",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.util.PackageNameMapper",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.util.StringUtils",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.DefaultLogger",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.NoBannerLogger",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.input.SecureInputHandler",
      "com.google.javascript.jscomp.NodeUtil$MatchDeclaration",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.IntrospectionHelper$AddNestedCreator",
      "com.google.javascript.jscomp.FunctionTypeBuilder$ImplementedTypeValidator",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.Environment$Variable",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.filters.TokenFilter$DeleteCharacters",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.filters.TokenFilter$DeleteCharacters$1",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.selectors.SignedSelector",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.taskdefs.condition.IsSigned",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.filters.StripJavaComments",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.selectors.PosixPermissionsSelector",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.util.RegexpPatternMapper",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.util.regexp.RegexpMatcherFactory",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.util.regexp.Jdk14RegexpMatcher",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.IntrospectionHelper$1",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.property.LocalProperties",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.filters.HeadFilter",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.util.LineTokenizer",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.filters.TabsToSpaces",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.util.regexp.RegexpFactory",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.RegularExpression",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.XmlLogger",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.util.FileTokenizer",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.util.FlatFileNameMapper",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.filters.ReplaceTokens",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.selectors.OwnedBySelector",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.taskdefs.condition.TypeFound",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.helper.IgnoreDependenciesExecutor",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.filters.TailFilter",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.resources.LazyResourceCollectionWrapper$FilteringIterator",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.util.IdentityMapper",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.input.GreedyInputHandler",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.util.FirstMatchMapper",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.taskdefs.condition.ParserSupports",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.util.UnPackageNameMapper",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.selectors.SizeSelector$ByteUnits",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.Mapper$MapperType",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.selectors.SizeSelector$SizeComparisons",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.selectors.modifiedselector.ModifiedSelector$AlgorithmName",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.PropertySet$BuiltinPropertySetName",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.selectors.modifiedselector.ModifiedSelector$ComparatorName",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.selectors.PresentSelector$FilePresence",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.selectors.DateSelector$TimeComparisons"
    );
  }
}
