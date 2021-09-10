package dataStructure;

public class Q_2 {
	 public static void main(String[] args) 
	    {
		 System.out.println("Armstrong number between 100 and 999 are: \n");
		 int i;
		 int rem;
		 double sum=0;
		 double temp = 0;
				for(i=100;i<999;i++) {
					temp=i;
					while(i!=0) {
					rem=i%10;
					sum=sum+(Math.pow(rem,3));
					i/=10;
				    }
			}
			if(temp==sum) {
			System.out.println(temp+" is a armstrong");
		    }
			else
			{
				System.out.println(temp+" is a not armstrong");
			}
	      }
	}

