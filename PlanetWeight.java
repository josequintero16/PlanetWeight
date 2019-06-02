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
		//System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━\n");
		System.out.print("Entry: ");
		float myWeight = in.nextInt();
		in.nextLine();
		String choice;
		do{
		    System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━\n");
			System.out.println("OPTIONS");	        //Menu
			System.out.println("'Sun' to find out your weight on the sun");	
			System.out.println("'Mercury' to find out your weight on Mercury");
			System.out.println("'Venus' to find out your weight on Venus");
			System.out.println("'Moon' to find out your weight on the moon");
			System.out.println("'Mars' to find out your weight on Mars");
			System.out.println("'Jupiter' to find out your weight on Jupiter");
			System.out.println("'Saturn to find out your weight on Saturn");
			System.out.println("'Uranus' to find out your weight on Uranus");
			System.out.println("'Neptune' to find out your weight on Neptune");
			System.out.println("'Pluto' to find out your weight on Pluto");
			System.out.println("'q' or 'quit' to exit");
			System.out.println("'weight' to change your weight");
			System.out.println("'help' to show this message again");

			do{
				System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━\n");

				System.out.print("Entry: ");
				choice = in.nextLine();
                choice = choice.toLowerCase();

				System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━\n");
				if(choice.equals("sun")){
					System.out.printf("Your weight on the Sun: %17.2f lbs\n", myWeight * SUN);
				}
				else if(choice.equals("mercury")){
					System.out.printf("Your weight on Mercury: %17.2f lbs\n", myWeight * MERCURY);
				}
				else if(choice.equals("venus")){
					System.out.printf("Your weight on Venus: %19.2f lbs\n", myWeight * VENUS);
				}
				else if(choice.equals("moon")){
					System.out.printf("Your weight on the Moon: %16.2f lbs\n", myWeight * MOON);
				}
				else if(choice.equals("mars")){
					System.out.printf("Your weight on Mars: %20.2f lbs\n", myWeight * MARS);
				}
				else if(choice.equals("jupiter")){
					System.out.printf("Your weight on Jupiter: %17.2f lbs\n", myWeight * JUPITER);
				}
				else if(choice.equals("saturn")){
					System.out.printf("Your weight on Saturn: %18.2f lbs\n", myWeight * SATURN);
				}
				else if(choice.equals("uranus")){
					System.out.printf("Your weight on Uranus: %18.2f lbs\n", myWeight * URANUS);
				}
				else if(choice.equals("neptune")){
					System.out.printf("Your weight on Neptune: %17.2f lbs\n", myWeight * NEPTUNE);
				}
				else if(choice.equals("pluto")){
					System.out.printf("Your weight on Pluto: %19.2f lbs\n", myWeight * PLUTO);
				}
				else if(choice.equals("quit") || choice.equals("q")){
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
			}while(!choice.equals("weight") || !choice.equals("quit") || !choice.equals("q"));
		}while(choice.equals("help") || choice.equals("weight"));
		System.out.println("Now logging off...");
	}
}
