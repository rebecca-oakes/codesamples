
public class QA {

	public static void main(String[] args) {
		Results Penelope, Astrid;
		
		Penelope = new Results();
		Penelope.phy = 65;
		Penelope.che = 40;
		Penelope.mat = 89;
		Penelope.Calculations();
		Penelope.showResults();
		
		Astrid = new Results();
		Astrid.phy = 85;
		Astrid.che = 70;
		Astrid.mat = 43;
		Astrid.Calculations();
		Astrid.showResults();
	}

}
