package Main;

public class LaneChange {
	private int Times;
	private int[] lane;
	private int[] Speed;
	private int change = 5;
	public LaneChange(int[] Lane,int[] RoadSpeed) {
	lane = Lane;
	Speed = RoadSpeed;
	}
	
	public void Count(){
		for(int i = 1;i < lane.length; i++) {
			if (Speed[i]>60) {
			if(lane[i] != lane[i-1]) {
				Times = Times +1;
			}}}}
	
	
	public int Points() {
		return (Times*change);
	}
}
//On a very busy road, traffic slows down because so many people are trying to change lanes.
//This class checks when you change lanes but only penalizes you if the speed limit is greater then 60
//So it only counts main roads instead of residential. 