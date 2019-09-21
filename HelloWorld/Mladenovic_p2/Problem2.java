
import java.util.Scanner;
public class Problem2 {

	public static void main(String[] args) {
		
		double weightKilograms = 0.0;
		double heightMeters = 0.0;
		double BMI = 0.0;
		float metricFormula = 1;
		float imperialFormula = 2; 
		double weightPounds = 0.0;
		double height = 0.0; 
		  
		
		Scanner input = new Scanner(System.in);
		  
		System.out.println("Choose a BMI formula:");
		
		System.out.println("1 = Metric:");
		System.out.println("2 = Imperial:");
		
		int choice = input.nextInt();
		  
		  
		 switch(choice) {
 	    case 1:
 	        if( metricFormula == 1){
 	        	
 	        	 System.out.print("Enter your weight in kilograms: ");
 	    		
 	    		weightKilograms = input.nextFloat();
 	    		
 	    		System.out.println("Enter your height in meters: ");
 	    		
 	    		heightMeters = input.nextFloat();
 	    		
 	    		BMI = ((weightKilograms) / (heightMeters * heightMeters));
 	    		
 	    		System.out.printf("Your BMI is: %f\n" , BMI );
 	    		
 	    		 System.out.println("Underweight = <18.5");
 	             System.out.println("Normal weight = 18.5–24.9 ");
 	             System.out.println("Overweight = 25–29.9");
 	             System.out.println("Obesity = BMI of 30 or greater \n");
 	    		
 	    		
 	    		 if (BMI < 18.5 ) {
	 	                System.out.println("You are Underweight!");
	 	            }

	 	            else if (BMI >= 18.5 && BMI < 25) {
	 	                System.out.println("You are normal!");
	 	            }

	 	            else if (BMI >= 25 && BMI < 30) {
	 	                System.out.println("You are overweight!");
	 	            }

	 	            else if (BMI >= 30) {
	 	                System.out.println("You are obese!");
 	    		
 	            
	 	            }
 	        	
 	        }
 	        
 	        
 	     case 2:
 	    	 if (imperialFormula ==2 ) {
 	    		 
 	    		 System.out.print("Enter your weight in pounds: ");
  	    		
 	    		weightPounds = input.nextFloat(); 
 	    		
 	    		 System.out.print("Enter your height in inches: ");
 	    	
 	    		 height = input.nextFloat();
 	    		
 	    		BMI = ((703 * weightPounds )/ ((height) * (height) ));
 	        
 	    		
 	    		System.out.printf("Your BMI is: %f\n" , BMI );
 	    		
 	    		System.out.println("");
 	    		
	    	
 	    		System.out.println("Underweight = <18.5");
	             System.out.println("Normal weight = 18.5–24.9 ");
	             System.out.println("Overweight = 25–29.9");
	             System.out.println("Obesity = BMI of 30 or greater \n");
			
	             if (BMI < 18.5 ) {
	 	                System.out.print("You are Underweight!");
	 	            }

	 	            else if (BMI >= 18.5 && BMI < 25) {
	 	                System.out.print("You are normal!");
	 	            }

	 	            else if (BMI >= 25 && BMI < 30) {
	 	                System.out.print("You are overweight!");
	 	            }

	 	            else if (BMI >= 30) {
	 	                System.out.print("You are obese!");

	 	               
	 	               input.close(); 
	 	                
 	    	 }
		
			
	
	         
          
            
		 }
 	    	
	}
	
	}
	  
}

