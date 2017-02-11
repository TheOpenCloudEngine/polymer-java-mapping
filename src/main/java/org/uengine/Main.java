package org.uengine;

import org.metaworks.annotation.ServiceMethod;


public class Main {
	
	public Main(Login login){
		setUser(new User());
		getUser().setName(login.getName());

		setMessage("Hello, " + getUser().getName());
	}

	User user;
		public User getUser() {
			return user;
		}
		public void setUser(User user) {
			this.user = user;
		}

	String message;
		public String getMessage() {
			return message;
		}
		public void setMessage(String message) {
			this.message = message;
		}


	@ServiceMethod(needToConfirm=true)
	public Login logout(){
		return new Login();
	}

}
