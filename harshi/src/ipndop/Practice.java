package ipndop;
import java.io.*;
public class Practice {

	public static void main(String[] args) {
		
try
		{
	// TODO Auto-generated method stub
		
       File obj= new File("C:\\users\\BOLHARSH\\Pictures\\myinfo.txt");
      
    	   System.out.println("file name"+ obj.getName());
     	  System.out.println("path"+obj.getAbsolutePath());
    	   File f= new File("C://");
    	   File[] list=f.listFiles();
    	   for(File flist:list){
    	   System.out.println(flist.getName());
       }  
    	   if(f.mkdir()){
    		   System.out.println("Created");
    	   }
		}catch(Exception e){
			System.out.println(e);	
		}
	}

}
