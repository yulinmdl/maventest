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

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @ClassName: FormatHump
 * @Description: TODO(根据数据库字段,提供get/set方法或者获得驼峰字符以及首字母大写)
 * @author ZHAOCHENGJU ZHAOCHENGJU@163.COM
 * @date 2015年12月8日 下午2:11:12
 * @since JDK 1.7
 * @see
 */
public class FormatHump {

  public static void main(String[] args) {
    readFileByLines("src/main/java/com/mdl/maven/utils/formatStr/sourceFile.txt",true,true,"bjlikp.Set","();");
  }
  /**
   *  
   * @Title: readFileByLines
   * @Description: TODO(这里用一句话描述这个方法的作用)
   * @param fileName        资源文件路径及文件名
   * @param hump            是否格式化为驼峰字符
   * @param upercaseFirst   是否首字母大写
   * @param addStart        添加到每行的开始位置
   * @param addEnd          添加到每行的结束位置
   * @author: MADONGLIN
   * @date 2015年12月14日 上午11:57:46
   */
  public static void readFileByLines(String fileName,boolean hump,boolean upercaseFirst,String addStart,String addEnd) {  
      File file = new File(fileName);  
      BufferedReader reader = null;  
      try {  
          reader = new BufferedReader(new FileReader(file));  
          String tempString = null;  
          int line = 1;  
          while ((tempString = reader.readLine()) != null) {  
//              System.out.println("line " + line + ": " + format(tempString.toString()));  // 显示行号 
              if(tempString==null || tempString.trim().equals("")){
                continue;
              }
              if(upercaseFirst){
                tempString=upercaseFirst(tempString.toString());
              }
              if(hump){
                tempString=format(tempString.toString());
              }
              if(addStart!=null && !addStart.trim().equals("")){
                tempString=addStart+tempString;
              }
              if(addEnd!=null && !addEnd.trim().equals("")){
                tempString=tempString+addEnd;
              }
              System.out.println(tempString);  
              line++;  
          }  
          reader.close();  
      } catch (IOException e) {  
          e.printStackTrace();  
      } finally {  
          if (reader != null) {  
              try {  
                  reader.close();  
              } catch (IOException e1) {  
              }  
          }  
      }  
  }
  
  /**
   * 
   * @Title: 格式化为驼峰字符
   * @Description: TODO(格式化为驼峰字符)
   * @param str
   * @return TODO(这里用一句话描述这个方法的参数和返回数据)
   * @author: MADONGLIN
   * @date 2015年12月8日 下午2:53:41
   */
  public static String format(String str) {
    Pattern p = Pattern.compile("_[a-zA-Z]");
    Matcher m = p.matcher(str);
    StringBuffer sb = new StringBuffer();
    while (m.find()) {
      String firstChar = m.group().substring(1, 2);
      m.appendReplacement(sb, firstChar.toUpperCase());
    }
    m.appendTail(sb);
    return sb.toString();
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
  public static String upercaseFirst(String str) {
    return str.substring(0,1).toUpperCase()+str.substring(1);
  }
}
