package handsonjava;

public class Student {
	 private int studentId;
	    private String studentName;
	    private String studentAddress;
	    private String collegeName;
	    
	    Student(int studentId,String studentName,String studentAddress ){
	        this.studentId=studentId;
	        this.studentName=studentName;
	        this.studentAddress=studentAddress;
	        this.collegeName="NIT";
	    }
	    
	    Student(int studentId,String studentName,String studentAddress,String collegeName){
			this.studentId=studentId;
	        this.studentName=studentName;
	        this.studentAddress=studentAddress;
	        this.collegeName=collegeName;
			
			
		}

		@Override
		public String toString() {
			return "Student id:" + studentId +"\n"+ "Student name:" + studentName +"\n" +"Address:"
					+ studentAddress +"\n"+ "College name:" + collegeName ;
		}

		public int getStudentId() {
			return studentId;
		}

		public void setStudentId(int studentId) {
			this.studentId = studentId;
		}

		public String getStudentName() {
			return studentName;
		}

		public void setStudentName(String studentName) {
			this.studentName = studentName;
		}

		public String getStudentAddress() {
			return studentAddress;
		}

		public void setStudentAddress(String studentAddress) {
			this.studentAddress = studentAddress;
		}

		public String getCollegeName() {
			return collegeName;
		}

		public void setCollegeName(String collegeName) {
			this.collegeName = collegeName;
		}
		
		
		
		
	

}
