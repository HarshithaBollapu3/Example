package Threadapp;

public class Printnum extends Thread {
	public void run(){
		try{
			//Thread.yield();
		for(int i=0; i<=30;i++){
			System.out.print(i+" ");
		}
			
		}catch(Exception e){
			System.out.println(e);
		}
	}

}
