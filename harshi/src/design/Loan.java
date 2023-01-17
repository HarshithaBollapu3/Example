package design;

public interface Loan {
  public void setloanDetails();
  default void show(){
	  System.out.println("Loan ia available at interest at 5%");
  }
}
