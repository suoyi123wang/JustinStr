package com.mysql.cj.jdbc;

import org.junit.Test;

public class EscapeProcessor_Test {

  @Test(timeout = 5000)
  public void test_escapeSQL_1_1() throws Exception,java.sql.SQLException{

      java.lang.String string0 = "{";
      java.lang.String string5 = "^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$";
      int int6 = 2147483647;
      java.util.TimeZone timeZone1 = new sun.util.calendar.ZoneInfo(string5, int6);
      boolean boolean2 = true;
      boolean boolean3 = false;
      java.lang.String string7 = " ";
      java.util.Properties properties11 = null;
      java.util.Properties properties10 = new java.util.Properties(properties11);
      java.util.Properties properties8 = new java.util.Properties(properties10);
      com.mysql.cj.log.Log log9 = null;
      com.mysql.cj.exceptions.ExceptionInterceptor exceptionInterceptor4 = new com.mysql.cj.exceptions.ExceptionInterceptorChain(string7, properties8, log9);
      com.mysql.cj.jdbc.EscapeProcessor.escapeSQL(string0, timeZone1, boolean2, boolean3, exceptionInterceptor4);

  }



  @Test(timeout = 5000)
  public void test_escapeSQL_2_2() throws Exception,java.sql.SQLException{

      java.lang.String string0 = "{\"key\":2 }";
      java.lang.String string5 = "{\"key\":null}";
      int int6 = -2147483648;
      java.util.TimeZone timeZone1 = new sun.util.calendar.ZoneInfo(string5, int6);
      boolean boolean2 = false;
      boolean boolean3 = false;
      java.lang.String string7 = ".\\a.txt";
      java.util.Properties properties8 = new java.util.Properties();
      java.lang.String string10 = " #";
      com.mysql.cj.log.Log log9 = new com.mysql.cj.log.Slf4JLogger(string10);
      com.mysql.cj.exceptions.ExceptionInterceptor exceptionInterceptor4 = new com.mysql.cj.exceptions.ExceptionInterceptorChain(string7, properties8, log9);
      com.mysql.cj.jdbc.EscapeProcessor.escapeSQL(string0, timeZone1, boolean2, boolean3, exceptionInterceptor4);

  }



  @Test(timeout = 5000)
  public void test_escapeSQL_3_3() throws Exception,java.sql.SQLException{

      java.lang.String string0 = "<a> </a>";
      int int5 = 1;
      java.lang.String string6 = "{\"key\":2 }";
      java.util.TimeZone timeZone1 = new java.util.SimpleTimeZone(int5, string6);
      boolean boolean2 = true;
      boolean boolean3 = true;
      java.lang.String string7 = "http://lcs.ios.ac.cn/";
      java.util.Properties properties8 = new java.util.Properties();
      java.lang.String string10 = " ";
      com.mysql.cj.log.Log log9 = new com.mysql.cj.log.StandardLogger(string10);
      com.mysql.cj.exceptions.ExceptionInterceptor exceptionInterceptor4 = new com.mysql.cj.exceptions.ExceptionInterceptorChain(string7, properties8, log9);
      com.mysql.cj.jdbc.EscapeProcessor.escapeSQL(string0, timeZone1, boolean2, boolean3, exceptionInterceptor4);

  }



  @Test(timeout = 5000)
  public void test_escapeSQL_4_4() throws Exception,java.sql.SQLException{

      java.lang.String string0 = "^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$";
      java.lang.String string5 = "<a> </a>";
      int int6 = -1;
      java.util.TimeZone timeZone1 = new sun.util.calendar.ZoneInfo(string5, int6);
      boolean boolean2 = false;
      boolean boolean3 = false;
      java.lang.String string7 = "<a>Hello World</a>";
      java.util.Properties properties11 = null;
      java.util.Properties properties10 = new java.util.Properties(properties11);
      java.util.Properties properties8 = new java.util.Properties(properties10);
      com.mysql.cj.log.Log log9 = null;
      com.mysql.cj.exceptions.ExceptionInterceptor exceptionInterceptor4 = new com.mysql.cj.exceptions.ExceptionInterceptorChain(string7, properties8, log9);
      com.mysql.cj.jdbc.EscapeProcessor.escapeSQL(string0, timeZone1, boolean2, boolean3, exceptionInterceptor4);

  }



