/**
This program calculates a users weight on different bodies of mass in the solar system.
*/

import java.util.Scanner;

public class PlanetWeight{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);

		final double SUN = 27.9;                        //Planet gravity constants
		final double MERCURY = 0.377;//make a list instead...
		final double VENUS = 0.904;
		final double MOON = 0.165;
		final double MARS = 0.378;
		final double JUPITER = 2.528;
		final double SATURN = 1.065;
		final double URANUS = 0.904;
		final double NEPTUNE = 1.137;
		final double PLUTO = 0.063;
		System.out.println(" · * ⏺   ☆˳̽ ʘ      ·    ☆ ˳̽   *    ⃝ ·   ˳̽  ·☆  `  * ` ⏺");
		System.out.println("   ·  ` *  · ·  ☆      *      ` ʘ  ·    · ⏺  *  ˳̽·    *");
		System.out.println("☆     `╔══════════════════════════════════════╗  ˳̽    ·");	
		System.out.println(" `  ·  ╟──────!!WELCOME TO PLANET ZONE!!──────╢☆    ʘ  ");	
		System.out.println(".   ˳̽  ╚══════════════════════════════════════╝˳̽   ·   ");	
		System.out.println("  ☆  ·⃝   ˳̽      *  ·    ☆   ` ·  ·  ☆    ʘ ·    * .   `");
		System.out.println("*  ʘ   `   ˳̽ ·  ☆ ʘ    ·   .    *    ⏺`   ˳̽    ☆   · ⃝* ");

		System.out.println("Lets get started....");
		System.out.println("Enter your weight in lbs");
		System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━\n");
		System.out.print("Entry: ");
		float myWeight = in.nextInt();
		in.nextLine();
		String choice;
		do{
		    System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━\n");
			System.out.println("OPTIONS");	        //Menu
			System.out.println("'1' to find out your weight on the sun");	
			System.out.println("'2' to find out your weight on Mercury");
			System.out.println("'3' to find out your weight on Venus");
			System.out.println("'4' to find out your weight on the moon");
			System.out.println("'5' to find out your weight on Mars");
			System.out.println("'6' to find out your weight on Jupiter");
			System.out.println("'7' to find out your weight on Saturn");
			System.out.println("'8' to find out your weight on Uranus");
			System.out.println("'9' to find out your weight on Neptune");
			System.out.println("'10' to find out your weight on Pluto");
			System.out.println("'0' to quit");
			System.out.println("'weight' to change your weight");
			System.out.println("'help' to show this message again");

			do{
				System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━\n");

				System.out.print("Entry: ");
				choice = in.nextLine();

				System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━\n");
				if(choice.equals("1")){
					System.out.println("Your weight on the Sun is " + myWeight * SUN + " lbs");
				}
				else if(choice.equals("2")){
					System.out.println("Your weight on Mercury is " + myWeight * MERCURY + " lbs");
				}
				else if(choice.equals("3")){
					System.out.println("Your weight on Venus is " + myWeight * VENUS + " lbs");
				}
				else if(choice.equals("4")){
					System.out.println("Your weight on the Moon is " + myWeight * MOON + " lbs");
				}
				else if(choice.equals("5")){
					System.out.println("Your weight on Mars is " + myWeight * MARS + " lbs");
				}
				else if(choice.equals("6")){
					System.out.println("Your weight on Jupiter is " + myWeight * JUPITER + " lbs");
				}
				else if(choice.equals("7")){
					System.out.println("Your weight on Saturn is " + myWeight * SATURN + " lbs");
				}
				else if(choice.equals("8")){
					System.out.println("Your weight on Uranus is " + myWeight * URANUS + " lbs");
				}
				else if(choice.equals("9")){
					System.out.println("Your weight on Neptune is " + myWeight * NEPTUNE + " lbs");
				}
				else if(choice.equals("10")){
					System.out.println("Your weight on Pluto is " + myWeight * PLUTO + " lbs");
				}
				else if(choice.equals("0")){
					break;
				}
				else if(choice.equals("weight")){
					System.out.println("Enter your new weight");
				    System.out.print("Entry: ");
                    myWeight = in.nextInt();
		            in.nextLine();
                    break;
				}
				else if(choice.equals("help")){
					break;
				}
				else{
					System.err.println("Please enter valid option!!");
				}
			}while(!choice.equals("0") || !choice.equals("weight"));
		}while(choice.equals("help") || choice.equals("weight"));
		System.out.println("Now logging off...");
	}
}
