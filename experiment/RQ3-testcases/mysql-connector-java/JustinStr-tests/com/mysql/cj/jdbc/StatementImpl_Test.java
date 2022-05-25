package com.mysql.cj.jdbc;

import org.junit.Test;

public class StatementImpl_Test {

  @Test(timeout = 5000)
  public void test_checkNullOrEmptyQuery_1_1() throws Exception,java.sql.SQLException{

      java.lang.String string1 = "v";
      com.mysql.cj.conf.ConnectionUrlParser connectionUrlParser6 = null;
      java.util.Properties properties7 = null;
      com.mysql.cj.conf.ConnectionUrl connectionUrl5 = new com.mysql.cj.conf.url.SingleConnectionUrl(connectionUrlParser6, properties7);
      com.mysql.cj.jdbc.ha.MultiHostConnectionProxy multiHostConnectionProxy4 = new com.mysql.cj.jdbc.ha.LoadBalancedConnectionProxy(connectionUrl5);
      com.mysql.cj.jdbc.JdbcConnection jdbcConnection2 = new com.mysql.cj.jdbc.ha.MultiHostMySQLConnection(multiHostConnectionProxy4);
      java.lang.String string3 = "<a> </a>";
      com.mysql.cj.jdbc.StatementImpl statementImpl0 = new com.mysql.cj.jdbc.StatementImpl(jdbcConnection2, string3);
      statementImpl0.checkNullOrEmptyQuery(string1);

  }



  @Test(timeout = 5000)
  public void test_checkNullOrEmptyQuery_2_2() throws Exception,java.sql.SQLException{

      java.lang.String string1 = "";
      com.mysql.cj.conf.ConnectionUrlParser connectionUrlParser7 = null;
      java.util.Properties properties8 = null;
      com.mysql.cj.conf.ConnectionUrl connectionUrl6 = new com.mysql.cj.conf.url.LoadBalanceConnectionUrl(connectionUrlParser7, properties8);
      com.mysql.cj.jdbc.ha.MultiHostConnectionProxy multiHostConnectionProxy5 = new com.mysql.cj.jdbc.ha.LoadBalancedConnectionProxy(connectionUrl6);
      com.mysql.cj.jdbc.JdbcConnection jdbcConnection2 = new com.mysql.cj.jdbc.ha.ReplicationMySQLConnection(multiHostConnectionProxy5);
      java.lang.String string3 = "<a>Hello World</a>";
      java.lang.String string4 = "\\n";
      com.mysql.cj.jdbc.StatementImpl statementImpl0 = new com.mysql.cj.jdbc.ClientPreparedStatement(jdbcConnection2, string3, string4);
      statementImpl0.checkNullOrEmptyQuery(string1);

  }



  @Test(timeout = 5000)
  public void test_checkNullOrEmptyQuery_3_3() throws Exception,java.sql.SQLException{

      java.lang.String string1 = "^[1]([3-9])[0-9]{9}$";
      com.mysql.cj.jdbc.ha.MultiHostConnectionProxy multiHostConnectionProxy8 = null;
      com.mysql.cj.jdbc.JdbcConnection jdbcConnection7 = new com.mysql.cj.jdbc.ha.MultiHostMySQLConnection(multiHostConnectionProxy8);
      com.mysql.cj.jdbc.MysqlPooledConnection mysqlPooledConnection4 = new com.mysql.cj.jdbc.MysqlPooledConnection(jdbcConnection7);
      com.mysql.cj.jdbc.JdbcConnection jdbcConnection5 = null;
      boolean boolean6 = true;
      com.mysql.cj.jdbc.JdbcConnection jdbcConnection2 = new com.mysql.cj.jdbc.ConnectionWrapper(mysqlPooledConnection4, jdbcConnection5, boolean6);
      java.lang.String string3 = "^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$";
      com.mysql.cj.jdbc.StatementImpl statementImpl0 = new com.mysql.cj.jdbc.StatementImpl(jdbcConnection2, string3);
      statementImpl0.checkNullOrEmptyQuery(string1);

  }



  @Test(timeout = 5000)
  public void test_checkNullOrEmptyQuery_4_4() throws Exception,java.sql.SQLException{

      java.lang.String string1 = "http://lcs.ios.ac.cn/";
      com.mysql.cj.conf.ConnectionUrlParser connectionUrlParser7 = null;
      java.util.Properties properties8 = null;
      com.mysql.cj.conf.ConnectionUrl connectionUrl6 = new com.mysql.cj.conf.url.LoadBalanceDnsSrvConnectionUrl(connectionUrlParser7, properties8);
      com.mysql.cj.jdbc.ha.MultiHostConnectionProxy multiHostConnectionProxy5 = new com.mysql.cj.jdbc.ha.LoadBalancedConnectionProxy(connectionUrl6);
      com.mysql.cj.jdbc.JdbcConnection jdbcConnection2 = new com.mysql.cj.jdbc.ha.ReplicationMySQLConnection(multiHostConnectionProxy5);
      java.lang.String string3 = "\\n";
      java.lang.String string4 = " #";
      com.mysql.cj.jdbc.StatementImpl statementImpl0 = new com.mysql.cj.jdbc.ClientPreparedStatement(jdbcConnection2, string3, string4);
      statementImpl0.checkNullOrEmptyQuery(string1);

  }



