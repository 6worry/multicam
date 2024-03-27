package multicam.java.hw;

import java.util.Objects;

public class VehicleTest {
	public static void main(String[] args) {
		Vehicle vehicle1= new Vehicle();
		Owner owner1= new Owner("LEE", "010-2233-4455");
		vehicle1.setOwner(owner1);
		vehicle1.setPrice(25000000);
		System.out.println(vehicle1);
		Vehicle vehicle2= new Vehicle();
		Owner owner2= new Owner("LEE", "010-6677-8899");
		vehicle2.setOwner(owner2);
		vehicle2.setPrice(50000000);
		System.out.println(vehicle2);
		System.out.println("동일한 소유주 여부 : "+ vehicle1.equals(vehicle2));
	}
}

class Owner {
	String name;
	String cellPhone;
	
	public Owner() {
		
	}
	
	public Owner(String name, String cellPhone) {
		super();
		this.name = name;
		this.cellPhone = cellPhone;
	}

	@Override
	public int hashCode() {
		return Objects.hash(name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Owner other = (Owner) obj;
		return Objects.equals(name, other.name);
	}

	@Override
	public String toString() {
		return "소유주정보: 이름은 " + name + "이고, 핸드폰번호는" + cellPhone + "입니다.";
	}
}

class Vehicle {
	Owner owner;
	int price;
	
	public Owner getOwner() {
		return owner;
	}

	public void setOwner(Owner owner) {
		this.owner = owner;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Vehicle() {
		
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(owner);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vehicle other = (Vehicle) obj;
		return Objects.equals(owner, other.owner);
	}

	@Override
	public String toString() {
		return owner + "\n"
				+ "차량정보: 가격은 " + price + "입니다.";
	}
}