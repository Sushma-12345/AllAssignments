package dataStructure;

import java.util.Scanner;

public class Q_5 {

	public static void main(String[] args) {
		int ctc;
		float tax;
		Scanner ys = new Scanner(System.in); 
		ctc=ys.nextInt();
		if(ctc>0 && ctc<=180000) {
			tax = 0;
			
		}
		else if(ctc>180000 && ctc <= 300000){
			tax = (ctc*10)/100;
		}
		else if(ctc>300000 && ctc <= 500000){
			tax = (ctc*20)/100;
					
		}
		else {
			tax = (ctc*30)/100;
		}
        System.out.println(tax);
	}

}
