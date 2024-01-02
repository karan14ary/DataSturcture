package com.learnDatastructure.DoublyLinkedList;

import java.util.Scanner;

public class DoublyLinkedListApp {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		DoublyLinkedList dll=new DoublyLinkedList();
		while(true) {
			System.out.println("Press 1----->InsertFront");
			System.out.println("Press 2----->DeleteFront");
			System.out.println("Press 3----->InsertRear");
			System.out.println("Press 4----->DeleteRear");
			System.out.println("Press 5----->DisplayForward");
			System.out.println("Press 6----->DisplayReverse");
			System.out.println("Any other key to exit");
			System.out.println("Enter your choice");
			int choice=scan.nextInt();
			switch(choice) {
			case 1: dll.insertfront();
			break;
			case 2: dll.deletefront();
			break;
			case 3: dll.insertrear();
			break;
			case 4: dll.deleterear();
			break;
			case 5: dll.displayforward();
			break;
			case 6: dll.displayreverse();
			break;
			default:System.exit(0);
			
			}
		}

	}

}
