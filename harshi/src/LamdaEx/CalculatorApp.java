package LamdaEx;

public class CalculatorApp {
	public void getAmount(InterestCaluculator obj)
	{
		System.out.println(obj.simpleInterest(5,7,8.5f));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
       CalculatorApp a = new CalculatorApp();
       a.getAmount((a,b,c)->(a*b*c)/100)
       
	};

}
