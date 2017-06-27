
public class Exams {
	int phy;
	int mat;
	int che;
	int total;
	int percent;
	
	public Exams(int p, int m, int c){
		phy = p;
		mat = m;
		che = c;
	}
	
	public void setPhysics(int p){
		phy = p;
	}
	
	public void setMaths(int m){
		mat = m;
	}
	
	public void setChemistry(int c){
		che = c;
	}
	
	public int getPhysics(){
		return phy;
	}
	
	public int getMaths(){
		return mat;
	}
	
	public int getChemistry(){
		return che;
	}
	
	public int getTotal(){
		return total;
	}
	public int getPercentage(){
		return percent;
	}
	
	public void calculate(){
		total = phy + mat + che;
		percent = total * 100/450;
	}
	
	public void showResults(){
		System.out.println("Total: " + total);
		System.out.println("Percentage: " + percent + "%");
	}
}
