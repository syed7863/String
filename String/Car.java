package syed;

public class Car {

	public static void main(String[] args) {
		Car c = new Car();
		System.out.println(c.toString());
		
		System.out.println(c.hashCode());
		
		System.out.println(c.equals(c));

	}

}
