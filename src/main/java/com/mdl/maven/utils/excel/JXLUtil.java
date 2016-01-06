package com.mdl.maven.utils.excel;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;


public class JXLUtil {

    public static void main(String[] args) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {  
/*        ErpTransportVo vo=null;
        List list=new ArrayList();
        for (int i = 0; i < 10; i++) {
            vo=new ErpTransportVo();
            vo.setState("10");
            vo.setType("0");
            vo.setStore("101");
            vo.setNote("notes...........");
            vo.setCreateTime(new Date());
            list.add(vo);
            
        }

        //创建数据表格
        String[] keyAry={"orderNo","store","stockPlace","contractNo","sendNo","sendType","sendSchedule","total","freightDetail","name","departTime","receiptTime","createUser","createTime","note"};
        String[] valueAry={"运输单号","门店","库存地点","合同编号","发货单号","发货类型","发货日程","总金额","运费","承运商","发运时间","回单时间","创建人","创建时间","备注"};
        createWorkbookByAry(list, keyAry,valueAry, "d:\\workbook.xls");*/
    }  

    
    //====根据标题顺序写入==============================================================================================
    /**
     * 获得WritableWorkbook_标题主导
     * @param list      包含对象list
     * @param title     Map<属性名,属性注释>
     * @param filePath  保存文件路径
     * @return
     */
    public static void createWorkbookByAry(List list,String[] keyAry,String[] valueAry,String filePath)  {  
      WritableWorkbook wwb=null;
      try {
        wwb = Workbook.createWorkbook(new File(filePath));
        WritableSheet sheet=wwb.createSheet("sheet1", 0);
        writeTitleByAry(valueAry, sheet);
        writeDataByAry(list,sheet,1,keyAry);
      } catch (IOException e) {
        e.printStackTrace();
      } finally {
        // 关闭 Excel 工作薄对象
        try {
          if (wwb != null) {
            wwb.write();
            wwb.close();
          }
        } catch (WriteException e) {
          e.printStackTrace();
        } catch (IOException e) {
          e.printStackTrace();
        }
      }
      
    }     
    
    /**
     * 写标题_把valueAry中所有value依次写入第一行
     * @param title     Map<属性名,属性注释>
     * @param sheet     WritableSheet对象
     */
    public static void writeTitleByAry(String[] valueAry,WritableSheet sheet){
      try {
        for (int i = 0; i < valueAry.length; i++) {
          Label label=new Label(i,0,valueAry[i]);
          sheet.addCell(label);
        }
      } catch (RowsExceededException e) {
        e.printStackTrace();  
      } catch (WriteException e) {
        e.printStackTrace();  
      }
    }
    
