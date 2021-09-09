package AssignmentOnStringBuilder;

public class Program_2 {
	public static void main(String[] args) {
        StringBuilder s = new StringBuilder("StringBuffer");
        System.out.println("string:  "+s);
	   StringBuilder s1 = new StringBuilder("it is used to at the specific position.");
       System.out.println(s1);
       System.out.println(s1.insert(13," insert text "));
}
}
