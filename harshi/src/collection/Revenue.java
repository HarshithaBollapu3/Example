package collection;
import java.util.*;
public class Revenue {
	String revenueName;
	float amount;
	public Revenue(String revenueName,float amount){
		this.revenueName=revenueName;
		this.amount=amount;
	}
	public String toString(){
		return revenueName+" "+amount;
	}
	public static void main(String[] args){
		TreeSet<Revenue> r =new TreeSet(new SortbyName());
		TreeSet<Revenue> r1 =new TreeSet(new SortbyAmount());
		r.add(new Revenue("Abc",200));
		r.add(new Revenue("cd",500));
		r.add(new Revenue("ef",204));
		r.add(new Revenue("rent",100));
		r.add(new Revenue("xyz",280));
		System.out.println(r);
		System.out.println(r1);
	}

}
