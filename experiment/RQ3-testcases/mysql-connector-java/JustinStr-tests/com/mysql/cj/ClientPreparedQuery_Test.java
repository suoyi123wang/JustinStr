package com.mysql.cj;

import org.junit.Test;

public class ClientPreparedQuery_Test {

  @Test(timeout = 5000)
  public void test_checkNullOrEmptyQuery_1_1() throws Exception{

      java.lang.String string1 = "4";
      com.mysql.cj.conf.HostInfo hostInfo3 = new com.mysql.cj.conf.HostInfo();
      com.mysql.cj.conf.PropertySet propertySet4 = new com.mysql.cj.jdbc.JdbcPropertySetImpl();
      com.mysql.cj.NativeSession nativeSession2 = new com.mysql.cj.NativeSession(hostInfo3, propertySet4);
      com.mysql.cj.ClientPreparedQuery clientPreparedQuery0 = new com.mysql.cj.ClientPreparedQuery(nativeSession2);
      clientPreparedQuery0.checkNullOrEmptyQuery(string1);

  }



  @Test(timeout = 5000)
  public void test_checkNullOrEmptyQuery_2_2() throws Exception{

      java.lang.String string1 = "";
      com.mysql.cj.conf.HostInfo hostInfo3 = new com.mysql.cj.conf.HostInfo();
      com.mysql.cj.conf.PropertySet propertySet4 = new com.mysql.cj.conf.DefaultPropertySet();
      com.mysql.cj.NativeSession nativeSession2 = new com.mysql.cj.NativeSession(hostInfo3, propertySet4);
      com.mysql.cj.ClientPreparedQuery clientPreparedQuery0 = new com.mysql.cj.ClientPreparedQuery(nativeSession2);
      clientPreparedQuery0.checkNullOrEmptyQuery(string1);

  }



  @Test(timeout = 5000)
  public void test_checkNullOrEmptyQuery_3_3() throws Exception{

      java.lang.String string1 = "{\"key\":null}";
      com.mysql.cj.conf.HostInfo hostInfo3 = new com.mysql.cj.conf.HostInfo();
      com.mysql.cj.conf.PropertySet propertySet4 = new com.mysql.cj.jdbc.MysqlDataSource();
      com.mysql.cj.NativeSession nativeSession2 = new com.mysql.cj.NativeSession(hostInfo3, propertySet4);
      com.mysql.cj.ClientPreparedQuery clientPreparedQuery0 = new com.mysql.cj.ClientPreparedQuery(nativeSession2);
      clientPreparedQuery0.checkNullOrEmptyQuery(string1);

  }



  @Test(timeout = 5000)
  public void test_checkNullOrEmptyQuery_4_4() throws Exception{

      java.lang.String string1 = "^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$";
      com.mysql.cj.conf.HostInfo hostInfo3 = new com.mysql.cj.conf.HostInfo();
      com.mysql.cj.conf.PropertySet propertySet4 = new com.mysql.cj.conf.DefaultPropertySet();
      com.mysql.cj.NativeSession nativeSession2 = new com.mysql.cj.NativeSession(hostInfo3, propertySet4);
      com.mysql.cj.ClientPreparedQuery clientPreparedQuery0 = new com.mysql.cj.ClientPreparedQuery(nativeSession2);
      clientPreparedQuery0.checkNullOrEmptyQuery(string1);

  }



  @Test(timeout = 5000)
  public void test_checkNullOrEmptyQuery_5_5() throws Exception{

      java.lang.String string1 = "<a>Hello World</a>";
      com.mysql.cj.conf.HostInfo hostInfo3 = new com.mysql.cj.conf.HostInfo();
      com.mysql.cj.conf.PropertySet propertySet4 = new com.mysql.cj.conf.DefaultPropertySet();
      com.mysql.cj.NativeSession nativeSession2 = new com.mysql.cj.NativeSession(hostInfo3, propertySet4);
      com.mysql.cj.ClientPreparedQuery clientPreparedQuery0 = new com.mysql.cj.ClientPreparedQuery(nativeSession2);
      clientPreparedQuery0.checkNullOrEmptyQuery(string1);

  }



