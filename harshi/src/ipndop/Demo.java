package ipndop;
import java.io.*;
public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			FileReader fr=new FileReader("C:\\Users\\BOLHARSH\\Pictures\\Screenshots\\file.txt");
		BufferedReader bt= new BufferedReader(fr);
		String str;
		
		while((str=bt.readLine())!=null){
		System.out.println(str);
		}
		}
		catch(FileNotFoundException e){
			System.out.println(e);
		}
		catch(IOException e){
			System.out.println(e);
		}

	}

}
