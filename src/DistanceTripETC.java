
public class DistanceTripETC {

	public static void main(String[] args) {
		
		double lunaCelestiaTrip = roadTrip(10.0);
		System.out.println("Luna and Celestia's trip is this long:  " + lunaCelestiaTrip);
		
		double baltimoreManehattanDistance = distance(29, 34, 16, 8);
		System.out.println("Distance from Baltimore to Manehatten is:  " + baltimoreManehattanDistance);
		
		double losPegasusNeighagraFallsDistance = distance(6, 22, 19, 7);
		System.out.println("Distance from Los Pegasus to Neighagra Falls is:  " + losPegasusNeighagraFallsDistance);

	}
	
	public static double roadTrip(double diameter) {
		 double circumference = diameter * Math.PI;
		return circumference;
	}
	
	public static double distance(double x1, double x2, double y1, double y2) {
		double vertical = y2-y1;
		double verticalSquared = Math.pow(vertical, 2);
		double horizontal = x2-x1;
		double horizontalSquared = Math.pow(horizontal, 2);
		double distance = Math.sqrt(verticalSquared + horizontalSquared);
		
		return distance;
		
	}
	
	

}
