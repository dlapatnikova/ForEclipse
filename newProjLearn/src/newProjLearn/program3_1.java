package newProjLearn;

import java.util.Scanner;

public class program3_1 {
	public static void main (String args[]){
		
		try (Scanner in = new Scanner(System.in)) {
			System.out.println("Введите два целых числа: ");
			int a = in.nextInt();
			int b = in.nextInt();        
			
			if (a%2 == 0) {
				int c = a*b;
				System.out.println("Произведение чисел: " + c);
			}
			else {
				double c1 = a/b;
				System.out.println("Частное чисел: " + c1);
			}
			
			if (a == b) {
				System.out.println("Числа равны");
			}
		}
		
	}

}
