package javastring;

public class Stringjava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="It is raining outside! Can I have a raincoat Please";
		int vol=0;
		char[] c=str.toCharArray();
		for(char a: c){
			if(a=='A'||a=='a'||a=='e'||a=='E'||a=='i'||a=='I'||a=='o'||a=='O'||a=='u'||a=='U'){
				vol++;
			}
		  }
		 System.out.println(vol);
		String str1=str.toUpperCase();
		System.out.println(str1);
		String str2 = str.replace("raincoat", "umbrella");
		System.out.println(str2);
		String[] str3=str.split(" ");
		String str4= String.join("#",str3);
		System.out.println(str4);
	}

}
