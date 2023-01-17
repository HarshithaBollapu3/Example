package ipndop;
import java.io.Serializable;
public class Customer implements Serializable{
	String customername;
		int address;
		Customer(String customername, int address){
			this.customername = customername;
			this.address=address;
		}
		public void showDetails(){
			System.out.println("customername"+customername);
			System.out.println("address"+address);
		}
	}



