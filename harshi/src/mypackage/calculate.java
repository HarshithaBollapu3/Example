package mypackage;

public class calculate {

	float area(){
		float f=0;
		final float pi=3.17f;
		float r=2.17f;
		 f= pi*r*r;
		return f;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		calculate obj=new calculate();
		//obj.area();
		System.out.println(obj.area());
		}
	

}
