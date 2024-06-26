package handsonjava;

class Scholarship {
	    private String name;
	    private double amount;
	    private int numRecipients;

	    public Scholarship(String name, double amount, int numRecipients) {
	        this.name = name;
	        this.amount = amount;
	        this.numRecipients = numRecipients;
	    }

	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public double getAmount() {
	        return amount;
	    }

	    public void setAmount(double amount) {
	        this.amount = amount;
	    }

	    public int getNumRecipients() {
	        return numRecipients;
	    }

	    public void setNumRecipients(int numRecipients) {
	        this.numRecipients = numRecipients;
	    }

	    @Override
	    public String toString() {
	        return "Scholarship{" +
	                "name='" + name + '\'' +
	                ", amount=" + amount +
	                ", numRecipients=" + numRecipients +
	                '}';
	    }
	}

	

	

	   
