package handsonjava;

import java.util.ArrayList;
import java.util.List;


	class ScholarshipApplication {
	    private String name;
	    private double gpa;
	    private String essay;
	    private List<Scholarship> scholarships;

	    public ScholarshipApplication(String name, double gpa, String essay) {
	        this.name = name;
	        this.gpa = gpa;
	        this.essay = essay;
	        this.scholarships = new ArrayList<>();
	    }

	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public double getGpa() {
	        return gpa;
	    }

	    public void setGpa(double gpa) {
	        this.gpa = gpa;
	    }

	    public String getEssay() {
	        return essay;
	    }

	    public void setEssay(String essay) {
	        this.essay = essay;
	    }

	    public List<Scholarship> getScholarships() {
	        return scholarships;
	    }

	    public void setScholarships(List<Scholarship> scholarships) {
	        this.scholarships = scholarships;
	    }

	    public void applyForScholarship(Scholarship scholarship) {
	        if (scholarship.getNumRecipients() <= scholarship.getNumRecipients()) {
	            System.out.println("Application for scholarship " + scholarship.getName() + " rejected");
	            return;
	        }
	        scholarship.setNumRecipients(scholarship.getNumRecipients() - 1);
	        this.scholarships.add(scholarship);
	        System.out.println("Application for scholarship " + scholarship.getName() + " accepted");
	    }

	    @Override
	    public String toString() {
	        return "ScholarshipApplication{" +
	                "name='" + name + '\'' +
	                ", gpa=" + gpa +
	                ", essay='" + essay + '\'' +
	                ", scholarships=" + scholarships +
	                '}';
	    }
	}


