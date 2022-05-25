package com.mysql.cj.jdbc;

import org.junit.Test;

public class CallableStatement_Test {

  @Test(timeout = 5000)
  public void test_getNamedParamIndex_1_1() throws Exception,java.sql.SQLException{

      java.lang.String string1 = "_";
      boolean boolean2 = true;
      com.mysql.cj.jdbc.ha.MultiHostConnectionProxy multiHostConnectionProxy9 = null;
      com.mysql.cj.jdbc.JdbcConnection jdbcConnection8 = new com.mysql.cj.jdbc.ha.ReplicationMySQLConnection(multiHostConnectionProxy9);
      com.mysql.cj.jdbc.MysqlPooledConnection mysqlPooledConnection5 = new com.mysql.cj.jdbc.MysqlPooledConnection(jdbcConnection8);
      com.mysql.cj.jdbc.JdbcConnection jdbcConnection6 = null;
      boolean boolean7 = true;
      com.mysql.cj.jdbc.JdbcConnection jdbcConnection3 = new com.mysql.cj.jdbc.ConnectionWrapper(mysqlPooledConnection5, jdbcConnection6, boolean7);
      com.mysql.cj.jdbc.CallableStatement.CallableStatementParamInfo callableStatement$CallableStatementParamInfo4 = null;
      com.mysql.cj.jdbc.CallableStatement callableStatement0 = new com.mysql.cj.jdbc.CallableStatement(jdbcConnection3, callableStatement$CallableStatementParamInfo4);
      callableStatement0.getNamedParamIndex(string1, boolean2);

  }



  @Test(timeout = 5000)
  public void test_getNamedParamIndex_2_2() throws Exception,java.sql.SQLException{

      java.lang.String string1 = "";
      boolean boolean2 = false;
      com.mysql.cj.jdbc.ha.MultiHostConnectionProxy multiHostConnectionProxy10 = null;
      com.mysql.cj.jdbc.JdbcConnection jdbcConnection8 = new com.mysql.cj.jdbc.ha.ReplicationMySQLConnection(multiHostConnectionProxy10);
      boolean boolean9 = true;
      com.mysql.cj.jdbc.MysqlPooledConnection mysqlPooledConnection5 = new com.mysql.cj.jdbc.MysqlXAConnection(jdbcConnection8, boolean9);
      com.mysql.cj.jdbc.JdbcConnection jdbcConnection6 = null;
      boolean boolean7 = false;
      com.mysql.cj.jdbc.JdbcConnection jdbcConnection3 = new com.mysql.cj.jdbc.ConnectionWrapper(mysqlPooledConnection5, jdbcConnection6, boolean7);
      com.mysql.cj.jdbc.CallableStatement.CallableStatementParamInfo callableStatement$CallableStatementParamInfo4 = null;
      com.mysql.cj.jdbc.CallableStatement callableStatement0 = new com.mysql.cj.jdbc.CallableStatement(jdbcConnection3, callableStatement$CallableStatementParamInfo4);
      callableStatement0.getNamedParamIndex(string1, boolean2);

  }



  @Test(timeout = 5000)
  public void test_getNamedParamIndex_3_3() throws Exception,java.sql.SQLException{

      java.lang.String string1 = "http://lcs.ios.ac.cn/";
      boolean boolean2 = false;
      com.mysql.cj.conf.HostInfo hostInfo5 = new com.mysql.cj.conf.HostInfo();
      com.mysql.cj.jdbc.JdbcConnection jdbcConnection3 = new com.mysql.cj.jdbc.ConnectionImpl(hostInfo5);
      com.mysql.cj.jdbc.CallableStatement.CallableStatementParamInfo callableStatement$CallableStatementParamInfo4 = null;
      com.mysql.cj.jdbc.CallableStatement callableStatement0 = new com.mysql.cj.jdbc.CallableStatement(jdbcConnection3, callableStatement$CallableStatementParamInfo4);
      callableStatement0.getNamedParamIndex(string1, boolean2);

  }



