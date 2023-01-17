package collection;
import java.util.*;
public class SortbyName implements Comparator<Revenue>{
     public int compare(Revenue r1, Revenue r2){
    	 return r1.revenueName.compareTo(r2.revenueName);
     }
}
