package mypackage;

public class Switchcase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char grade='A';
         switch(grade){
         case 'A' :
        	 System.out.println(35000);
        	 break;
         case 'B' :
          System.out.println(30000);
    	     break;
         case 'C' :
        	 System.out.println(25000);
    	     break;
         case 'D' :
        	 System.out.println(20000);
    	     break;
         case 'E' :
        	 System.out.println(15000);
    	     break;
    	  default:
    		  System.out.println("grade is not in the range");
         }
	}

}