  @Test(timeout = 5000)
  public void test_getNamedParamIndex_4_4() throws Exception,java.sql.SQLException{

      java.lang.String string1 = " ";
      boolean boolean2 = false;
      com.mysql.cj.conf.ConnectionUrlParser connectionUrlParser7 = null;
      java.util.Properties properties8 = null;
      com.mysql.cj.conf.ConnectionUrl connectionUrl6 = new com.mysql.cj.conf.url.ReplicationConnectionUrl(connectionUrlParser7, properties8);
      com.mysql.cj.jdbc.ha.MultiHostConnectionProxy multiHostConnectionProxy5 = new com.mysql.cj.jdbc.ha.LoadBalancedConnectionProxy(connectionUrl6);
      com.mysql.cj.jdbc.JdbcConnection jdbcConnection3 = new com.mysql.cj.jdbc.ha.ReplicationMySQLConnection(multiHostConnectionProxy5);
      com.mysql.cj.jdbc.CallableStatement.CallableStatementParamInfo callableStatement$CallableStatementParamInfo4 = null;
      com.mysql.cj.jdbc.CallableStatement callableStatement0 = new com.mysql.cj.jdbc.CallableStatement(jdbcConnection3, callableStatement$CallableStatementParamInfo4);
      callableStatement0.getNamedParamIndex(string1, boolean2);

  }



  @Test(timeout = 5000)
  public void test_getNamedParamIndex_5_5() throws Exception,java.sql.SQLException{

      java.lang.String string1 = "^[1]([3-9])[0-9]{9}$";
      boolean boolean2 = true;
      java.util.List<com.mysql.cj.conf.HostInfo> list7 = null;
      java.util.List<com.mysql.cj.conf.HostInfo> list8 = null;
      java.util.Map<java.lang.String,java.lang.String> map9 = null;
      com.mysql.cj.conf.ConnectionUrl connectionUrl6 = new com.mysql.cj.conf.url.ReplicationConnectionUrl(list7, list8, map9);
      com.mysql.cj.jdbc.ha.MultiHostConnectionProxy multiHostConnectionProxy5 = new com.mysql.cj.jdbc.ha.LoadBalancedConnectionProxy(connectionUrl6);
      com.mysql.cj.jdbc.JdbcConnection jdbcConnection3 = new com.mysql.cj.jdbc.ha.ReplicationMySQLConnection(multiHostConnectionProxy5);
      com.mysql.cj.jdbc.CallableStatement.CallableStatementParamInfo callableStatement$CallableStatementParamInfo4 = null;
      com.mysql.cj.jdbc.CallableStatement callableStatement0 = new com.mysql.cj.jdbc.CallableStatement(jdbcConnection3, callableStatement$CallableStatementParamInfo4);
      callableStatement0.getNamedParamIndex(string1, boolean2);

  }



  @Test(timeout = 5000)
  public void test_getNamedParamIndex_6_6() throws Exception,java.sql.SQLException{

      java.lang.String string1 = ".\\a.txt";
      boolean boolean2 = false;
      java.util.List<com.mysql.cj.conf.HostInfo> list7 = null;
      java.util.List<com.mysql.cj.conf.HostInfo> list8 = null;
      java.util.Map<java.lang.String,java.lang.String> map9 = null;
      com.mysql.cj.conf.ConnectionUrl connectionUrl6 = new com.mysql.cj.conf.url.ReplicationConnectionUrl(list7, list8, map9);
      com.mysql.cj.jdbc.ha.MultiHostConnectionProxy multiHostConnectionProxy5 = new com.mysql.cj.jdbc.ha.LoadBalancedConnectionProxy(connectionUrl6);
      com.mysql.cj.jdbc.JdbcConnection jdbcConnection3 = new com.mysql.cj.jdbc.ha.ReplicationMySQLConnection(multiHostConnectionProxy5);
      com.mysql.cj.jdbc.CallableStatement.CallableStatementParamInfo callableStatement$CallableStatementParamInfo4 = null;
      com.mysql.cj.jdbc.CallableStatement callableStatement0 = new com.mysql.cj.jdbc.CallableStatement(jdbcConnection3, callableStatement$CallableStatementParamInfo4);
      callableStatement0.getNamedParamIndex(string1, boolean2);

  }



