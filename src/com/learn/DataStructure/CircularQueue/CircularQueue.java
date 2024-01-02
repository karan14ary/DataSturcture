package com.learn.DataStructure.CircularQueue;

import java.util.Scanner;

public class CircularQueue {
	private int cq[];
	private int size;
	private int r=-1;
	private int f=0;
	private int count=0;
	private Scanner scan=new Scanner (System.in);
	public CircularQueue(int n) {
		cq=new int[n];
		size=cq.length;
	}
	public void insert()
	{
		int elem;
		if(count==size) {
			System.out.println("Insertion not possible");
		}
		else {
			System.out.println("Enter the number to be inserted");
			elem=scan.nextInt();
		    r=(r+1)%size;
			cq[r]=elem;
			count++;
		}

	}
	public void delete() {
		if(count==0) {
			System.out.println("Deletetion not possible");
		}
		else {
			System.out.println("Element deleted is "+cq[f]);
		 f=(f+1)%size;
		 count--;
		}

	}
	public void display() {
		if(count==0) {
			System.out.println("Display not possible");
		}
		else {
			for(int i=1;i<=count;i++) {
				System.out.print(cq[f]+" ");
				f=(f+1)%size;
			}
			System.out.println();
		}
	}
}
