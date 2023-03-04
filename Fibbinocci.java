package week1.day1;

public class Fibbinocci {

	public static void main(String[] args) {
		int n1=0, n2=1,s=0;
		System.out.println(n1);
		for (int i = 1; i <= 11; i++) {
			s=n1+n2;
			n1=n2;
			n2=s;
			System.out.println(s);
			}
		}
		
	}


