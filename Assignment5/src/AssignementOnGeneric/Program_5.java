package AssignementOnGeneric;
import java.sql.Date;
public class Program_5 {
 public static void main(String[] args) {
			Pairs<String,Date> obj = new Pairs<>();
		 
			obj.setKey("888");
			System.out.println(obj.getKey());
			
			obj.setValue(new Date(0));
			System.out.println(obj.getValue());
		}
}
class Pairs<K,V>
{
			  K key;
			  V value;
			public K getKey() {
				return key;
			}
			public void setKey(K key) {
				this.key = key;
			}
			public V getValue() {
				return value;
			}
			public void setValue(V value) {
				this.value = value;
			}
			
		  }

