package collection;
import java.util.*;
public class Item {
     String itemName;
     float price;
     public Item(String itemName, float price){
    	 this.itemName = itemName;
    	 this.price = price;
     }
     //public String toString(){
    	 //return "itemName "+itemName+" price"+price;
     //}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Set<Item> set = new HashSet<Item>();
     Item obj=new Item("candy",10);
     set.add(obj);
     set.add(new Item("Biryani",100));
     Iterator<Item> it = set.iterator();
     while(it.hasNext()){
    	 System.out.println(it.next());
    	 
     }
	}

}
