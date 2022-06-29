package dailyAPR2APY;
import java.util.Scanner;

public class DailyAPR2APY {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		Scanner sc = new Scanner(System.in);  // Create a Scanner object
		
		// Ask for starting capital
		System.out.println("Enter starting investment.");
		String s = sc.nextLine();
		double startInvestment = Double.parseDouble(s);
		
		// Ask for APR 
	    System.out.println("Enter daily multiplier.");
	    String dailyapr = sc.nextLine();  // Read user input
	    //System.out.println("You entered: " + dailyapr);  // Output user input
	    
	    // Calculate APY
//	    System.out.println("Calculating APY...");
	    double resValue = calculateAPY(dailyapr);
//	    System.out.println("Return is " + resValue + "%");
	    
	    // Calculate Return
	    double finalInvest = startInvestment*resValue;
	    System.out.println("The result is " + finalInvest);
	    
	    // Verify this (longer)
	    double val = startInvestment;
	    for(int i = 0; i < 365; i++) {
	    	val*=1.015;
	    }
		System.out.println("Verify: " + val);
	}
	
	public static double calculateAPY(String a) {
		double b = Double.parseDouble(a);
//		System.out.println(b);
		
		double apy = Math.pow(b, 365);
//		System.out.println(apy);
	    
	    // return value
	    return apy;
	}

}
