package tutoriaforjava;

public class Demo15 {

	public static void main(String[] args) {
//		String a="selenium";
//		String b="Selenium";
//		String c="SELENIUM";
//		String d="selenium";
//		System.out.println(a==b);
//		
//		System.out.println(a==c);
//		
//		System.out.println(a==d);
//		
//	}
//
//}
		
		String a="selenium";
		String b="Selenium";
		String c="SELENIUM";
		String d="selenium";
		
		System.out.println(a.equals(b));
		System.out.println(a.equals(c));
		System.out.println(a.equals("selenium"));
		System.out.println("----------------------");
		
		System.out.println(a.equalsIgnoreCase(b));
		System.out.println(a.equalsIgnoreCase(c));
		System.out.println(a.equalsIgnoreCase(d));
		
	}

}
