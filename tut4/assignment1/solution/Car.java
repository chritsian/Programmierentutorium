package s_a1;

public class Car {
	
	private final int ID;
	private CarBrand carBrand;
	private String description;
	private int km;
	private int fuel;
	
	Car (int ID) {
		this.ID = ID;
	}

	//ID
	public int getID() {
		return ID;
	}

	
	//carBrand
	public CarBrand getCarBrand() {
		return carBrand;
	}

	public void setCarBrand(CarBrand carBrand) {
		this.carBrand = carBrand;
	}

	
	//decription
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		if(description.equals("")) {
			
		} else {
			this.description = description;
		}
	}

	
	//km
	public int getKm() {
		return km;
	}

	public void setKm(int km) {
		if(km > this.km) {
			this.km = km;
		}
	}

	
	//fuel
	public int getFuel() {
		return fuel;
	}

	public void setFuel(int fuel) {
		if(fuel >= 0 && fuel < 80) {
			this.fuel = fuel;
		}
	}
	
	//better use String constants here
	//print method
	public void print() {
		System.out.println("ID: " + ID + "\n"
				+ "Marke: " + carBrand + "\n"
				+ "Beschreibung: " + description + "\n"
				+ "KM: " + km + "\n"
				+ "Fuel: " + fuel + "\n");
	}

}
