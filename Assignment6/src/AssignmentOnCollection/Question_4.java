package AssignmentOnCollection;
import java.util.Comparator;
public class Question_4 {
	public class FirstComparator implements Comparator<employee>{

		@Override
		public int compare(employee o1, employee o2) {
			// TODO Auto-generated method stub
			return (o1.id).compareTo(o2.id);
		}
		
	}
	
}
