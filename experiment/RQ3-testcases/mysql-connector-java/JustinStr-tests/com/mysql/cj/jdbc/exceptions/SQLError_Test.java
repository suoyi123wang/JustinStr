package com.mysql.cj.jdbc.exceptions;

import org.junit.Test;

public class SQLError_Test {

  @Test(timeout = 5000)
  public void test_createSQLException_1_1() throws Exception{

      java.lang.String string0 = "http://lcs.ios.ac.cn/";
      java.lang.String string1 = "70100";
      int int2 = 0;
      boolean boolean3 = false;
      java.lang.String string6 = "[0,1]";
      java.lang.Throwable throwable7 = new java.lang.Exception();
      java.lang.Throwable throwable4 = new java.lang.Error(string6, throwable7);
      java.lang.String string8 = "<a> </a>";
      java.util.Properties properties11 = new java.util.Properties();
      java.util.Properties properties9 = new java.util.Properties(properties11);
      com.mysql.cj.log.Log log10 = null;
      com.mysql.cj.exceptions.ExceptionInterceptor exceptionInterceptor5 = new com.mysql.cj.exceptions.ExceptionInterceptorChain(string8, properties9, log10);
      com.mysql.cj.jdbc.exceptions.SQLError.createSQLException(string0, string1, int2, boolean3, throwable4, exceptionInterceptor5);

  }



  @Test(timeout = 5000)
  public void test_createSQLException_2_2() throws Exception{

      java.lang.String string0 = "";
      java.lang.String string1 = "23";
      int int2 = 1;
      boolean boolean3 = true;
      java.lang.String string7 = "<a> </a>";
      java.lang.Throwable throwable6 = new java.lang.Throwable(string7);
      java.lang.Throwable throwable4 = new java.lang.Throwable(throwable6);
      java.lang.String string8 = "^[1]([3-9])[0-9]{9}$";
      java.util.Properties properties9 = new java.util.Properties();
      java.lang.String string11 = ".\\a.txt";
      com.mysql.cj.log.Log log10 = new com.mysql.cj.log.StandardLogger(string11);
      com.mysql.cj.exceptions.ExceptionInterceptor exceptionInterceptor5 = new com.mysql.cj.exceptions.ExceptionInterceptorChain(string8, properties9, log10);
      com.mysql.cj.jdbc.exceptions.SQLError.createSQLException(string0, string1, int2, boolean3, throwable4, exceptionInterceptor5);

  }



  @Test(timeout = 5000)
  public void test_createSQLException_3_3() throws Exception{

      java.lang.String string0 = "{\"key\":null}";
      java.lang.String string1 = "22";
      int int2 = 0;
      boolean boolean3 = false;
      java.lang.String string6 = " ";
      java.lang.Throwable throwable4 = new java.lang.Exception(string6);
      java.lang.String string7 = "{\"key\":2 }";
      java.util.Properties properties8 = new java.util.Properties();
      java.lang.String string10 = "<a> </a>";
      com.mysql.cj.log.Log log9 = new com.mysql.cj.log.Slf4JLogger(string10);
      com.mysql.cj.exceptions.ExceptionInterceptor exceptionInterceptor5 = new com.mysql.cj.exceptions.ExceptionInterceptorChain(string7, properties8, log9);
      com.mysql.cj.jdbc.exceptions.SQLError.createSQLException(string0, string1, int2, boolean3, throwable4, exceptionInterceptor5);

  }



  @Test(timeout = 5000)
  public void test_createSQLException_4_4() throws Exception{

      java.lang.String string0 = "4P^Y|G:`9zk.I|`%3~zyz1QeOy'I\\\"t[zEpj?A~";
      java.lang.String string1 = "42";
      int int2 = 2147483647;
      boolean boolean3 = true;
      java.lang.String string7 = "http://lcs.ios.ac.cn/";
      java.lang.Throwable throwable6 = new java.lang.Error(string7);
      java.lang.Throwable throwable4 = new java.lang.Exception(throwable6);
      java.lang.String string8 = "<n}_nsxF";
      java.util.Properties properties12 = null;
      java.util.Properties properties11 = new java.util.Properties(properties12);
      java.util.Properties properties9 = new java.util.Properties(properties11);
      com.mysql.cj.log.Log log10 = null;
      com.mysql.cj.exceptions.ExceptionInterceptor exceptionInterceptor5 = new com.mysql.cj.exceptions.ExceptionInterceptorChain(string8, properties9, log10);
      com.mysql.cj.jdbc.exceptions.SQLError.createSQLException(string0, string1, int2, boolean3, throwable4, exceptionInterceptor5);

  }



