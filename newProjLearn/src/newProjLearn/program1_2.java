package newProjLearn;

public class program1_2 {
	public static void main (String args[]){
		
		String name = "Даша";
	
		System.out.println(name);
	
		char ch = 'Д';
		char ch1 = 'а';
		char ch2 = 'ш';
		char ch3 = 'а';	
		
		System.out.println(ch + "" + ch1 + "" + ch2 + "" + ch3);
		
		char name1 = 'Д';		
		System.out.print(name1);
		name1 = 'а';		
		System.out.print(name1);
		name1 = 'ш';		
		System.out.print(name1);
		name1 = 'а';		
		System.out.print(name1);
		
		System.out.println("");
		
		String text = """	
		        Д
                а
                ш
                а
                """;
		
		System.out.println(text);
	}

}
