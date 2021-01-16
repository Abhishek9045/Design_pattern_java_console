package com.nagarro.notification;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import com.nagarro.eventhandler.EventHandler;

public class Starter {

	
	public void start() {
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		System.out.println("++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("| Welcome to Nagarro Notification System |");
		System.out.println("++++++++++++++++++++++++++++++++++++++++++");
		
		System.out.println("| here you can send notification to      |");
		System.out.println("| nagarro employes i.e.urgent,holiday,etc|");
		System.out.println("++++++++++++++++++++++++++++++++++++++++++");
		
		System.out.println("\n");
		
		System.out.println("+++++++++++++++++++++++++++");
		System.out.println("| Event/Notification Type |");
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("| Holiday | Event  | UrgentHelp  | Nagarro News | New Policy |");
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("|         |        |             |              |            |");
		System.out.println("| Portal  | Portal | Email       | Email        | Email      |");
		System.out.println("|         |        |             |              |            |");
		System.out.println("| ------  | Email  | SMS         | Portal       | Portal     |");
		System.out.println("|         |        |             |              |            |");
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
	
		
		System.out.println("\n");
		
		boolean loop;
		
		//Event type
		List<String> eventType = Arrays.asList("holiday","event","urgenthelp","nagarronews","newpolicy");
		
		//Event Input
		String event="";
		loop =true;
		System.out.println("Enter your event type: ");
		
		//Event Validation
		while(loop) {
			event = scan.nextLine().toLowerCase();
			if(eventType.contains(event)) {
				loop=false;
			}else {
				System.out.println("Enter the valid Event Type!");
				loop=true;
			}
		}
		
		
		loop =true;
		// Message Input
		System.out.println("\n");
		String message="";
		System.out.println("Enter the message: ");
		
		//Message Validation
		
		while(loop) {
			message = scan.nextLine();
			if (message.isEmpty()) {
				System.out.println("Message can't be empty!");
				loop=true;
			}else {
				loop = false;
			}
		}

		
		System.out.println("\n \n");
		
		//Creating Object of Event Handler Class
		
		EventHandler notify = new EventHandler();
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("\n");
		
		// calling Event Handler method
		try {
		notify.eventHandler(event, message);
		}catch(Exception e) {
			System.out.println(e);
		}
		System.out.println("\n");
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		
		
		
	}
	
}
