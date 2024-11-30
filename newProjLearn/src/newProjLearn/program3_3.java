package newProjLearn;

import java.util.Scanner;

public class program3_3 {
	public static void main (String args[]) {
		
		try (Scanner in = new Scanner(System.in)) {
			System.out.print("Введите вашу фамилию: ");
			String lastName = in.nextLine();
			System.out.print("Введите ваше имя: ");
			String name = in.nextLine();
			System.out.print("Введите ваше отчество: ");
			String fatherName = in.nextLine();
			System.out.println(lastName + " " + name + " " + fatherName);
			
			System.out.printf("FIO: %s %s %s", lastName, name, fatherName);
		}
	}
	

}
