/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Thu May 12 09:46:12 GMT 2022
 */

package com.google.debugging.sourcemap;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class SourceMapGeneratorV3_ESTest_scaffolding {

  @org.junit.Rule
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "com.google.debugging.sourcemap.SourceMapGeneratorV3"; 
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
    java.lang.System.setProperty("java.io.tmpdir", "/tmp"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(SourceMapGeneratorV3_ESTest_scaffolding.class.getClassLoader() ,
      "com.google.javascript.jscomp.jarjar.com.google.gson.internal.bind.TypeAdapters$4",
      "com.google.javascript.jscomp.jarjar.com.google.gson.internal.bind.TypeAdapters$5",
      "com.google.javascript.jscomp.jarjar.com.google.gson.internal.bind.TypeAdapters$2",
      "com.google.javascript.jscomp.jarjar.com.google.gson.internal.bind.TypeAdapters$3",
      "com.google.javascript.jscomp.jarjar.com.google.gson.internal.bind.ReflectiveTypeAdapterFactory$1",
      "com.google.debugging.sourcemap.SourceMapping",
      "com.google.javascript.jscomp.jarjar.com.google.gson.internal.bind.TypeAdapters$8",
      "com.google.debugging.sourcemap.SourceMapGeneratorV3",
      "com.google.javascript.jscomp.jarjar.com.google.gson.internal.bind.TypeAdapters$9",
      "com.google.javascript.jscomp.jarjar.com.google.gson.internal.bind.TypeAdapters$6",
      "com.google.javascript.jscomp.jarjar.com.google.gson.internal.bind.TypeAdapters$7",
      "com.google.debugging.sourcemap.SourceMapGeneratorV3$MappingVisitor",
      "com.google.javascript.jscomp.jarjar.com.google.gson.internal.bind.TypeAdapters$29",
      "com.google.javascript.jscomp.jarjar.com.google.gson.internal.bind.TypeAdapters$28",
      "com.google.javascript.jscomp.jarjar.com.google.gson.internal.ObjectConstructor",
      "com.google.javascript.jscomp.jarjar.com.google.gson.internal.bind.TypeAdapters$1",
      "com.google.javascript.jscomp.jarjar.com.google.gson.internal.bind.DateTypeAdapter$1",
      "com.google.javascript.jscomp.jarjar.com.google.gson.internal.bind.TypeAdapters$34",
      "com.google.javascript.jscomp.jarjar.com.google.gson.internal.bind.TypeAdapters$33",
      "com.google.javascript.jscomp.jarjar.com.google.gson.internal.bind.TypeAdapters$32",
      "com.google.debugging.sourcemap.SourceMapGeneratorV3$Mapping",
      "com.google.javascript.jscomp.jarjar.com.google.gson.internal.bind.TypeAdapters$36",
      "com.google.javascript.jscomp.jarjar.com.google.gson.internal.bind.TypeAdapters$35",
      "com.google.javascript.jscomp.jarjar.com.google.gson.reflect.TypeToken",
      "com.google.javascript.jscomp.jarjar.com.google.gson.TypeAdapter$1",
      "com.google.javascript.jscomp.jarjar.com.google.gson.internal.bind.TypeAdapters$30",
      "com.google.debugging.sourcemap.SourceMapGeneratorV3$ConsumerEntryVisitor",
      "com.google.javascript.jscomp.jarjar.com.google.gson.internal.bind.SqlDateTypeAdapter$1",
      "com.google.javascript.jscomp.jarjar.com.google.gson.internal.bind.ReflectiveTypeAdapterFactory",
      "com.google.debugging.sourcemap.SourceMapSection",
      "com.google.javascript.jscomp.jarjar.com.google.gson.FieldNamingPolicy$5",
      "com.google.javascript.jscomp.jarjar.com.google.gson.internal.bind.TimeTypeAdapter",
      "com.google.javascript.jscomp.jarjar.com.google.gson.FieldNamingPolicy$4",
      "com.google.javascript.jscomp.jarjar.com.google.gson.internal.bind.TypeAdapters",
      "com.google.javascript.jscomp.jarjar.com.google.common.base.JdkPattern",
      "com.google.javascript.jscomp.jarjar.com.google.gson.JsonSyntaxException",
      "com.google.javascript.jscomp.jarjar.com.google.gson.FieldNamingPolicy$1",
      "com.google.javascript.jscomp.jarjar.com.google.common.base.Platform",
      "com.google.javascript.jscomp.jarjar.com.google.gson.FieldNamingPolicy$3",
      "com.google.javascript.jscomp.jarjar.com.google.gson.FieldNamingPolicy$2",
      "com.google.javascript.jscomp.jarjar.com.google.gson.internal.bind.MapTypeAdapterFactory",
      "com.google.javascript.jscomp.jarjar.com.google.gson.internal.bind.JsonAdapterAnnotationTypeAdapterFactory",
      "com.google.debugging.sourcemap.SourceMapObjectParser",
      "com.google.javascript.jscomp.jarjar.com.google.gson.internal.bind.ArrayTypeAdapter",
      "com.google.javascript.jscomp.jarjar.com.google.gson.Gson$FutureTypeAdapter",
      "com.google.javascript.jscomp.jarjar.com.google.gson.internal.bind.TimeTypeAdapter$1",
      "com.google.debugging.sourcemap.SourceMapSupplier",
      "com.google.debugging.sourcemap.SourceMapGenerator",
      "com.google.javascript.jscomp.jarjar.com.google.gson.internal.LazilyParsedNumber",
      "com.google.javascript.jscomp.jarjar.com.google.gson.internal.bind.JsonTreeReader",
      "com.google.javascript.jscomp.jarjar.com.google.gson.JsonObject",
      "com.google.javascript.jscomp.jarjar.com.google.gson.stream.JsonReader$1",
      "com.google.javascript.jscomp.jarjar.com.google.gson.JsonArray",
      "com.google.javascript.jscomp.jarjar.com.google.gson.JsonIOException",
      "com.google.javascript.jscomp.jarjar.com.google.gson.stream.JsonToken",
      "com.google.javascript.jscomp.jarjar.com.google.gson.internal.bind.ObjectTypeAdapter$1",
      "com.google.debugging.sourcemap.FilePosition",
      "com.google.javascript.jscomp.jarjar.com.google.gson.internal.bind.JsonTreeWriter",
      "com.google.javascript.jscomp.jarjar.com.google.common.base.Strings",
      "com.google.debugging.sourcemap.Base64",
      "com.google.javascript.jscomp.jarjar.com.google.gson.FieldNamingPolicy",
      "com.google.debugging.sourcemap.Base64VLQ",
      "com.google.javascript.jscomp.jarjar.com.google.gson.JsonElement",
      "com.google.javascript.jscomp.jarjar.com.google.common.base.Platform$JdkPatternCompiler",
      "com.google.javascript.jscomp.jarjar.com.google.gson.internal.bind.TypeAdapters$26$1",
      "com.google.debugging.sourcemap.SourceMapGeneratorV3$UsedMappingCheck",
      "com.google.javascript.jscomp.jarjar.com.google.gson.internal.bind.ArrayTypeAdapter$1",
      "com.google.javascript.jscomp.jarjar.com.google.gson.Gson$1",
      "com.google.javascript.jscomp.jarjar.com.google.gson.Gson$2",
      "com.google.javascript.jscomp.jarjar.com.google.common.base.PatternCompiler",
      "com.google.javascript.jscomp.jarjar.com.google.gson.Gson$3",
      "com.google.javascript.jscomp.jarjar.com.google.gson.Gson$4",
      "com.google.debugging.sourcemap.SourceMappingReversable",
      "com.google.javascript.jscomp.jarjar.com.google.gson.Gson$5",
      "com.google.javascript.jscomp.jarjar.com.google.gson.Gson$6",
      "com.google.javascript.jscomp.jarjar.com.google.gson.Gson",
      "com.google.javascript.jscomp.jarjar.com.google.gson.internal.Excluder$1",
      "com.google.debugging.sourcemap.Util",
      "com.google.debugging.sourcemap.SourceMapGeneratorV3$LineMapper",
      "com.google.javascript.jscomp.jarjar.com.google.gson.internal.bind.MapTypeAdapterFactory$Adapter",
      "com.google.debugging.sourcemap.SourceMapParseException",
      "com.google.debugging.sourcemap.SourceMapGeneratorV3$ExtensionMergeAction",
      "com.google.javascript.jscomp.jarjar.com.google.gson.LongSerializationPolicy",
      "com.google.debugging.sourcemap.SourceMapConsumerV3$EntryVisitor",
      "com.google.javascript.jscomp.jarjar.com.google.gson.internal.$Gson$Types",
      "com.google.javascript.jscomp.jarjar.com.google.gson.TypeAdapterFactory",
      "com.google.javascript.jscomp.jarjar.com.google.gson.internal.bind.ReflectiveTypeAdapterFactory$Adapter",
      "com.google.javascript.jscomp.jarjar.com.google.gson.internal.bind.ReflectiveTypeAdapterFactory$BoundField",
      "com.google.javascript.jscomp.jarjar.com.google.gson.internal.bind.ObjectTypeAdapter",
      "com.google.javascript.jscomp.jarjar.com.google.gson.internal.Primitives",
      "com.google.javascript.jscomp.jarjar.com.google.gson.stream.JsonWriter",
      "com.google.javascript.jscomp.jarjar.com.google.gson.TypeAdapter",
      "com.google.javascript.jscomp.jarjar.com.google.gson.LongSerializationPolicy$1",
      "com.google.debugging.sourcemap.SourceMapGeneratorV3$MappingTraversal",
      "com.google.javascript.jscomp.jarjar.com.google.gson.LongSerializationPolicy$2",
      "com.google.debugging.sourcemap.SourceMapConsumerV3",
      "com.google.javascript.jscomp.jarjar.com.google.gson.internal.bind.CollectionTypeAdapterFactory$Adapter",
      "com.google.javascript.jscomp.jarjar.com.google.gson.internal.bind.TypeAdapterRuntimeTypeWrapper",
      "com.google.javascript.jscomp.jarjar.com.google.gson.internal.bind.CollectionTypeAdapterFactory",
      "com.google.debugging.sourcemap.SourceMapSection$SectionType",
      "com.google.javascript.jscomp.jarjar.com.google.gson.internal.ConstructorConstructor",
      "com.google.javascript.jscomp.jarjar.com.google.common.base.CommonPattern",
      "com.google.javascript.jscomp.jarjar.com.google.gson.internal.bind.DateTypeAdapter",
      "com.google.debugging.sourcemap.SourceMapObject",
      "com.google.javascript.jscomp.jarjar.com.google.gson.internal.Excluder",
      "com.google.javascript.jscomp.jarjar.com.google.gson.internal.$Gson$Preconditions",
      "com.google.javascript.jscomp.jarjar.com.google.gson.JsonPrimitive",
      "com.google.javascript.jscomp.jarjar.com.google.gson.JsonNull",
      "com.google.javascript.jscomp.jarjar.com.google.gson.internal.bind.SqlDateTypeAdapter",
      "com.google.debugging.sourcemap.SourceMapObject$Builder",
      "com.google.javascript.jscomp.jarjar.com.google.gson.internal.bind.TreeTypeAdapter",
      "com.google.debugging.sourcemap.Util$1UnescapedRegion",
      "com.google.javascript.jscomp.jarjar.com.google.gson.internal.bind.TypeAdapters$35$1",
      "com.google.javascript.jscomp.jarjar.com.google.gson.internal.bind.TypeAdapters$12",
      "com.google.javascript.jscomp.jarjar.com.google.gson.stream.JsonReader",
      "com.google.javascript.jscomp.jarjar.com.google.gson.internal.bind.TypeAdapters$11",
      "com.google.javascript.jscomp.jarjar.com.google.gson.internal.bind.TypeAdapters$10",
      "com.google.javascript.jscomp.jarjar.com.google.gson.internal.bind.TypeAdapters$16",
      "com.google.javascript.jscomp.jarjar.com.google.gson.internal.bind.TypeAdapters$15",
      "com.google.javascript.jscomp.jarjar.com.google.gson.internal.bind.TypeAdapters$EnumTypeAdapter",
      "com.google.javascript.jscomp.jarjar.com.google.gson.internal.bind.TypeAdapters$14",
      "com.google.javascript.jscomp.jarjar.com.google.gson.internal.bind.TypeAdapters$13",
      "com.google.javascript.jscomp.jarjar.com.google.gson.JsonParseException",
      "com.google.debugging.sourcemap.SourceMapConsumer",
      "com.google.javascript.jscomp.jarjar.com.google.gson.internal.JsonReaderInternalAccess",
      "com.google.javascript.jscomp.jarjar.com.google.gson.internal.bind.TypeAdapters$19",
      "com.google.javascript.jscomp.jarjar.com.google.gson.internal.bind.TypeAdapters$18",
      "com.google.javascript.jscomp.jarjar.com.google.gson.internal.bind.TypeAdapters$17",
      "com.google.javascript.jscomp.jarjar.com.google.gson.internal.bind.TypeAdapters$23",
      "com.google.javascript.jscomp.jarjar.com.google.gson.internal.bind.TypeAdapters$22",
      "com.google.javascript.jscomp.jarjar.com.google.gson.internal.bind.TypeAdapters$21",
      "com.google.javascript.jscomp.jarjar.com.google.gson.internal.bind.TypeAdapters$20",
      "com.google.javascript.jscomp.jarjar.com.google.gson.internal.bind.TypeAdapters$27",
      "com.google.javascript.jscomp.jarjar.com.google.gson.internal.bind.TypeAdapters$26",
      "com.google.javascript.jscomp.jarjar.com.google.gson.internal.bind.TypeAdapters$25",
      "com.google.javascript.jscomp.jarjar.com.google.common.base.Preconditions",
      "com.google.javascript.jscomp.jarjar.com.google.gson.internal.bind.TypeAdapters$24",
      "com.google.javascript.jscomp.jarjar.com.google.gson.FieldNamingStrategy",
      "com.google.javascript.jscomp.jarjar.com.google.gson.stream.MalformedJsonException"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(SourceMapGeneratorV3_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "com.google.debugging.sourcemap.SourceMapGeneratorV3",
      "com.google.debugging.sourcemap.SourceMapGeneratorV3$Mapping",
      "com.google.debugging.sourcemap.SourceMapGeneratorV3$ConsumerEntryVisitor",
      "com.google.debugging.sourcemap.SourceMapGeneratorV3$MappingTraversal",
      "com.google.debugging.sourcemap.SourceMapGeneratorV3$UsedMappingCheck",
      "com.google.debugging.sourcemap.SourceMapGeneratorV3$LineMapper",
      "com.google.debugging.sourcemap.Util",
      "com.google.debugging.sourcemap.SourceMapSection$SectionType",
      "com.google.debugging.sourcemap.FilePosition",
      "com.google.javascript.jscomp.jarjar.com.google.common.base.Preconditions",
      "com.google.debugging.sourcemap.Util$1UnescapedRegion",
      "com.google.debugging.sourcemap.SourceMapConsumerV3",
      "com.google.javascript.jscomp.jarjar.com.google.gson.reflect.TypeToken",
      "com.google.javascript.jscomp.jarjar.com.google.gson.Gson$1",
      "com.google.javascript.jscomp.jarjar.com.google.gson.internal.$Gson$Types",
      "com.google.javascript.jscomp.jarjar.com.google.gson.Gson",
      "com.google.javascript.jscomp.jarjar.com.google.gson.internal.Excluder",
      "com.google.javascript.jscomp.jarjar.com.google.gson.FieldNamingPolicy",
      "com.google.javascript.jscomp.jarjar.com.google.gson.LongSerializationPolicy",
      "com.google.javascript.jscomp.jarjar.com.google.gson.internal.ConstructorConstructor",
      "com.google.javascript.jscomp.jarjar.com.google.gson.TypeAdapter",
      "com.google.javascript.jscomp.jarjar.com.google.gson.internal.bind.TypeAdapters$1",
      "com.google.javascript.jscomp.jarjar.com.google.gson.internal.bind.TypeAdapters$32",
      "com.google.javascript.jscomp.jarjar.com.google.gson.internal.bind.TypeAdapters$2",
      "com.google.javascript.jscomp.jarjar.com.google.gson.internal.bind.TypeAdapters$3",
      "com.google.javascript.jscomp.jarjar.com.google.gson.internal.bind.TypeAdapters$4",
      "com.google.javascript.jscomp.jarjar.com.google.gson.internal.bind.TypeAdapters$33",
      "com.google.javascript.jscomp.jarjar.com.google.gson.internal.bind.TypeAdapters$5",
      "com.google.javascript.jscomp.jarjar.com.google.gson.internal.bind.TypeAdapters$6",
      "com.google.javascript.jscomp.jarjar.com.google.gson.internal.bind.TypeAdapters$7",
      "com.google.javascript.jscomp.jarjar.com.google.gson.internal.bind.TypeAdapters$8",
      "com.google.javascript.jscomp.jarjar.com.google.gson.TypeAdapter$1",
      "com.google.javascript.jscomp.jarjar.com.google.gson.internal.bind.TypeAdapters$9",
      "com.google.javascript.jscomp.jarjar.com.google.gson.internal.bind.TypeAdapters$10",
      "com.google.javascript.jscomp.jarjar.com.google.gson.internal.bind.TypeAdapters$11",
      "com.google.javascript.jscomp.jarjar.com.google.gson.internal.bind.TypeAdapters$12",
      "com.google.javascript.jscomp.jarjar.com.google.gson.internal.bind.TypeAdapters$13",
      "com.google.javascript.jscomp.jarjar.com.google.gson.internal.bind.TypeAdapters$14",
      "com.google.javascript.jscomp.jarjar.com.google.gson.internal.bind.TypeAdapters$15",
      "com.google.javascript.jscomp.jarjar.com.google.gson.internal.bind.TypeAdapters$16",
      "com.google.javascript.jscomp.jarjar.com.google.gson.internal.bind.TypeAdapters$17",
      "com.google.javascript.jscomp.jarjar.com.google.gson.internal.bind.TypeAdapters$18",
      "com.google.javascript.jscomp.jarjar.com.google.gson.internal.bind.TypeAdapters$19",
      "com.google.javascript.jscomp.jarjar.com.google.gson.internal.bind.TypeAdapters$20",
      "com.google.javascript.jscomp.jarjar.com.google.gson.internal.bind.TypeAdapters$21",
      "com.google.javascript.jscomp.jarjar.com.google.gson.internal.bind.TypeAdapters$22",
      "com.google.javascript.jscomp.jarjar.com.google.gson.internal.bind.TypeAdapters$23",
      "com.google.javascript.jscomp.jarjar.com.google.gson.internal.bind.TypeAdapters$35",
      "com.google.javascript.jscomp.jarjar.com.google.gson.internal.bind.TypeAdapters$24",
      "com.google.javascript.jscomp.jarjar.com.google.gson.internal.bind.TypeAdapters$25",
      "com.google.javascript.jscomp.jarjar.com.google.gson.internal.bind.TypeAdapters$26",
      "com.google.javascript.jscomp.jarjar.com.google.gson.internal.bind.TypeAdapters$27",
      "com.google.javascript.jscomp.jarjar.com.google.gson.internal.bind.TypeAdapters$34",
      "com.google.javascript.jscomp.jarjar.com.google.gson.internal.bind.TypeAdapters$28",
      "com.google.javascript.jscomp.jarjar.com.google.gson.internal.bind.TypeAdapters$29",
      "com.google.javascript.jscomp.jarjar.com.google.gson.internal.bind.TypeAdapters$30",
      "com.google.javascript.jscomp.jarjar.com.google.gson.internal.bind.TypeAdapters",
      "com.google.javascript.jscomp.jarjar.com.google.gson.internal.bind.ObjectTypeAdapter$1",
      "com.google.javascript.jscomp.jarjar.com.google.gson.internal.bind.ObjectTypeAdapter",
      "com.google.javascript.jscomp.jarjar.com.google.gson.Gson$2",
      "com.google.javascript.jscomp.jarjar.com.google.gson.Gson$3",
      "com.google.javascript.jscomp.jarjar.com.google.gson.Gson$5",
      "com.google.javascript.jscomp.jarjar.com.google.gson.Gson$6",
      "com.google.javascript.jscomp.jarjar.com.google.gson.internal.bind.DateTypeAdapter$1",
      "com.google.javascript.jscomp.jarjar.com.google.gson.internal.bind.DateTypeAdapter",
      "com.google.javascript.jscomp.jarjar.com.google.gson.internal.bind.TimeTypeAdapter$1",
      "com.google.javascript.jscomp.jarjar.com.google.gson.internal.bind.TimeTypeAdapter",
      "com.google.javascript.jscomp.jarjar.com.google.gson.internal.bind.SqlDateTypeAdapter$1",
      "com.google.javascript.jscomp.jarjar.com.google.gson.internal.bind.SqlDateTypeAdapter",
      "com.google.javascript.jscomp.jarjar.com.google.gson.internal.bind.ArrayTypeAdapter$1",
      "com.google.javascript.jscomp.jarjar.com.google.gson.internal.bind.ArrayTypeAdapter",
      "com.google.javascript.jscomp.jarjar.com.google.gson.internal.bind.CollectionTypeAdapterFactory",
      "com.google.javascript.jscomp.jarjar.com.google.gson.internal.bind.MapTypeAdapterFactory",
      "com.google.javascript.jscomp.jarjar.com.google.gson.internal.bind.JsonAdapterAnnotationTypeAdapterFactory",
      "com.google.javascript.jscomp.jarjar.com.google.gson.internal.bind.ReflectiveTypeAdapterFactory",
      "com.google.debugging.sourcemap.SourceMapObjectParser",
      "com.google.debugging.sourcemap.SourceMapObject",
      "com.google.debugging.sourcemap.SourceMapObject$Builder",
      "com.google.javascript.jscomp.jarjar.com.google.gson.internal.JsonReaderInternalAccess",
      "com.google.javascript.jscomp.jarjar.com.google.gson.stream.JsonReader$1",
      "com.google.javascript.jscomp.jarjar.com.google.gson.stream.JsonReader",
      "com.google.javascript.jscomp.jarjar.com.google.gson.internal.Primitives",
      "com.google.javascript.jscomp.jarjar.com.google.gson.internal.$Gson$Preconditions",
      "com.google.javascript.jscomp.jarjar.com.google.gson.stream.JsonToken",
      "com.google.javascript.jscomp.jarjar.com.google.gson.Gson$FutureTypeAdapter",
      "com.google.javascript.jscomp.jarjar.com.google.gson.internal.bind.TypeAdapters$35$1",
      "com.google.javascript.jscomp.jarjar.com.google.gson.internal.bind.TypeAdapters$36",
      "com.google.javascript.jscomp.jarjar.com.google.gson.JsonElement",
      "com.google.javascript.jscomp.jarjar.com.google.gson.JsonPrimitive",
      "com.google.javascript.jscomp.jarjar.com.google.gson.JsonParseException",
      "com.google.javascript.jscomp.jarjar.com.google.gson.JsonSyntaxException",
      "com.google.debugging.sourcemap.SourceMapParseException",
      "com.google.javascript.jscomp.jarjar.com.google.common.base.MoreObjects",
      "com.google.javascript.jscomp.jarjar.com.google.common.base.MoreObjects$ToStringHelper",
      "com.google.javascript.jscomp.jarjar.com.google.common.base.MoreObjects$ToStringHelper$ValueHolder",
      "com.google.javascript.jscomp.jarjar.com.google.common.base.MoreObjects$ToStringHelper$UnconditionalValueHolder",
      "com.google.debugging.sourcemap.SourceMapSection",
      "com.google.javascript.jscomp.jarjar.com.google.gson.stream.MalformedJsonException",
      "com.google.debugging.sourcemap.Base64VLQ",
      "com.google.debugging.sourcemap.Base64",
      "com.google.javascript.jscomp.jarjar.com.google.gson.JsonObject",
      "com.google.javascript.jscomp.jarjar.com.google.gson.internal.LinkedTreeMap$1",
      "com.google.javascript.jscomp.jarjar.com.google.gson.internal.LinkedTreeMap",
      "com.google.javascript.jscomp.jarjar.com.google.gson.internal.LinkedTreeMap$Node",
      "com.google.javascript.jscomp.jarjar.com.google.gson.JsonArray",
      "com.google.javascript.jscomp.jarjar.com.google.common.base.Strings",
      "com.google.javascript.jscomp.jarjar.com.google.gson.internal.LazilyParsedNumber",
      "com.google.javascript.jscomp.jarjar.com.google.gson.JsonNull",
      "com.google.javascript.jscomp.deps.ModuleLoader$PathResolver",
      "com.google.javascript.jscomp.jarjar.com.google.common.base.Platform$JdkPatternCompiler",
      "com.google.javascript.jscomp.jarjar.com.google.common.base.Platform"
    );
  }
}
