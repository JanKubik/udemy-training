package basics;

public class weather {

	public static void main(String[] args) {
		// this program will give sugestions of what to wear on wether condition(temperature)
		
		int temperature =65;
		
		if (temperature>80){
			System.out.println("It is pleasent. Wear shorts and t-shirts");
		}
		else if(temperature>60){
			System.out.println("It is a little bit cooler. wear jeans and long sleeve shitrt");
		}
		else {
			System.out.println("loks like a cold weather,wear sweater");
		}

	}

}
