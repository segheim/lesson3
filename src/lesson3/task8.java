package lesson3;

import java.util.Scanner;

public class task8 {

	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number: ");
		int a=sc.nextInt();
		
		Scanner sc1=new Scanner(System.in);
		System.out.print("Enter number which need delet: ");
		int del=sc1.nextInt();
		
		int b=0;
			int[] mas=new int[100];
			for (int i=0; i<100; i++) {
				while (a>0) {
					b=a%10;
					a/=10;
					mas[i]=b;
						System.out.print(mas[i]);
						
						//if (b==del) {
							for (int j=0;j<mas.length; j++) {
							mas[j]=mas[mas.length-1];
								System.out.print(mas[j]);
							
							//}
						}
				}
				}
				
				}
						
			}
		
		
