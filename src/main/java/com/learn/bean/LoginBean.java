package com.learn.bean;

public class LoginBean { 
	
	private String name;
	private String passWord;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassWord() {
		return passWord;
	}
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	
	public boolean validate()
	{
		
		return passWord==null?false:this.passWord.equals("pass");
	}
}
