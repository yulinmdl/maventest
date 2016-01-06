/**
 * @copyright Copyright (c) IKongJian Inc. 2015 All Rights Reserved.
 * @Title: CheckListInfo.java
 * @Package com.mdl.maven.utils.list
 * @Description: TODO(用来检查报价单导入报错,统计抛出异常中是否有重复sku,并找出来这些sku以及数量)
 * @author ZHAOCHENGJU ZHAOCHENGJU@163.COM
 * @date 2015年12月18日 下午3:29:08
 * @version V1.0
 */

package com.mdl.maven.utils.list;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * @ClassName: CheckListInfo
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author ZHAOCHENGJU ZHAOCHENGJU@163.COM
 * @date 2015年12月18日 下午3:29:08
 * @since JDK 1.7
 * @see
 */
public class CheckListInfo {

  public static void main(String[] args) {
//    readFileByLinesManyLine("src/main/java/com/mdl/maven/utils/list/sourceFile.txt");
    readFileByLinesOneLine("src/main/java/com/mdl/maven/utils/list/sourceFile.txt");
  }

  //多行文本检查
  public static void readFileByLinesManyLine(String fileName) {
    Map<String, Integer> map = new HashMap<String, Integer>();

    File file = new File(fileName);
    BufferedReader reader = null;
    try {
      reader = new BufferedReader(new FileReader(file));
      String tempString = null;
      int line = 1;
      while ((tempString = reader.readLine()) != null) {
        if (tempString == null || tempString.trim().equals("")) {
          continue;
        }
        tempString = tempString.trim();

        if (map.get(tempString) != null) {
          map.put(tempString, map.get(tempString) + 1);
        } else {
          map.put(tempString, 1);
        }


        line++;
      }
      
      String result="";
      for (String key : map.keySet()) {
        if(map.get(key)>1){
          result+=key+":"+map.get(key)+",";
        }
        System.out.println("key= " + key + " and value= " + map.get(key));
      }
      System.out.println("mapSize:" + map.size());
      System.out.println("result:" + result);
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

  //单行文本用逗号隔开检查
  public static void readFileByLinesOneLine(String fileName) {
    Map<String, Integer> map = new HashMap<String, Integer>();
    
    File file = new File(fileName);
    BufferedReader reader = null;
    try {
      reader = new BufferedReader(new FileReader(file));
      String tempString = null;
      int line = 1;
      while ((tempString = reader.readLine()) != null) {
        if (tempString == null || tempString.trim().equals("")) {
          continue;
        }
        tempString=tempString.trim().replace("[", "").replace("]", "").replace(" ", "");
        String[] strs=tempString.split(",");
        for (String string : strs) {
          if (map.get(string) != null) {
            map.put(string, map.get(string) + 1);
          } else {
            map.put(string, 1);
          }
        }
        
        
        line++;
      }
      
      String result="";
      for (String key : map.keySet()) {
        if(map.get(key)>1){
          result+=key+":"+map.get(key)+",";
        }
        System.out.println("key= " + key + " and value= " + map.get(key));
      }
      System.out.println("mapSize:" + map.size());
      System.out.println("result:" + result);
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


}