  @Test(timeout = 5000)
  public void test_getNamedParamIndex_7_7() throws Exception,java.sql.SQLException{

      java.lang.String string1 = "[0,1]";
      boolean boolean2 = false;
      com.mysql.cj.jdbc.ha.MultiHostConnectionProxy multiHostConnectionProxy9 = null;
      com.mysql.cj.jdbc.JdbcConnection jdbcConnection8 = new com.mysql.cj.jdbc.ha.ReplicationMySQLConnection(multiHostConnectionProxy9);
      com.mysql.cj.jdbc.MysqlPooledConnection mysqlPooledConnection5 = new com.mysql.cj.jdbc.MysqlPooledConnection(jdbcConnection8);
      com.mysql.cj.jdbc.JdbcConnection jdbcConnection6 = null;
      boolean boolean7 = true;
      com.mysql.cj.jdbc.JdbcConnection jdbcConnection3 = new com.mysql.cj.jdbc.ConnectionWrapper(mysqlPooledConnection5, jdbcConnection6, boolean7);
      com.mysql.cj.jdbc.CallableStatement.CallableStatementParamInfo callableStatement$CallableStatementParamInfo4 = null;
      com.mysql.cj.jdbc.CallableStatement callableStatement0 = new com.mysql.cj.jdbc.CallableStatement(jdbcConnection3, callableStatement$CallableStatementParamInfo4);
      callableStatement0.getNamedParamIndex(string1, boolean2);

  }



  @Test(timeout = 5000)
  public void test_getNamedParamIndex_8_8() throws Exception,java.sql.SQLException{

      java.lang.String string1 = "";
      boolean boolean2 = true;
      com.mysql.cj.conf.ConnectionUrlParser connectionUrlParser7 = null;
      java.util.Properties properties8 = null;
      com.mysql.cj.conf.ConnectionUrl connectionUrl6 = new com.mysql.cj.conf.url.SingleConnectionUrl(connectionUrlParser7, properties8);
      com.mysql.cj.jdbc.ha.MultiHostConnectionProxy multiHostConnectionProxy5 = new com.mysql.cj.jdbc.ha.LoadBalancedConnectionProxy(connectionUrl6);
      com.mysql.cj.jdbc.JdbcConnection jdbcConnection3 = new com.mysql.cj.jdbc.ha.MultiHostMySQLConnection(multiHostConnectionProxy5);
      com.mysql.cj.jdbc.CallableStatement.CallableStatementParamInfo callableStatement$CallableStatementParamInfo4 = null;
      com.mysql.cj.jdbc.CallableStatement callableStatement0 = new com.mysql.cj.jdbc.CallableStatement(jdbcConnection3, callableStatement$CallableStatementParamInfo4);
      callableStatement0.getNamedParamIndex(string1, boolean2);

  }



  @Test(timeout = 5000)
  public void test_getNamedParamIndex_9_9() throws Exception,java.sql.SQLException{

      java.lang.String string1 = "*(f@zQFI%&1[4RWT\\\"";
      boolean boolean2 = false;
      com.mysql.cj.conf.ConnectionUrlParser connectionUrlParser7 = null;
      java.util.Properties properties8 = null;
      com.mysql.cj.conf.ConnectionUrl connectionUrl6 = new com.mysql.cj.conf.url.XDevApiConnectionUrl(connectionUrlParser7, properties8);
      com.mysql.cj.jdbc.ha.LoadBalancedConnectionProxy loadBalancedConnectionProxy5 = new com.mysql.cj.jdbc.ha.LoadBalancedConnectionProxy(connectionUrl6);
      com.mysql.cj.jdbc.JdbcConnection jdbcConnection3 = new com.mysql.cj.jdbc.ha.LoadBalancedMySQLConnection(loadBalancedConnectionProxy5);
      com.mysql.cj.jdbc.CallableStatement.CallableStatementParamInfo callableStatement$CallableStatementParamInfo4 = null;
      com.mysql.cj.jdbc.CallableStatement callableStatement0 = new com.mysql.cj.jdbc.CallableStatement(jdbcConnection3, callableStatement$CallableStatementParamInfo4);
      callableStatement0.getNamedParamIndex(string1, boolean2);

  }



  @Test(timeout = 5000)
  public void test_getNamedParamIndex_10_10() throws Exception,java.sql.SQLException{

      java.lang.String string1 = "\\n";
      boolean boolean2 = false;
      com.mysql.cj.conf.HostInfo hostInfo5 = new com.mysql.cj.conf.HostInfo();
      com.mysql.cj.jdbc.JdbcConnection jdbcConnection3 = new com.mysql.cj.jdbc.ConnectionImpl(hostInfo5);
      com.mysql.cj.jdbc.CallableStatement.CallableStatementParamInfo callableStatement$CallableStatementParamInfo4 = null;
      com.mysql.cj.jdbc.CallableStatement callableStatement0 = new com.mysql.cj.jdbc.CallableStatement(jdbcConnection3, callableStatement$CallableStatementParamInfo4);
      callableStatement0.getNamedParamIndex(string1, boolean2);

  }



