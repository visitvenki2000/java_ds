package geeks;

public class TestGrade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String grade ="9.0";
		String[] list = grade.split("\\.");
	      if(list!=null && list.length>0) {
	    	String   gradeValue = list[0];
	    	 System.out.println("---"+gradeValue); 
	      }
	    	  
	    	
	      
	}

}
