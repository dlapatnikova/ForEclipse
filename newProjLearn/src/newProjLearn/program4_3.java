package newProjLearn;

import java.util.Scanner;

public class program4_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите длину прямоугольника:");
        int length = scanner.nextInt();
        scanner.nextLine(); 
        System.out.println("Введите ширину прямоугольника:");
        int width = scanner.nextInt();

       
        for (int i = 1; i <= length; i++) {
            if (i == 1 || i == length) { 
                for (int j = 1; j <= width; j++) {
                    System.out.print(" ");
                }
                System.out.println("-"); 
            } else { 
                if (i == 1) { 
                    for (int k = 0; k < width - 1; k++) {
                        System.out.print("-");
                    }
                    System.out.print("|");
                } else if (i == width) { 
                    for (int m = 0; m < length - 1; m++) {
                        System.out.print("-");
                    }
                    System.out.print("|\n"); 
                } else {
                    System.out.print("-|-");
                }
            }
        }

        scanner.close();
    }
}

