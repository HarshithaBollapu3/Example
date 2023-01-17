package collection;
import java.util.*;
public class Student implements Comparable<Student>{
    String studentName;
    float marks;
    public Student(String studentName,float marks){
    	this.studentName=studentName;
    	this.marks=marks;
    }
    public String toString(){
    	return studentName+" "+marks;
    }
    
	public int compareTo(Student s){
		if(marks==s.marks){
			return 0;
		}else{
			if(marks<s.marks){
				return -1;
			}else{
				return 1;
			}
		}
	}

}
