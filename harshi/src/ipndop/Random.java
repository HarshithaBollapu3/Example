package ipndop;
import java.io.*;
public class Random {

	public static void main(String[] args) {
				//TODO Auto-generated method stub
		try{
			String[] str={"Apple","mango","orange"};
			RandomAccessFile ra =new RandomAccessFile("C:\\Users\\BOLHARSH\\Pictures\\Screenshots\\file.txt","rw");
			for(String arr:str){
				ra.writeUTF(arr);
			}
			ra.seek(0);
			String s = ra.readLine();
			System.out.println(s);
		}catch(Exception e){
			System.out.println(e);
		}
       
       
	}

}