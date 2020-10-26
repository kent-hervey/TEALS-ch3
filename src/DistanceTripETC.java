
public class DistanceTripETC {

	public static void main(String[] args) {
		
		double lunaCelestiaTrip = roadTrip(10.0);
		System.out.println("Luna and Celestia's trip is this long:  " + lunaCelestiaTrip);
		
		double baltimoreManehattanDistance = distance(29, 16, 34, 8);
		System.out.println("Distance from Baltimore to Manehatten is:  " + baltimoreManehattanDistance);
		
		double losPegasusNeighagraFallsDistance = distance(6,19, 22, 7);
		System.out.println("Distance from Los Pegasus to Neighagra Falls is:  " + losPegasusNeighagraFallsDistance);
		
		double badlandsPonyvilleDistance = distance(25,24, 16, 14);
		System.out.println("Distance from Badlands Ponyville is:  " + badlandsPonyvilleDistance);
		
		double locationOneX = 4;
		double locationOneY = 5;
		double locationTwoX = 7;
		double locationTwoY = 8;
		double locationThreeX = 9;
		double locationThreeY =12;
		
		
		totalTripOneTwoThreeOne(locationOneX, locationOneY, locationTwoX, locationTwoY, locationThreeX, locationThreeY);

	}
	
	private static void totalTripOneTwoThreeOne(double locationOneX, double locationOneY, double locationTwoX,
			double locationTwoY, double locationThreeX, double locationThreeY) {
		//Calculate and return distance from one to two as double distanceOneTwo
		
		//Calculate and return distance from two to three as double distanceTwoThree
		
		//Calculate and return distance from three to one as double distance ThreeOne
		
		
		
	}

	public static double roadTrip(double diameter) {
		 double circumference = diameter * Math.PI;
		return circumference;
	}
	
	public static double distance(double x1, double y1, double x2, double y2) {
		double vertical = y2-y1;
		double verticalSquared = Math.pow(vertical, 2);
		double horizontal = x2-x1;
		double horizontalSquared = Math.pow(horizontal, 2);
		double distance = Math.sqrt(verticalSquared + horizontalSquared);
		
		return distance;
		
	}
	
	

}
