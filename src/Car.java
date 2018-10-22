
public class Car {
	
	
	private String make;
	private String model;
	private int carYear;
	private double carPrice;
	
	public Car() {
		
	}
	
	public Car(String carMake, String carModel, int year, double price) {
		this.make = carMake;
		this.model = carModel;
		this.carYear = year;
		this.carPrice = price;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getCarYear() {
		return carYear;
	}

	public void setCarYear(int carYear) {
		this.carYear = carYear;
	}

	public double getCarPrice() {
		return carPrice;
	}

	public void setCarPrice(double carPrice) {
		this.carPrice = carPrice;
	}
	
	@Override
	public String toString() {
		return String.format("Make: %-10s Model: %-10s Year: %-10s Price: %-10s", make, model, carYear, carPrice);
		
	}

}

