
public class Drive implements Car{

	@Override
	public void turnLeft(String direction) {
		System.out.println("Car has turned " + direction);		
	}

	@Override
	public void turnRight(String direction) {
		System.out.println("Car has turned " + direction);
	}

	@Override
	public void doAUturn(String direction) {
		System.out.println("Car has turned " + direction);
	}

	@Override
	public void accelerate(int speed) {
		System.out.println("Speed has increased by " + speed);
	}

	@Override
	public void deccelerate(int speed) {
		System.out.println("Speed has decreased by " + speed);		
	}

	@Override
	public void parked(boolean parkingBrake) {
		if(parkingBrake == true)
			System.out.println("Parking Brake is on");
		else
			System.out.println("Parking Brake is off");
	}

	@Override
	public boolean startCar(boolean brakes) {
		System.out.println("Brakes are off and car is go");
		brakes = false;
		return brakes;
	}

	@Override
	public boolean stopCar(boolean brakes) {
		System.out.println("Brakes are on and car is off");
		brakes = true;
		return brakes;
	}

}
