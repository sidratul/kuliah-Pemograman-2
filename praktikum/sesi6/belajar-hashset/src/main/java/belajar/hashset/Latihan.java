import java.util.*;

public class Latihan{
	public static void main(String[] agrs){
		Set set= new HashSet();
		set.add("second");
		set.add("one");
		set.add("3rd");
		set.add(new Integer(4));
		set.add(new Float(5.0f));
		set.add("second");
		set.add(new Integer(4));
		System.out.println(set);
	}
}