  @Test(timeout = 5000)
  public void test_createSQLException_5_5() throws Exception{

      java.lang.String string0 = " ";
      java.lang.String string1 = "40";
      int int2 = 1;
      boolean boolean3 = false;
      java.lang.String string6 = "";
      java.lang.Throwable throwable4 = new java.lang.Error(string6);
      java.lang.String string7 = "^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$";
      java.util.Properties properties10 = new java.util.Properties();
      java.util.Properties properties8 = new java.util.Properties(properties10);
      com.mysql.cj.log.Log log9 = null;
      com.mysql.cj.exceptions.ExceptionInterceptor exceptionInterceptor5 = new com.mysql.cj.exceptions.ExceptionInterceptorChain(string7, properties8, log9);
      com.mysql.cj.jdbc.exceptions.SQLError.createSQLException(string0, string1, int2, boolean3, throwable4, exceptionInterceptor5);

  }



  @Test(timeout = 5000)
  public void test_createSQLException_6_6() throws Exception{

      java.lang.String string0 = "H\\KLkL:B3*Q7Q@IIrk}nQ#'z4:b$T-TF";
      java.lang.String string1 = "08";
      int int2 = -1;
      boolean boolean3 = true;
      java.lang.Throwable throwable6 = new java.lang.Throwable();
      java.lang.Throwable throwable4 = new java.lang.Error(throwable6);
      java.lang.String string7 = "{\"key\":2 }";
      java.util.Properties properties8 = new java.util.Properties();
      java.lang.String string10 = "http://lcs.ios.ac.cn/";
      com.mysql.cj.log.Log log9 = new com.mysql.cj.log.Slf4JLogger(string10);
      com.mysql.cj.exceptions.ExceptionInterceptor exceptionInterceptor5 = new com.mysql.cj.exceptions.ExceptionInterceptorChain(string7, properties8, log9);
      com.mysql.cj.jdbc.exceptions.SQLError.createSQLException(string0, string1, int2, boolean3, throwable4, exceptionInterceptor5);

  }



  @Test(timeout = 5000)
  public void test_createSQLException_7_7() throws Exception{

      java.lang.String string0 = "{\"key\":null}";
      java.lang.String string1 = "2";
      int int2 = 2147483647;
      boolean boolean3 = false;
      java.lang.String string6 = "{\"key\":2 }";
      java.lang.String string8 = " ";
      java.lang.Throwable throwable9 = null;
      java.lang.Throwable throwable7 = new java.lang.Throwable(string8, throwable9);
      java.lang.Throwable throwable4 = new java.lang.Throwable(string6, throwable7);
      java.lang.String string10 = " #";
      java.util.Properties properties11 = new java.util.Properties();
      java.lang.String string13 = "<a> </a>";
      com.mysql.cj.log.Log log12 = new com.mysql.cj.log.NullLogger(string13);
      com.mysql.cj.exceptions.ExceptionInterceptor exceptionInterceptor5 = new com.mysql.cj.exceptions.ExceptionInterceptorChain(string10, properties11, log12);
      com.mysql.cj.jdbc.exceptions.SQLError.createSQLException(string0, string1, int2, boolean3, throwable4, exceptionInterceptor5);

  }



