package revision;

import java.util.Scanner;

public class calc {

	public static void main(String[] args) {
		Scanner Scan= new Scanner(System.in);
		System.out.println("Enter a value for i:");
		int i=Scan.nextInt();
		System.out.println("Enter a value for j:");
		int j=Scan.nextInt();
		System.out.println("Enter a value for k:");
		int k=Scan.nextInt();
		
		int sum=(i*j)/k+(j*k)/i-(i*k)/j;
		System.out.println("the addition of i and j is:"+sum);

	}

}
