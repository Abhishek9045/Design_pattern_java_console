package com.nagarro.notification.type;



public class DisplaySms implements Observer{

	private String phoneNo;
	private String message;
	private String event;
	
	@Override
	public void update(String email, String phoneNo,String message,String event) {
		
		this.phoneNo = phoneNo;
		this.event=event;
		this.message=message;
		display();
	}

	private void display() {
		System.out.println("Type:  "+event+"\nMessage:"+message +"\n \nmessage successfully send to "+phoneNo);
		System.out.println("-----------------------------------------------------------------------------");
		
	}




}
