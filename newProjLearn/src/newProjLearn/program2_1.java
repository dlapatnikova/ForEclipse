package newProjLearn;

import java.util.Scanner;

public class program2_1 {
	public static void main (String args[]){
		
		try (Scanner in = new Scanner(System.in)) {
			System.out.println("Введите два вещественных числа: ");
			double a = in.nextFloat();
			double b = in.nextFloat();        
			double c = b*a*(a+b)/(a*a); 
			System.out.println(c);
			
			System.out.println("///////////");
			
			System.out.println("Введите два целых числа: ");
			int a1 = in.nextInt();
			int b1 = in.nextInt();        
			System.out.println("a^3 > b^2?");
			System.out.println(a1*a1*a1 > b1*b1);
		}     
		System.out.println("///////////");
        
        int a2 = 1;
        int b2 = a2++;
        b2 += a2++;
        System.out.println(b2);
	}

}
