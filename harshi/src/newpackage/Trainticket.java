package newpackage;

public class Trainticket {
	String source;
    String destination;
    int price;
}
	//public static void main(String[] args) {
		// TODO Auto-generated method stub
      //String source;
      //String destination;
      //int price;
	//}
    class waitingticket extends Trainticket{
    	Trainticket obj = new Trainticket;
    	boolean status = true ;
    	if(status== true){
    	System.out.println("Approved");
    	}
    	else{
    		System.out.println("Not approved");
    	}
    }
    class conformticket extends Trainticket{
        int seatno	= 35;
    }

