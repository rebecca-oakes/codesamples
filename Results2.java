
public class Results2 {

	private int phy, che, mat;
	private int fails = 0;
	private String failed;
	private float total, percent;
	
	public void Marks(int mark, String classcode){		
		if(mark <= 150 && mark >= 0){
			if (classcode == "phy"){
				phy = mark;
				if (phy < 70){
					fails++;
					if (fails == 1)
						failed = "physics";
					if (fails == 2 && failed == "chemistry")
						failed = "science";
					else if (fails == 2 && failed == "maths")
						failed  = "mathematical science";
				}
			}
			else if (classcode == "che"){
				che = mark;
				if (che < 70){
					fails++;
					if (fails == 1)
						failed = "chemistry";
					if (fails == 2 && failed == "physics")
						failed = "science";
					else if (fails == 2 && failed == "maths")
						failed  = "mathematical science";
				}
			}
			else if (classcode == "mat"){
				mat = mark;
				if (mat < 70){
					fails++;
					if (fails == 1)
						failed = "maths";
					if (fails == 2 && failed == "chemistry")
						failed = "mathematical science";
					else if (fails == 2 && failed == "physics")
						failed  = "mathematical science";
				}	
			}
			else
				System.out.println("Invalid classcode given");
		}
		else {
			System.out.println("Invalid mark value given.");
		}
	}
	
	public void showMarks(String classcode){
		if(classcode == "phy" || classcode == "che"  || classcode == "mat")
			if (classcode == "phy")
				System.out.println("The mark for this student in physics is " + phy);
			else if (classcode == "che")
				System.out.println("The mark for this student in chemistry is " + che);
			else 
				System.out.println("The mark for this student in maths is " + mat);
		else
			System.out.println("Invalid class code given.");
	}
	
	public void Calculations() {
			total = phy + che + mat;
			percent = total * 100/450;
	}
	
	public void showResults() {		
		if(fails == 0){
			System.out.println("Total Score: " + total);
			System.out.println("Percentage: " + percent);
		}
		else if (fails == 1)
			System.out.println("You need to retake the " + failed + " exam.");
		else if (fails == 2)
			System.out.println("You need to retake the " + failed + " course.");
		else if (fails == 3)
			System.out.println("Just go home...");
	}
}
