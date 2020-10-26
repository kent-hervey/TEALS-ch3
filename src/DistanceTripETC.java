
public class DistanceTripETC {

	public static void main(String[] args) {

		// Exercise 1 Princess Luna and Celestia are going on a tour of the kingdom
		double lunaCelestiaTrip = roadTrip(10.0);
		System.out.println("Luna and Celestia's trip is this long:  " + lunaCelestiaTrip);

		// Exercise 2 Test out your program by writing a main method that calls the
		// distance method for each of the following pairs of cities.
		// Your main method should output the value returned by the distance method.
		double baltimoreManehattanDistance = distance(29, 16, 34, 8);
		System.out.println("Distance from Baltimore to Manehatten is:  " + baltimoreManehattanDistance);

		double losPegasusNeighagraFallsDistance = distance(6, 19, 22, 7);
		System.out.println("Distance from Los Pegasus to Neighagra Falls is:  " + losPegasusNeighagraFallsDistance);

		double badlandsPonyvilleDistance = distance(25, 24, 16, 14);
		System.out.println("Distance from Badlands Ponyville is:  " + badlandsPonyvilleDistance);

		// Exercise 3 Write a program that helps Princess Luna plan a 3-stop tour of
		// Equestria.
		// choose three destinations in Equestria output the distance between the three.

		double locationOneX = 4;
		double locationOneY = 5;
		double locationTwoX = 7;
		double locationTwoY = 8;
		double locationThreeX = 9;
		double locationThreeY = 12;

		displayTotalTripOneTwoThreeOne(locationOneX, locationOneY, locationTwoX, locationTwoY, locationThreeX, locationThreeY);

		// Exercise 4 Write a method called totalTrip that accepts parameters for 3
		// locations (each containing coordinates) and returns the total distance
		// traveled by visiting all 3 locations and returning to the starting location.
		// You should use the distance methods you wrote in Exercise 2 and you can
		// choose any 3 locations in Equestria.

		// using same three locations as above, but this time calculating entire trip
		// to/from start
		double locationStartX = 0;
		double locationStartY = 0;

		double totalDistanceTraveledThreeLocations = fetchTotalDistanceTraveledToFromThree(locationStartX, locationStartY, locationOneX, locationOneY, locationTwoX, locationTwoY,
				locationThreeX, locationThreeY);
		System.out.println("Distance traveled from start to three locations and back is:  " + totalDistanceTraveledThreeLocations);

	}

	private static double fetchTotalDistanceTraveledToFromThree(double locationStartX, double locationStartY, double locationOneX, double locationOneY, double locationTwoX,
			double locationTwoY, double locationThreeX, double locationThreeY) {
		// TODO Auto-generated method stub

		// Calculate and return distance from start to one as distanceStartOne
		double distanceStartOne = distance(locationStartX, locationStartY, locationOneX, locationOneY);

		// Calculate and return distance from one to two as double distanceOneTwo
		double distanceOneTwo = distance(locationOneX, locationOneY, locationTwoX, locationTwoY);

		// Calculate and return distance from two to three as double distanceTwoThree
		double distanceTwoThree = distance(locationTwoX, locationTwoY, locationThreeX, locationThreeY);

		// Calculate and return distance from three to start as double
		// distanceThreeStart
		double distanceThreeStart = distance(locationThreeX, locationThreeY, locationStartX, locationStartY);

		return distanceStartOne + distanceOneTwo + distanceTwoThree + distanceThreeStart;
	}

	private static void displayTotalTripOneTwoThreeOne(double locationOneX, double locationOneY, double locationTwoX, double locationTwoY, double locationThreeX,
			double locationThreeY) {
		// Calculate and return distance from one to two as double distanceOneTwo
		double distanceOneTwo = distance(locationOneX, locationOneY, locationTwoX, locationTwoY);
		System.out.println("Distance from location one to two is: " + distanceOneTwo);

		// Calculate and return distance from two to three as double distanceTwoThree
		double distanceTwoThree = distance(locationTwoX, locationTwoY, locationThreeX, locationThreeY);
		System.out.println("Distance from location two to three is:  " + distanceTwoThree);

	}

	public static double roadTrip(double diameter) {
		double circumference = diameter * Math.PI;
		return circumference;
	}

	public static double distance(double x1, double y1, double x2, double y2) {
		double vertical = y2 - y1;
		double verticalSquared = Math.pow(vertical, 2);
		double horizontal = x2 - x1;
		double horizontalSquared = Math.pow(horizontal, 2);
		double distance = Math.sqrt(verticalSquared + horizontalSquared);

		return distance;

	}

}
