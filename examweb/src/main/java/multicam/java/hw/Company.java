package multicam.java.hw;

public class Company {
	public static void main(String[] args) {
		Secretary sec = new Secretary("Hilery", 1, "secretary", 800);
		Sales sal = new Sales("Clinten", 2, "sales", 1200);
		System.out.println("name \t\t department \t salary");
		System.out.println("------------------------------------------");
		System.out.println(sec.getName() + " \t\t " + sec.getDepartment()
				+ " \t " + sec.getSalary());
		System.out.println(sal.getName() + " \t " + sal.getDepartment()
				+ " \t\t " + sal.getSalary());
		System.out.println();
		System.out.println("인센티브 100 지급");
		System.out.println();
		sec.incentive(100);
		sal.incentive(100);
		System.out.println("name \t\t department \t salary \t tax");
		System.out
				.println("-----------------------------------------------------------");
		System.out.println(sec.getName() + " \t\t " + sec.getDepartment()
				+ " \t " + sec.getSalary() + " \t\t " + sec.tax());
		System.out.println(sal.getName() + " \t " + sal.getDepartment()
				+ " \t\t " + sal.getSalary() + " \t\t " + sal.tax());
	}
}

class Employee {
	private String name;
	private int number;
	private String department;
	private int salary;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public Employee() {
		super();
	}
	
	public Employee(String name, int number, String department, int salary) {
		this.name = name;
		this.number = number;
		this.department = department;
		this.salary = salary;
	}
	
	public double tax() {
		return tax();
	}
}

class Secretary extends Employee implements Bonus{
	public String getName() {
		return super.getName();
	}

	public void setName(String name) {
		super.setName(name);
	}

	public int getNumber() {
		return super.getNumber();
	}

	public void setNumber(int number) {
		super.setNumber(number);
	}

	public String getDepartment() {
		return super.getDepartment();
	}

	public void setDepartment(String department) {
		super.setDepartment(department);
	}

	public int getSalary() {		return super.getSalary();
	}

	public void setSalary(int salary) {
		super.setSalary(salary);
	}
	
	public Secretary() {
		super();
	}

	public Secretary(String name, int number, String department, int salary) {
		super(name, number, department, salary);
	}

	public double tax() {
		return getSalary() * 0.1;
	}

	public void incentive(int pay) {
		setSalary((int) (getSalary() + pay * 0.8));
	}
}

class Sales extends Employee implements Bonus {
	public String getName() {
		return super.getName();
	}

	public void setName(String name) {
		super.setName(name);
	}
	
	public int getNumber() {
		return super.getNumber();
	}

	public void setNumber(int number) {
		super.setNumber(number);
	}

	public String getDepartment() {
		return super.getDepartment();
	}

	public void setDepartment(String department) {
		super.setDepartment(department);
	}

	public int getSalary() {
		return super.getSalary();
	}

	public void setSalary(int salary) {
		super.setSalary(salary);
	}

	public Sales() {
		super();
	}

	public Sales(String name, int number, String department, int salary) {
		super(name, number, department, salary);
	}

	public double tax() {
		return getSalary() * 0.13;
	}

	public void incentive(int pay) {
		setSalary((int) (getSalary() + pay * 1.2));
	}
}

interface Bonus {
	public void incentive(int pay);
}