    /**
     * 写数据_根据keyArys顺序写数据
     * @param list      包含对象list
     * @param sheet     WritableSheet对象
     * @param startRow  第一行位置
     */
    public static void writeDataByAry(List list,WritableSheet sheet,int startRow,String[] keyAry){
      Label label=null;             // = new Label(3, 3, "周星驰"); 
      jxl.write.Number number;      // = new jxl.write.Number(1, 1, 250);
      SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
      jxl.write.Boolean bool;           // = new jxl.write.Boolean(4, 1, true); 
      
      try {
        Class clazz = list.get(0).getClass();
        Field[] fields = clazz.getDeclaredFields();
        Map<String,Integer> nameIndexMap=new HashMap<String,Integer>();
        for (int i = 0; i < fields.length; i++) {
          nameIndexMap.put( fields[i].getName(),i);
        }
        
        String name=null;//属性名
        Method method=null;//方法
        String type=null;//属性类型
        int rowNum; //行
        for (int i = 0; i < list.size(); i++) {
          for (int j = 0; j < keyAry.length; j++) {
            
            type = fields[nameIndexMap.get(keyAry[j])].getGenericType().toString();
            name=keyAry[j];
            method = clazz.getMethod("get"+ firstCharToUpper(keyAry[j]), null);
            
            rowNum=i+startRow;  //行
            
            if (type.equals("class java.lang.String")) { //如果type是类类型，则前面包含"class "，后面跟类名
              String value = (String) method.invoke(list.get(i)); //调用getter方法获取属性值
              if (value != null) {
                label = new Label(j, rowNum, value); 
                sheet.addCell(label);
              }
            }
            if (type.equals("class java.lang.Integer")) {
              Integer value = (Integer) method.invoke(list.get(i));
              if (value != null) {
                number= new jxl.write.Number(j, rowNum, value);
                sheet.addCell(number);
              }
            }
            if (type.equals("class java.lang.Long")) {
              Long value = (Long) method.invoke(list.get(i));
              if (value != null) {
                number= new jxl.write.Number(j, rowNum, value);
                sheet.addCell(number);
              }
            }
            if (type.equals("class java.lang.Short")) {
              Short value = (Short) method.invoke(list.get(i));
              if (value != null) {
                number= new jxl.write.Number(j, rowNum, value);
                sheet.addCell(number);
              }
            }
            if (type.equals("class java.lang.Double")) {
              Double value = (Double) method.invoke(list.get(i));
              if (value != null) {
                number= new jxl.write.Number(j, rowNum, value);
                sheet.addCell(number);
              }
            }
            if (type.equals("class java.lang.Boolean")) {
              Boolean value = (Boolean) method.invoke(list.get(i));
              if (value != null) {
                bool = new jxl.write.Boolean(j, rowNum, value);
                sheet.addCell(bool);
              }
            }
            if (type.equals("class java.util.Date")) {
              Date value = (Date) method.invoke(list.get(i));
              if (value != null) {
                label=new Label(j,rowNum,sdf.format(value));
                sheet.addCell(label);
              }
            }
            if (type.equals("class java.math.BigDecimal")) {
              Method m = list.get(i).getClass().getMethod("get" + firstCharToUpper(name));
              BigDecimal value = (BigDecimal) m.invoke(list.get(i));
              if (value != null) {
                label=new Label(j,rowNum,value.toString());
                sheet.addCell(label);
              }
            }            
          }
          
          
        }
        
      } catch (NoSuchMethodException e) {
        e.printStackTrace();
      } catch (IllegalAccessException e) {
        e.printStackTrace();
      } catch (InvocationTargetException e) {
        e.printStackTrace();
      } catch (RowsExceededException e) {
        e.printStackTrace();
      } catch (WriteException e) {
        e.printStackTrace();
      }     
    }    
    
