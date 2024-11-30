package newProjLearn;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
			System.out.println("Введите целое число: ");
			int number = in.nextInt();

			if (number >= 0) {
			    int factorial = 1;
			    for (int i = 1; i <= number; i++) {
			        factorial *= i;
			    }
			    System.out.println("Факториал числа " + number + " равен " + factorial);
			} 
			else {
			    System.out.println("Число должно быть неотрицательным.");
			}
		}
    }
}
