package com.mysql.cj;

import org.junit.Test;

public class NativeSession_Test {

  @Test(timeout = 5000)
  public void test_loadServerVariables_1_1() throws Exception{

      com.mysql.cj.conf.ConnectionUrlParser connectionUrlParser7 = null;
      java.util.Properties properties8 = null;
      com.mysql.cj.conf.ConnectionUrl connectionUrl6 = new com.mysql.cj.conf.url.FailoverDnsSrvConnectionUrl(connectionUrlParser7, properties8);
      com.mysql.cj.jdbc.ha.LoadBalancedConnectionProxy loadBalancedConnectionProxy5 = new com.mysql.cj.jdbc.ha.LoadBalancedConnectionProxy(connectionUrl6);
      com.mysql.cj.jdbc.JdbcConnection jdbcConnection3 = new com.mysql.cj.jdbc.ha.LoadBalancedMySQLConnection(loadBalancedConnectionProxy5);
      java.lang.String string4 = "^[1]([3-9])[0-9]{9}$";
      java.lang.Object object1 = new com.mysql.cj.jdbc.StatementImpl(jdbcConnection3, string4);
      java.lang.String string2 = "*";
      com.mysql.cj.conf.HostInfo hostInfo9 = new com.mysql.cj.conf.HostInfo();
      com.mysql.cj.conf.PropertySet propertySet10 = new com.mysql.cj.jdbc.MysqlDataSource();
      com.mysql.cj.NativeSession nativeSession0 = new com.mysql.cj.NativeSession(hostInfo9, propertySet10);
      nativeSession0.loadServerVariables(object1, string2);

  }



  @Test(timeout = 5000)
  public void test_loadServerVariables_2_2() throws Exception{

      boolean[] booleanArray4 = {};
      sun.security.util.BitArray bitArray3 = new sun.security.util.BitArray(booleanArray4);
      java.lang.Object object1 = new sun.security.x509.UniqueIdentity(bitArray3);
      java.lang.String string2 = "*";
      com.mysql.cj.conf.HostInfo hostInfo5 = new com.mysql.cj.conf.HostInfo();
      com.mysql.cj.conf.PropertySet propertySet6 = new com.mysql.cj.conf.DefaultPropertySet();
      com.mysql.cj.NativeSession nativeSession0 = new com.mysql.cj.NativeSession(hostInfo5, propertySet6);
      nativeSession0.loadServerVariables(object1, string2);

  }



  @Test(timeout = 5000)
  public void test_loadServerVariables_3_3() throws Exception{

      java.lang.Object object1 = new javax.xml.transform.sax.SAXSource();
      java.lang.String string2 = "+*";
      com.mysql.cj.conf.HostInfo hostInfo3 = new com.mysql.cj.conf.HostInfo();
      com.mysql.cj.conf.PropertySet propertySet4 = new com.mysql.cj.jdbc.JdbcPropertySetImpl();
      com.mysql.cj.NativeSession nativeSession0 = new com.mysql.cj.NativeSession(hostInfo3, propertySet4);
      nativeSession0.loadServerVariables(object1, string2);

  }



  @Test(timeout = 5000)
  public void test_loadServerVariables_4_4() throws Exception{

      java.lang.Throwable throwable3 = new java.lang.Throwable();
      java.lang.Object object1 = new java.lang.Throwable(throwable3);
      java.lang.String string2 = "\"";
      com.mysql.cj.conf.HostInfo hostInfo4 = new com.mysql.cj.conf.HostInfo();
      com.mysql.cj.conf.PropertySet propertySet5 = new com.mysql.cj.jdbc.JdbcPropertySetImpl();
      com.mysql.cj.NativeSession nativeSession0 = new com.mysql.cj.NativeSession(hostInfo4, propertySet5);
      nativeSession0.loadServerVariables(object1, string2);

  }



  @Test(timeout = 5000)
  public void test_loadServerVariables_5_5() throws Exception{

      java.lang.Object object1 = new sun.security.util.ResourcesMgr();
      java.lang.String string2 = "";
      com.mysql.cj.conf.HostInfo hostInfo3 = new com.mysql.cj.conf.HostInfo();
      com.mysql.cj.conf.PropertySet propertySet4 = new com.mysql.cj.jdbc.JdbcPropertySetImpl();
      com.mysql.cj.NativeSession nativeSession0 = new com.mysql.cj.NativeSession(hostInfo3, propertySet4);
      nativeSession0.loadServerVariables(object1, string2);

  }



