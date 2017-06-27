
public class Driver {
	public static void main(String[] args) {
		Drive d = new Drive();
		String direction = "";
		int speed = 0;
		boolean parkingBrake = false;
		boolean brakes = true;

		d.parked(parkingBrake);
		d.startCar(brakes);
		speed = 15;
		d.accelerate(speed);
		direction = "left";
		d.turnLeft(direction);
		
		d.deccelerate(speed);
		d.stopCar(brakes);
		
		parkingBrake = true;
		d.parked(parkingBrake);
	}
}
