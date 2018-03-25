package basics;

public class NumbersCalc {

	public static void main(String[] args) {
		
	System.out.println("prg is starting");	
	printName();
	int numA=10;
	int numB=20;
	addNumber(numA,numB);
	
	System.out.println("the product is:" + multipleNumbers(numA, numB));
	
	
		
	}

static void printName(){
	System.out.println("my name is Tim");
}
	
	
static void addNumber(int numberA, int numberB){
	int sum=numberA+numberB;
	System.out.println("The sum of numbers " + numberA + " and "+numberB+" is="+ sum);
}



static int multipleNumbers(int valueA, int valueB){
	int product=valueA*valueB;
	return product;
}



	

}
