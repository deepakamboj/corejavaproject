package com.dk.variables;

// class mobile given in mock interview
public class Mobilemock {

	String brand;
	String color;
	int ram;
	int camera;

	// constructor initialized
	public Mobilemock(String brand, String color, int ram, int camera) {

		this.brand = brand;
		this.color = color;
		this.ram = ram;
		this.camera = camera;

	}

	public static void main(String[] args) {

		// object creation
		Mobilemock mob1 = new Mobilemock("iphone", "gold", 32, 16);
		Mobilemock mob2 = new Mobilemock("samsung", "blue", 16, 8);
		Mobilemock mob3 = new Mobilemock("redmi", "silver", 16, 4);

		// smartphone details for each user
		System.out.println("====== smartphone details for each user======"); 
		
		System.out.println("1) Deepa owns" + " "+mob1.brand + " "+mob1.color +" "+ "smartphone having" + " "+mob1.ram + "GB Ram and"
				+" " +mob1.camera + "mp camera.");
		System.out.println("2) Priyanka owns" +" "+mob2.brand +" "+mob2.color +" "+ "smartphone having" +" "+ mob2.ram + "GB Ram and"
				+" " +mob2.camera + "mp camera.");
		System.out.println("3) Nitika owns" +" " +mob3.brand +" " +mob3.color +" " +"smartphone having" +" " +mob3.ram + "GB Ram and"
				+" " +mob3.camera + "mp camera.");
	}

}
