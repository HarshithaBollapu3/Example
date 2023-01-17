package Threadapp;

public class Interest extends Thread{
    public void run(){
    	try{
    		int p=2;
        	int t=2;
        	int r=5;
        	float f = p*t*r;
        	System.out.print(f);
    	}
    	catch(Exception e){
    		System.out.print(e);
    	}
    	
    }
}
