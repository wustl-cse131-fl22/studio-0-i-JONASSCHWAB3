package studio0;

public class MilageReport {
	
	public static void main(String[] args) {
		int car1miles = 250;
		int car2miles = 100;
		int car3miles = 900;
		double debugTest = 0;
		
		int totalMiles = car1miles + car2miles + car3miles;
		double milesPerGallon = 24.5;
		//System.out.println("Step 1: total miles: " + totalMiles + "miles per gallon: " + milesPerGallon);
		debugTest = 24.5 * 1250;
		//System.out.println("debugTest: " + debugTest);
		double totalGallons = totalMiles / milesPerGallon;
		double pricePerGallon = 3.05;
		double totalPrice = totalGallons * pricePerGallon;
		
		System.out.println("Total price spent on gas was $" + totalPrice);
	}
}
