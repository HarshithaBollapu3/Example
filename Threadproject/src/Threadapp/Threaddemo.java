package Threadapp;

public class Threaddemo extends Thread {
	 public void run(){
		 try{
			 String cname="HA";
			  int d = 25;
			// System.out.println(Thread.currentThread().getName());
			  Thread.join(obj);
			 System.out.println(cname);
			 //System.out.println(Thread.currentThread().getName());
			 System.out.println(d);
		 }catch(Exception e){
			 System.out.println(e);
		 }
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Threaddemo obj=new Threaddemo();
        Threaddemo obj1=new Threaddemo();
        obj.start();
        obj1.start();
	}

}
