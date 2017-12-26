package lesson3;

public class lask1 {

	public static void main(String[] args) {
		
		int a = (int) (Math.random()*900+100);
		
		System.out.println("Slychainoe chislo: " + a);
		
		int b=(a/100)%10+(a/10)%10+a%10;
		int c=((a/100)%10)*((a/10)%10)*(a%10);
		
		System.out.println("Sum numbers: " + b);
		System.out.println("Proizvedenie naumbers: " + c);

	}

}