  @Test(timeout = 5000)
  public void test_createSQLException_8_8() throws Exception{

      java.lang.String string0 = "\\n";
      java.lang.String string1 = "http://lcs.ios.ac.cn/";
      int int2 = -2147483648;
      boolean boolean3 = true;
      java.lang.String string7 = ".\\a.txt";
      java.lang.Throwable throwable9 = null;
      java.lang.Throwable throwable8 = new java.lang.Error(throwable9);
      java.lang.Throwable throwable6 = new java.lang.Throwable(string7, throwable8);
      java.lang.Throwable throwable4 = new java.lang.Throwable(throwable6);
      java.lang.String string10 = "{\"key\":2 }";
      java.util.Properties properties11 = new java.util.Properties();
      java.lang.String string13 = "MQ~H~>u|n4*mJQ@1jTO;iyqq";
      com.mysql.cj.log.Log log12 = new com.mysql.cj.log.Slf4JLogger(string13);
      com.mysql.cj.exceptions.ExceptionInterceptor exceptionInterceptor5 = new com.mysql.cj.exceptions.ExceptionInterceptorChain(string10, properties11, log12);
      com.mysql.cj.jdbc.exceptions.SQLError.createSQLException(string0, string1, int2, boolean3, throwable4, exceptionInterceptor5);

  }



  @Test(timeout = 5000)
  public void test_createSQLException_9_9() throws Exception{

      java.lang.String string0 = "^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$";
      java.lang.String string1 = "<a>Hello World</a>";
      int int2 = 1561977084;
      boolean boolean3 = true;
      java.lang.Throwable throwable4 = new java.lang.Throwable();
      java.lang.String string6 = ".\\a.txt";
      java.util.Properties properties7 = new java.util.Properties();
      java.lang.String string9 = ".\\a.txt";
      com.mysql.cj.log.Log log8 = new com.mysql.cj.log.Jdk14Logger(string9);
      com.mysql.cj.exceptions.ExceptionInterceptor exceptionInterceptor5 = new com.mysql.cj.exceptions.ExceptionInterceptorChain(string6, properties7, log8);
      com.mysql.cj.jdbc.exceptions.SQLError.createSQLException(string0, string1, int2, boolean3, throwable4, exceptionInterceptor5);

  }



  @Test(timeout = 5000)
  public void test_createSQLException_10_10() throws Exception{

      java.lang.String string0 = " ";
      java.lang.String string1 = "{\"key\":2 }";
      int int2 = 2147483647;
      boolean boolean3 = false;
      java.lang.String string6 = "<a>Hello World</a>";
      java.lang.Throwable throwable4 = new java.lang.Exception(string6);
      java.lang.String string7 = "^[1]([3-9])[0-9]{9}$";
      java.util.Properties properties8 = new java.util.Properties();
      java.lang.String string10 = ".\\a.txt";
      com.mysql.cj.log.Log log9 = new com.mysql.cj.log.NullLogger(string10);
      com.mysql.cj.exceptions.ExceptionInterceptor exceptionInterceptor5 = new com.mysql.cj.exceptions.ExceptionInterceptorChain(string7, properties8, log9);
      com.mysql.cj.jdbc.exceptions.SQLError.createSQLException(string0, string1, int2, boolean3, throwable4, exceptionInterceptor5);

  }



  @Test(timeout = 5000)
  public void test_createSQLException_11_11() throws Exception{

      java.lang.String string0 = "\\n";
      java.lang.String string1 = "^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$";
      int int2 = 0;
      boolean boolean3 = true;
      java.lang.String string6 = " ";
      java.lang.Throwable throwable4 = new java.lang.Exception(string6);
      java.lang.String string7 = ".\\a.txt";
      java.util.Properties properties8 = new java.util.Properties();
      java.lang.String string10 = "";
      com.mysql.cj.log.Log log9 = new com.mysql.cj.log.Jdk14Logger(string10);
      com.mysql.cj.exceptions.ExceptionInterceptor exceptionInterceptor5 = new com.mysql.cj.exceptions.ExceptionInterceptorChain(string7, properties8, log9);
      com.mysql.cj.jdbc.exceptions.SQLError.createSQLException(string0, string1, int2, boolean3, throwable4, exceptionInterceptor5);

  }



  @Test(timeout = 5000)
  public void test_createSQLException_12_12() throws Exception{

      java.lang.String string0 = "<a>Hello World</a>";
      java.lang.String string1 = "<a>Hello World</a>";
      int int2 = 1;
      boolean boolean3 = true;
      java.lang.Throwable throwable4 = new java.lang.Exception();
      java.lang.String string6 = "<a> </a>";
      java.util.Properties properties7 = new java.util.Properties();
      java.lang.String string9 = "[0,1]";
      com.mysql.cj.log.Log log8 = new com.mysql.cj.log.NullLogger(string9);
      com.mysql.cj.exceptions.ExceptionInterceptor exceptionInterceptor5 = new com.mysql.cj.exceptions.ExceptionInterceptorChain(string6, properties7, log8);
      com.mysql.cj.jdbc.exceptions.SQLError.createSQLException(string0, string1, int2, boolean3, throwable4, exceptionInterceptor5);

  }



