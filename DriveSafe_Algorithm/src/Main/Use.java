package Main;

public class Use {
	private int Time;
	private int change = 2;
	private int[] speed;
	public Use(int[] CurrentSpeed) {
		speed = CurrentSpeed;
		for(int i = 0;i<speed.length;i++) {
			if (speed[i]>10){
				Time++;
			}
		}
	}
	public int TimePoints() {
		return (Time*change);
	}
}
//The app gives points for using it so long as your moving
//This is the insinuative because it rewards people for driving well.
//If your not moving above 10km per hour