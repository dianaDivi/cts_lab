package ro.ase.CTS.main;

public class Main {

	public static void main(String[] args) {
		ArrayList<MovableImperial> cars = new ArrayList<MovableImperial>();
		cars.add(new AmericanCar("Ford"));
		cars.add(new AmericanCar("Chevy"));
		
		Lamborghini lambo = new Lamborghini("Aventador");

		AdapterMetric adapter = new AdapterMetric(lambo);
		cars.add(adapter);
		
		for (MovableImperial car : cars) {
			System.out.println("Max speed in miles is " + car.getMaxSpeed());
		}
	}
}
