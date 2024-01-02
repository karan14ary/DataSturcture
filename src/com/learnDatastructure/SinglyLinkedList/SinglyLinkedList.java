package com.learnDatastructure.SinglyLinkedList;

import java.util.Scanner;

public class SinglyLinkedList {
	class Node{
		Node link;
		int data;
	}
	private Node first;
	private Scanner scan=new Scanner(System.in);

	public void insertfront() {
		System.out.println("Enter the element");
		int elem=scan.nextInt();
		Node newnode=new Node();

		newnode.data=elem;
		newnode.link=null;
		if(first==null) {
			first=newnode;
		}
		else {
			newnode.link=first;
			first=newnode;
		}


	}

	public void deletefront() {

		if(first==null) {
			System.out.println("Delete not poossible");
		}
		else if(first.link==null) {
			System.out.println("Element deleted is :"+first.data);
			first=null;
		}
		else {
			System.out.println("Element deleted is : "+first.data);
			first=first.link;
		}
	}

	public void insertrear() {
		Node temp;
		System.out.println("Enter the element");
		int elem=scan.nextInt();
		Node newnode=new Node();

		newnode.data=elem;
		newnode.link=null;
		if(first==null) {
			first=newnode;
		}
		else {
			temp=first;
			while(temp.link!=null) {
				temp=temp.link;
			}
			temp.link=newnode;

		}

	}

	public void deleterear() {
		Node temp;

		if(first==null) {
			System.out.println("Delete not poossible");
		}
		else if(first.link==null) {
			System.out.println("Element deleted is :"+first.data);
			first=null;
		}
		else {
			temp=first;
			while(temp.link.link!=null) {
				temp=temp.link;
			}
			System.out.println("Element deleted is : "+temp.link.data);
			temp.link=null;

		}
	}
	public void display() {
		Node temp;

		if(first==null) {
			System.out.println("Display not poossible");
		}
		else if(first.link==null) {
			System.out.println("Element is :"+first.data);
			first=null;
		}
		else {
			temp=first;
			while(temp!=null) {
				System.out.print(temp.data+" ");
				temp=temp.link;
			}
		}
		System.out.println();
	}

}
