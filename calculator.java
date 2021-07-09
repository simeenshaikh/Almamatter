package revision;

import java.util.Scanner;

public class calculator {

	public static void main(String[] args) {
		Scanner Scan=new Scanner(System.in);
		System.out.println("Enter a value for i:");
		int i=Scan.nextInt();
		
		System.out.println("Enter a value for j:");
		int j=Scan.nextInt();
		
		int sum=i+j;
		System.out.println("the addition of i and j is:"+sum);
		int subs=i-j;
		System.out.println("the substraction of i and j is:"+subs);
		int mult=i*j;
		System.out.println("the Multiplication of i and j is:"+mult);
		int div=i/j;
		System.out.println("the division of i and j is:"+div);
	}

}
