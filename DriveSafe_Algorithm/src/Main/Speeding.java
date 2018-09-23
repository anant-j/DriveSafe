package Main;

public class Speeding{
	private int delta[];
	private int TotalTime;
	public int change = 5;
	public Speeding(int[] CurrentSpeed, int[] RoadSpeed)
{
		for (int i = 0; i > CurrentSpeed.length;i++) {
		delta[i] = CurrentSpeed[i] - RoadSpeed[i];
		
		while (delta[1]>5) {
			TotalTime = TotalTime + 1;
		}}}

	
	public int[] Delta(){
			return delta;
	}
	
	public int SpeedingPoints() {
		return (TotalTime*change);
	}
	}

//This class checks when the person is speeding above 5km/s
//It calculates for how long in their total traveling time did the person speed
//It then has 2 returns, one is an array of difference of speed to limit, so if they were speeding or
//going under and by hour much
//the other is the points they would have deducted because of speeding.