  @Test(timeout = 5000)
  public void test_loadServerVariables_6_6() throws Exception{

      java.lang.String string4 = " ";
      java.lang.Object object3 = new java.lang.String(string4);
      java.lang.Object object1 = new java.text.Annotation(object3);
      java.lang.String string2 = "http://lcs.ios.ac.cn/";
      com.mysql.cj.conf.HostInfo hostInfo5 = new com.mysql.cj.conf.HostInfo();
      com.mysql.cj.conf.PropertySet propertySet6 = new com.mysql.cj.conf.DefaultPropertySet();
      com.mysql.cj.NativeSession nativeSession0 = new com.mysql.cj.NativeSession(hostInfo5, propertySet6);
      nativeSession0.loadServerVariables(object1, string2);

  }



  @Test(timeout = 5000)
  public void test_loadServerVariables_7_7() throws Exception{

      java.lang.String string4 = "a ";
      java.lang.StringBuilder stringBuilder3 = new java.lang.StringBuilder(string4);
      java.lang.Object object1 = new java.lang.String(stringBuilder3);
      java.lang.String string2 = "^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$";
      com.mysql.cj.conf.HostInfo hostInfo5 = new com.mysql.cj.conf.HostInfo();
      com.mysql.cj.conf.PropertySet propertySet6 = new com.mysql.cj.conf.DefaultPropertySet();
      com.mysql.cj.NativeSession nativeSession0 = new com.mysql.cj.NativeSession(hostInfo5, propertySet6);
      nativeSession0.loadServerVariables(object1, string2);

  }



  @Test(timeout = 5000)
  public void test_loadServerVariables_8_8() throws Exception{

      java.lang.String string3 = " ";
      java.lang.Object object1 = new java.lang.ThreadGroup(string3);
      java.lang.String string2 = "<a> </a>";
      com.mysql.cj.conf.HostInfo hostInfo4 = new com.mysql.cj.conf.HostInfo();
      com.mysql.cj.conf.PropertySet propertySet5 = new com.mysql.cj.jdbc.MysqlDataSource();
      com.mysql.cj.NativeSession nativeSession0 = new com.mysql.cj.NativeSession(hostInfo4, propertySet5);
      nativeSession0.loadServerVariables(object1, string2);

  }



  @Test(timeout = 5000)
  public void test_loadServerVariables_9_9() throws Exception{

      java.lang.String string5 = "^[1]([3-9])[0-9]{9}$";
      java.lang.String string6 = ".\\a.txt";
      java.lang.String string7 = "\\n";
      javax.management.ObjectName objectName3 = new javax.management.ObjectName(string5, string6, string7);
      java.lang.String string4 = "[0,1]";
      java.lang.Object object1 = new javax.management.ObjectInstance(objectName3, string4);
      java.lang.String string2 = " ";
      com.mysql.cj.conf.HostInfo hostInfo8 = new com.mysql.cj.conf.HostInfo();
      com.mysql.cj.conf.PropertySet propertySet9 = new com.mysql.cj.conf.DefaultPropertySet();
      com.mysql.cj.NativeSession nativeSession0 = new com.mysql.cj.NativeSession(hostInfo8, propertySet9);
      nativeSession0.loadServerVariables(object1, string2);

  }



  @Test(timeout = 5000)
  public void test_loadServerVariables_10_10() throws Exception{

      java.lang.String string3 = "[0,1]";
      java.lang.Object object1 = new jdk.internal.org.objectweb.asm.ClassReader(string3);
      java.lang.String string2 = "\\n";
      com.mysql.cj.conf.HostInfo hostInfo4 = new com.mysql.cj.conf.HostInfo();
      com.mysql.cj.conf.PropertySet propertySet5 = new com.mysql.cj.conf.DefaultPropertySet();
      com.mysql.cj.NativeSession nativeSession0 = new com.mysql.cj.NativeSession(hostInfo4, propertySet5);
      nativeSession0.loadServerVariables(object1, string2);

  }