  @Test(timeout = 5000)
  public void test_checkNullOrEmptyQuery_5_5() throws Exception,java.sql.SQLException{

      java.lang.String string1 = "{\"key\":null}";
      java.util.List<com.mysql.cj.conf.HostInfo> list6 = null;
      java.util.List<com.mysql.cj.conf.HostInfo> list7 = null;
      java.util.Map<java.lang.String,java.lang.String> map8 = null;
      com.mysql.cj.conf.ConnectionUrl connectionUrl5 = new com.mysql.cj.conf.url.ReplicationConnectionUrl(list6, list7, map8);
      com.mysql.cj.jdbc.ha.MultiHostConnectionProxy multiHostConnectionProxy4 = new com.mysql.cj.jdbc.ha.LoadBalancedConnectionProxy(connectionUrl5);
      com.mysql.cj.jdbc.JdbcConnection jdbcConnection2 = new com.mysql.cj.jdbc.ha.MultiHostMySQLConnection(multiHostConnectionProxy4);
      java.lang.String string3 = "a ";
      com.mysql.cj.jdbc.StatementImpl statementImpl0 = new com.mysql.cj.jdbc.StatementImpl(jdbcConnection2, string3);
      statementImpl0.checkNullOrEmptyQuery(string1);

  }



  @Test(timeout = 5000)
  public void test_checkNullOrEmptyQuery_6_6() throws Exception,java.sql.SQLException{

      java.lang.String string1 = " ";
      com.mysql.cj.conf.HostInfo hostInfo5 = new com.mysql.cj.conf.HostInfo();
      com.mysql.cj.jdbc.JdbcConnection jdbcConnection2 = new com.mysql.cj.jdbc.ConnectionImpl(hostInfo5);
      java.lang.String string3 = "\\n";
      java.lang.String string4 = "[0,1]";
      com.mysql.cj.jdbc.StatementImpl statementImpl0 = new com.mysql.cj.jdbc.ClientPreparedStatement(jdbcConnection2, string3, string4);
      statementImpl0.checkNullOrEmptyQuery(string1);

  }



  @Test(timeout = 5000)
  public void test_checkNullOrEmptyQuery_7_7() throws Exception,java.sql.SQLException{

      java.lang.String string1 = ".\\a.txt";
      com.mysql.cj.conf.ConnectionUrlParser connectionUrlParser6 = null;
      java.util.Properties properties7 = null;
      com.mysql.cj.conf.ConnectionUrl connectionUrl5 = new com.mysql.cj.conf.url.ReplicationDnsSrvConnectionUrl(connectionUrlParser6, properties7);
      com.mysql.cj.jdbc.ha.MultiHostConnectionProxy multiHostConnectionProxy4 = new com.mysql.cj.jdbc.ha.LoadBalancedConnectionProxy(connectionUrl5);
      com.mysql.cj.jdbc.JdbcConnection jdbcConnection2 = new com.mysql.cj.jdbc.ha.ReplicationMySQLConnection(multiHostConnectionProxy4);
      java.lang.String string3 = "a ";
      com.mysql.cj.jdbc.StatementImpl statementImpl0 = new com.mysql.cj.jdbc.StatementImpl(jdbcConnection2, string3);
      statementImpl0.checkNullOrEmptyQuery(string1);

  }



  @Test(timeout = 5000)
  public void test_checkNullOrEmptyQuery_8_8() throws Exception,java.sql.SQLException{

      java.lang.String string1 = "<a> </a>";
      com.mysql.cj.conf.ConnectionUrlParser connectionUrlParser6 = null;
      java.util.Properties properties7 = null;
      com.mysql.cj.conf.ConnectionUrl connectionUrl5 = new com.mysql.cj.conf.url.LoadBalanceDnsSrvConnectionUrl(connectionUrlParser6, properties7);
      com.mysql.cj.jdbc.ha.LoadBalancedConnectionProxy loadBalancedConnectionProxy4 = new com.mysql.cj.jdbc.ha.LoadBalancedConnectionProxy(connectionUrl5);
      com.mysql.cj.jdbc.JdbcConnection jdbcConnection2 = new com.mysql.cj.jdbc.ha.LoadBalancedMySQLConnection(loadBalancedConnectionProxy4);
      java.lang.String string3 = "http://lcs.ios.ac.cn/";
      com.mysql.cj.jdbc.StatementImpl statementImpl0 = new com.mysql.cj.jdbc.StatementImpl(jdbcConnection2, string3);
      statementImpl0.checkNullOrEmptyQuery(string1);

  }



  @Test(timeout = 5000)
  public void test_checkNullOrEmptyQuery_9_9() throws Exception,java.sql.SQLException{

      java.lang.String string1 = "\\n";
      com.mysql.cj.conf.ConnectionUrlParser connectionUrlParser6 = null;
      java.util.Properties properties7 = null;
      com.mysql.cj.conf.ConnectionUrl connectionUrl5 = new com.mysql.cj.conf.url.FailoverDnsSrvConnectionUrl(connectionUrlParser6, properties7);
      com.mysql.cj.jdbc.ha.LoadBalancedConnectionProxy loadBalancedConnectionProxy4 = new com.mysql.cj.jdbc.ha.LoadBalancedConnectionProxy(connectionUrl5);
      com.mysql.cj.jdbc.JdbcConnection jdbcConnection2 = new com.mysql.cj.jdbc.ha.LoadBalancedMySQLConnection(loadBalancedConnectionProxy4);
      java.lang.String string3 = " #";
      com.mysql.cj.jdbc.StatementImpl statementImpl0 = new com.mysql.cj.jdbc.StatementImpl(jdbcConnection2, string3);
      statementImpl0.checkNullOrEmptyQuery(string1);

  }



  @Test(timeout = 5000)
  public void test_checkNullOrEmptyQuery_10_10() throws Exception,java.sql.SQLException{

      java.lang.String string1 = " ";
      com.mysql.cj.conf.ConnectionUrlParser connectionUrlParser6 = null;
      java.util.Properties properties7 = null;
      com.mysql.cj.conf.ConnectionUrl connectionUrl5 = new com.mysql.cj.conf.url.LoadBalanceConnectionUrl(connectionUrlParser6, properties7);
      com.mysql.cj.jdbc.ha.MultiHostConnectionProxy multiHostConnectionProxy4 = new com.mysql.cj.jdbc.ha.LoadBalancedConnectionProxy(connectionUrl5);
      com.mysql.cj.jdbc.JdbcConnection jdbcConnection2 = new com.mysql.cj.jdbc.ha.ReplicationMySQLConnection(multiHostConnectionProxy4);
      java.lang.String string3 = "<a> </a>";
      com.mysql.cj.jdbc.StatementImpl statementImpl0 = new com.mysql.cj.jdbc.StatementImpl(jdbcConnection2, string3);
      statementImpl0.checkNullOrEmptyQuery(string1);

  }



