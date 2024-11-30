package newProjLearn;

import java.util.Scanner;

public class program3_4 {
	public static void main (String args[]) {
		
		try (Scanner in = new Scanner(System.in)) {
			System.out.println("Введите два целых числа: ");
			int a = in.nextInt();
			int b = in.nextInt();   		
			
			if ((a%2 == 0) && (a%3 == 0)) {
				double c = Math.pow(a, b);
				if ((c < Integer.MIN_VALUE) || (c > Integer.MAX_VALUE)) {
					System.out.println("Результат выражения слишком большой!");
				}
				else {
					System.out.println(c);
				}
			}
			else if ((a%2 == 0) || (b%3 == 0)) {
				System.out.println(a == b);
			}
		}
	}

}
