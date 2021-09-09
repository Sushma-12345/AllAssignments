package AssignmentOnLE;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
public class Question_6 {
	    public static void main(String[] args) {
	        List<String> list1 = new ArrayList<>();
	        list1.add("see");
	        list1.add("the");
	        list1.add("change");
	        list1.add("made");
	        list1.add("by");
	        list1.add("me");

	        System.out.println("Before using replaceALL:");
	        System.out.println(list1);

	        list1.replaceAll(str->str.toUpperCase());
	        System.out.println("After using replace all: ");
	        System.out.println(list1);
	    }
}
