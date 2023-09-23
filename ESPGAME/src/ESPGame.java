/*
 * Class: CMSC203 
 * Instructor: Gary Thai
 * Description: ESP Game that prompts users to guess colors over 10 rounds. Tells user how many guesses out of 10 are correct. Validates that a correct color was input.
 * Due: 09/22/2023
 * Platform/compiler: JAVA
 * I pledge that I have completed the programming assignment 
* independently. I have not copied the code from a student or   * any source. I have not given my code to any student.
 * Print your Name here:Liam
*/


import java.util.Scanner;

public class ESPGame {
	static boolean Cond_met = true;
	public static void main(String[] args) {
		 int total_guess = 0;
		 int good_guess = 0;
		 int bad_guess = 0;
		 int round =1;
		 String random_color = "";
		 String picked_color = "";
		 
		 Scanner namein = new Scanner(System.in); // user inputs name

	     System.out.print("Enter your name: ");
	     String name = namein.nextLine();
	     
	     Scanner descriptionin = new Scanner(System.in); // user inputs description

	     System.out.print("Describe yourself: ");
	     String description = descriptionin.nextLine();
	     
	     Scanner duedatein = new Scanner(System.in); // user inputs due date

	     System.out.print("Due date: ");
	     String duedate = duedatein.nextLine();
		 		 
		 System.out.println("CMSC203 Assignment1: Test your ESP skills!\n");
		 System.out.println("I am thinking of a color. \n"
		 		+ "Is it red, yellow, orange, green or blue?\n");
		 		 
		 Scanner typein = new Scanner(System.in); // scanner for color entry

		 while (total_guess <10) {  // while guesses are less than 10, rounds continue (loop)
			  if (Cond_met == true) {
				  
					 int randomNum = ((int)(Math.random() * 5)+0); // random number for color picking from 0-5. Each number relates to one color.
					 
					 if (randomNum == 0) {
						 random_color = "red";}
					 else if (randomNum == 1) {
						 random_color = "blue";}
					 else if (randomNum == 2) {
						 random_color = "green";}
					 else if (randomNum == 3) {
						 random_color = "yellow";}
					 else if (randomNum == 4) {
						 random_color = "orange";}			 
			  		}
			  
			  System.out.println("Enter your guess: ");
			  picked_color = typein.nextLine();
			  
			  if (picked_color.equalsIgnoreCase(random_color)) {  // if color input equals random color....
				  System.out.print("Good guess! I was thinking of " // if color input equals random color.... output message
				  + random_color + ".\n");
				  
				  total_guess +=1; // increment these values
				  good_guess +=1;
				  round ++;
				  
				  if (round<=10) {
				  System.out.print("\nRound " + round + "\n\n");
				  }
			  }
			  
			  else if(picked_color.equalsIgnoreCase("green") || // if color input equals valid color.... similar to  before.
					  picked_color.equalsIgnoreCase("yellow") ||
					  picked_color.equalsIgnoreCase("blue") ||
					  picked_color.equalsIgnoreCase("red") ||
					  picked_color.equalsIgnoreCase("orange"))
			  {
				  
				  System.out.print("Nope! I was thinking of " + random_color + ".\n");
				  total_guess +=1;
				  bad_guess += 1;
				  round ++;
				  if (round<=10) {
					  System.out.print("\nRound " + round + "\n\n");
					  }
				  
			  }
			  else {
				  System.out.print("Not a valid color. Please try again!\n");
			  }}
			  
			System.out.println("\nYou guessed " + good_guess + " out of 10 colors correctly\n");
			System.out.println("User name: " + name + "\n");
			System.out.println("User description: " + description + "\n");
			System.out.println("Due date: " + duedate + "\n");


			


}}
