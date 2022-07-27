package tutoriaforjava;

public class Demo8 {

	public static void main(String[] args) {
		System.out.println("main method started");
		int a=100,b=200,c=20,d=230;
		
		if((a>b)&&(a>c)&&(a>d))
		{
			System.out.println("a is big no");
		}
		else if((b>c)&&(b>d))
		{
			System.out.println("b is big no");
		}
		else if ((c>d)) 
		{
			System.out.println("c is big no");
		}
		else 
		{
			System.out.println("d is big no");
		}
		System.out.println("main method is ended");
			
	}

}
