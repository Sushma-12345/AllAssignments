package AssignmentOnCollection;
import java.util.TreeMap;
public class Question_1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<Long,String> map=new TreeMap<Long,String>();
		map.put((long) 131, "yashu");
		map.put((long) 132, "sushu");
		map.put((long) 133, "ankku");
		System.out.println("all the keys: "+map.keySet());
		System.out.println("all the values: "+map.values());
		System.out.println("all key-value pairs: "+map.keySet()+map.values());
		System.out.println("descendingMap: "+map.descendingMap());
	}

}
