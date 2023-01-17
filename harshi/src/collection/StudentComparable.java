package collection;

import java.util.TreeSet;

public class StudentComparable {
//public StudentComparable(){
	
//}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 TreeSet<Student> s = new TreeSet<Student>();
	      s.add(new Student("peter",60));
	      s.add(new Student("Ed",70));
	      s.add(new Student("Erric",60));
	      s.add(new Student("Mac",80));
	      System.out.println(s);

	}

}
