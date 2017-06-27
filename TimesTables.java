
public class TimesTables {

	public void createTable(int table, int range){
		System.out.println("Times Tables for " + table + " for the range of " + range);
		for(int r = 1; r <= range; r++){
			System.out.println(table + "*" + r + "=" + table * r);
		}
	}
	
}