  @Test(timeout = 5000)
  public void test_checkNullOrEmptyQuery_11_11() throws Exception,java.sql.SQLException{

      java.lang.String string1 = " ";
      com.mysql.cj.conf.HostInfo hostInfo5 = new com.mysql.cj.conf.HostInfo();
      com.mysql.cj.jdbc.JdbcConnection jdbcConnection2 = new com.mysql.cj.jdbc.ConnectionImpl(hostInfo5);
      java.lang.String string3 = "http://lcs.ios.ac.cn/";
      java.lang.String string4 = ".\\a.txt";
      com.mysql.cj.jdbc.StatementImpl statementImpl0 = new com.mysql.cj.jdbc.ClientPreparedStatement(jdbcConnection2, string3, string4);
      statementImpl0.checkNullOrEmptyQuery(string1);

  }



  @Test(timeout = 5000)
  public void test_checkNullOrEmptyQuery_12_12() throws Exception,java.sql.SQLException{

      java.lang.String string1 = "[0,1]";
      com.mysql.cj.conf.HostInfo hostInfo4 = new com.mysql.cj.conf.HostInfo();
      com.mysql.cj.jdbc.JdbcConnection jdbcConnection2 = new com.mysql.cj.jdbc.ConnectionImpl(hostInfo4);
      java.lang.String string3 = " #";
      com.mysql.cj.jdbc.StatementImpl statementImpl0 = new com.mysql.cj.jdbc.StatementImpl(jdbcConnection2, string3);
      statementImpl0.checkNullOrEmptyQuery(string1);

  }



  @Test(timeout = 5000)
  public void test_checkNullOrEmptyQuery_13_13() throws Exception,java.sql.SQLException{

      java.lang.String string1 = "^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$";
      java.util.List<com.mysql.cj.conf.HostInfo> list7 = null;
      java.util.Map<java.lang.String,java.lang.String> map8 = null;
      com.mysql.cj.conf.ConnectionUrl connectionUrl6 = new com.mysql.cj.conf.url.LoadBalanceConnectionUrl(list7, map8);
      com.mysql.cj.jdbc.ha.MultiHostConnectionProxy multiHostConnectionProxy5 = new com.mysql.cj.jdbc.ha.LoadBalancedConnectionProxy(connectionUrl6);
      com.mysql.cj.jdbc.JdbcConnection jdbcConnection2 = new com.mysql.cj.jdbc.ha.MultiHostMySQLConnection(multiHostConnectionProxy5);
      java.lang.String string3 = "http://lcs.ios.ac.cn/";
      java.lang.String string4 = "<a>Hello World</a>";
      com.mysql.cj.jdbc.StatementImpl statementImpl0 = new com.mysql.cj.jdbc.ClientPreparedStatement(jdbcConnection2, string3, string4);
      statementImpl0.checkNullOrEmptyQuery(string1);

  }



  @Test(timeout = 5000)
  public void test_checkNullOrEmptyQuery_14_14() throws Exception,java.sql.SQLException{

      java.lang.String string1 = "{\"key\":null}";
      com.mysql.cj.jdbc.ha.LoadBalancedConnectionProxy loadBalancedConnectionProxy9 = null;
      com.mysql.cj.jdbc.JdbcConnection jdbcConnection7 = new com.mysql.cj.jdbc.ha.LoadBalancedMySQLConnection(loadBalancedConnectionProxy9);
      boolean boolean8 = true;
      com.mysql.cj.jdbc.MysqlPooledConnection mysqlPooledConnection4 = new com.mysql.cj.jdbc.MysqlXAConnection(jdbcConnection7, boolean8);
      com.mysql.cj.jdbc.JdbcConnection jdbcConnection5 = null;
      boolean boolean6 = false;
      com.mysql.cj.jdbc.JdbcConnection jdbcConnection2 = new com.mysql.cj.jdbc.ConnectionWrapper(mysqlPooledConnection4, jdbcConnection5, boolean6);
      java.lang.String string3 = "T>z`M'Ho#KmG?hIn%Wch,3$^bI3|1<W3XP&oy`APg!";
      com.mysql.cj.jdbc.StatementImpl statementImpl0 = new com.mysql.cj.jdbc.StatementImpl(jdbcConnection2, string3);
      statementImpl0.checkNullOrEmptyQuery(string1);

  }



  @Test(timeout = 5000)
  public void test_checkNullOrEmptyQuery_15_15() throws Exception,java.sql.SQLException{

      java.lang.String string1 = "^[1]([3-9])[0-9]{9}$";
      com.mysql.cj.conf.ConnectionUrlParser connectionUrlParser7 = null;
      java.util.Properties properties8 = null;
      com.mysql.cj.conf.ConnectionUrl connectionUrl6 = new com.mysql.cj.conf.url.LoadBalanceConnectionUrl(connectionUrlParser7, properties8);
      com.mysql.cj.jdbc.ha.MultiHostConnectionProxy multiHostConnectionProxy5 = new com.mysql.cj.jdbc.ha.LoadBalancedConnectionProxy(connectionUrl6);
      com.mysql.cj.jdbc.JdbcConnection jdbcConnection2 = new com.mysql.cj.jdbc.ha.MultiHostMySQLConnection(multiHostConnectionProxy5);
      java.lang.String string3 = "http://lcs.ios.ac.cn/";
      java.lang.String string4 = "\\n";
      com.mysql.cj.jdbc.StatementImpl statementImpl0 = new com.mysql.cj.jdbc.ClientPreparedStatement(jdbcConnection2, string3, string4);
      statementImpl0.checkNullOrEmptyQuery(string1);

  }



