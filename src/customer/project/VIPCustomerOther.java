package customer.project;


public class VIPCustomerOther extends Customer {

	private int agentID;
	double saleRatio;
	
	public VIPCustomer(int customerID, String customerName, int agentID){
		super(customerID, customerName);
	
		super.customerGrade = "VIP";
		super.bonusRatio = 0.03;
		this.saleRatio = 0.2;
		this.agentID = agentID;
	}

	@Override
	public int calcPrice(int price) {
		bonusPoint += (price * saleRatio);
		return price - (int)(price * saleRatio);
	}

	
	public int getAgentID(){
			return agentID;
	}
}
