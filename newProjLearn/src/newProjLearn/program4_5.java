package newProjLearn;

import java.util.Scanner;

public class program4_5 {
	public static void main(String[] args) {
		
		try (Scanner in = new Scanner(System.in)) {
			System.out.print("Введите номер варианта 1 или 2: ");
			String word = in.nextLine();
			
			switch(word){
			
			case "1": 
				while (true) {
			        System.out.println("Введите число:");
			        int number = in.nextInt();
			        if (number == 1) {
			            break;
			        }
			        System.out.println("Не угадал!");
			        in.nextLine(); 
			    }
			    break;
			case "2": 
				do {
					System.out.println("Не угадал!");
					System.out.println("Введите число:");
			        int number = in.nextInt();
			        in.nextLine(); 
			        if (number == 1) {
			            break;
			        }	            
			    } while (true);			
			    break;
			default:
			    System.out.println("Unknow message");
}
		}

}
}
