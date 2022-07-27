package tutoriaforjava;

public class Demo1 {
	public void abc (int a,int b) {
		System.out.println(a+b);
	}
		
	public static void main(String[] args) {
		{
			System.out.println("main method is starded");
		}
		Demo1 obj= new Demo1();
		obj.abc(100,200);
		{
		System.out.println("main maethod is ended");
		
		}
	}

}
