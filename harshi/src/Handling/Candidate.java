package Handling;

public class Candidate {
	public int checkMarks(int marks) throws Exception{
		if(marks<30){
			throw new Exception("marks invalid");
		}
		else{
			System.out.println(marks);
			return marks;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			Candidate obj= new Candidate();
			obj.checkMarks(31);
			
		}
		catch(Exception e){
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

	}

}