  @Test(timeout = 5000)
  public void test_escapeSQL_5_5() throws Exception,java.sql.SQLException{

      java.lang.String string0 = "{\"key\":null}";
      java.util.TimeZone timeZone1 = new sun.util.calendar.ZoneInfo();
      boolean boolean2 = false;
      boolean boolean3 = false;
      java.lang.String string5 = "[0,1]";
      java.util.Properties properties6 = new java.util.Properties();
      java.lang.String string8 = "{\"key\":null}";
      com.mysql.cj.log.Log log7 = new com.mysql.cj.log.NullLogger(string8);
      com.mysql.cj.exceptions.ExceptionInterceptor exceptionInterceptor4 = new com.mysql.cj.exceptions.ExceptionInterceptorChain(string5, properties6, log7);
      com.mysql.cj.jdbc.EscapeProcessor.escapeSQL(string0, timeZone1, boolean2, boolean3, exceptionInterceptor4);

  }



  @Test(timeout = 5000)
  public void test_escapeSQL_6_6() throws Exception,java.sql.SQLException{

      java.lang.String string0 = " ";
      java.util.TimeZone timeZone1 = new sun.util.calendar.ZoneInfo();
      boolean boolean2 = true;
      boolean boolean3 = false;
      java.lang.String string5 = "^[1]([3-9])[0-9]{9}$";
      java.util.Properties properties6 = new java.util.Properties();
      java.lang.String string8 = "";
      com.mysql.cj.log.Log log7 = new com.mysql.cj.log.StandardLogger(string8);
      com.mysql.cj.exceptions.ExceptionInterceptor exceptionInterceptor4 = new com.mysql.cj.exceptions.ExceptionInterceptorChain(string5, properties6, log7);
      com.mysql.cj.jdbc.EscapeProcessor.escapeSQL(string0, timeZone1, boolean2, boolean3, exceptionInterceptor4);

  }



  @Test(timeout = 5000)
  public void test_escapeSQL_7_7() throws Exception,java.sql.SQLException{

      java.lang.String string0 = "";
      java.lang.String string5 = "\\n";
      int int6 = 1;
      java.util.TimeZone timeZone1 = new sun.util.calendar.ZoneInfo(string5, int6);
      boolean boolean2 = false;
      boolean boolean3 = false;
      java.lang.String string7 = "http://lcs.ios.ac.cn/";
      java.util.Properties properties11 = null;
      java.util.Properties properties10 = new java.util.Properties(properties11);
      java.util.Properties properties8 = new java.util.Properties(properties10);
      com.mysql.cj.log.Log log9 = null;
      com.mysql.cj.exceptions.ExceptionInterceptor exceptionInterceptor4 = new com.mysql.cj.exceptions.ExceptionInterceptorChain(string7, properties8, log9);
      com.mysql.cj.jdbc.EscapeProcessor.escapeSQL(string0, timeZone1, boolean2, boolean3, exceptionInterceptor4);

  }



  @Test(timeout = 5000)
  public void test_escapeSQL_8_8() throws Exception,java.sql.SQLException{

      java.lang.String string0 = "^[1]([3-9])[0-9]{9}$";
      java.util.TimeZone timeZone1 = new sun.util.calendar.ZoneInfo();
      boolean boolean2 = true;
      boolean boolean3 = false;
      java.lang.String string5 = "^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$";
      java.util.Properties properties8 = new java.util.Properties();
      java.util.Properties properties6 = new java.util.Properties(properties8);
      com.mysql.cj.log.Log log7 = null;
      com.mysql.cj.exceptions.ExceptionInterceptor exceptionInterceptor4 = new com.mysql.cj.exceptions.ExceptionInterceptorChain(string5, properties6, log7);
      com.mysql.cj.jdbc.EscapeProcessor.escapeSQL(string0, timeZone1, boolean2, boolean3, exceptionInterceptor4);

  }



