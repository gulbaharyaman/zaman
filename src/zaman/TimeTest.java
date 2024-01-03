package zaman;

import java.util.Scanner;

public class TimeTest {

	public static void main(String[] args) {
		Time t1 = new Time();
		System.out.println("atama yapılmadan önce");
		System.out.println("universal time is: "+t1.toUniversalString());
		System.out.println("standard time is: "+t1.toStandardString());
		System.out.println();
		
		t1.setTime(13,59,5);
		/*Scanner scan=new Scanner(System.in);
		int h,m,s;
		h=scan.nextInt();
		m=scan.nextInt();
		s=scan.nextInt();
		t1.setTime(h, m, s);*/
		
		System.out.println("atama yapıldıktan sonra");
		System.out.println("universal time is: "+t1.toUniversalString());
		System.out.println("standard time: "+t1.toStandardString());
		System.out.println();
		
		try {
			t1.setTime(15,56,64);
		} catch (IllegalArgumentException e) {
			System.out.printf("Exception:%s\n\n",e.getMessage());
		}
		 
		System.out.println("geçersiz denemeden sonra");
		System.out.println("universal time: "+t1.toUniversalString());
		System.out.println("standard time: "+t1.toStandardString());

	}

}
