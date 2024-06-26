package handsonjava;

public class ScholarshipManagement {
	 public static void main(String[] args) {
	        // Create scholarships
	        Scholarship scholarship1 = new Scholarship("Scholarship 1", 10000, 5);
	        Scholarship scholarship2 = new Scholarship("Scholarship 2", 5000, 10);

	        // Create scholarship applications
	        ScholarshipApplication application1 = new ScholarshipApplication("John Doe", 3.8, "Why I deserve this scholarship");
	        ScholarshipApplication application2 = new ScholarshipApplication("Jane Smith", 3.6, "Why I deserve this scholarship");

	        // Apply for scholarships
	        application1.applyForScholarship(scholarship1);
	        application1.applyForScholarship(scholarship2);
	      //  application2


}

}
