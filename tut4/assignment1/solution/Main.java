package s_a1;

public class Main {

	public static void main(String[] args) {
		
		Car car = new Car(23542);
		car.setCarBrand(CarBrand.AUDI);
		car.setFuel(40);
		car.setKm(54000);
		car.setDescription("Ich bin ein Audi.");
		car.print();
		car.setFuel(345);
		car.print();
		car.setFuel(50);
		car.print();
	
	}

}
