package multicam.java.hw;

public class TestAcc {
    public static void main(String[] args) throws Exception {
        String accNo = null;
        int balance = 0;

        Account2 accObj = new Account2();
		accObj.setAccNo("078-3762-293");
        accNo = accObj.getAccNo();
        balance = accObj.getBalance();
        System.out.println(accNo + " 계좌의 잔고는 " + balance + "만원입니다.");

        accObj.save(100);
        balance = accObj.getBalance();
        System.out.println(accObj.getAccNo() + " 계좌의 잔고는 " + balance + "만원입니다.");

        accObj.deposit(30);
        balance = accObj.getBalance();
        System.out.println(accNo + " 계좌의 잔고는 " + balance + "만원입니다.");
    }
}

class Account2 {
	private String accNo;
	private int balance;
	
	public Account2() {
		
	}

	public String getAccNo() {
		return accNo;
	}
	
	public void setAccNo(String accNo) {
		this.accNo = accNo;
		System.out.println(accNo + " 계좌가 개설되었습니다.");
	}
	
	public int getBalance() {
		return balance;
	}
	
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	public void save(int money) {
		balance += money;
		System.out.println(accNo + " 계좌에 " + money + "만원이 입금되었습니다.");
	}
	
	public void deposit(int money) {
		balance -= money;
		System.out.println(accNo + " 계좌에 " + money + "만원이 출금되었습니다.");
	}
}