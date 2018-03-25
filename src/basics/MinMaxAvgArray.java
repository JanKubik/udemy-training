package basics;

import java.util.Arrays;

public class MinMaxAvgArray {

	public static void main(String[] args) {
		  
		
int[] values = {5, 17, 4, 7, 6, 9, 13, 17, 36};


		   
		   int maximum = Arrays.stream(values).max().getAsInt();
		   
	       int minimum = Arrays.stream(values).min().getAsInt();
	        
	       double average = Arrays.stream(values).average().getAsDouble();
	        
System.out.println("Min = " + minimum);
	        
System.out.println("Max = " + maximum);
	        
System.out.println("Avg = " + average);

//******************************************
	
 System.out.println("Average = " + average( values));	
	
	}
	




public static int minimum(int[] arr){
int min = arr[0];
	for(int i=1; i<arr.length; i++){
		if(arr[i]<min){min =arr[i];}
	}
	return min;
}


public static int maximum(int[] array){
int max = array[0];
	for(int i=1; i<array.length; i++){
		if(array[i]>max){max =array[i];}
	}
	return max;
}
//*********************************************
public static double average(int[] array){
	double sum=0;
	for (int i=0; i<array.length; i++){
		sum=sum+array[i];		
	}
	return (sum/array.length);
}

}