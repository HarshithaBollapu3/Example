package ipndop;
import java.io.*;
public class Readndwrite {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        try{
        	InputStream a = System.in;
        	byte[] bt= new byte[100];
        	a.read(bt);
        	PrintStream op = System.out;
        	String str= "I am fine!";
        	op.write(str.getBytes());
         }
        catch(IOException e){
        	System.out.print(e);
        }
	}

}
