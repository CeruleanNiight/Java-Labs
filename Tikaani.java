package com.ryan.tikaani;

import java.util.*;

public class Tikaani 
{
	public Integer[] values = new Integer[25]; // declares the array
	// of ascii values for each string
	public static Scanner input = new Scanner(System.in); // declares scanner
	
	/**
	 * Main method to call necessary methods
	 * and assign values.
	 * @param args
	 * @return null
	 */
	
	public static void main(String[] args)
	{
		System.out.println("Loading Version 1.0.0 (Alpha)");
		System.out.println("Written by Ryan.");
		System.out.println("Welcome to the Tikaani Secret Language\n"
							+ "translator."); // welcome message
		// initiates scanner
		//Scanner input = new Scanner(System.in);
		// range of ASCII is 97->121
		// ASCII value for a space is 32
		String sentence;
		do
		{
			do
			{
				System.out.println("Please enter the sentence [no symbols/nonALPHABETICAL"
						+ "letters allowed]:");
				sentence = input.nextLine();
				sentence = sentence.toLowerCase();
			} while (!stringCheck(sentence));
			System.out.println(stringGen(sentence)); // checks 
		} while (playAgain());
		input.close();
		System.out.println("Thank you for using the TIKAANI TRANSLATOR.");
	}
	
	/**
	 * Asks the user if they want to translate again!
	 * @return boolean
	 */
	
	public static boolean playAgain()
	{
		String choice;
		do
		{
			System.out.println("Would you like to translate again [y/n]:");
			choice = input.nextLine();
		} while (!stringCheck(choice.toLowerCase()));
		choice = choice.toLowerCase();
		boolean truth = choice.contentEquals("y") ? true : false;
		return truth;
	}
	
	/**
	 * This method validates whether a string is valid
	 * with only alphabetical characters (no symbols, etc.)
	 * by returning a boolean value.
	 * @param sentence
	 * @return boolean
	 */
	
	public static boolean stringCheck(String sentence)
	{
		boolean isValid = true;
		for (int i = 0; i < sentence.length(); i++) // runs a loop
			// for the boolean logic checker
		{
			char check = sentence.charAt(i);
			if (check == 32)
			{
				isValid = true;
			}
			else if ((check < 97) || (check > 122))
			{
				isValid = false;
				System.out.println("Invalid characters. "
						+ "Please try again using letters only.");
				break;
			}
		}
		return isValid;
	}
	
	/**
	 * This method will generate a string by creating an array
	 * and associating array indexes to the Matched Code Value
	 * by ASCII values.
	 * @param sentence
	 * @return String
	 */
	
	public static String stringGen(String sentence)
	{
		// Needed: expressions for all ASCII 97->121 & 32!
		Integer[] values = new Integer[sentence.length()];
		for (int i = 0; i < sentence.length(); i++)
		{
			char ascii = sentence.charAt(i);
			int asciiValue = (int) ascii;
			values[i] = asciiValue; // writes 
			// an array of ascii values which corresponds to
			// the values entered by the user
		}
		StringBuilder tikaani = new StringBuilder();
		for (int i = 0; i < sentence.length(); i++)
			// pseudo list of all character values in accordance
			// with secret tikaani alphabet
		{
			if (values[i] == 32)
			{
				tikaani.append(":SPACE: ");
			}
			if (values[i] == 97)
			{
				tikaani.append(":aTK: ");
			}
			if (values[i] == 98)
			{
				tikaani.append(":bTK: ");
			}
			if (values[i] == 99)
			{
				tikaani.append(":cTK: ");
			}
			if (values[i] == 100)
			{
				tikaani.append(":dTK: ");
			}
			if (values[i] == 101)
			{
				tikaani.append(":eTK: ");
			}
			if (values[i] == 102)
			{
				tikaani.append(":fTK: ");
			}
			if (values[i] == 103)
			{
				tikaani.append(":gTK: ");
			}
			if (values[i] == 104)
			{
				tikaani.append(":hTK: ");
			}
			if (values[i] == 105)
			{
				tikaani.append(":iTK: ");
			}
			if (values[i] == 106)
			{
				tikaani.append(":jTK: ");
			}
			if (values[i] == 107)
			{
				tikaani.append(":kTK: ");
			}
			if (values[i] == 108)
			{
				tikaani.append(":lTK: ");
			}
			if (values[i] == 109)
			{
				tikaani.append(":mTK: ");
			}
			if (values[i] == 110)
			{
				tikaani.append(":nTK: ");
			}
			if (values[i] == 111)
			{
				tikaani.append(":oTK: ");
			}
			if (values[i] == 112)
			{
				tikaani.append(":pTK: ");
			}
			if (values[i] == 113)
			{
				tikaani.append(":qTK: ");
			}
			if (values[i] == 114)
			{
				tikaani.append(":rTK: ");
			}
			if (values[i] == 115)
			{
				tikaani.append(":sTK: ");
			}
			if (values[i] == 116)
			{
				tikaani.append(":tTK: ");
			}
			if (values[i] == 117)
			{
				tikaani.append(":uTK: ");
			}
			if (values[i] == 118)
			{
				tikaani.append(":vTK: ");
			}
			if (values[i] == 119)
			{
				tikaani.append(":wTK: ");
			}
			if (values[i] == 120)
			{
				tikaani.append(":xTK: ");
			}
			if (values[i] == 121)
			{
				tikaani.append(":yTK: ");
			}
			if (values[i] == 122)
			{
				tikaani.append(":zTK: ");
			}
		}
		return tikaani.toString();
	}
}