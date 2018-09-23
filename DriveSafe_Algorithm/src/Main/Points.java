package Main;

public class Points {
	private int Totalpoints;
	private int[] Current;
	private int[] Road;
	private int[] Lanes;
	
	public Points(int[] CurrentSpeed,int[] RoadSpeed,int[] Lane) {
		Current = CurrentSpeed;
		Road = RoadSpeed;
		Lanes = Lane;
	}
	
	
	public void total() {
		Speeding h = new Speeding(Current, Road);
		LaneChange k = new LaneChange(Lanes, Road);
		Use l = new Use(Current);
		k.Count();
		Totalpoints = Totalpoints - h.SpeedingPoints() - k.Points() + l.TimePoints();
	}
	
	public int TotalPoints() {
		return Totalpoints;
	}
}

//There are 3 parts of this class
//The constructor reads all the variables and saves them.(Line 9-13)
//The void commands the other classes and gets back scores to add up(Line 16-22)
//The return gives the Main class back the total points so that it may print it to the screen
