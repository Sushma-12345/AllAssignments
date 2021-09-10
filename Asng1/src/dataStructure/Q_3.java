package dataStructure;

import java.util.Scanner;

public class Q_3 {
	public static void main(String[] args) {
		double p,t,r;
		
		try (Scanner sc = new Scanner(System.in)) {
			p =sc.nextInt();
			t=sc.nextInt();
			r=sc.nextInt();
		}
		double si,ci;
		si=(p*t*r)/100;
		r=Math.pow(r+1, t);
		ci=(p*r)-p;
		System.out.println(si+","+ci);

	}
}
