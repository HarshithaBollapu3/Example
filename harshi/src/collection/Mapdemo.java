package collection;
import java.util.*;
public class Mapdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Map<String, String> map=new HashMap<String,String>();
        map.put("E001", "peter");
        map.put("E002", "Sid");
        map.put("E003", "Ed");
        map.put("E004", "Mat");
        map.put("E005", "Erric");
        System.out.println(map.get("E003"));
        Set set = map.keySet();
        for(Object i:set){
        	System.out.println(i+" "+map.get(i));
        }
        Set set1=map.entrySet();
        for(Object i:set1){
        	System.out.println(i);
        }
        
	}

}
