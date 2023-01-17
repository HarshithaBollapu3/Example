package ipndop;
import java.io.*;

public class Filedemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
        FileInputStream file = new FileInputStream("C:\\Users\\BOLHARSH\\Pictures\\Screenshots\\file.txt");
        byte[] bt= new byte[file.available()];
        file.read(bt);
        for(byte b: bt){
        	System.out.print((char)b);
        }
		}
		catch(IOException e){
			System.out.print(e);
		}
	}

}