  @Test(timeout = 5000)
  public void test_checkNullOrEmptyQuery_16_16() throws Exception,java.sql.SQLException{

      java.lang.String string1 = "{\"key\":null}";
      com.mysql.cj.jdbc.ha.MultiHostConnectionProxy multiHostConnectionProxy9 = null;
      com.mysql.cj.jdbc.JdbcConnection jdbcConnection8 = new com.mysql.cj.jdbc.ha.MultiHostMySQLConnection(multiHostConnectionProxy9);
      com.mysql.cj.jdbc.MysqlPooledConnection mysqlPooledConnection5 = new com.mysql.cj.jdbc.SuspendableXAConnection(jdbcConnection8);
      com.mysql.cj.jdbc.JdbcConnection jdbcConnection6 = null;
      boolean boolean7 = false;
      com.mysql.cj.jdbc.JdbcConnection jdbcConnection2 = new com.mysql.cj.jdbc.ConnectionWrapper(mysqlPooledConnection5, jdbcConnection6, boolean7);
      java.lang.String string3 = "a ";
      java.lang.String string4 = "a ";
      com.mysql.cj.jdbc.StatementImpl statementImpl0 = new com.mysql.cj.jdbc.ClientPreparedStatement(jdbcConnection2, string3, string4);
      statementImpl0.checkNullOrEmptyQuery(string1);

  }



  @Test(timeout = 5000)
  public void test_checkNullOrEmptyQuery_17_17() throws Exception,java.sql.SQLException{

      java.lang.String string1 = "{\"key\":null}";
      com.mysql.cj.conf.ConnectionUrlParser connectionUrlParser7 = null;
      java.util.Properties properties8 = null;
      com.mysql.cj.conf.ConnectionUrl connectionUrl6 = new com.mysql.cj.conf.url.XDevApiDnsSrvConnectionUrl(connectionUrlParser7, properties8);
      com.mysql.cj.jdbc.ha.MultiHostConnectionProxy multiHostConnectionProxy5 = new com.mysql.cj.jdbc.ha.LoadBalancedConnectionProxy(connectionUrl6);
      com.mysql.cj.jdbc.JdbcConnection jdbcConnection2 = new com.mysql.cj.jdbc.ha.MultiHostMySQLConnection(multiHostConnectionProxy5);
      java.lang.String string3 = "<a>Hello World</a>";
      java.lang.String string4 = "\\n";
      com.mysql.cj.jdbc.StatementImpl statementImpl0 = new com.mysql.cj.jdbc.ClientPreparedStatement(jdbcConnection2, string3, string4);
      statementImpl0.checkNullOrEmptyQuery(string1);

  }



  @Test(timeout = 5000)
  public void test_checkNullOrEmptyQuery_18_18() throws Exception,java.sql.SQLException{

      java.lang.String string1 = "<a>Hello World</a>";
      com.mysql.cj.conf.ConnectionUrlParser connectionUrlParser7 = null;
      java.util.Properties properties8 = null;
      com.mysql.cj.conf.ConnectionUrl connectionUrl6 = new com.mysql.cj.conf.url.SingleConnectionUrl(connectionUrlParser7, properties8);
      com.mysql.cj.jdbc.ha.LoadBalancedConnectionProxy loadBalancedConnectionProxy5 = new com.mysql.cj.jdbc.ha.LoadBalancedConnectionProxy(connectionUrl6);
      com.mysql.cj.jdbc.JdbcConnection jdbcConnection2 = new com.mysql.cj.jdbc.ha.LoadBalancedMySQLConnection(loadBalancedConnectionProxy5);
      java.lang.String string3 = "<a> </a>";
      java.lang.String string4 = " #";
      com.mysql.cj.jdbc.StatementImpl statementImpl0 = new com.mysql.cj.jdbc.ClientPreparedStatement(jdbcConnection2, string3, string4);
      statementImpl0.checkNullOrEmptyQuery(string1);

  }



  @Test(timeout = 5000)
  public void test_checkNullOrEmptyQuery_19_19() throws Exception,java.sql.SQLException{

      java.lang.String string1 = ".\\a.txt";
      java.util.List<com.mysql.cj.conf.HostInfo> list6 = null;
      java.util.List<com.mysql.cj.conf.HostInfo> list7 = null;
      java.util.Map<java.lang.String,java.lang.String> map8 = null;
      com.mysql.cj.conf.ConnectionUrl connectionUrl5 = new com.mysql.cj.conf.url.ReplicationConnectionUrl(list6, list7, map8);
      com.mysql.cj.jdbc.ha.MultiHostConnectionProxy multiHostConnectionProxy4 = new com.mysql.cj.jdbc.ha.LoadBalancedConnectionProxy(connectionUrl5);
      com.mysql.cj.jdbc.JdbcConnection jdbcConnection2 = new com.mysql.cj.jdbc.ha.ReplicationMySQLConnection(multiHostConnectionProxy4);
      java.lang.String string3 = "<a> </a>";
      com.mysql.cj.jdbc.StatementImpl statementImpl0 = new com.mysql.cj.jdbc.StatementImpl(jdbcConnection2, string3);
      statementImpl0.checkNullOrEmptyQuery(string1);

  }



