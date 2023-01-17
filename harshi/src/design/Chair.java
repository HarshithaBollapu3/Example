package design;

public class Chair extends Furniture {

	@Override
	public void setStructure() {
		// TODO Auto-generated method stub
         System.out.println("abstraction class");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Furniture f=new Chair();
        f.setStructure();
	}

}
