package AssignmentOnLE;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
public class Question_1 {
	public static void main(String[] args) {
		addinf add = (a,b)-> a+b;
		addinf div = (a,b) -> a/b;
		addinf sub = (a,b) -> a-b;
		addinf mul = (a,b) -> a*b;
		int y = add.call(6,7);
		int a = div.call(2,8);
		int s = sub.call(5,7);
		int h = mul.call(2,5);
		System.out.println(y);
        System.out.println(a);
		System.out.println(s);
		System.out.println(h);
	}
	interface addinf{
		int call(int a, int b);
	}
}