  @Test(timeout = 5000)
  public void test_checkNullOrEmptyQuery_20_20() throws Exception,java.sql.SQLException{

      java.lang.String string1 = "o1yb>Qx7hY+%X_'sx{Ixt;3";
      com.mysql.cj.conf.HostInfo hostInfo9 = null;
      com.mysql.cj.jdbc.JdbcConnection jdbcConnection8 = new com.mysql.cj.jdbc.ConnectionImpl(hostInfo9);
      com.mysql.cj.jdbc.MysqlPooledConnection mysqlPooledConnection5 = new com.mysql.cj.jdbc.SuspendableXAConnection(jdbcConnection8);
      com.mysql.cj.jdbc.JdbcConnection jdbcConnection6 = null;
      boolean boolean7 = false;
      com.mysql.cj.jdbc.JdbcConnection jdbcConnection2 = new com.mysql.cj.jdbc.ConnectionWrapper(mysqlPooledConnection5, jdbcConnection6, boolean7);
      java.lang.String string3 = "^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$";
      java.lang.String string4 = "";
      com.mysql.cj.jdbc.StatementImpl statementImpl0 = new com.mysql.cj.jdbc.ClientPreparedStatement(jdbcConnection2, string3, string4);
      statementImpl0.checkNullOrEmptyQuery(string1);

  }



  @Test(timeout = 5000)
  public void test_executeQuery_1_21() throws Exception,java.sql.SQLException{

      java.lang.String string1 = "/";
      com.mysql.cj.conf.ConnectionUrlParser connectionUrlParser7 = null;
      java.util.Properties properties8 = null;
      com.mysql.cj.conf.ConnectionUrl connectionUrl6 = new com.mysql.cj.conf.url.FailoverConnectionUrl(connectionUrlParser7, properties8);
      com.mysql.cj.jdbc.ha.MultiHostConnectionProxy multiHostConnectionProxy5 = new com.mysql.cj.jdbc.ha.LoadBalancedConnectionProxy(connectionUrl6);
      com.mysql.cj.jdbc.JdbcConnection jdbcConnection2 = new com.mysql.cj.jdbc.ha.ReplicationMySQLConnection(multiHostConnectionProxy5);
      java.lang.String string3 = "http://lcs.ios.ac.cn/";
      java.lang.String string4 = ".\\a.txt";
      com.mysql.cj.jdbc.StatementImpl statementImpl0 = new com.mysql.cj.jdbc.ClientPreparedStatement(jdbcConnection2, string3, string4);
      statementImpl0.executeQuery(string1);

  }



  @Test(timeout = 5000)
  public void test_executeQuery_2_22() throws Exception,java.sql.SQLException{

      java.lang.String string1 = "/* ping */";
      java.util.List<com.mysql.cj.conf.HostInfo> list6 = null;
      java.util.List<com.mysql.cj.conf.HostInfo> list7 = null;
      java.util.Map<java.lang.String,java.lang.String> map8 = null;
      com.mysql.cj.conf.ConnectionUrl connectionUrl5 = new com.mysql.cj.conf.url.ReplicationConnectionUrl(list6, list7, map8);
      com.mysql.cj.jdbc.ha.MultiHostConnectionProxy multiHostConnectionProxy4 = new com.mysql.cj.jdbc.ha.LoadBalancedConnectionProxy(connectionUrl5);
      com.mysql.cj.jdbc.JdbcConnection jdbcConnection2 = new com.mysql.cj.jdbc.ha.MultiHostMySQLConnection(multiHostConnectionProxy4);
      java.lang.String string3 = "^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$";
      com.mysql.cj.jdbc.StatementImpl statementImpl0 = new com.mysql.cj.jdbc.StatementImpl(jdbcConnection2, string3);
      statementImpl0.executeQuery(string1);

  }



  @Test(timeout = 5000)
  public void test_executeQuery_3_23() throws Exception,java.sql.SQLException{

      java.lang.String string1 = ":/";
      com.mysql.cj.conf.HostInfo hostInfo4 = new com.mysql.cj.conf.HostInfo();
      com.mysql.cj.jdbc.JdbcConnection jdbcConnection2 = new com.mysql.cj.jdbc.ConnectionImpl(hostInfo4);
      java.lang.String string3 = "http://lcs.ios.ac.cn/";
      com.mysql.cj.jdbc.StatementImpl statementImpl0 = new com.mysql.cj.jdbc.StatementImpl(jdbcConnection2, string3);
      statementImpl0.executeQuery(string1);

  }



  @Test(timeout = 5000)
  public void test_executeQuery_4_24() throws Exception,java.sql.SQLException{

      java.lang.String string1 = "7";
      com.mysql.cj.jdbc.MysqlPooledConnection mysqlPooledConnection9 = null;
      com.mysql.cj.jdbc.JdbcConnection jdbcConnection10 = null;
      boolean boolean11 = true;
      com.mysql.cj.jdbc.JdbcConnection jdbcConnection8 = new com.mysql.cj.jdbc.ConnectionWrapper(mysqlPooledConnection9, jdbcConnection10, boolean11);
      com.mysql.cj.jdbc.MysqlPooledConnection mysqlPooledConnection5 = new com.mysql.cj.jdbc.MysqlPooledConnection(jdbcConnection8);
      com.mysql.cj.jdbc.JdbcConnection jdbcConnection6 = null;
      boolean boolean7 = true;
      com.mysql.cj.jdbc.JdbcConnection jdbcConnection2 = new com.mysql.cj.jdbc.ConnectionWrapper(mysqlPooledConnection5, jdbcConnection6, boolean7);
      java.lang.String string3 = " #";
      java.lang.String string4 = "<a>Hello World</a>";
      com.mysql.cj.jdbc.StatementImpl statementImpl0 = new com.mysql.cj.jdbc.ClientPreparedStatement(jdbcConnection2, string3, string4);
      statementImpl0.executeQuery(string1);

  }



