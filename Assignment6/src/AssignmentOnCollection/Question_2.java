package AssignmentOnCollection;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
public class Question_2 {
	public static void main(String[] args) {
		// creating ArrayList and adding objects
		ArrayList<String> obj=new ArrayList<>();
		obj.add("metal");
		obj.add("diamond");
		obj.add("iron");
		obj.add("copper");
		obj.add("platinum");
		obj.add("Silver");
		obj.add("ceramic");
		obj.add("gold");
		obj.add("kohinoor");
		obj.add("Doctor Strange");
		obj.add("Doctor Strange");
		//creating HashSet and adding objects
		HashSet<String> set=new HashSet<String>(obj);
		set.add("Hulk");
		
		Iterator<String> itr=set.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}

