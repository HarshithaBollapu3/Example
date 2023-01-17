package Threadapp;

public class Multithread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Interest obj = new Interest();
		Customer obj1 = new Customer();
		obj.start();
		obj1.start();

	}

}