  @Test(timeout = 5000)
  public void test_executeQuery_5_25() throws Exception,java.sql.SQLException{

      java.lang.String string1 = "";
      com.mysql.cj.conf.ConnectionUrlParser connectionUrlParser7 = null;
      java.util.Properties properties8 = null;
      com.mysql.cj.conf.ConnectionUrl connectionUrl6 = new com.mysql.cj.conf.url.ReplicationDnsSrvConnectionUrl(connectionUrlParser7, properties8);
      com.mysql.cj.jdbc.ha.LoadBalancedConnectionProxy loadBalancedConnectionProxy5 = new com.mysql.cj.jdbc.ha.LoadBalancedConnectionProxy(connectionUrl6);
      com.mysql.cj.jdbc.JdbcConnection jdbcConnection2 = new com.mysql.cj.jdbc.ha.LoadBalancedMySQLConnection(loadBalancedConnectionProxy5);
      java.lang.String string3 = " #";
      java.lang.String string4 = "{\"key\":2 }";
      com.mysql.cj.jdbc.StatementImpl statementImpl0 = new com.mysql.cj.jdbc.ClientPreparedStatement(jdbcConnection2, string3, string4);
      statementImpl0.executeQuery(string1);

  }



  @Test(timeout = 5000)
  public void test_executeQuery_6_26() throws Exception,java.sql.SQLException{

      java.lang.String string1 = "{\"key\":null}";
      com.mysql.cj.conf.ConnectionUrlParser connectionUrlParser6 = null;
      java.util.Properties properties7 = null;
      com.mysql.cj.conf.ConnectionUrl connectionUrl5 = new com.mysql.cj.conf.url.FailoverConnectionUrl(connectionUrlParser6, properties7);
      com.mysql.cj.jdbc.ha.MultiHostConnectionProxy multiHostConnectionProxy4 = new com.mysql.cj.jdbc.ha.LoadBalancedConnectionProxy(connectionUrl5);
      com.mysql.cj.jdbc.JdbcConnection jdbcConnection2 = new com.mysql.cj.jdbc.ha.MultiHostMySQLConnection(multiHostConnectionProxy4);
      java.lang.String string3 = "";
      com.mysql.cj.jdbc.StatementImpl statementImpl0 = new com.mysql.cj.jdbc.StatementImpl(jdbcConnection2, string3);
      statementImpl0.executeQuery(string1);

  }



  @Test(timeout = 5000)
  public void test_executeQuery_7_27() throws Exception,java.sql.SQLException{

      java.lang.String string1 = "[0,1]";
      com.mysql.cj.conf.ConnectionUrlParser connectionUrlParser6 = null;
      java.util.Properties properties7 = null;
      com.mysql.cj.conf.ConnectionUrl connectionUrl5 = new com.mysql.cj.conf.url.XDevApiConnectionUrl(connectionUrlParser6, properties7);
      com.mysql.cj.jdbc.ha.LoadBalancedConnectionProxy loadBalancedConnectionProxy4 = new com.mysql.cj.jdbc.ha.LoadBalancedConnectionProxy(connectionUrl5);
      com.mysql.cj.jdbc.JdbcConnection jdbcConnection2 = new com.mysql.cj.jdbc.ha.LoadBalancedMySQLConnection(loadBalancedConnectionProxy4);
      java.lang.String string3 = " ";
      com.mysql.cj.jdbc.StatementImpl statementImpl0 = new com.mysql.cj.jdbc.StatementImpl(jdbcConnection2, string3);
      statementImpl0.executeQuery(string1);

  }



  @Test(timeout = 5000)
  public void test_executeQuery_8_28() throws Exception,java.sql.SQLException{

      java.lang.String string1 = "^605;lHzPsYsas~_W]/_g?fS(3B4P$VJ";
      com.mysql.cj.conf.ConnectionUrlParser connectionUrlParser7 = null;
      java.util.Properties properties8 = null;
      com.mysql.cj.conf.ConnectionUrl connectionUrl6 = new com.mysql.cj.conf.url.LoadBalanceDnsSrvConnectionUrl(connectionUrlParser7, properties8);
      com.mysql.cj.jdbc.ha.LoadBalancedConnectionProxy loadBalancedConnectionProxy5 = new com.mysql.cj.jdbc.ha.LoadBalancedConnectionProxy(connectionUrl6);
      com.mysql.cj.jdbc.JdbcConnection jdbcConnection2 = new com.mysql.cj.jdbc.ha.LoadBalancedMySQLConnection(loadBalancedConnectionProxy5);
      java.lang.String string3 = "a ";
      java.lang.String string4 = ".\\a.txt";
      com.mysql.cj.jdbc.StatementImpl statementImpl0 = new com.mysql.cj.jdbc.ClientPreparedStatement(jdbcConnection2, string3, string4);
      statementImpl0.executeQuery(string1);

  }



  @Test(timeout = 5000)
  public void test_executeQuery_9_29() throws Exception,java.sql.SQLException{

      java.lang.String string1 = "<a> </a>";
      com.mysql.cj.jdbc.ha.MultiHostConnectionProxy multiHostConnectionProxy8 = null;
      com.mysql.cj.jdbc.JdbcConnection jdbcConnection7 = new com.mysql.cj.jdbc.ha.MultiHostMySQLConnection(multiHostConnectionProxy8);
      com.mysql.cj.jdbc.MysqlPooledConnection mysqlPooledConnection4 = new com.mysql.cj.jdbc.MysqlPooledConnection(jdbcConnection7);
      com.mysql.cj.jdbc.JdbcConnection jdbcConnection5 = null;
      boolean boolean6 = true;
      com.mysql.cj.jdbc.JdbcConnection jdbcConnection2 = new com.mysql.cj.jdbc.ConnectionWrapper(mysqlPooledConnection4, jdbcConnection5, boolean6);
      java.lang.String string3 = "^[1]([3-9])[0-9]{9}$";
      com.mysql.cj.jdbc.StatementImpl statementImpl0 = new com.mysql.cj.jdbc.StatementImpl(jdbcConnection2, string3);
      statementImpl0.executeQuery(string1);

  }



