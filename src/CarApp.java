import java.util.ArrayList;
import java.util.Scanner;

public class CarApp {

	public static void main(String[] args) {
		
		int numCars;
		String make;
		String model;
		int carYear;
		double carPrice;
		
		
		
		Scanner scan = new Scanner(System.in);
		
		ArrayList <Car> carList = new ArrayList <>();
		
		System.out.println("Welcome to Grand Circus Automotive!");
		System.out.println("\nHow many cars are you entering?");
		numCars = scan.nextInt();
		
		scan.nextLine();
		
		for (int i = 0; i < numCars; i++) {
			System.out.println("Enter Car Make: ");
			make = scan.nextLine();
			System.out.println("Enter Car Model: ");
			model = scan.nextLine();
			carYear = Validator.getInt(scan, "Enter Car Year: ");
			carPrice = Validator.getDouble(scan, "Enter Car Price: ");
			carList.add(new Car(make, model, carYear, carPrice));
			
		}
		
		
		
		
		System.out.println("Current Inventory:");
		System.out.println(carList.toString());
		
		
		
		

	}

}