  @Test(timeout = 5000)
  public void test_checkNullOrEmptyQuery_6_6() throws Exception{

      java.lang.String string1 = " #";
      com.mysql.cj.conf.HostInfo hostInfo3 = new com.mysql.cj.conf.HostInfo();
      com.mysql.cj.conf.PropertySet propertySet4 = new com.mysql.cj.jdbc.JdbcPropertySetImpl();
      com.mysql.cj.NativeSession nativeSession2 = new com.mysql.cj.NativeSession(hostInfo3, propertySet4);
      com.mysql.cj.ClientPreparedQuery clientPreparedQuery0 = new com.mysql.cj.ClientPreparedQuery(nativeSession2);
      clientPreparedQuery0.checkNullOrEmptyQuery(string1);

  }



  @Test(timeout = 5000)
  public void test_checkNullOrEmptyQuery_7_7() throws Exception{

      java.lang.String string1 = "http://lcs.ios.ac.cn/";
      com.mysql.cj.conf.HostInfo hostInfo3 = new com.mysql.cj.conf.HostInfo();
      com.mysql.cj.conf.PropertySet propertySet4 = new com.mysql.cj.jdbc.JdbcPropertySetImpl();
      com.mysql.cj.NativeSession nativeSession2 = new com.mysql.cj.NativeSession(hostInfo3, propertySet4);
      com.mysql.cj.ClientPreparedQuery clientPreparedQuery0 = new com.mysql.cj.ClientPreparedQuery(nativeSession2);
      clientPreparedQuery0.checkNullOrEmptyQuery(string1);

  }



  @Test(timeout = 5000)
  public void test_checkNullOrEmptyQuery_8_8() throws Exception{

      java.lang.String string1 = "a ";
      com.mysql.cj.conf.HostInfo hostInfo3 = new com.mysql.cj.conf.HostInfo();
      com.mysql.cj.conf.PropertySet propertySet4 = new com.mysql.cj.jdbc.JdbcPropertySetImpl();
      com.mysql.cj.NativeSession nativeSession2 = new com.mysql.cj.NativeSession(hostInfo3, propertySet4);
      com.mysql.cj.ClientPreparedQuery clientPreparedQuery0 = new com.mysql.cj.ClientPreparedQuery(nativeSession2);
      clientPreparedQuery0.checkNullOrEmptyQuery(string1);

  }



  @Test(timeout = 5000)
  public void test_checkNullOrEmptyQuery_9_9() throws Exception{

      java.lang.String string1 = "a ";
      com.mysql.cj.conf.HostInfo hostInfo3 = new com.mysql.cj.conf.HostInfo();
      com.mysql.cj.conf.PropertySet propertySet4 = new com.mysql.cj.jdbc.MysqlDataSource();
      com.mysql.cj.NativeSession nativeSession2 = new com.mysql.cj.NativeSession(hostInfo3, propertySet4);
      com.mysql.cj.ClientPreparedQuery clientPreparedQuery0 = new com.mysql.cj.ClientPreparedQuery(nativeSession2);
      clientPreparedQuery0.checkNullOrEmptyQuery(string1);

  }



  @Test(timeout = 5000)
  public void test_checkNullOrEmptyQuery_10_10() throws Exception{

      java.lang.String string1 = "[0,1]";
      com.mysql.cj.conf.HostInfo hostInfo3 = new com.mysql.cj.conf.HostInfo();
      com.mysql.cj.conf.PropertySet propertySet4 = new com.mysql.cj.jdbc.MysqlDataSource();
      com.mysql.cj.NativeSession nativeSession2 = new com.mysql.cj.NativeSession(hostInfo3, propertySet4);
      com.mysql.cj.ClientPreparedQuery clientPreparedQuery0 = new com.mysql.cj.ClientPreparedQuery(nativeSession2);
      clientPreparedQuery0.checkNullOrEmptyQuery(string1);

  }



