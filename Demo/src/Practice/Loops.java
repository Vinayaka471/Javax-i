package Practice;
import java.util.Scanner;

public class Loops {

	public static void main(String[] args) {
		//Loops
		//for(int i=0;i<=100;i++) {
		//	System.out.println(i);
		//}
		//for(int i=100;i>=1;i--) {
			//System.out.println(i);
		//}
		
	//int k=100;
	//while(k>=1) {
		//System.out.println(k);
		//k=k-1;
	//}
		//int l=0;
		//while(l<=100) {
			//System.out.println(l);
			//l=l+1;
		//}
		
		//int t=100;
		//do {
		//	System.out.println(t);
		//	t=t-1;
		//}
		//while(t>=1);
		
		//int s=0;
		//do {
			//System.out.println(s);
			//s=s+1;
		//}
		//while(s<=100);
		
		Scanner sc=new Scanner(System.in);
		int number=0;
		do {
			System.out.print("Enter Your Number:");
			number=sc.nextInt();
			System.out.println("Here's Your Number:");
			System.out.println(number);
			
		}
		while(number>=0);
		System.out.println("End The Number");
		
		
		

	}

}
