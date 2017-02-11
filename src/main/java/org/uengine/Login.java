package org.uengine;

import org.metaworks.annotation.ServiceMethod;


public class Login {

	String name;
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
	String message;
		public String getMessage() {
			return message;
		}
		public void setMessage(String message) {
			this.message = message;
		}
	String password;
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		
		
	@ServiceMethod(callByContent=true)
	public Object login(){
		
		if(getName().equals(getPassword())){
			return new Main(this);
		}else{
			setMessage("Wrong Password for " + getName() + ".");

			return this;
		}

	}
		
	

}
