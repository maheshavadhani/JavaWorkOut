package test.practise.littleAdvance;

class BankAccount {
	static final String bankName = "HDFC";
	static final String accountType = "Savings Bank";
	private String userName;
	private int accountNumber;
	private int mobileNumber;

	public String getuserName() {
		return userName;
	}

	public void setuserName(String userName) {
		this.userName = userName;
	}

	public int getaccountNumber() {
		return accountNumber;
	}

	public void setaccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public int getmobileNumber() {
		return mobileNumber;
	}

	public void setmobileNumber(int mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	void display() {
		System.out.println(userName + " has " + accountType + " account in " + bankName + " A/C id:" + accountNumber
				+ " SMS to:" + mobileNumber);
	}
}

public class Encapsulation {
	public static void main(String[] args) {

		BankAccount A = new BankAccount();
		A.setuserName("Mahesh");
		A.setaccountNumber(6655);
		A.setmobileNumber(88888888);
		A.display();
	}
}