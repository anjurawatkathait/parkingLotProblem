package parking_lot;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ParkingClass {

	private int capacity;
	private List<String> cars;

	public void create_parking_lot(int capacity) {
		this.capacity = capacity;
		this.cars = new ArrayList<String>(Collections.nCopies(capacity, null));
		
		System.out.println("Created parking lot with " + capacity + " slots");
	}

	public void park(String car_number) {
		int indexValue = cars.indexOf(null); // get the first element with null value

		if (indexValue != -1) {
			cars.set(indexValue, car_number);
			System.out.println("Allocated slot number: " + (indexValue + 1));
		} else {
			System.out.println("Sorry, parking lot is full");
		}
	}

	public void leave(String car_number, int hours) {
		int index = cars.indexOf(car_number);
		if (index != -1) {
			cars.set(index, null);
			System.out.println("Registration number " + car_number + " with Slot Number " + (index + 1)
					+ " is free with Charge " + computeCharge(hours));
		} else {
			System.out.println("Registration number " + car_number + " not found");
		}
	}

	private int computeCharge(int hours) {
		int baseFare = 10;

		if (hours <= 2) {
			return baseFare;
		} else {
			return baseFare + (10 * (hours - 2));
		}
	}

	public void status() {
		System.out.println("Slot No. " + "Registration No.");
		for (int i = 0; i < cars.size(); i++) {
			if (cars.get(i) != null)
				System.out.println((i + 1) + " " + cars.get(i));
		}
	}
}
