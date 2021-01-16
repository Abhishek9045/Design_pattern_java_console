package com.nagarro.notification.type;



public class DisplayEmail implements Observer {

	private String email;
	private String message;
	private String event;
	
	@Override
	public void update(String email, String phoneNo,String message,String event) {
		this.email = email;
		this.message=message;
		this.event=event;
		display();
		
	}

	private void display() {
		System.out.println("Type:  "+event+"\nMessage:"+message +"\n \nEmail successfully send to "+email);
		System.out.println("-----------------------------------------------------------------------------");
		
	}
	

}
