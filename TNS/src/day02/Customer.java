package day02;

	public class Customer {
			//Local variables
			private String customerName;
			private int customerId;
			private String customerCity;
			public Customer() {	//default constructor 
				System.out.println("Method Default Constructor");
			}
			public Customer(String customerName, int customerId, String customerCity) {	//parameterized constructor
				System.out.println("Parameterized constructor");
				this.customerName = customerName;
				this.customerId = customerId;
				this.customerCity = customerCity;
			}
			//Getter & Setter
			public String getCustomerName() {
				return customerName;
			}
			public void setCustomerName(String customerName) {
				this.customerName = customerName;
			}
			public int getCustomerId() {
				return customerId;
			}
			public void setCustomerId(int customerId) {
				this.customerId = customerId;
			}
			public String getCustomerCity() {
				return customerCity;
			}
			public void setCustomerCity(String customerCity) {
				this.customerCity = customerCity;
			}
			@Override
			public String toString() {
				return "Customer [customerName=" + customerName + ", customerId=" + customerId + ", customerCity="
						+ customerCity + "]";
			}
		
	}


