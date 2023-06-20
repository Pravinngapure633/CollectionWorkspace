package Ex;

public class C {

	public static void main(String[] args) {
		
			String s1="ABC";
			String s2=new String("ABC");
			String s3=new String("ABC");
			String s4="PQR";
			String s5=new String("PQR");
			String s6="ABC";
			
			System.out.println(s1==s2);
			System.out.println(s1==s3);
			System.out.println(s2==s3);
			System.out.println(s1==s6);
			System.out.println(s5==s4);
			System.out.println(s5==s1);
			System.out.println(s2.equals(s1));
			System.out.println(s3.equals(s2));
			System.out.println(s5.equals(s4));
			System.out.println(s6.equals(s4));
	}
}
