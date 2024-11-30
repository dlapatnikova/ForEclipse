package newProjLearn;

import java.util.Scanner;

public class program4_3 {
    public static void main(String[] args) {
        
    	try (Scanner in = new Scanner(System.in)) {
			System.out.println("Введите длину прямоугольника:");
			int length = in.nextInt();        
			System.out.println("Введите ширину прямоугольника:");
			int width = in.nextInt();
			
			String Line = " ";


			for (int i = 0; i < length; i++) {
			    Line += "-";
			}

			Line += " \n";

			String Line2 = "|";

			for (int i = 0; i < length; i++) {
			    Line2 += " ";
			}

			Line2 += "|\n";


			String finishLine = "";

			for (int i = 0; i < width; i++) {
				finishLine += Line2;
			}

			System.out.println(Line + finishLine + Line);
		}
    }
}