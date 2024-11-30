package newProjLearn;

import java.util.Scanner;

public class program4_4 {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
			System.out.print("Введите второе число ");
			int number = in.nextInt();

			for (int i = 1; i <= 10; i++) {
			    if (i % 2 == 0) {
			        int result = i + number;
			        System.out.printf("%d + %d = %d\n", i, number, result);
			    } else {
			        int result = i - number;
			        System.out.printf("%d - %d = %d\n", i, number, result);
			    }

			    if (i == number) {
			        System.out.println("Числа равны!");
			    }
			}
		}
    }
}
