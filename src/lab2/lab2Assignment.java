package lab2;

public class lab2Assignment {

	public static void main(String[] args) {
	studentDB sdb1 = new studentDB("John", "12345688");		
	}
}

class studentDB implements Enrolment{
	private static int ID =1001;
	private String SSN;
	private String name;
	private String userID;
	private String eID;
	private static int balance =5000; 
	private String phone;
	private String city;
	private String state;
	
	//  **** constructor ********
public	studentDB(String name,String SSN){
	
	this.name = name;
	this.SSN = SSN;
	ID++;
	showCourses();
	setEID( name);
	setUserID();
	setCity();
	setPhone();
	setState();
	pay();
	System.out.println(toString());	
	}



	private void setEID(String name) {
	eID=(name+"@gmail.com");
	System.out.println(eID);
	
}
	

	private void setUserID() {
		int random = (int) (Math.random()*100);
		int length= SSN.length();
		String lastDig = SSN.substring(length-4, length);
		userID=(ID+""+random+lastDig);
				
	}
	
		
	public void showCourses(){
		System.out.println("***********************");
		System.out.println("**** C O U R S E S ****");
		System.out.println("***********************");
		System.out.println("*** Math ");
		System.out.println("*** Physics ");
		System.out.println("*** Material science ");
		System.out.println("*** Computer science ");
		System.out.println("***********************");
	}
	
	@Override
	public void setCity() {
		city=City;
	}

	@Override
	public void setPhone() {
		phone=Phone;
	}

	@Override
	public void setState() {
		state=State;
	}
	
	
	public String getPhone(){
		return phone;
	}
	
	public String getCity(){
		return city;
	}
	
	public String getState(){
		return state;
	}
	
	public int checkBalance(){
		return (balance);
	}
	
	@Override
	public void enrol() {
		System.out.println("enroled to "+course);		
	}
	
	@Override
	public void pay() {
		balance=(balance-cost);		
	}
	
		
	@Override
	public String toString(){
		return "[Name: " + name +"]\n[Ueser ID: " + userID +"]\n"+"[Course: " + course + "]\n"+"[Payed: "+"€"+ cost +"]\n" +"[Balance: "+ checkBalance() +"]\n"+"[Phone: "+ Phone +"]\n"+"[City: "+ getCity() +"]\n"+"[State: "+ State +"]\n";
	}



	

	
	
	
}