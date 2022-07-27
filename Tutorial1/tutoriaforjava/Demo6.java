package tutoriaforjava;

public class Demo6 {

	public static void main(String[] args) 
	{
		System.out.println("main method is started");
		int a=10;
		int b=120;
		int c=90;
		if((a>b)&&(a>c))
		{
			System.out.println("a is big number");
			
		}
		else if((b>a)&&(b>c))
		{
			System.out.println("b is big number");
		}
		else
		{
			System.out.println("c is big number");
		}
		System.out.println("main method is ended");

	}

}
