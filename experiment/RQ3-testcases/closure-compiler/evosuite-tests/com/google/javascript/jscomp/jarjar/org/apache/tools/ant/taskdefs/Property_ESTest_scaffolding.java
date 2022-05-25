/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Thu May 12 10:01:50 GMT 2022
 */

package com.google.javascript.jscomp.jarjar.org.apache.tools.ant.taskdefs;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class Property_ESTest_scaffolding {

  @org.junit.Rule
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.taskdefs.Property"; 
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
    java.lang.System.setProperty("user.dir", "/home/wangmiaomiao/testData/findBugs/compiler/ssh"); 
    java.lang.System.setProperty("sun.boot.class.path", "/home/panlj/jdk1.8.0_161/jre/lib/resources.jar:/home/panlj/jdk1.8.0_161/jre/lib/rt.jar:/home/panlj/jdk1.8.0_161/jre/lib/sunrsasign.jar:/home/panlj/jdk1.8.0_161/jre/lib/jsse.jar:/home/panlj/jdk1.8.0_161/jre/lib/jce.jar:/home/panlj/jdk1.8.0_161/jre/lib/charsets.jar:/home/panlj/jdk1.8.0_161/jre/lib/jfr.jar:/home/panlj/jdk1.8.0_161/jre/classes"); 
    java.lang.System.setProperty("java.io.tmpdir", "/tmp"); 
    java.lang.System.setProperty("user.home", "/home/wangmiaomiao"); 
    java.lang.System.setProperty("file.encoding", "UTF-8"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(Property_ESTest_scaffolding.class.getClassLoader() ,
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.PathTokenizer",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.SubBuildListener",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.TaskContainer",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.taskdefs.condition.Os",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.PropertyHelper$Delegate",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.resources.FileResource",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.ResourceFactory",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.Path",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.selectors.SelectorContainer",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.zip.ZipLong",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.BuildEvent",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.RuntimeConfigurable",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.FilterSetCollection",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.resources.FailFast",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.property.PropertyExpander",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.property.ParseProperties",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.PropertyHelper$PropertyEvaluator",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.util.VectorSet",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.FileList",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.ResourceCollection",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.property.GetProperty",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.AbstractFileSet",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.resources.FileProvider",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.Project",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.util.IdentityStack",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.resources.Union",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.taskdefs.condition.Condition",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.UnknownElement",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.AntClassLoader",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.property.ResolvePropertyMap",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.FileSet",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.taskdefs.Available$FileDir",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.resources.AppendableResourceCollection",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.ProjectComponent",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.taskdefs.Execute$1",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.Executor",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.Location",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.Task",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.property.ParseNextProperty",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.taskdefs.Property",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.taskdefs.Execute",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.taskdefs.Available",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.PropertyHelper$2",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.PropertyHelper",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.Path$PathElement",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.input.InputHandler",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.resources.BaseResourceCollectionContainer",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.util.JavaEnvUtils",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.taskdefs.ProcessDestroyer",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.util.FileUtils",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.PropertyHelper$1",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.Resource",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.FilterSet",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.PropertyHelper$PropertySetter",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.Project$AntRefTable",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.BuildException",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.BuildListener",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.util.DeweyDecimal",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.Reference",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.util.FileUtils$1",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.Target",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.input.DefaultInputHandler",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.DirSet",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.taskdefs.ExecuteStreamHandler",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.EnumeratedAttribute",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.DataType",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.resources.Appendable",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.FilterSet$OnMissing",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.resources.Touchable"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(Property_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.ProjectComponent",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.Task",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.taskdefs.Property",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.taskdefs.condition.Os",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.taskdefs.ProcessDestroyer",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.taskdefs.Execute",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.util.FileUtils",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.Location",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.DataType",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.PropertySet",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.Target",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.PropertyHelper$1",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.PropertyHelper$2",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.PropertyHelper",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.Project",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.Project$AntRefTable",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.FilterSet",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.EnumeratedAttribute",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.FilterSet$OnMissing",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.FilterSetCollection",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.input.DefaultInputHandler",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.ComponentHelper",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.BuildEvent",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.property.ParseProperties",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.helper.SingleCheckExecutor",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.helper.DefaultExecutor",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.taskdefs.condition.ResourceContains",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.Reference",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.filters.BaseFilterReader",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.filters.TokenFilter",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.filters.BaseParamFilterReader",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.filters.ConcatFilter",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.AbstractFileSet",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.FileSet",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.ArchiveFileSet",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.ZipFileSet",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.PatternSet",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.property.ResolvePropertyMap",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.Path$PathElement",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.resources.BaseResourceCollectionContainer",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.resources.Union",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.resources.FailFast",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.PathTokenizer",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.Path",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.taskdefs.MatchingTask",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.taskdefs.Checksum",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.taskdefs.Checksum$FormatElement",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.taskdefs.Available",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.BuildException",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.UnknownElement",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.RuntimeConfigurable",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.TaskAdapter",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.CommandlineJava",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.Commandline",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.Environment",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.CommandlineJava$SysProperties",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.util.DeweyDecimal",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.util.JavaEnvUtils",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.filters.StripJavaComments",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.Resource",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.selectors.BaseSelector",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.selectors.ExtendSelector",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.resources.FileResource",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.DirSet",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.TarFileSet",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.PatternSet$NameEntry",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.DirectoryScanner",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.input.GreedyInputHandler",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.selectors.BaseExtendSelector",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.selectors.DepthSelector",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.FileList",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.filters.SortFilter",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.filters.ExpandProperties",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.zip.ZipLong",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.AntClassLoader",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.util.VectorSet",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.filters.TokenFilter$ChainableReaderFilter",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.filters.TokenFilter$IgnoreBlank",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.taskdefs.condition.ConditionBase",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.taskdefs.condition.Not",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.filters.FixCrLfFilter",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.filters.FixCrLfFilter$AddAsisRemove",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.filters.FixCrLfFilter$CrLf",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.filters.EscapeUnicode",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.taskdefs.condition.HasMethod",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.resources.FileResourceIterator",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.IntrospectionHelper",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.IntrospectionHelper$NestedCreator",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.IntrospectionHelper$CreateNestedCreator",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.IntrospectionHelper$AttributeSetter",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.IntrospectionHelper$3",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.IntrospectionHelper$7",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.IntrospectionHelper$12",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.IntrospectionHelper$5",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.IntrospectionHelper$2",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.AntFilterReader",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.selectors.BaseSelectorContainer",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.selectors.AndSelector",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.CommandlineJava$ExecutableType",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.filters.SuffixLines",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.filters.StripLineComments",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.selectors.DateSelector",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.TimeComparison",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.selectors.FilenameSelector",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.selectors.ReadableSelector",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.Commandline$Argument",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.ProjectHelper",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.AntTypeDefinition",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.DefaultDefinitions",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.taskdefs.AntlibDefinition",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.taskdefs.DefBase",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.taskdefs.Definer",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.taskdefs.Typedef",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.taskdefs.Definer$OnError",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.util.ClasspathUtils",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.util.ClasspathUtils$Delegate",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.AntClassLoader$ResourceEnumeration",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.filters.HeadFilter",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.filters.LineContains",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.selectors.PresentSelector",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.Mapper",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.filters.TailFilter",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.filters.LineContainsRegExp",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.filters.ClassConstants",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.filters.PrefixLines",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.filters.ReplaceTokens",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.filters.TabsToSpaces",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.taskdefs.condition.IsTrue",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.helper.IgnoreDependenciesExecutor",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.filters.UniqFilter",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.util.LineTokenizer",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.PatternSet$PatternFileNameEntry",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.Parameter",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.input.InputRequest",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.util.KeepAliveInputStream",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.filters.StripLineBreaks",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.Description",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.selectors.MappingSelector",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.selectors.DifferentSelector",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.input.PropertyFileInputHandler",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.taskdefs.UpToDate",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.property.LocalProperties",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.selectors.modifiedselector.ModifiedSelector",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.dispatch.DispatchUtils",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.PropertySet$BuiltinPropertySetName",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.PropertySet$PropertyRef",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.util.SourceFileScanner",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.util.MergingMapper",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.input.SecureInputHandler",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.taskdefs.condition.Matches",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.filters.TokenFilter$DeleteCharacters",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.filters.TokenFilter$DeleteCharacters$1",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.taskdefs.condition.AntVersion",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.filters.FixCrLfFilter$SimpleFilterReader",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.filters.FixCrLfFilter$RemoveEofFilter",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.filters.FixCrLfFilter$NormalizeEolFilter",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.util.regexp.RegexpMatcherFactory",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.util.regexp.Jdk14RegexpMatcher",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.util.regexp.RegexpUtil",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.selectors.WritableSelector",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.selectors.ContainsRegexpSelector",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.selectors.PosixGroupSelector",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.selectors.OrSelector",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.taskdefs.Redirector",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.selectors.PosixPermissionsSelector",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.FileList$FileName",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.selectors.OwnedBySelector",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.selectors.NoneSelector",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.types.selectors.NotSelector",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.taskdefs.condition.IsFailure",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.taskdefs.condition.Equals",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.util.StringUtils",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.DefaultLogger",
      "com.google.javascript.jscomp.jarjar.org.apache.tools.ant.util.IdentityMapper"
    );
  }
}
