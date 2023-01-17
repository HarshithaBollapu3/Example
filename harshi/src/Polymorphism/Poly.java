package Polymorphism;

public class Poly {
	public void interest(float amount){
		System.out.println("Float Amount");
	}
     public void interest(float p,float rate,float time){
    	 System.out.println("Float p nd rate nd time");
	}
     public void interest(float p,float t_a){
    	 System.out.println("Float p nd t_a ");
}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Poly obj=new Poly();
         obj.interest(1.5f);
         obj.interest(1.11f,1.55f);
         obj.interest(1.11f,1.55f,2);
         
	}
}

