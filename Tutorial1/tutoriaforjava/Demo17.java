package tutoriaforjava;

public class Demo17 {

	public static void main(String[] args) {
		String a="selenium";
		int abc=a.length()-1;
		System.out.println(abc);
		
		for(int i=abc;i>=0;i--) 
		{
			System.out.println(a.charAt(i));
		}
		
	}

}