  @Test(timeout = 5000)
  public void test_loadServerVariables_11_11() throws Exception{

      boolean boolean3 = false;
      java.lang.Object object1 = new sun.security.provider.PolicyParser(boolean3);
      java.lang.String string2 = "^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$";
      com.mysql.cj.conf.HostInfo hostInfo4 = new com.mysql.cj.conf.HostInfo();
      com.mysql.cj.conf.PropertySet propertySet5 = new com.mysql.cj.jdbc.JdbcPropertySetImpl();
      com.mysql.cj.NativeSession nativeSession0 = new com.mysql.cj.NativeSession(hostInfo4, propertySet5);
      nativeSession0.loadServerVariables(object1, string2);

  }



  @Test(timeout = 5000)
  public void test_loadServerVariables_12_12() throws Exception{

      javax.management.loading.ClassLoaderRepository classLoaderRepository6 = null;
      java.lang.String string2 = "http://lcs.ios.ac.cn/";
      com.mysql.cj.conf.HostInfo hostInfo7 = new com.mysql.cj.conf.HostInfo();
      com.mysql.cj.conf.PropertySet propertySet8 = new com.mysql.cj.conf.DefaultPropertySet();
      com.mysql.cj.NativeSession nativeSession0 = new com.mysql.cj.NativeSession(hostInfo7, propertySet8);
      nativeSession0.loadServerVariables(null, string2);

  }



  @Test(timeout = 5000)
  public void test_loadServerVariables_13_13() throws Exception{

      java.lang.Object object1 = new java.lang.String();
      java.lang.String string2 = "^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$";
      com.mysql.cj.conf.HostInfo hostInfo3 = new com.mysql.cj.conf.HostInfo();
      com.mysql.cj.conf.PropertySet propertySet4 = new com.mysql.cj.jdbc.MysqlDataSource();
      com.mysql.cj.NativeSession nativeSession0 = new com.mysql.cj.NativeSession(hostInfo3, propertySet4);
      nativeSession0.loadServerVariables(object1, string2);

  }



  @Test(timeout = 5000)
  public void test_loadServerVariables_14_14() throws Exception{

      java.net.URL uRL11 = null;
      java.lang.String string12 = "<a>Hello World</a>";
      java.net.URL uRL8 = new java.net.URL(uRL11, string12);
      java.lang.String string9 = " #";
      java.net.URLStreamHandler uRLStreamHandler10 = null;
      java.net.URL uRL6 = new java.net.URL(uRL8, string9, uRLStreamHandler10);
      java.lang.String string7 = "%TAP|hS~Uvs&jjTnak";
      java.net.URL uRL3 = new java.net.URL(uRL6, string7);
      java.lang.String string4 = "<a>Hello World</a>";
      long long5 = -9223372036854775808L;
      java.lang.Object object1 = new sun.net.ProgressSource(uRL3, string4, long5);
      java.lang.String string2 = "o'Tg|M1AB4%%\\]@!T";
      com.mysql.cj.conf.HostInfo hostInfo13 = new com.mysql.cj.conf.HostInfo();
      com.mysql.cj.conf.PropertySet propertySet14 = new com.mysql.cj.jdbc.JdbcPropertySetImpl();
      com.mysql.cj.NativeSession nativeSession0 = new com.mysql.cj.NativeSession(hostInfo13, propertySet14);
      nativeSession0.loadServerVariables(object1, string2);

  }



  @Test(timeout = 5000)
  public void test_loadServerVariables_15_15() throws Exception{

      java.security.ProtectionDomain[] protectionDomainArray7 = {};
      java.security.AccessControlContext accessControlContext5 = new java.security.AccessControlContext(protectionDomainArray7);
      java.security.DomainCombiner domainCombiner6 = null;
      java.security.AccessControlContext accessControlContext3 = new java.security.AccessControlContext(accessControlContext5, domainCombiner6);
      java.security.DomainCombiner domainCombiner4 = null;
      java.lang.Object object1 = new java.security.AccessControlContext(accessControlContext3, domainCombiner4);
      java.lang.String string2 = "http://lcs.ios.ac.cn/";
      com.mysql.cj.conf.HostInfo hostInfo8 = new com.mysql.cj.conf.HostInfo();
      com.mysql.cj.conf.PropertySet propertySet9 = new com.mysql.cj.conf.DefaultPropertySet();
      com.mysql.cj.NativeSession nativeSession0 = new com.mysql.cj.NativeSession(hostInfo8, propertySet9);
      nativeSession0.loadServerVariables(object1, string2);

  }



