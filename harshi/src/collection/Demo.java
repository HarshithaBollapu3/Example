package collection;
import java.util.*;
public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        List<String> list = new ArrayList<String>();
        list.add("tea");
        list.add("coffee");
        list.add("black coffee");
        list.add("Espresso");
        list.add("regular coffee");
        System.out.println(list.get(2));
        
        Set<String> set = new HashSet<String>();
        set.add("Toy Car");
        set.add("Teady Bear");
        set.add("Toy Bus");
        set.add("guitar");
        set.add("Candies");
        System.out.println(set.remove("guitar"));
        System.out.println(set);
        System.out.println(set.contains("Teady Bear"));
        
        Queue<String> q = new ArrayDeque<String>();
        	q.add("cup");
        	q.add("cup");
        	q.add("cup");
        	q.add("cup");
	}

}
