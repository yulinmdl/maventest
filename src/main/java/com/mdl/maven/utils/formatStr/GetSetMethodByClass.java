/**
 * @copyright Copyright (c) IKongJian Inc. 2015 All Rights Reserved.
 * @Title: FormatHump.java
 * @Package com.utils.format
 * @Description: TODO(用一句话描述该文件做什么)
 * @author ZHAOCHENGJU ZHAOCHENGJU@163.COM
 * @date 2015年12月8日 下午2:11:12
 * @version V1.0
 */

package com.mdl.maven.utils.formatStr;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @ClassName: FormatHump
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author ZHAOCHENGJU ZHAOCHENGJU@163.COM
 * @date 2015年12月8日 下午2:11:12
 * @since JDK 1.7
 * @see
 */
public class GetSetMethodByClass {

  public static void main(String[] args) {
    ErpTransportDetail bjlikp=new ErpTransportDetail();
    getSetMethod(bjlikp,"detail.");
  }

  /**
   * 
   * @Title: 反射方式获得实体类的所有set方法
   * @Description: TODO(反射方式获得实体类的所有set方法)
   * @param list
   * @param sheet
   * @param startRow TODO(这里用一句话描述这个方法的参数和返回数据)
   * @author: MADONGLIN
   * @date 2015年12月14日 上午11:21:02
   */
  public static void getSetMethod(Object obj,String addStart) {
    try {
      Class clazz = obj.getClass();
      Field[] fields = clazz.getDeclaredFields();
      String name = null;// 属性名
      Method method = null;// 方法
      String type = null;// 属性类型
      for (int j = 0; j < fields.length; j++) {
        //属性名
        name = fields[j].getName();                                             //vbeln
        //方法全名
        method = clazz.getMethod("get" + firstCharToUpper(name), null);         //public java.lang.String com.mdl.maven.utils.formatStr.ErpBjlikp.getDlvSplitInitia()
        //数据类型全名
        type = fields[j].getGenericType().toString();                           //class java.lang.String
        
        //获得get方法
//        System.out.println("get" + firstCharToUpper(name)+"();");
        //获得set方法
        System.out.println(addStart + "set" + firstCharToUpper(name)+"();");

      }

    } catch (NoSuchMethodException e) {
      e.printStackTrace();
    }
  }

  /**
   * 
   * @Title: 首字母大写
   * @Description: TODO(首字母转为大写形式)
   * @param str
   * @return TODO(首字母大写的字符串)
   * @author: MADONGLIN
   * @date 2015年12月14日 上午10:39:47
   */
  public static String firstCharToUpper(String src) {
    if (src != null) {
      StringBuffer sb = new StringBuffer(src);
      sb.setCharAt(0, Character.toUpperCase(sb.charAt(0)));
      return sb.toString();
    } else {
      return null;
    }
  }

}
