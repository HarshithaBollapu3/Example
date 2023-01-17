package mypackage;

public class Finding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int s=0;int l = 0;
		int[] arr={12,16,4,6,89,98};
		s=l=arr[0];
		{
			for(int i:arr){
				if(i<s){
					s=i;
				}
				else if(i>l){
					l=i;
				}
			}
		}
			System.out.println("smallest"+s+"\tlargest"+l);

	}

}
