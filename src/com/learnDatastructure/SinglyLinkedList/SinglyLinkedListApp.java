package com.learnDatastructure.SinglyLinkedList;

import java.util.Scanner;

import com.learnDatastructure.DoublyLinkedList.DoublyLinkedList;

public class SinglyLinkedListApp {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		SinglyLinkedList sll=new SinglyLinkedList();
		while(true) {
			System.out.println("Press 1----->InsertFront");
			System.out.println("Press 2----->DeleteFront");
			System.out.println("Press 3----->InsertRear");
			System.out.println("Press 4----->DeleteRear");
			System.out.println("Press 5----->Display");
			System.out.println("Any other key to exit");
			System.out.println("Enter your choice");
			int choice=scan.nextInt();
			switch(choice) {
			case 1: sll.insertfront();
			break;
			case 2: sll.deletefront();
			break;
			case 3: sll.insertrear();
			break;
			case 4: sll.deleterear();
			break;
			case 5: sll.display();
			break;
			default:System.exit(0);
			
			}
		}


	}

}
