package assignment1;

public class Car {
	
	private final int ID; //set this value with constructor
	private CarBrand carBrand;
	private String description;
	private int km;
	private int fuel;
	
	
	public CarBrand getCarBrand() {
		return carBrand;
	}

	public void setCarBrand(CarBrand carBrand) {
		this.carBrand = carBrand;
	}
	
	//insert constructors here
	
	public Car (int id) {
	    this.ID = id;
    }

    public Car (int id, CarBrand carBrand) {
        this.ID = id;
        this.carBrand = carBrand;
    }
	
	//insert getter and setter here
	
	public int getKm {
	    return km;
    }

    public void setKm(int km) {
	    if (km > this.km) {
	        this.km = km;
        }
    }

    public void setDescription(String description) {
	    this.description = description;
    }
	
	
	//insert print method here
	
	public void print() {
        System.out.println("ID: " + ID + "\n"
                + "Marke: " + carBrand + "\n"
                + "Beschreibung: " + description + "\n"
                + "KM: " + km + "\n"
                + "Fuel: " + fuel + "\n");
    }

}