  @Test(timeout = 5000)
  public void test_getNamedParamIndex_11_11() throws Exception,java.sql.SQLException{

      java.lang.String string1 = " #";
      boolean boolean2 = true;
      com.mysql.cj.conf.ConnectionUrlParser connectionUrlParser7 = null;
      java.util.Properties properties8 = null;
      com.mysql.cj.conf.ConnectionUrl connectionUrl6 = new com.mysql.cj.conf.url.SingleConnectionUrl(connectionUrlParser7, properties8);
      com.mysql.cj.jdbc.ha.LoadBalancedConnectionProxy loadBalancedConnectionProxy5 = new com.mysql.cj.jdbc.ha.LoadBalancedConnectionProxy(connectionUrl6);
      com.mysql.cj.jdbc.JdbcConnection jdbcConnection3 = new com.mysql.cj.jdbc.ha.LoadBalancedMySQLConnection(loadBalancedConnectionProxy5);
      com.mysql.cj.jdbc.CallableStatement.CallableStatementParamInfo callableStatement$CallableStatementParamInfo4 = null;
      com.mysql.cj.jdbc.CallableStatement callableStatement0 = new com.mysql.cj.jdbc.CallableStatement(jdbcConnection3, callableStatement$CallableStatementParamInfo4);
      callableStatement0.getNamedParamIndex(string1, boolean2);

  }



  @Test(timeout = 5000)
  public void test_getNamedParamIndex_12_12() throws Exception,java.sql.SQLException{

      java.lang.String string1 = "http://lcs.ios.ac.cn/";
      boolean boolean2 = false;
      com.mysql.cj.conf.HostInfo hostInfo5 = new com.mysql.cj.conf.HostInfo();
      com.mysql.cj.jdbc.JdbcConnection jdbcConnection3 = new com.mysql.cj.jdbc.ConnectionImpl(hostInfo5);
      com.mysql.cj.jdbc.CallableStatement.CallableStatementParamInfo callableStatement$CallableStatementParamInfo4 = null;
      com.mysql.cj.jdbc.CallableStatement callableStatement0 = new com.mysql.cj.jdbc.CallableStatement(jdbcConnection3, callableStatement$CallableStatementParamInfo4);
      callableStatement0.getNamedParamIndex(string1, boolean2);

  }



  @Test(timeout = 5000)
  public void test_getNamedParamIndex_13_13() throws Exception,java.sql.SQLException{

      java.lang.String string1 = " #";
      boolean boolean2 = true;
      com.mysql.cj.conf.HostInfo hostInfo9 = null;
      com.mysql.cj.jdbc.JdbcConnection jdbcConnection8 = new com.mysql.cj.jdbc.ConnectionImpl(hostInfo9);
      com.mysql.cj.jdbc.MysqlPooledConnection mysqlPooledConnection5 = new com.mysql.cj.jdbc.MysqlPooledConnection(jdbcConnection8);
      com.mysql.cj.jdbc.JdbcConnection jdbcConnection6 = null;
      boolean boolean7 = true;
      com.mysql.cj.jdbc.JdbcConnection jdbcConnection3 = new com.mysql.cj.jdbc.ConnectionWrapper(mysqlPooledConnection5, jdbcConnection6, boolean7);
      com.mysql.cj.jdbc.CallableStatement.CallableStatementParamInfo callableStatement$CallableStatementParamInfo4 = null;
      com.mysql.cj.jdbc.CallableStatement callableStatement0 = new com.mysql.cj.jdbc.CallableStatement(jdbcConnection3, callableStatement$CallableStatementParamInfo4);
      callableStatement0.getNamedParamIndex(string1, boolean2);

  }



  @Test(timeout = 5000)
  public void test_getNamedParamIndex_14_14() throws Exception,java.sql.SQLException{

      java.lang.String string1 = "a ";
      boolean boolean2 = true;
      com.mysql.cj.conf.ConnectionUrlParser connectionUrlParser7 = null;
      java.util.Properties properties8 = null;
      com.mysql.cj.conf.ConnectionUrl connectionUrl6 = new com.mysql.cj.conf.url.LoadBalanceDnsSrvConnectionUrl(connectionUrlParser7, properties8);
      com.mysql.cj.jdbc.ha.MultiHostConnectionProxy multiHostConnectionProxy5 = new com.mysql.cj.jdbc.ha.LoadBalancedConnectionProxy(connectionUrl6);
      com.mysql.cj.jdbc.JdbcConnection jdbcConnection3 = new com.mysql.cj.jdbc.ha.ReplicationMySQLConnection(multiHostConnectionProxy5);
      com.mysql.cj.jdbc.CallableStatement.CallableStatementParamInfo callableStatement$CallableStatementParamInfo4 = null;
      com.mysql.cj.jdbc.CallableStatement callableStatement0 = new com.mysql.cj.jdbc.CallableStatement(jdbcConnection3, callableStatement$CallableStatementParamInfo4);
      callableStatement0.getNamedParamIndex(string1, boolean2);

  }



