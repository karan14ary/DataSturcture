package com.learnDatastructure.Queue;

import java.util.Scanner;


public class QueueApp {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the length of an Queue");	
		int n=scan.nextInt();
		Queue qe=new Queue(n);
		while(true) {
			System.out.println("Press 1------->Insert");
			System.out.println("Press 2------->Delete");
			System.out.println("Press 3------->Display");
			System.out.println("Any other number to exit");
			System.out.println("Enter your choice");
			int choice=scan.nextInt();
			switch(choice) {
			case 1: {
				qe.insert();
				break;
			}
			case 2:{
				qe.delete();
				break;
			}
			case 3:{
				qe.display();
				break;
			}
			default:{
				System.exit(0);
			}
			}
		}


	}

}
