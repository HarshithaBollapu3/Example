package mypackage;

public class Ticket {
	String source;
	String destination;
	double price;
	Ticket(String s,String d,double p){
		source = s;
		destination= d;
		price=p;
	}
	Ticket(){
		source = "hyd";
		destination="bng";
		price = 200;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ticket obj = new Ticket("pune","Ap",1000);
		
		System.out.println("source"+obj.source+"desintaion"+obj.destination+"price"+obj.price);
		Ticket obj1= new Ticket();

		System.out.println("source"+obj1.source+"desintaion"+obj1.destination+"price"+obj1.price);
 
	}

}
