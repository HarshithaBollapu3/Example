package javastring;

public class Stringbuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       StringBuilder sb = new StringBuilder();
       sb.append("Hello People!This is a StringBuilder");
       sb.insert(13, "Welcome ");
       sb.replace(6,12,"programmer");
       sb.delete(34, 47);
       sb.insert(34, "Stringbuffer");
       System.out.println(sb);
	}

}
