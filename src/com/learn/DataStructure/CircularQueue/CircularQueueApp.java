package com.learn.DataStructure.CircularQueue;

import java.util.Scanner;



public class CircularQueueApp {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the length of a CircularQueue");	
		int n=scan.nextInt();
		CircularQueue cq=new CircularQueue(n);
		while(true) {
			System.out.println("Press 1------->Insert");
			System.out.println("Press 2------->Delete");
			System.out.println("Press 3------->Display");
			System.out.println("Any other number to exit");
			System.out.println("Enter your choice");
			int choice=scan.nextInt();
			switch(choice) {
			case 1: {
				cq.insert();
				break;
			}
			case 2:{
				cq.delete();
				break;
			}
			case 3:{
				cq.display();
				break;
			}
			default:{
				System.exit(0);
			}
			}
		}

	}

}