  @Test(timeout = 5000)
  public void test_createSQLException_13_13() throws Exception{

      java.lang.String string0 = " #";
      java.lang.String string1 = ".\\a.txt";
      int int2 = -1;
      boolean boolean3 = false;
      java.lang.Throwable throwable6 = new java.lang.Exception();
      java.lang.Throwable throwable4 = new java.lang.Error(throwable6);
      java.lang.String string7 = "\\n";
      java.util.Properties properties10 = new java.util.Properties();
      java.util.Properties properties8 = new java.util.Properties(properties10);
      com.mysql.cj.log.Log log9 = null;
      com.mysql.cj.exceptions.ExceptionInterceptor exceptionInterceptor5 = new com.mysql.cj.exceptions.ExceptionInterceptorChain(string7, properties8, log9);
      com.mysql.cj.jdbc.exceptions.SQLError.createSQLException(string0, string1, int2, boolean3, throwable4, exceptionInterceptor5);

  }



  @Test(timeout = 5000)
  public void test_createSQLException_14_14() throws Exception{

      java.lang.String string0 = "a ";
      java.lang.String string1 = "http://lcs.ios.ac.cn/";
      int int2 = 0;
      boolean boolean3 = true;
      java.lang.String string6 = "^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$";
      java.lang.Throwable throwable4 = new java.lang.Error(string6);
      java.lang.String string7 = " #";
      java.util.Properties properties8 = new java.util.Properties();
      java.lang.String string10 = "{\"key\":null}";
      com.mysql.cj.log.Log log9 = new com.mysql.cj.log.Slf4JLogger(string10);
      com.mysql.cj.exceptions.ExceptionInterceptor exceptionInterceptor5 = new com.mysql.cj.exceptions.ExceptionInterceptorChain(string7, properties8, log9);
      com.mysql.cj.jdbc.exceptions.SQLError.createSQLException(string0, string1, int2, boolean3, throwable4, exceptionInterceptor5);

  }



  @Test(timeout = 5000)
  public void test_createSQLException_15_15() throws Exception{

      java.lang.String string0 = "<a> </a>";
      java.lang.String string1 = " ";
      int int2 = -1;
      boolean boolean3 = false;
      java.lang.String string6 = "<a> </a>";
      java.lang.Throwable throwable4 = new java.lang.Throwable(string6);
      java.lang.String string7 = ".\\a.txt";
      java.util.Properties properties8 = new java.util.Properties();
      java.lang.String string10 = "";
      com.mysql.cj.log.Log log9 = new com.mysql.cj.log.StandardLogger(string10);
      com.mysql.cj.exceptions.ExceptionInterceptor exceptionInterceptor5 = new com.mysql.cj.exceptions.ExceptionInterceptorChain(string7, properties8, log9);
      com.mysql.cj.jdbc.exceptions.SQLError.createSQLException(string0, string1, int2, boolean3, throwable4, exceptionInterceptor5);

  }



  @Test(timeout = 5000)
  public void test_createSQLException_16_16() throws Exception{

      java.lang.String string0 = " ";
      java.lang.String string1 = "{\"key\":2 }";
      int int2 = 0;
      boolean boolean3 = true;
      java.lang.Throwable throwable6 = new java.lang.Error();
      java.lang.Throwable throwable4 = new java.lang.Error(throwable6);
      java.lang.String string7 = "\\n";
      java.util.Properties properties8 = new java.util.Properties();
      java.lang.String string10 = " ";
      com.mysql.cj.log.Log log9 = new com.mysql.cj.log.NullLogger(string10);
      com.mysql.cj.exceptions.ExceptionInterceptor exceptionInterceptor5 = new com.mysql.cj.exceptions.ExceptionInterceptorChain(string7, properties8, log9);
      com.mysql.cj.jdbc.exceptions.SQLError.createSQLException(string0, string1, int2, boolean3, throwable4, exceptionInterceptor5);

  }



