import java.util.*;

/**
 * Calculate Wavelength in a Closed Column.
 * @author Ryan Willimas
 */
public class WavelengthCalculator {

    //force = mass * acceleration
	// v = lamba*frequency
	// Ln = 2n-1/4*lambda
    public static void main(String[] args){
    	System.out.println("Please note: this will find lamba & frequency"
    						+ " for closed columns only");
        System.out.println("Another Note: all values are given assuming 1st Fundamental"
				+ " frequency  only.");
        Scanner input = new Scanner(System.in);
        double temperature;
        double length;
        double frequency;
        double velocity; 
        double wavelength;
        
        System.out.println("Please enter the temperature in Celsius:");
        temperature = input.nextDouble();
        System.out.println("Please enter the length of the column in meters:");
        length = input.nextDouble();
        
        // first find  lambda 
        // assume fundamental frequency first
        // L1=1/4*lambda
        
        wavelength = length * 4;
        
        System.out.printf("The wavelength is: %.2fm.\n", wavelength);
        
        // second find frequency but first need velocity
        
        velocity = 0.6*temperature + 332;
        
        System.out.printf("The velocity of sound is: %.2fm/s.\n", velocity);
        
        frequency = velocity / wavelength;
        
        System.out.printf("The frequency is: %.2fHz.\n", frequency);
        
        input.close();
    }
    
}
