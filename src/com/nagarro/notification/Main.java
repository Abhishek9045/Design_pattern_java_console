package com.nagarro.notification;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		//initialize scanner object
		Scanner scan = new Scanner(System.in);
		//initialize Starter object
		Starter obj = new Starter();
		boolean loop = true;
		try {	
			
			do {
				//call starter class method
			obj.start();
			System.out.println("wana send some more notification [true/false]:");
			loop = scan.nextBoolean();
			}while(loop);
	
		}catch(Exception e){
			System.out.println(e);
		}finally {
			scan.close();
		}
		
	
	}
}
