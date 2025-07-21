package Practice;

import java.util.Scanner;

public class Button {
	public static void main(String[] args) {
		int a=60;
		int b=95;
		int sum = a+b;
		System.out.println(a+b);
		
		int numb=1;
		numb = numb+1;
		System.out.println(numb);
		
		int numb2=6;
		numb2++;
		System.out.println(numb2++);
		
		int numb3=1;
		System.out.println(++numb3);
		
		int ref=3;
		System.out.println(++ref);
		
		int clr=9;
		System.out.println(clr++);
		
		int rat=5;
		rat++;
		System.out.println(rat);
		
		int cat=8;
		++cat;
		System.out.println(cat);
		
		int nus=7;
		nus++;
		System.out.println(nus);
		
		int gas=5;
		++gas;
		System.out.println(gas);
		
		
		System.out.println((int)(Math.random()*100));
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your Age:");
		int age=sc.nextInt();
		System.out.println(age);
		
		Scanner scv=new Scanner(System.in);
		System.out.println("Enter Your Name:");
		String name=scv.next();
		System.out.println(name);
		
		Scanner bt = new Scanner(System.in);
		System.out.println("Enter Your Feedback:");
		String feedback = bt.nextLine();
		System.out.println(feedback);
		
		
			
		
		
		
		
	}

}
