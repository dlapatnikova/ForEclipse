package newProjLearn;

import java.util.Scanner;

public class program3_2 {
	public static void main (String args[]){
		
		try (Scanner in = new Scanner(System.in)) {
			System.out.print("Введите слово: ");
			String word = in.nextLine();
			
			switch(word){
			
			case "Hi": 
			    System.out.println("Hello");
			    break;
			case "Bye": 
			    System.out.println("Good bye");	  
			    break;
			case "How are you": 
			    System.out.println("How are your doing");
			    break;
			default:
			    System.out.println("Unknow message");
}
			
			System.out.println("///////////////");
			System.out.println("Введите слово: ");
			String word1 = in.nextLine();
			
			if ("Hi".equals(word1)) {
				System.out.println("Hello");
			}
			else if ("Bye".equals(word1)) {
				System.out.println("Good bye");	
			}
			else if ("How are you".equals(word1)) {
				System.out.println("How are your doing");
			}
			else {
				System.out.println("Unknow message");
			}
		}
	}

}
