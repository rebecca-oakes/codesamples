public class QAnew {

	public static void main(String[] args) {
		Results2 john, sam, daphne, jack;
		john = new Results2();
		sam = new Results2();
		daphne = new Results2();
		jack = new Results2();
		
		john.Marks(150, "phy");
		john.Marks(80, "che");
		john.Marks(69, "mat");
		john.Calculations();
		john.showResults();
				
		sam.Marks(45, "phy");
		sam.Marks(15, "che");
		sam.Marks(85, "mat");
		sam.Calculations();
		sam.showResults();
		
		daphne.Marks(85, "phy");
		daphne.Marks(121, "che");
		daphne.Marks(93, "mat");
		daphne.Calculations();
		daphne.showResults();
		
		jack.Marks(34, "phy");
		jack.Marks(60, "che");
		jack.Marks(45, "mat");
		jack.Calculations();
		jack.showResults();
	}

}
