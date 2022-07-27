package tutoriaforjava;

public class Demo3 {
public void M1() {
	System.out.println("m1 method in demo3 class");
}
public void M2() {
	System.out.println("m2 method in demo3 class");
}
	public static void main(String[] args) {
		System.out.println("main method is started");
		Demo3 obj=new Demo3();
		obj.M1();
		obj.M2();
		System.out.println("main method is ended");
		
	}

}
