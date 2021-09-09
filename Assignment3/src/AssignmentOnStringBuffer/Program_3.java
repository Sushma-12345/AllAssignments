package AssignmentOnStringBuffer;
public class Program_3 {
	public static void main(String[] args) {
        StringBuffer s = new StringBuffer("StringBuffer");
        System.out.println("string:  "+s);

        StringBuffer s2 = new StringBuffer("this method returns reversed string");
        System.out.println(s2.reverse());
}
}