    //====对象全部属性写入方式=====================================================================================
    /**
     * 获得WritableWorkbook_数据对象主导
     * @param list      包含对象list
     * @param title     Map<属性名,属性注释>
     * @param filePath  保存文件路径
     * @return
     */
    public static void createWorkbook(List list,Map<String,String> title,String filePath)  {  
        WritableWorkbook wwb=null;
        try {
            wwb = Workbook.createWorkbook(new File(filePath));
            WritableSheet sheet=wwb.createSheet("sheet1", 0);
            writeTitle(list, title, sheet);
            writeData(list,sheet,1);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // 关闭 Excel 工作薄对象
            try {
                if (wwb != null) {
                    wwb.write();
                    wwb.close();
                }
            } catch (WriteException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        
    }  
    
    /**
     * 写标题_根据数据对象写入
     * @param list      包含对象list
     * @param title     Map<属性名,属性注释>
     * @param sheet     WritableSheet对象
     */
    public static void writeTitle(List list,Map<String,String> title,WritableSheet sheet){
        Class clazz = list.get(0).getClass();
        Field[] fields = clazz.getDeclaredFields();
        try {
            for (int i = 0; i < fields.length; i++) {
                String name = fields[i].getName();//属性名
                String type = fields[i].getGenericType().toString();
                
                String value=title.get(name);
                Label label=new Label(i,0,value);
                sheet.addCell(label);
            }
        } catch (RowsExceededException e) {
            e.printStackTrace();
        } catch (WriteException e) {
            e.printStackTrace();
        }
    }

   
    
    
    /**
     * 写数据_依次写入
     * @param list      包含对象list
     * @param sheet     WritableSheet对象
     * @param startRow  第一行位置
     */
    public static void writeData(List list,WritableSheet sheet,int startRow){
        Label label=null;               // = new Label(3, 3, "周星驰"); 
        jxl.write.Number number;        // = new jxl.write.Number(1, 1, 250);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        jxl.write.Boolean bool;         // = new jxl.write.Boolean(4, 1, true); 
        
        try {
            Class clazz = list.get(0).getClass();
            Field[] fields = clazz.getDeclaredFields();
            String name=null;//属性名
            Method method=null;//方法
            String type=null;//属性类型
            int rowNum; //行
            for (int i = 0; i < list.size(); i++) {
                for (int j = 0; j < fields.length; j++) {
                    name = fields[j].getName();//属性名
                    method = clazz.getMethod("get"+ firstCharToUpper(name), null);
                    type = fields[j].getGenericType().toString();
                    
                    rowNum=i+startRow;  //行
                    
                    if (type.equals("class java.lang.String")) { //如果type是类类型，则前面包含"class "，后面跟类名
                        String value = (String) method.invoke(list.get(i)); //调用getter方法获取属性值
                        if (value != null) {
                            label = new Label(j, rowNum, value); 
                            sheet.addCell(label);
                        }
                    }
                    if (type.equals("class java.lang.Integer")) {
                        Integer value = (Integer) method.invoke(list.get(i));
                        if (value != null) {
                            number= new jxl.write.Number(j, rowNum, value);
                            sheet.addCell(number);
                        }
                    }
                    if (type.equals("class java.lang.Long")) {
                        Long value = (Long) method.invoke(list.get(i));
                        if (value != null) {
                            number= new jxl.write.Number(j, rowNum, value);
                            sheet.addCell(number);
                        }
                    }
                    if (type.equals("class java.lang.Short")) {
                        Short value = (Short) method.invoke(list.get(i));
                        if (value != null) {
                            number= new jxl.write.Number(j, rowNum, value);
                            sheet.addCell(number);
                        }
                    }
                    if (type.equals("class java.lang.Double")) {
                        Double value = (Double) method.invoke(list.get(i));
                        if (value != null) {
                            number= new jxl.write.Number(j, rowNum, value);
                            sheet.addCell(number);
                        }
                    }
                    if (type.equals("class java.lang.Boolean")) {
                        Boolean value = (Boolean) method.invoke(list.get(i));
                        if (value != null) {
                            bool = new jxl.write.Boolean(j, rowNum, value);
                            sheet.addCell(bool);
                        }
                    }
                    if (type.equals("class java.util.Date")) {
                        Date value = (Date) method.invoke(list.get(i));
                        if (value != null) {
                            label=new Label(j,rowNum,sdf.format(value));
                            sheet.addCell(label);
                        }
                    }
                    if (type.equals("class java.math.BigDecimal")) {
                        Method m = list.get(i).getClass().getMethod("get" + firstCharToUpper(name));
                        BigDecimal value = (BigDecimal) m.invoke(list.get(i));
                        if (value != null) {
                            label=new Label(j,rowNum,value.toString());
                            sheet.addCell(label);
                        }
                    }                   
                    
                }
                
            }
            
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (RowsExceededException e) {
            e.printStackTrace();
        } catch (WriteException e) {
            e.printStackTrace();
        }       
    }
    
    
    /** 
     * @param src 
     *            源字符串 
     * @return 字符串，将src的第一个字母转换为大写，src为空时返回null 
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
    
    /**
     * 导出excel
     * @param resp
     * @param filePath
     */
    public static void exportToOutputStream(HttpServletResponse resp,String filePath) {  
        try {
                File file = new File(filePath);
                FileInputStream fis=new FileInputStream(file);
                BufferedInputStream buff=new BufferedInputStream(fis);
                byte [] b=new byte[1024];//相当于我们的缓存
                long k=0;//该值用于计算当前实际下载了多少字节
                //从response对象中得到输出流,准备下载
                OutputStream respOut=resp.getOutputStream();
                //开始循环下载
                while(k < file.length()){
                    int j=buff.read(b,0,1024);
                    k+=j;
                    //将b中的数据写到客户端的内存
                    respOut.write(b,0,j);
                }
                //将写入到客户端的内存的数据,刷新到磁盘
                respOut.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }       
    
}   
    


