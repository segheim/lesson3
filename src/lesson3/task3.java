package lesson3;

import java.util.Scanner;

public class task3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Diamert: ");
		double d = sc.nextDouble();
		
		Scanner sc1= new Scanner(System.in);
		System.out.print("Enter Height: ");
		double h = sc.nextDouble();
		
		Scanner sc2 = new Scanner(System.in);
		System.out.print("Consumpshion: ");
		double c = sc2.nextDouble();
		
		double sk=3.14*d*d/4;
		double sb=3.14*d*h;
		double s=(sk+sb)/c;
		System.out.print("Number of banks: " + Math.floor(s));

	}

}
