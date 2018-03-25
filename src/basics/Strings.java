package basics;

public class Strings {

	public static void main(String[] args) {
	
		String bookTitle;
		String wordChoice = "Ring";
		
		bookTitle="the lord of the Rings";
				
	
		if (bookTitle.contains(wordChoice)){
			System.out.println("The book contains the word Ring "+ wordChoice);
			
		}
		
		String browser ="Chrome";
		if(browser.equalsIgnoreCase("chrome")){
		System.out.println("The browser is " + browser);	
		}
		
		String firstName = "Tim";
		String lastName = "Short";
		String SSN ="987654321";
		
		// Print the initials plus last 4 digits
		System.out.println(firstName.substring(1)); // from position to left - star with 0
		System.out.println(lastName.substring(0,1)); // from 0, 1 leter
		System.out.println(SSN.substring(5)); // from 5 to left
		
	}

}
