package com.learnDatastructure.Stack;

import java.util.Scanner;

import com.learnDatastructure.Array.Array;

public class StackApp {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the length of an Stack");	
		int n=scan.nextInt();
		Stack st=new Stack(n);
		while(true) {
			System.out.println("Press 1------->Push");
			System.out.println("Press 2------->Pop");
			System.out.println("Press 3------->Display");
			System.out.println("Any other number to exit");
			System.out.println("Enter your choice");
			int choice=scan.nextInt();
			switch(choice) {
			case 1: {
				st.push();
				break;
			}
			case 2:{
				st.pop();
				break;
			}
			case 3:{
				st.display();
				break;
			}
			default:{
				System.exit(0);
			}
			}
		}

	}

}
