package com.nagarro.notification.updatenotification;

import com.nagarro.notification.type.Observer;

public interface Subject {
	
    public void registerObserver(Observer o); 
    public void unregisterObserver(Observer o); 
    public void notifyObservers(); 
}
