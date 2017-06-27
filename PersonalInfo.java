
public class PersonalInfo {
	ContactDetails cd;
	Exams e;
	Office o;
	
	
	public PersonalInfo() {
		cd = new ContactDetails("abc@gmail.com", 07741, "8 Rivendell Court", "NP19 0GP", "Newport");
		e = new Exams(85, 75, 82);
		o = new Office(01170, 14500, 2, "Government Buildings", "NP20 9HI", "Newport");
	}

}
