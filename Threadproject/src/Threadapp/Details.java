package Threadapp;

public class Details implements Runnable {
	public void run(){
		synchronized(this){
			System.out.println("Erric");
			System.out.println("23");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Details d = new Details();
		Thread t1= new Thread(d);
		Thread t2= new Thread(d);
		Thread t3= new Thread(d);
		t1.start();
		t2.start();
		t3.start();
	}

}
