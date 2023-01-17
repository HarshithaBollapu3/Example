package mypackage;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [][] s={
				{"peter","simond","edger"},
				{"Harry","mathew","Stephen"},
				{"jason","erric","jasmin"}
		};
		for(String[] x: s){
			for(String y:x){
				if(y.equals("simond")||y.equals("edger")){
					System.out.println(y);
				}
			}
		}
		
	}

}
