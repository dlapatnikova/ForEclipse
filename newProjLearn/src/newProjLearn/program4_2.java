package newProjLearn;

import java.util.Scanner;

public class program4_2 {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
			System.out.println("Введите целое число:");
			int number = in.nextInt();
			int number1 = number;

			if (number >= 0) {
			    int sum = 0;
			    while (number > 0) {
			        sum += number % 10;
			        number = number / 10;
			    }
			    System.out.println("Сумма цифр числа " + number1 + " равна " + sum);
			} else {
			    System.out.println("Число должно быть неотрицательным.");
			}
		}
    }
}