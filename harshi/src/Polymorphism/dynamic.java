package Polymorphism;

public class dynamic {
	/*public class Ticket{
		public void setDetails(){
			System.out.println("Setting details");
		}
	}
	public class waitingTicket extends Ticket {
		public void setDetails(){
			System.out.println("waiting details");
		}

	}
	public class conformTicket extends Ticket {
		public void setDetails(){
			System.out.println("conform details");
		}

	}*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Ticket t;
        t = new waitingTicket();
        t.setDetails();
        t = new conformTicket();
        t.setDetails();
        
	}

}
