package com.sac;

public class Hello {
	
	private String hello;
	
	public String getHello() {
		return hello;
	}

	public void setHello(String hello) {
		this.hello = hello;
	}


	@Override
	public boolean equals(Object obj) {
		
		if(obj != null){
			return true;
		}else{
			return false;
		}
	}
	
	@Override
	public int hashCode() {
		return super.hashCode();
	}

}