  @Test(timeout = 5000)
  public void test_getNamedParamIndex_15_15() throws Exception,java.sql.SQLException{

      java.lang.String string1 = "[0,1]";
      boolean boolean2 = true;
      com.mysql.cj.conf.ConnectionUrlParser connectionUrlParser7 = null;
      java.util.Properties properties8 = null;
      com.mysql.cj.conf.ConnectionUrl connectionUrl6 = new com.mysql.cj.conf.url.FailoverConnectionUrl(connectionUrlParser7, properties8);
      com.mysql.cj.jdbc.ha.MultiHostConnectionProxy multiHostConnectionProxy5 = new com.mysql.cj.jdbc.ha.LoadBalancedConnectionProxy(connectionUrl6);
      com.mysql.cj.jdbc.JdbcConnection jdbcConnection3 = new com.mysql.cj.jdbc.ha.ReplicationMySQLConnection(multiHostConnectionProxy5);
      com.mysql.cj.jdbc.CallableStatement.CallableStatementParamInfo callableStatement$CallableStatementParamInfo4 = null;
      com.mysql.cj.jdbc.CallableStatement callableStatement0 = new com.mysql.cj.jdbc.CallableStatement(jdbcConnection3, callableStatement$CallableStatementParamInfo4);
      callableStatement0.getNamedParamIndex(string1, boolean2);

  }



  @Test(timeout = 5000)
  public void test_getNamedParamIndex_16_16() throws Exception,java.sql.SQLException{

      java.lang.String string1 = "|/.3*~.0<vb%F%MLOV=\\\"R*!";
      boolean boolean2 = true;
      com.mysql.cj.conf.ConnectionUrlParser connectionUrlParser7 = null;
      java.util.Properties properties8 = null;
      com.mysql.cj.conf.ConnectionUrl connectionUrl6 = new com.mysql.cj.conf.url.ReplicationConnectionUrl(connectionUrlParser7, properties8);
      com.mysql.cj.jdbc.ha.MultiHostConnectionProxy multiHostConnectionProxy5 = new com.mysql.cj.jdbc.ha.LoadBalancedConnectionProxy(connectionUrl6);
      com.mysql.cj.jdbc.JdbcConnection jdbcConnection3 = new com.mysql.cj.jdbc.ha.MultiHostMySQLConnection(multiHostConnectionProxy5);
      com.mysql.cj.jdbc.CallableStatement.CallableStatementParamInfo callableStatement$CallableStatementParamInfo4 = null;
      com.mysql.cj.jdbc.CallableStatement callableStatement0 = new com.mysql.cj.jdbc.CallableStatement(jdbcConnection3, callableStatement$CallableStatementParamInfo4);
      callableStatement0.getNamedParamIndex(string1, boolean2);

  }



  @Test(timeout = 5000)
  public void test_getNamedParamIndex_17_17() throws Exception,java.sql.SQLException{

      java.lang.String string1 = "^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$";
      boolean boolean2 = true;
      java.util.List<com.mysql.cj.conf.HostInfo> list7 = null;
      java.util.List<com.mysql.cj.conf.HostInfo> list8 = null;
      java.util.Map<java.lang.String,java.lang.String> map9 = null;
      com.mysql.cj.conf.ConnectionUrl connectionUrl6 = new com.mysql.cj.conf.url.ReplicationConnectionUrl(list7, list8, map9);
      com.mysql.cj.jdbc.ha.LoadBalancedConnectionProxy loadBalancedConnectionProxy5 = new com.mysql.cj.jdbc.ha.LoadBalancedConnectionProxy(connectionUrl6);
      com.mysql.cj.jdbc.JdbcConnection jdbcConnection3 = new com.mysql.cj.jdbc.ha.LoadBalancedMySQLConnection(loadBalancedConnectionProxy5);
      com.mysql.cj.jdbc.CallableStatement.CallableStatementParamInfo callableStatement$CallableStatementParamInfo4 = null;
      com.mysql.cj.jdbc.CallableStatement callableStatement0 = new com.mysql.cj.jdbc.CallableStatement(jdbcConnection3, callableStatement$CallableStatementParamInfo4);
      callableStatement0.getNamedParamIndex(string1, boolean2);

  }



