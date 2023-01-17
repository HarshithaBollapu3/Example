package Threadapp;

public class Multiapp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Printchar obj = new Printchar();
       Printnum obj1 = new Printnum();
       //obj.start();
       /*try{
    	   obj1.yield();
       }
       catch(Exception e){
    	   System.out.println(e);
       }*/
       obj.setPriority(Thread.MAX_PRIORITY);
       obj1.setPriority(Thread.MIN_PRIORITY);
       obj.start(); 
       obj1.start();
       
	}

}
