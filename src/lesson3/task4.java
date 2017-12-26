package lesson3;

import java.util.Scanner;

public class task4 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number 4-e: ");
		int n=sc.nextInt();
		
		int s=(n/1000)%10+(n/100)%10+(n/10)%10+n%10;
		
		System.out.println(" a*b+c*d = " + s);
		

	}

}