  @Test(timeout = 5000)
  public void test_escapeSQL_9_9() throws Exception,java.sql.SQLException{

      java.lang.String string0 = "{\"key\":2 }";
      java.util.TimeZone timeZone1 = new sun.util.calendar.ZoneInfo();
      boolean boolean2 = false;
      boolean boolean3 = false;
      java.lang.String string5 = "[0,1]";
      java.util.Properties properties8 = new java.util.Properties();
      java.util.Properties properties6 = new java.util.Properties(properties8);
      com.mysql.cj.log.Log log7 = null;
      com.mysql.cj.exceptions.ExceptionInterceptor exceptionInterceptor4 = new com.mysql.cj.exceptions.ExceptionInterceptorChain(string5, properties6, log7);
      com.mysql.cj.jdbc.EscapeProcessor.escapeSQL(string0, timeZone1, boolean2, boolean3, exceptionInterceptor4);

  }



  @Test(timeout = 5000)
  public void test_escapeSQL_10_10() throws Exception,java.sql.SQLException{

      java.lang.String string0 = "<a> </a>";
      int int5 = 2147483647;
      java.lang.String string6 = "";
      java.util.TimeZone timeZone1 = new java.util.SimpleTimeZone(int5, string6);
      boolean boolean2 = true;
      boolean boolean3 = true;
      java.lang.String string7 = "{\"key\":null}";
      java.util.Properties properties10 = new java.util.Properties();
      java.util.Properties properties8 = new java.util.Properties(properties10);
      com.mysql.cj.log.Log log9 = null;
      com.mysql.cj.exceptions.ExceptionInterceptor exceptionInterceptor4 = new com.mysql.cj.exceptions.ExceptionInterceptorChain(string7, properties8, log9);
      com.mysql.cj.jdbc.EscapeProcessor.escapeSQL(string0, timeZone1, boolean2, boolean3, exceptionInterceptor4);

  }



  @Test(timeout = 5000)
  public void test_escapeSQL_11_11() throws Exception,java.sql.SQLException{

      java.lang.String string0 = "";
      java.util.TimeZone timeZone1 = new sun.util.calendar.ZoneInfo();
      boolean boolean2 = true;
      boolean boolean3 = true;
      java.lang.String string5 = "^[1]([3-9])[0-9]{9}$";
      java.util.Properties properties6 = new java.util.Properties();
      java.lang.String string8 = " #";
      com.mysql.cj.log.Log log7 = new com.mysql.cj.log.StandardLogger(string8);
      com.mysql.cj.exceptions.ExceptionInterceptor exceptionInterceptor4 = new com.mysql.cj.exceptions.ExceptionInterceptorChain(string5, properties6, log7);
      com.mysql.cj.jdbc.EscapeProcessor.escapeSQL(string0, timeZone1, boolean2, boolean3, exceptionInterceptor4);

  }



  @Test(timeout = 5000)
  public void test_escapeSQL_12_12() throws Exception,java.sql.SQLException{

      java.lang.String string0 = "http://lcs.ios.ac.cn/";
      java.util.TimeZone timeZone1 = new sun.util.calendar.ZoneInfo();
      boolean boolean2 = true;
      boolean boolean3 = false;
      java.lang.String string5 = "{\"key\":2 }";
      java.util.Properties properties8 = new java.util.Properties();
      java.util.Properties properties6 = new java.util.Properties(properties8);
      com.mysql.cj.log.Log log7 = null;
      com.mysql.cj.exceptions.ExceptionInterceptor exceptionInterceptor4 = new com.mysql.cj.exceptions.ExceptionInterceptorChain(string5, properties6, log7);
      com.mysql.cj.jdbc.EscapeProcessor.escapeSQL(string0, timeZone1, boolean2, boolean3, exceptionInterceptor4);

  }



