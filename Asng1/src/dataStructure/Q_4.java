package dataStructure;

import java.util.Scanner;

public class Q_4 {
	public static void main(String[] args) {
		int a,b,c;
		Scanner ys = new Scanner(System.in);
		a=ys.nextInt();
		b=ys.nextInt();
		c=ys.nextInt();
	if(a>=60   &&  b>=60 && c>=60)
		{
			System.out.println("pass");
			
		}
	else if((a>=60 && b>=60)||(b>=60 && c>=60)||(c>=60 && a>=60))
	   {
		System.out.println("promoted");	
		}
	else if ((a>=60&&b<=60&&c<60)||(a<=60&&b>=60&&c<60)||(a<=60&&b<=60&&c>=60)) {
		System.out.println("fail");
		
	}
	else {
		System.out.println("fail all");
	}
}

}