  @Test(timeout = 5000)
  public void test_checkNullOrEmptyQuery_11_11() throws Exception{

      java.lang.String string1 = " ";
      com.mysql.cj.conf.HostInfo hostInfo3 = new com.mysql.cj.conf.HostInfo();
      com.mysql.cj.conf.PropertySet propertySet4 = new com.mysql.cj.conf.DefaultPropertySet();
      com.mysql.cj.NativeSession nativeSession2 = new com.mysql.cj.NativeSession(hostInfo3, propertySet4);
      com.mysql.cj.ClientPreparedQuery clientPreparedQuery0 = new com.mysql.cj.ClientPreparedQuery(nativeSession2);
      clientPreparedQuery0.checkNullOrEmptyQuery(string1);

  }



  @Test(timeout = 5000)
  public void test_checkNullOrEmptyQuery_12_12() throws Exception{

      java.lang.String string1 = " #";
      com.mysql.cj.conf.HostInfo hostInfo3 = new com.mysql.cj.conf.HostInfo();
      com.mysql.cj.conf.PropertySet propertySet4 = new com.mysql.cj.jdbc.JdbcPropertySetImpl();
      com.mysql.cj.NativeSession nativeSession2 = new com.mysql.cj.NativeSession(hostInfo3, propertySet4);
      com.mysql.cj.ClientPreparedQuery clientPreparedQuery0 = new com.mysql.cj.ClientPreparedQuery(nativeSession2);
      clientPreparedQuery0.checkNullOrEmptyQuery(string1);

  }



  @Test(timeout = 5000)
  public void test_checkNullOrEmptyQuery_13_13() throws Exception{

      java.lang.String string1 = "\\n";
      com.mysql.cj.conf.HostInfo hostInfo3 = new com.mysql.cj.conf.HostInfo();
      com.mysql.cj.conf.PropertySet propertySet4 = new com.mysql.cj.jdbc.JdbcPropertySetImpl();
      com.mysql.cj.NativeSession nativeSession2 = new com.mysql.cj.NativeSession(hostInfo3, propertySet4);
      com.mysql.cj.ClientPreparedQuery clientPreparedQuery0 = new com.mysql.cj.ClientPreparedQuery(nativeSession2);
      clientPreparedQuery0.checkNullOrEmptyQuery(string1);

  }



  @Test(timeout = 5000)
  public void test_checkNullOrEmptyQuery_14_14() throws Exception{

      java.lang.String string1 = "{\"key\":null}";
      com.mysql.cj.conf.HostInfo hostInfo3 = new com.mysql.cj.conf.HostInfo();
      com.mysql.cj.conf.PropertySet propertySet4 = new com.mysql.cj.conf.DefaultPropertySet();
      com.mysql.cj.NativeSession nativeSession2 = new com.mysql.cj.NativeSession(hostInfo3, propertySet4);
      com.mysql.cj.ClientPreparedQuery clientPreparedQuery0 = new com.mysql.cj.ClientPreparedQuery(nativeSession2);
      clientPreparedQuery0.checkNullOrEmptyQuery(string1);

  }



  @Test(timeout = 5000)
  public void test_checkNullOrEmptyQuery_15_15() throws Exception{

      java.lang.String string1 = ".\\a.txt";
      com.mysql.cj.conf.HostInfo hostInfo3 = new com.mysql.cj.conf.HostInfo();
      com.mysql.cj.conf.PropertySet propertySet4 = new com.mysql.cj.conf.DefaultPropertySet();
      com.mysql.cj.NativeSession nativeSession2 = new com.mysql.cj.NativeSession(hostInfo3, propertySet4);
      com.mysql.cj.ClientPreparedQuery clientPreparedQuery0 = new com.mysql.cj.ClientPreparedQuery(nativeSession2);
      clientPreparedQuery0.checkNullOrEmptyQuery(string1);

  }



