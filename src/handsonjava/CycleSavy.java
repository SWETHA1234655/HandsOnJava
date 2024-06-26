package handsonjava;

public class CycleSavy {
	private String c_id;
	private String c_name;
	private String c_type;
	private String access;
	private double price;
	
	public CycleSavy() {
		
	}
	public CycleSavy(String c_id,String c_name,String c_type,String access,double price) {
		this.c_id=c_id;
		this.c_name=c_name;
		this.c_type=c_type;
		this.access=access;
		this.price=price;
	}

	public String getC_id() {
		return c_id;
	}

	public void setC_id(String c_id) {
		this.c_id = c_id;
	}

	public String getC_name() {
		return c_name;
	}

	public void setC_name(String c_name) {
		this.c_name = c_name;
	}

	public String getC_type() {
		return c_type;
	}

	public void setC_type(String c_type) {
		this.c_type = c_type;
	}

	public String getAccess() {
		return access;
	}

	public void setAccess(String access) {
		this.access = access;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	public double calculateBillAmount() {
		double bill_amount=0,total=0;
		if(c_type.equals("Road Cycle")) {
			if(access.equalsIgnoreCase("yes")) {
			total=price+((price*2)/100);
			bill_amount=total+1000;
			//return bill_amount;
		}
			else if(access.equalsIgnoreCase("no")) {
				bill_amount=price+((price*2)/100);
				//return bill_amount;
				
			}
			//return bill_amount;
		}
		
		else if(c_type.equals("Mountain Cycle")) {
			if( access.equalsIgnoreCase("yes")) {
			total=price+((price*5)/100);
			bill_amount=total+1000;
			//return bill_amount;
		}
			else if(access.equalsIgnoreCase("no")) {
				bill_amount=price+((price*5)/100);
				//return bill_amount;
				
			}
		//	return -1;
		}
		
		else if(c_type.equals("Hybrid Cycle")) {
			if(access.equalsIgnoreCase("yes")) {
			total=price+((price*6)/100);
			bill_amount=total+1000;
			//return bill_amount;
		}
			else if(access.equalsIgnoreCase("no")) {
				bill_amount=price+((price*6)/100);
				//return bill_amount;
				
			}
		//	return -1;
		}
		
		else if(c_type.equals("Touring Cycle")) {
			if(access.equalsIgnoreCase("yes")) {
			total=price+((price*4)/100);
			bill_amount=total+1000;
			//return bill_amount;
		}
			else if(access.equalsIgnoreCase("no")) {
				bill_amount=price+((price*4)/100);
				//return bill_amount;
				
			}
		//	return -1;
		}
		
		else if(c_type.equals("Electric Cycle")) {
			if(access.equalsIgnoreCase("yes")) {
			total=price+((price*2)/100);
			bill_amount=total+1000;
			//return bill_amount;
		}
			else if(access.equalsIgnoreCase("no")) {
			bill_amount=price+((price*2)/100);
			//return bill_amount;
		
		}
			//return bill_amount;
		}
		else {
			return -1;
		}
		return bill_amount;
		
	}

}
