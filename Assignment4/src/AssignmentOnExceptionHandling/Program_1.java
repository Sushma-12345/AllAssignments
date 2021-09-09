package AssignmentOnExceptionHandling;
import java.util.Scanner;
public class Program_1 {
	public static void main(String[] args) {
		System.out.println("Enter the First Number : ");
		Scanner yes = new Scanner(System.in);
        int a= yes.nextInt();
        System.out.println("Enter the Second Number : ");
        int b= yes.nextInt();
        System.out.println("Perform addition and division");
        int sum = a+b;
        System.out.println("additon of two numbers : " +sum);	
				try {
					int div = a/b;
					System.out.println("division of two numbers : " +sum);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					System.out.println("Arithmetic Exception occured");
				}
			
			}

	}

