package Annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;
	@Target(ElementType.METHOD) 
	@interface Test{
		
	}
	public class Question_1 {
		public static void main(String[] args) {
			printSeries(10);

		}
	@Test
	static void printSeries(int n){
	    for (int i=0;i<n;i++) {
	    	System.out.println(i);
	    }
	}
	}