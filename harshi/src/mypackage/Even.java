package mypackage;

public class Even {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=0,i = 0;
		while(i<=10){
			if(i%2==0){
				n=n+i;
			}
			i++;
		}
         System.out.println(n);
	}

}
