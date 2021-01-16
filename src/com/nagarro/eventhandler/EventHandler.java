package com.nagarro.eventhandler;

import com.nagarro.data.NagarroData;
import com.nagarro.notification.type.DisplayEmail;
import com.nagarro.notification.type.DisplayPortal;
import com.nagarro.notification.type.DisplaySms;
import com.nagarro.notification.updatenotification.UpdateNotification;

public class EventHandler {
	
	
	public void eventHandler(String event,String message) {
		
	
		UpdateNotification updateMessage = new UpdateNotification();
		DisplayPortal portal = new DisplayPortal();
		DisplaySms sms = new DisplaySms();
		DisplayEmail email = new DisplayEmail();
		NagarroData data = new NagarroData();
		String ndata[][] = data.nagarroData;
		
		try {
		switch (event.toLowerCase()) {
		case "event":
			for (int i =0;i<ndata.length;i++ ) {
			updateMessage.registerObserver(portal);
			updateMessage.registerObserver(email);
			updateMessage.dataChanged(ndata[i][0],ndata[i][1],message,"Event/celebration");
			updateMessage.unregisterObserver(portal);
			updateMessage.unregisterObserver(email);
			Thread.sleep(3000);
			}return;
			
		case "urgenthelp":
			for (int i =0;i<ndata.length;i++ ) {
			updateMessage.registerObserver(email);
			updateMessage.registerObserver(sms);
			updateMessage.dataChanged(ndata[i][0],ndata[i][1],message,"Urgent Help");
			updateMessage.unregisterObserver(sms);
			updateMessage.unregisterObserver(email);
			Thread.sleep(3000);
			}return;
		
		case "holiday":
			for (int i =0;i<ndata.length;i++ ) {
			updateMessage.registerObserver(portal);
			updateMessage.dataChanged(ndata[i][0],ndata[i][1],message,"Holiday");
			updateMessage.unregisterObserver(portal);
			Thread.sleep(3000);
			}return;
			
		case "nagarronews":
			for (int i =0;i<ndata.length;i++ ) {
			updateMessage.registerObserver(email);
			updateMessage.registerObserver(portal);
			updateMessage.dataChanged(ndata[i][0],ndata[i][1],message,"Nagarro News");
			updateMessage.unregisterObserver(email);
			updateMessage.unregisterObserver(portal);
			Thread.sleep(3000);
			}return;
		
		case "newpolicy":
			for (int i =0;i<ndata.length;i++ ) {
			updateMessage.registerObserver(email);
			updateMessage.registerObserver(portal);
			updateMessage.dataChanged(ndata[i][0],ndata[i][1],message,"Nagarro Policy");
			updateMessage.unregisterObserver(portal);
			updateMessage.unregisterObserver(email);
			Thread.sleep(3000);
			}return;
		default:
			return;
		}
		}catch(Exception e) {
			System.out.println(e);
		}
		
	}
		
	}
	



