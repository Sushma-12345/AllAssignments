package AssignmentOnLE;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
public class Question_5 {
	        public static void main(String[] args) {
	        List<String> list1 = new ArrayList<>();
	        list1.add("hey");
	        list1.add("drink");
	        list1.add("water");
	        list1.add("everyday");
	        list1.add("man");
	        Consumer<List<String>> displaylist = list->list.forEach(System.out::println);
	        System.out.println("list elements: ");
	        displaylist.accept(list1);
	        StringBuilder s1 = new StringBuilder();
	        Consumer<List<String>> modify = list2->list2.forEach(s ->s1.append(s.charAt(0)));
	        modify.accept(list1);
	        System.out.println(s1);


	    }
	}
