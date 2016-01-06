/**   
 * @copyright Copyright (c) IKongJian Inc. 2016 All Rights Reserved.
 * @Title: AuthUser.java 
 * @Package com.mdl.maven.model 
 * @Description: TODO(用一句话描述该文件做什么) 
 * @author madonglin 
 * @date 2016年1月5日 下午2:10:59 
 * @version V1.0   
 */ 
  
package com.mdl.maven.model;  

import java.io.Serializable;

/** 
 * @ClassName: AuthUser 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @author madonglin 
 * @date 2016年1月5日 下午2:10:59 
 * @since JDK 1.7 
 * @see       
 */
public class AuthUser implements Serializable{

  public AuthUser() {
    // TODO Auto-generated constructor stub  
  }
  
  private int id;
  private String realname;
  private String username;
  private String password;
  private String email;
  private String age;
  
  public int getId() {
    return id;
  }
  public void setId(int id) {
    this.id = id;
  }
  public String getRealname() {
    return realname;
  }
  public void setRealname(String realname) {
    this.realname = realname;
  }
  public String getUsername() {
    return username;
  }
  public void setUsername(String username) {
    this.username = username;
  }
  public String getPassword() {
    return password;
  }
  public void setPassword(String password) {
    this.password = password;
  }
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }
  public String getAge() {
    return age;
  }
  public void setAge(String age) {
    this.age = age;
  }

}
  