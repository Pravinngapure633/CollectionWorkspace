package Ex;

public class B {
	
	public static void main(String[] args) {
		
			String s1=new String("ABC");
			String s2=new String("ABC");
			String s3="ABC";
			
			System.out.println(s1);
			System.out.println(s2);
			System.out.println(s3);
			
			System.out.println(s1==s2);
			System.out.println(s2==s3);
			System.out.println(s1==s3);
	}

}