  @Test(timeout = 5000)
  public void test_escapeSQL_13_13() throws Exception,java.sql.SQLException{

      java.lang.String string0 = "{\"key\":2 }";
      int int5 = 2147483647;
      java.lang.String string6 = "^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$";
      java.util.TimeZone timeZone1 = new java.util.SimpleTimeZone(int5, string6);
      boolean boolean2 = false;
      boolean boolean3 = true;
      java.lang.String string7 = "a ";
      java.util.Properties properties8 = new java.util.Properties();
      java.lang.String string10 = "T\\\"[pjL'UL|lLi:$_GcN`h`(-RQh]E9h{fz";
      com.mysql.cj.log.Log log9 = new com.mysql.cj.log.NullLogger(string10);
      com.mysql.cj.exceptions.ExceptionInterceptor exceptionInterceptor4 = new com.mysql.cj.exceptions.ExceptionInterceptorChain(string7, properties8, log9);
      com.mysql.cj.jdbc.EscapeProcessor.escapeSQL(string0, timeZone1, boolean2, boolean3, exceptionInterceptor4);

  }



  @Test(timeout = 5000)
  public void test_escapeSQL_14_14() throws Exception,java.sql.SQLException{

      java.lang.String string0 = "";
      java.lang.String string5 = "http://lcs.ios.ac.cn/";
      int int6 = -1;
      java.util.TimeZone timeZone1 = new sun.util.calendar.ZoneInfo(string5, int6);
      boolean boolean2 = true;
      boolean boolean3 = true;
      java.lang.String string7 = "\\\"q+!.3#oiJ<Tv=j<'#";
      java.util.Properties properties10 = new java.util.Properties();
      java.util.Properties properties8 = new java.util.Properties(properties10);
      com.mysql.cj.log.Log log9 = null;
      com.mysql.cj.exceptions.ExceptionInterceptor exceptionInterceptor4 = new com.mysql.cj.exceptions.ExceptionInterceptorChain(string7, properties8, log9);
      com.mysql.cj.jdbc.EscapeProcessor.escapeSQL(string0, timeZone1, boolean2, boolean3, exceptionInterceptor4);

  }



  @Test(timeout = 5000)
  public void test_escapeSQL_15_15() throws Exception,java.sql.SQLException{

      java.lang.String string0 = "";
      java.lang.String string5 = " ";
      int int6 = 2147483647;
      java.util.TimeZone timeZone1 = new sun.util.calendar.ZoneInfo(string5, int6);
      boolean boolean2 = true;
      boolean boolean3 = true;
      java.lang.String string7 = " #";
      java.util.Properties properties11 = null;
      java.util.Properties properties10 = new java.util.Properties(properties11);
      java.util.Properties properties8 = new java.util.Properties(properties10);
      com.mysql.cj.log.Log log9 = null;
      com.mysql.cj.exceptions.ExceptionInterceptor exceptionInterceptor4 = new com.mysql.cj.exceptions.ExceptionInterceptorChain(string7, properties8, log9);
      com.mysql.cj.jdbc.EscapeProcessor.escapeSQL(string0, timeZone1, boolean2, boolean3, exceptionInterceptor4);

  }



  @Test(timeout = 5000)
  public void test_escapeSQL_16_16() throws Exception,java.sql.SQLException{

      java.lang.String string0 = "a ";
      java.lang.String string5 = "{\"key\":2 }";
      int int6 = 0;
      java.util.TimeZone timeZone1 = new sun.util.calendar.ZoneInfo(string5, int6);
      boolean boolean2 = false;
      boolean boolean3 = true;
      java.lang.String string7 = "^[1]([3-9])[0-9]{9}$";
      java.util.Properties properties11 = null;
      java.util.Properties properties10 = new java.util.Properties(properties11);
      java.util.Properties properties8 = new java.util.Properties(properties10);
      com.mysql.cj.log.Log log9 = null;
      com.mysql.cj.exceptions.ExceptionInterceptor exceptionInterceptor4 = new com.mysql.cj.exceptions.ExceptionInterceptorChain(string7, properties8, log9);
      com.mysql.cj.jdbc.EscapeProcessor.escapeSQL(string0, timeZone1, boolean2, boolean3, exceptionInterceptor4);

  }