  @Test(timeout = 5000)
  public void test_checkNullOrEmptyQuery_16_16() throws Exception{

      java.lang.String string1 = "";
      com.mysql.cj.conf.HostInfo hostInfo3 = new com.mysql.cj.conf.HostInfo();
      com.mysql.cj.conf.PropertySet propertySet4 = new com.mysql.cj.jdbc.MysqlDataSource();
      com.mysql.cj.NativeSession nativeSession2 = new com.mysql.cj.NativeSession(hostInfo3, propertySet4);
      com.mysql.cj.ClientPreparedQuery clientPreparedQuery0 = new com.mysql.cj.ClientPreparedQuery(nativeSession2);
      clientPreparedQuery0.checkNullOrEmptyQuery(string1);

  }



  @Test(timeout = 5000)
  public void test_checkNullOrEmptyQuery_17_17() throws Exception{

      java.lang.String string1 = "http://lcs.ios.ac.cn/";
      com.mysql.cj.conf.HostInfo hostInfo3 = new com.mysql.cj.conf.HostInfo();
      com.mysql.cj.conf.PropertySet propertySet4 = new com.mysql.cj.jdbc.MysqlDataSource();
      com.mysql.cj.NativeSession nativeSession2 = new com.mysql.cj.NativeSession(hostInfo3, propertySet4);
      com.mysql.cj.ClientPreparedQuery clientPreparedQuery0 = new com.mysql.cj.ClientPreparedQuery(nativeSession2);
      clientPreparedQuery0.checkNullOrEmptyQuery(string1);

  }



  @Test(timeout = 5000)
  public void test_checkNullOrEmptyQuery_18_18() throws Exception{

      java.lang.String string1 = "[0,1]";
      com.mysql.cj.conf.HostInfo hostInfo3 = new com.mysql.cj.conf.HostInfo();
      com.mysql.cj.conf.PropertySet propertySet4 = new com.mysql.cj.jdbc.JdbcPropertySetImpl();
      com.mysql.cj.NativeSession nativeSession2 = new com.mysql.cj.NativeSession(hostInfo3, propertySet4);
      com.mysql.cj.ClientPreparedQuery clientPreparedQuery0 = new com.mysql.cj.ClientPreparedQuery(nativeSession2);
      clientPreparedQuery0.checkNullOrEmptyQuery(string1);

  }



  @Test(timeout = 5000)
  public void test_checkNullOrEmptyQuery_19_19() throws Exception{

      java.lang.String string1 = "";
      com.mysql.cj.conf.HostInfo hostInfo3 = new com.mysql.cj.conf.HostInfo();
      com.mysql.cj.conf.PropertySet propertySet4 = new com.mysql.cj.jdbc.MysqlDataSource();
      com.mysql.cj.NativeSession nativeSession2 = new com.mysql.cj.NativeSession(hostInfo3, propertySet4);
      com.mysql.cj.ClientPreparedQuery clientPreparedQuery0 = new com.mysql.cj.ClientPreparedQuery(nativeSession2);
      clientPreparedQuery0.checkNullOrEmptyQuery(string1);

  }



  @Test(timeout = 5000)
  public void test_checkNullOrEmptyQuery_20_20() throws Exception{

      java.lang.String string1 = "";
      com.mysql.cj.conf.HostInfo hostInfo3 = new com.mysql.cj.conf.HostInfo();
      com.mysql.cj.conf.PropertySet propertySet4 = new com.mysql.cj.jdbc.MysqlDataSource();
      com.mysql.cj.NativeSession nativeSession2 = new com.mysql.cj.NativeSession(hostInfo3, propertySet4);
      com.mysql.cj.ClientPreparedQuery clientPreparedQuery0 = new com.mysql.cj.ClientPreparedQuery(nativeSession2);
      clientPreparedQuery0.checkNullOrEmptyQuery(string1);

  }



}