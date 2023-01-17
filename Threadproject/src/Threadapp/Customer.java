package Threadapp;

public class Customer extends Thread{
     public void run(){
    	try{
    		 String name = "cap";
        	 String city = "kadapa";
        	 System.out.println(name);
        	 System.out.println(city);
    	} catch(Exception e){
    		System.out.print(e);
    	}
     }
}