  @Test(timeout = 5000)
  public void test_escapeSQL_17_17() throws Exception,java.sql.SQLException{

      java.lang.String string0 = "{\"key\":2 }";
      int int5 = -1;
      java.lang.String string6 = "";
      java.util.TimeZone timeZone1 = new java.util.SimpleTimeZone(int5, string6);
      boolean boolean2 = true;
      boolean boolean3 = true;
      java.lang.String string7 = "<a> </a>";
      java.util.Properties properties8 = new java.util.Properties();
      java.lang.String string10 = "<a> </a>";
      com.mysql.cj.log.Log log9 = new com.mysql.cj.log.StandardLogger(string10);
      com.mysql.cj.exceptions.ExceptionInterceptor exceptionInterceptor4 = new com.mysql.cj.exceptions.ExceptionInterceptorChain(string7, properties8, log9);
      com.mysql.cj.jdbc.EscapeProcessor.escapeSQL(string0, timeZone1, boolean2, boolean3, exceptionInterceptor4);

  }



  @Test(timeout = 5000)
  public void test_escapeSQL_18_18() throws Exception,java.sql.SQLException{

      java.lang.String string0 = "[0,1]";
      int int5 = 0;
      java.lang.String string6 = "a ";
      java.util.TimeZone timeZone1 = new java.util.SimpleTimeZone(int5, string6);
      boolean boolean2 = false;
      boolean boolean3 = true;
      java.lang.String string7 = "a ";
      java.util.Properties properties8 = new java.util.Properties();
      java.lang.String string10 = " #";
      boolean boolean11 = true;
      com.mysql.cj.log.Log log9 = new com.mysql.cj.log.StandardLogger(string10, boolean11);
      com.mysql.cj.exceptions.ExceptionInterceptor exceptionInterceptor4 = new com.mysql.cj.exceptions.ExceptionInterceptorChain(string7, properties8, log9);
      com.mysql.cj.jdbc.EscapeProcessor.escapeSQL(string0, timeZone1, boolean2, boolean3, exceptionInterceptor4);

  }



  @Test(timeout = 5000)
  public void test_escapeSQL_19_19() throws Exception,java.sql.SQLException{

      java.lang.String string0 = "pRL:Yt$b\\\"+Wo\\zk,+e/";
      java.lang.String string5 = "^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$";
      int int6 = -1;
      java.util.TimeZone timeZone1 = new sun.util.calendar.ZoneInfo(string5, int6);
      boolean boolean2 = true;
      boolean boolean3 = false;
      java.lang.String string7 = "^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$";
      java.util.Properties properties8 = new java.util.Properties();
      java.lang.String string10 = "^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$";
      boolean boolean11 = false;
      com.mysql.cj.log.Log log9 = new com.mysql.cj.log.StandardLogger(string10, boolean11);
      com.mysql.cj.exceptions.ExceptionInterceptor exceptionInterceptor4 = new com.mysql.cj.exceptions.ExceptionInterceptorChain(string7, properties8, log9);
      com.mysql.cj.jdbc.EscapeProcessor.escapeSQL(string0, timeZone1, boolean2, boolean3, exceptionInterceptor4);

  }



  @Test(timeout = 5000)
  public void test_escapeSQL_20_20() throws Exception,java.sql.SQLException{

      java.lang.String string0 = "<a>Hello World</a>";
      int int5 = -1;
      java.lang.String string6 = "^[1]([3-9])[0-9]{9}$";
      java.util.TimeZone timeZone1 = new java.util.SimpleTimeZone(int5, string6);
      boolean boolean2 = true;
      boolean boolean3 = false;
      java.lang.String string7 = "^[1]([3-9])[0-9]{9}$";
      java.util.Properties properties8 = new java.util.Properties();
      java.lang.String string10 = "<a>Hello World</a>";
      com.mysql.cj.log.Log log9 = new com.mysql.cj.log.Jdk14Logger(string10);
      com.mysql.cj.exceptions.ExceptionInterceptor exceptionInterceptor4 = new com.mysql.cj.exceptions.ExceptionInterceptorChain(string7, properties8, log9);
      com.mysql.cj.jdbc.EscapeProcessor.escapeSQL(string0, timeZone1, boolean2, boolean3, exceptionInterceptor4);

  }



}