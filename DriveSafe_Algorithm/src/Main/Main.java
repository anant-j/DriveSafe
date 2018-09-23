package Main;

public class Main {
	public static void Main(String args[]) {
		int[] CurrentSpeed = new int[] {68,68,68,68,68,67,67,67,67,68,68,68,69,69,69,69,69,69,69,69,69};
		int[] RoadSpeed = new int[] {70,70,70,70,70,70,70,70,70,70,70,70,70,70,70,70,70,70,70,70,70};
		int[] Lanes = new int[] {3,3,3,3,3,3,3,3,3,3,3,2,2,2,2,2,2,2,2,2,2};
		Points Steve = new Points(CurrentSpeed,RoadSpeed,Lanes);
		System.out.println("Working");
	}

	//Steve.total();
	//System.out.print(Steve.TotalPoints());
	
}
//The main class initializes everything. 
//The name of an object will be named after the person who its referring to
//All information would normally be imported on this slide, but for the time being its manually encoded
//Current speed is the drivers speed at that given moment
//Road Speed is the speed limit on the road they are on
//Lanes is what lane they are in starting from the right side.
//Values are measured every second, therefore the length of the array is the time in seconds.