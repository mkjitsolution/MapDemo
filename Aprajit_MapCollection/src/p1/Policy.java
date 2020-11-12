package p1;

public class Policy {

	private int policyNumber;
	private String policyName;
	// ...
	public Policy() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Policy(int policyNumber, String policyName) {
		super();
		this.policyNumber = policyNumber;
		this.policyName = policyName;
	}
	public int getPolicyNumber() {
		return policyNumber;
	}
	public void setPolicyNumber(int policyNumber) {
		this.policyNumber = policyNumber;
	}
	public String getPolicyName() {
		return policyName;
	}
	public void setPolicyName(String policyName) {
		this.policyName = policyName;
	}
	
	
	
}
