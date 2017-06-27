
public class Results {

	int phy, che, mat;
	float total, percent;
	
	public void Calculations() {
		total = phy + che + mat;
		percent = total * 100/450;
	}
	
	public void showResults() {
		System.out.println("Total Score: " + total);
		System.out.println("Percentage: " + percent);
	}
}
