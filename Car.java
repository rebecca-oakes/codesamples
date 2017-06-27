
public interface Car {

	public boolean startCar(boolean brakes);
	
	public void turnLeft(String direction);
	
	public void turnRight(String direction);
	
	public void doAUturn(String direction);
	
	public void accelerate(int speed);
	
	public void deccelerate(int speed);
	
	public boolean stopCar(boolean brakes);
	
	public void parked(boolean parkingBrake);
}
