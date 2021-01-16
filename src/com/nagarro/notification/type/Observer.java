package com.nagarro.notification.type;

public interface Observer {

	void update(String email, String phoneNo, String message, String event);

}
