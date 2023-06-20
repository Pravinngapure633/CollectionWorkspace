package Ex;

public class D {

	public static void main(String[] args) {
		
		String s1=new String("ABC");
		s1.concat("PQR");
		s1.toLowerCase();
		String s2=s1.concat("XYZ");
		
		System.out.println(s1);
		System.out.println(s2);
		
		s1=s2.toLowerCase();
		System.out.println(s1);
		System.out.println(s2);
	}
}
