/*
 * Main
 *
 * Version 0.1
 *
*/

package conversion;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

	Scanner sc=new Scanner (System.in);
				System.out.println("menu\t");
				System.out.println("1.Convert from Kelvin to celsius OR celsius to Kelvin.");
				System.out.println("2. Convert from Pounds  to kilograms");
		        System.out.println("3. Convert from Miles to kilometers");
				int convertion=sc.nextInt();

			switch (convertion) {
				case 1:
				Scanner scnr = new Scanner(System.in);
				Converter ctof = new Converter();
				String input = new String();

				System.out.println("What would you like to convert from?");
				System.out.println("Type  c for Celsius, and k for Kelvin");
				input = scnr.next("[\\s]*[a-zA-Z]");

				if (input.equalsIgnoreCase("c")) {
					ctof.FromCelsius();
				}
				if (input.equalsIgnoreCase("k")) {
					ctof.FromKelvin();
				} else if (input.equalsIgnoreCase("[a-bA-B[^ckf]]")) {
					System.out.println("Sorry, input not recognized.");
				}
				break;
			case 2:
				Scanner input1 = new Scanner(System.in);
				System.out.print("Enter a number in pounds: ");
				double pounds = input1.nextDouble();
				double kilograms = pounds * 0.454;
				System.out.print(pounds + " pounds is " + kilograms + " killograms");
				break;
			case 3:
				System.out.print("Enter distance in miles:");
				Scanner s = new Scanner(System.in);

				double distanceInMiles = s.nextDouble();

				System.out.println(distanceInMiles + " miles = " + milesTokm(distanceInMiles) + " km");

				System.out.print("Enter distance in km:");
				double distanceInKm = s.nextDouble();

				System.out.println(distanceInKm + " km = " + kmTomiles(distanceInKm) + " miles");
				s.close();
				break;
				default:
				System.out.println("Sorry, input not recognized.(choose from 1 to 3");
				break;
		}

	}
	private static double milesTokm(double distanceInMiles) {
		return distanceInMiles * 1.60934;
	}

	private static double kmTomiles(double distanceInKm) {
		return distanceInKm * 0.621371;
	}

}