  @Test(timeout = 5000)
  public void test_loadServerVariables_16_16() throws Exception{

      byte[] byteArray4 = {};
      int int5 = 0;
      int int6 = -1;
      sun.security.util.DerValue derValue3 = new sun.security.util.DerValue(byteArray4, int5, int6);
      java.lang.Object object1 = new sun.security.x509.X509CertInfo(derValue3);
      java.lang.String string2 = "\\n";
      com.mysql.cj.conf.HostInfo hostInfo7 = new com.mysql.cj.conf.HostInfo();
      com.mysql.cj.conf.PropertySet propertySet8 = new com.mysql.cj.jdbc.MysqlDataSource();
      com.mysql.cj.NativeSession nativeSession0 = new com.mysql.cj.NativeSession(hostInfo7, propertySet8);
      nativeSession0.loadServerVariables(object1, string2);

  }



  @Test(timeout = 5000)
  public void test_loadServerVariables_17_17() throws Exception{

      int int3 = 2147483647;
      java.lang.Object object1 = new sun.security.util.ECKeySizeParameterSpec(int3);
      java.lang.String string2 = " #";
      com.mysql.cj.conf.HostInfo hostInfo4 = new com.mysql.cj.conf.HostInfo();
      com.mysql.cj.conf.PropertySet propertySet5 = new com.mysql.cj.jdbc.MysqlDataSource();
      com.mysql.cj.NativeSession nativeSession0 = new com.mysql.cj.NativeSession(hostInfo4, propertySet5);
      nativeSession0.loadServerVariables(object1, string2);

  }



  @Test(timeout = 5000)
  public void test_loadServerVariables_18_18() throws Exception{

      java.lang.String string4 = "{\"key\":null}";
      java.lang.String string5 = "^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$";
      java.lang.String string6 = "<a> </a>";
      java.net.URL uRL3 = new java.net.URL(string4, string5, string6);
      java.lang.Object object1 = new sun.net.www.protocol.http.HttpCallerInfo(uRL3);
      java.lang.String string2 = "";
      com.mysql.cj.conf.HostInfo hostInfo7 = new com.mysql.cj.conf.HostInfo();
      com.mysql.cj.conf.PropertySet propertySet8 = new com.mysql.cj.jdbc.JdbcPropertySetImpl();
      com.mysql.cj.NativeSession nativeSession0 = new com.mysql.cj.NativeSession(hostInfo7, propertySet8);
      nativeSession0.loadServerVariables(object1, string2);

  }



  @Test(timeout = 5000)
  public void test_loadServerVariables_19_19() throws Exception{

      java.lang.Object object1 = new com.mysql.cj.protocol.a.MysqlTextValueDecoder();
      java.lang.String string2 = "a ";
      com.mysql.cj.conf.HostInfo hostInfo3 = new com.mysql.cj.conf.HostInfo();
      com.mysql.cj.conf.PropertySet propertySet4 = new com.mysql.cj.conf.DefaultPropertySet();
      com.mysql.cj.NativeSession nativeSession0 = new com.mysql.cj.NativeSession(hostInfo3, propertySet4);
      nativeSession0.loadServerVariables(object1, string2);

  }



  @Test(timeout = 5000)
  public void test_loadServerVariables_20_20() throws Exception{

      byte[] byteArray7 = {};
      sun.security.util.DerInputStream derInputStream6 = new sun.security.util.DerInputStream(byteArray7);
      sun.security.util.ObjectIdentifier objectIdentifier3 = new sun.security.util.ObjectIdentifier(derInputStream6);
      boolean boolean4 = false;
      byte[] byteArray5 = {};
      java.lang.Object object1 = new sun.security.x509.Extension(objectIdentifier3, boolean4, byteArray5);
      java.lang.String string2 = "<a> </a>";
      com.mysql.cj.conf.HostInfo hostInfo8 = new com.mysql.cj.conf.HostInfo();
      com.mysql.cj.conf.PropertySet propertySet9 = new com.mysql.cj.conf.DefaultPropertySet();
      com.mysql.cj.NativeSession nativeSession0 = new com.mysql.cj.NativeSession(hostInfo8, propertySet9);
      nativeSession0.loadServerVariables(object1, string2);

  }



}