  @Test(timeout = 5000)
  public void test_getNamedParamIndex_18_18() throws Exception,java.sql.SQLException{

      java.lang.String string1 = "<a> </a>";
      boolean boolean2 = false;
      com.mysql.cj.conf.ConnectionUrlParser connectionUrlParser7 = null;
      java.util.Properties properties8 = null;
      com.mysql.cj.conf.ConnectionUrl connectionUrl6 = new com.mysql.cj.conf.url.LoadBalanceDnsSrvConnectionUrl(connectionUrlParser7, properties8);
      com.mysql.cj.jdbc.ha.MultiHostConnectionProxy multiHostConnectionProxy5 = new com.mysql.cj.jdbc.ha.LoadBalancedConnectionProxy(connectionUrl6);
      com.mysql.cj.jdbc.JdbcConnection jdbcConnection3 = new com.mysql.cj.jdbc.ha.ReplicationMySQLConnection(multiHostConnectionProxy5);
      com.mysql.cj.jdbc.CallableStatement.CallableStatementParamInfo callableStatement$CallableStatementParamInfo4 = null;
      com.mysql.cj.jdbc.CallableStatement callableStatement0 = new com.mysql.cj.jdbc.CallableStatement(jdbcConnection3, callableStatement$CallableStatementParamInfo4);
      callableStatement0.getNamedParamIndex(string1, boolean2);

  }



  @Test(timeout = 5000)
  public void test_getNamedParamIndex_19_19() throws Exception,java.sql.SQLException{

      java.lang.String string1 = "{\"key\":2 }";
      boolean boolean2 = false;
      com.mysql.cj.conf.ConnectionUrlParser connectionUrlParser7 = null;
      java.util.Properties properties8 = null;
      com.mysql.cj.conf.ConnectionUrl connectionUrl6 = new com.mysql.cj.conf.url.XDevApiDnsSrvConnectionUrl(connectionUrlParser7, properties8);
      com.mysql.cj.jdbc.ha.MultiHostConnectionProxy multiHostConnectionProxy5 = new com.mysql.cj.jdbc.ha.LoadBalancedConnectionProxy(connectionUrl6);
      com.mysql.cj.jdbc.JdbcConnection jdbcConnection3 = new com.mysql.cj.jdbc.ha.MultiHostMySQLConnection(multiHostConnectionProxy5);
      com.mysql.cj.jdbc.CallableStatement.CallableStatementParamInfo callableStatement$CallableStatementParamInfo4 = null;
      com.mysql.cj.jdbc.CallableStatement callableStatement0 = new com.mysql.cj.jdbc.CallableStatement(jdbcConnection3, callableStatement$CallableStatementParamInfo4);
      callableStatement0.getNamedParamIndex(string1, boolean2);

  }



  @Test(timeout = 5000)
  public void test_getNamedParamIndex_20_20() throws Exception,java.sql.SQLException{

      java.lang.String string1 = "Xc;>xO|}XHb3')/@";
      boolean boolean2 = false;
      com.mysql.cj.conf.ConnectionUrlParser connectionUrlParser7 = null;
      java.util.Properties properties8 = null;
      com.mysql.cj.conf.ConnectionUrl connectionUrl6 = new com.mysql.cj.conf.url.LoadBalanceConnectionUrl(connectionUrlParser7, properties8);
      com.mysql.cj.jdbc.ha.MultiHostConnectionProxy multiHostConnectionProxy5 = new com.mysql.cj.jdbc.ha.LoadBalancedConnectionProxy(connectionUrl6);
      com.mysql.cj.jdbc.JdbcConnection jdbcConnection3 = new com.mysql.cj.jdbc.ha.ReplicationMySQLConnection(multiHostConnectionProxy5);
      com.mysql.cj.jdbc.CallableStatement.CallableStatementParamInfo callableStatement$CallableStatementParamInfo4 = null;
      com.mysql.cj.jdbc.CallableStatement callableStatement0 = new com.mysql.cj.jdbc.CallableStatement(jdbcConnection3, callableStatement$CallableStatementParamInfo4);
      callableStatement0.getNamedParamIndex(string1, boolean2);

  }



}