  @Test(timeout = 5000)
  public void test_executeQuery_10_30() throws Exception,java.sql.SQLException{

      java.lang.String string1 = "{\"key\":2 }";
      com.mysql.cj.conf.ConnectionUrlParser connectionUrlParser6 = null;
      java.util.Properties properties7 = null;
      com.mysql.cj.conf.ConnectionUrl connectionUrl5 = new com.mysql.cj.conf.url.ReplicationConnectionUrl(connectionUrlParser6, properties7);
      com.mysql.cj.jdbc.ha.MultiHostConnectionProxy multiHostConnectionProxy4 = new com.mysql.cj.jdbc.ha.LoadBalancedConnectionProxy(connectionUrl5);
      com.mysql.cj.jdbc.JdbcConnection jdbcConnection2 = new com.mysql.cj.jdbc.ha.ReplicationMySQLConnection(multiHostConnectionProxy4);
      java.lang.String string3 = "<a>Hello World</a>";
      com.mysql.cj.jdbc.StatementImpl statementImpl0 = new com.mysql.cj.jdbc.StatementImpl(jdbcConnection2, string3);
      statementImpl0.executeQuery(string1);

  }



  @Test(timeout = 5000)
  public void test_executeQuery_11_31() throws Exception,java.sql.SQLException{

      java.lang.String string1 = "{\"key\":null}";
      com.mysql.cj.jdbc.ha.MultiHostConnectionProxy multiHostConnectionProxy9 = null;
      com.mysql.cj.jdbc.JdbcConnection jdbcConnection7 = new com.mysql.cj.jdbc.ha.ReplicationMySQLConnection(multiHostConnectionProxy9);
      boolean boolean8 = true;
      com.mysql.cj.jdbc.MysqlPooledConnection mysqlPooledConnection4 = new com.mysql.cj.jdbc.MysqlXAConnection(jdbcConnection7, boolean8);
      com.mysql.cj.jdbc.JdbcConnection jdbcConnection5 = null;
      boolean boolean6 = true;
      com.mysql.cj.jdbc.JdbcConnection jdbcConnection2 = new com.mysql.cj.jdbc.ConnectionWrapper(mysqlPooledConnection4, jdbcConnection5, boolean6);
      java.lang.String string3 = "";
      com.mysql.cj.jdbc.StatementImpl statementImpl0 = new com.mysql.cj.jdbc.StatementImpl(jdbcConnection2, string3);
      statementImpl0.executeQuery(string1);

  }



  @Test(timeout = 5000)
  public void test_executeQuery_12_32() throws Exception,java.sql.SQLException{

      java.lang.String string1 = "[0,1]";
      com.mysql.cj.conf.ConnectionUrlParser connectionUrlParser6 = null;
      java.util.Properties properties7 = null;
      com.mysql.cj.conf.ConnectionUrl connectionUrl5 = new com.mysql.cj.conf.url.ReplicationConnectionUrl(connectionUrlParser6, properties7);
      com.mysql.cj.jdbc.ha.LoadBalancedConnectionProxy loadBalancedConnectionProxy4 = new com.mysql.cj.jdbc.ha.LoadBalancedConnectionProxy(connectionUrl5);
      com.mysql.cj.jdbc.JdbcConnection jdbcConnection2 = new com.mysql.cj.jdbc.ha.LoadBalancedMySQLConnection(loadBalancedConnectionProxy4);
      java.lang.String string3 = "^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$";
      com.mysql.cj.jdbc.StatementImpl statementImpl0 = new com.mysql.cj.jdbc.StatementImpl(jdbcConnection2, string3);
      statementImpl0.executeQuery(string1);

  }



  @Test(timeout = 5000)
  public void test_executeQuery_13_33() throws Exception,java.sql.SQLException{

      java.lang.String string1 = "";
      com.mysql.cj.conf.ConnectionUrlParser connectionUrlParser7 = null;
      java.util.Properties properties8 = null;
      com.mysql.cj.conf.ConnectionUrl connectionUrl6 = new com.mysql.cj.conf.url.XDevApiDnsSrvConnectionUrl(connectionUrlParser7, properties8);
      com.mysql.cj.jdbc.ha.LoadBalancedConnectionProxy loadBalancedConnectionProxy5 = new com.mysql.cj.jdbc.ha.LoadBalancedConnectionProxy(connectionUrl6);
      com.mysql.cj.jdbc.JdbcConnection jdbcConnection2 = new com.mysql.cj.jdbc.ha.LoadBalancedMySQLConnection(loadBalancedConnectionProxy5);
      java.lang.String string3 = "[0,1]";
      java.lang.String string4 = "<a> </a>";
      com.mysql.cj.jdbc.StatementImpl statementImpl0 = new com.mysql.cj.jdbc.ClientPreparedStatement(jdbcConnection2, string3, string4);
      statementImpl0.executeQuery(string1);

  }



  @Test(timeout = 5000)
  public void test_executeQuery_14_34() throws Exception,java.sql.SQLException{

      java.lang.String string1 = "{\"key\":2 }";
      com.mysql.cj.conf.HostInfo hostInfo5 = new com.mysql.cj.conf.HostInfo();
      com.mysql.cj.jdbc.JdbcConnection jdbcConnection2 = new com.mysql.cj.jdbc.ConnectionImpl(hostInfo5);
      java.lang.String string3 = "{\"key\":null}";
      java.lang.String string4 = "{\"key\":null}";
      com.mysql.cj.jdbc.StatementImpl statementImpl0 = new com.mysql.cj.jdbc.ClientPreparedStatement(jdbcConnection2, string3, string4);
      statementImpl0.executeQuery(string1);

  }



