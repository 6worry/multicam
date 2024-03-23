package multicam.java.hw;

public class TestAccount {
	public static void main(String[] args) {
		CheckingAccount acc1 = 
			new CheckingAccount("111-222-333","장동건"
					,1000000,"1234-5647-8888");
		acc1.pay("1234-5678-8888", 500000);
		System.out.println("현재잔액====>"+acc1.getBalance());
		acc1.pay("1234-5647-8888", 500000);
		System.out.println("현재잔액====>"+acc1.getBalance());
	}
}

class Account {
	private String accId;
	private long balance;
	private String ownerName;
	
	public Account() {
		System.out.println("현재잔액: " + getBalance());
	}
	
	public Account(String accId, long balance, String ownerName) {
		this.accId = accId;
		this.balance = balance;
		this.ownerName = ownerName;
	}
	
	public void deposit(long amount) {
		balance += amount;
	}
	
	public void withdraw(long amount) {
		balance -= amount;
	}
	
	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public String getAccId() {
		return accId;
	}
	public void setAccId(String accId) {
		this.accId = accId;
	}
	public long getBalance() {
		return balance;
	}
	public void setBalance(long balance) {
		this.balance = balance;
	}
}

class CheckingAccount extends Account{
	private String cardNo;
	
	public CheckingAccount() {
		
	}
	
	public CheckingAccount(String accId, String ownerName, long balance, String cardNo) {
		super(accId, balance, ownerName);
		this.cardNo = cardNo;
	}

	public String getCardNo() {
		return cardNo;
	}

	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}
	
	public void pay(String cardNo, long amount) {
		if(getCardNo().equals(cardNo) && amount <= getBalance()) {
			System.out.println("지불 기능 수행함. 지불금액: " + amount);
			withdraw(amount);
		} else {
			System.out.println("지불이 불가능 합니다.");			
		}
	}
}