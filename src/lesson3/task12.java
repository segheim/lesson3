package lesson3;

public class task12 {

	public static void main(String[] args) {
		
		int k = 0;
		int mas[] = { 123, 342, 342, 55, 987, 343, 334, 444, 322, 235, 345, 348, 34, 100, 102};
		
			for (int i = 0; i < mas.length; i = (i + 2)) {
				if (mas[i]%2 == 0) {
					k++;
				}
			}
			
			System.out.print("Array: ");
		int[] mas1 = new int[k];	
			for (int i = 0, j = 0; i < mas.length; i = (i +2)) {
				if (mas[i]%2 == 0) {
					mas1[j] = mas[i];
					System.out.print(+ mas1[j] + " ");
				}
			}


	}

}