  @Test(timeout = 5000)
  public void test_executeQuery_15_35() throws Exception,java.sql.SQLException{

      java.lang.String string1 = "{\"key\":null}";
      com.mysql.cj.conf.ConnectionUrlParser connectionUrlParser6 = null;
      java.util.Properties properties7 = null;
      com.mysql.cj.conf.ConnectionUrl connectionUrl5 = new com.mysql.cj.conf.url.FailoverConnectionUrl(connectionUrlParser6, properties7);
      com.mysql.cj.jdbc.ha.MultiHostConnectionProxy multiHostConnectionProxy4 = new com.mysql.cj.jdbc.ha.LoadBalancedConnectionProxy(connectionUrl5);
      com.mysql.cj.jdbc.JdbcConnection jdbcConnection2 = new com.mysql.cj.jdbc.ha.MultiHostMySQLConnection(multiHostConnectionProxy4);
      java.lang.String string3 = "\\n";
      com.mysql.cj.jdbc.StatementImpl statementImpl0 = new com.mysql.cj.jdbc.StatementImpl(jdbcConnection2, string3);
      statementImpl0.executeQuery(string1);

  }



  @Test(timeout = 5000)
  public void test_executeQuery_16_36() throws Exception,java.sql.SQLException{

      java.lang.String string1 = "http://lcs.ios.ac.cn/";
      com.mysql.cj.conf.HostInfo hostInfo5 = new com.mysql.cj.conf.HostInfo();
      com.mysql.cj.jdbc.JdbcConnection jdbcConnection2 = new com.mysql.cj.jdbc.ConnectionImpl(hostInfo5);
      java.lang.String string3 = "\\n";
      java.lang.String string4 = " #";
      com.mysql.cj.jdbc.StatementImpl statementImpl0 = new com.mysql.cj.jdbc.ClientPreparedStatement(jdbcConnection2, string3, string4);
      statementImpl0.executeQuery(string1);

  }



  @Test(timeout = 5000)
  public void test_executeQuery_17_37() throws Exception,java.sql.SQLException{

      java.lang.String string1 = ".\\a.txt";
      com.mysql.cj.conf.ConnectionUrlParser connectionUrlParser6 = null;
      java.util.Properties properties7 = null;
      com.mysql.cj.conf.ConnectionUrl connectionUrl5 = new com.mysql.cj.conf.url.XDevApiConnectionUrl(connectionUrlParser6, properties7);
      com.mysql.cj.jdbc.ha.LoadBalancedConnectionProxy loadBalancedConnectionProxy4 = new com.mysql.cj.jdbc.ha.LoadBalancedConnectionProxy(connectionUrl5);
      com.mysql.cj.jdbc.JdbcConnection jdbcConnection2 = new com.mysql.cj.jdbc.ha.LoadBalancedMySQLConnection(loadBalancedConnectionProxy4);
      java.lang.String string3 = "<a>Hello World</a>";
      com.mysql.cj.jdbc.StatementImpl statementImpl0 = new com.mysql.cj.jdbc.StatementImpl(jdbcConnection2, string3);
      statementImpl0.executeQuery(string1);

  }



  @Test(timeout = 5000)
  public void test_executeQuery_18_38() throws Exception,java.sql.SQLException{

      java.lang.String string1 = "a ";
      com.mysql.cj.conf.HostInfo hostInfo5 = new com.mysql.cj.conf.HostInfo();
      com.mysql.cj.jdbc.JdbcConnection jdbcConnection2 = new com.mysql.cj.jdbc.ConnectionImpl(hostInfo5);
      java.lang.String string3 = "<a> </a>";
      java.lang.String string4 = " ";
      com.mysql.cj.jdbc.StatementImpl statementImpl0 = new com.mysql.cj.jdbc.ClientPreparedStatement(jdbcConnection2, string3, string4);
      statementImpl0.executeQuery(string1);

  }



  @Test(timeout = 5000)
  public void test_executeQuery_19_39() throws Exception,java.sql.SQLException{

      java.lang.String string1 = ".\\a.txt";
      com.mysql.cj.conf.ConnectionUrlParser connectionUrlParser7 = null;
      java.util.Properties properties8 = null;
      com.mysql.cj.conf.ConnectionUrl connectionUrl6 = new com.mysql.cj.conf.url.XDevApiConnectionUrl(connectionUrlParser7, properties8);
      com.mysql.cj.jdbc.ha.MultiHostConnectionProxy multiHostConnectionProxy5 = new com.mysql.cj.jdbc.ha.LoadBalancedConnectionProxy(connectionUrl6);
      com.mysql.cj.jdbc.JdbcConnection jdbcConnection2 = new com.mysql.cj.jdbc.ha.MultiHostMySQLConnection(multiHostConnectionProxy5);
      java.lang.String string3 = "^[1]([3-9])[0-9]{9}$";
      java.lang.String string4 = "";
      com.mysql.cj.jdbc.StatementImpl statementImpl0 = new com.mysql.cj.jdbc.ClientPreparedStatement(jdbcConnection2, string3, string4);
      statementImpl0.executeQuery(string1);

  }



  @Test(timeout = 5000)
  public void test_executeQuery_20_40() throws Exception,java.sql.SQLException{

      java.lang.String string1 = "<a>Hello World</a>";
      com.mysql.cj.conf.ConnectionUrlParser connectionUrlParser7 = null;
      java.util.Properties properties8 = null;
      com.mysql.cj.conf.ConnectionUrl connectionUrl6 = new com.mysql.cj.conf.url.LoadBalanceDnsSrvConnectionUrl(connectionUrlParser7, properties8);
      com.mysql.cj.jdbc.ha.MultiHostConnectionProxy multiHostConnectionProxy5 = new com.mysql.cj.jdbc.ha.LoadBalancedConnectionProxy(connectionUrl6);
      com.mysql.cj.jdbc.JdbcConnection jdbcConnection2 = new com.mysql.cj.jdbc.ha.ReplicationMySQLConnection(multiHostConnectionProxy5);
      java.lang.String string3 = "^[1]([3-9])[0-9]{9}$";
      java.lang.String string4 = " #";
      com.mysql.cj.jdbc.StatementImpl statementImpl0 = new com.mysql.cj.jdbc.ClientPreparedStatement(jdbcConnection2, string3, string4);
      statementImpl0.executeQuery(string1);

  }



}