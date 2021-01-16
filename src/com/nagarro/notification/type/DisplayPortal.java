package com.nagarro.notification.type;


public class DisplayPortal implements Observer{

	private String email;
	private String message;
	private String event;
	

	
	@Override
	public void update(String email, String phoneNo,String message,String event) {
		this.email = email;
		this.event=event;
		this.message=message;
		
	
		display();
		
	}

	private void display() {
		System.out.println("Type:  "+event+"\nMessage:"+message +"\n \nMessage successfully send to "+email+" portal");
		System.out.println("-----------------------------------------------------------------------------");
	}

}
