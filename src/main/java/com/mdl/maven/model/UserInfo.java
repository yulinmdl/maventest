package com.mdl.maven.model;

import java.io.Serializable;

public class UserInfo implements Serializable {


	
	private int uid;
	private String uname;
	private int unumber;
	
	
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public int getUnumber() {
		return unumber;
	}
	public void setUnumber(int unumber) {
		this.unumber = unumber;
	}


	

}