  @Test(timeout = 5000)
  public void test_createSQLException_17_17() throws Exception{

      java.lang.String string0 = "\\n";
      java.lang.String string1 = "^[1]([3-9])[0-9]{9}$";
      int int2 = 2147483647;
      boolean boolean3 = true;
      java.lang.Throwable throwable4 = new java.lang.Exception();
      java.lang.String string6 = "http://lcs.ios.ac.cn/";
      java.util.Properties properties7 = new java.util.Properties();
      java.lang.String string9 = "\\n";
      com.mysql.cj.log.Log log8 = new com.mysql.cj.log.NullLogger(string9);
      com.mysql.cj.exceptions.ExceptionInterceptor exceptionInterceptor5 = new com.mysql.cj.exceptions.ExceptionInterceptorChain(string6, properties7, log8);
      com.mysql.cj.jdbc.exceptions.SQLError.createSQLException(string0, string1, int2, boolean3, throwable4, exceptionInterceptor5);

  }



  @Test(timeout = 5000)
  public void test_createSQLException_18_18() throws Exception{

      java.lang.String string0 = ".\\a.txt";
      java.lang.String string1 = "\\n";
      int int2 = -362577438;
      boolean boolean3 = false;
      java.lang.String string6 = "^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$";
      java.lang.Throwable throwable7 = new java.lang.Error();
      java.lang.Throwable throwable4 = new java.lang.Exception(string6, throwable7);
      java.lang.String string8 = " #";
      java.util.Properties properties11 = new java.util.Properties();
      java.util.Properties properties9 = new java.util.Properties(properties11);
      com.mysql.cj.log.Log log10 = null;
      com.mysql.cj.exceptions.ExceptionInterceptor exceptionInterceptor5 = new com.mysql.cj.exceptions.ExceptionInterceptorChain(string8, properties9, log10);
      com.mysql.cj.jdbc.exceptions.SQLError.createSQLException(string0, string1, int2, boolean3, throwable4, exceptionInterceptor5);

  }



  @Test(timeout = 5000)
  public void test_createSQLException_19_19() throws Exception{

      java.lang.String string0 = " (+E5q0&zv|Qe/A|/PLg w8(RWhN1#L~X/$MI%^E(f18B";
      java.lang.String string1 = "{\"key\":2 }";
      int int2 = 2147483647;
      boolean boolean3 = false;
      java.lang.String string6 = "[0,1]";
      java.lang.Throwable throwable4 = new java.lang.Exception(string6);
      java.lang.String string7 = " ";
      java.util.Properties properties10 = new java.util.Properties();
      java.util.Properties properties8 = new java.util.Properties(properties10);
      com.mysql.cj.log.Log log9 = null;
      com.mysql.cj.exceptions.ExceptionInterceptor exceptionInterceptor5 = new com.mysql.cj.exceptions.ExceptionInterceptorChain(string7, properties8, log9);
      com.mysql.cj.jdbc.exceptions.SQLError.createSQLException(string0, string1, int2, boolean3, throwable4, exceptionInterceptor5);

  }



  @Test(timeout = 5000)
  public void test_createSQLException_20_20() throws Exception{

      java.lang.String string0 = "http://lcs.ios.ac.cn/";
      java.lang.String string1 = " #";
      int int2 = -1482206516;
      boolean boolean3 = false;
      java.lang.String string6 = ",cg)/Ct2w[vC:uW`%(}o@+C=HP;\\\"\\'!4r'bjvZEBSdc=";
      java.lang.Throwable throwable4 = new java.lang.Throwable(string6);
      java.lang.String string7 = "{\"key\":2 }";
      java.util.Properties properties8 = new java.util.Properties();
      java.lang.String string10 = "[0,1]";
      com.mysql.cj.log.Log log9 = new com.mysql.cj.log.StandardLogger(string10);
      com.mysql.cj.exceptions.ExceptionInterceptor exceptionInterceptor5 = new com.mysql.cj.exceptions.ExceptionInterceptorChain(string7, properties8, log9);
      com.mysql.cj.jdbc.exceptions.SQLError.createSQLException(string0, string1, int2, boolean3, throwable4, exceptionInterceptor5);

  }



}