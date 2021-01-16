package com.nagarro.notification.updatenotification;

import java.util.ArrayList;
import java.util.Iterator;

import com.nagarro.notification.type.Observer;

public class UpdateNotification implements Subject {
//observer pattern 
	
	String email;
	String phoneNo;
	String event;
	String message;
	ArrayList<Observer> observerList;
	
	
	public UpdateNotification() {
		observerList = new ArrayList<Observer>();	
	}
	
    @Override
    public void registerObserver(Observer o) { 
        observerList.add(o); 
    } 
  
    @Override
    public void unregisterObserver(Observer o) { 
        observerList.remove(observerList.indexOf(o)); 
    } 
  
    @Override
    public void notifyObservers() 
    { 
        for (Iterator<Observer> it = observerList.iterator();it.hasNext();) 
        { 
            Observer o = it.next(); 
            o.update(email,phoneNo,message,event); 
        } 
    }

    public void dataChanged(String email,String phoneNo,String message,String event) 
    { 
        this.email=email;
        this.phoneNo=phoneNo;
        this.event=event;
        this.message=message;
  
        notifyObservers(); 
    }


    
   
}
