package parking_lot;

public class CarParkingLot {

	public static void main(String[] args) {

		ParkingClass pk = new ParkingClass();
		pk.create_parking_lot(6);

		pk.park("KA-01-HH-1234");
		pk.park("KA-01-HH-9999");
		pk.park("KA-01-BB-0001");
		pk.park("KA-01-HH-7777");
		pk.park("KA-01-HH-2701");
		pk.park("KA-01-HH-3141");
		pk.leave("KA-01-HH-3141", 4);
		pk.status();
		pk.park("KA-01-P-333");
		pk.park("DL-12-AA-9999");

		pk.leave("KA-01-HH-1234", 4);
		pk.leave("KA-01-BB-0001", 6);
		pk.leave("DL-12-AA-9999", 2);
		pk.park("KA-09-HH-0987");
		pk.park("CA-09-IO-1111");
		pk.park("KA-09-HH-0123");

		pk.status();
	}
}