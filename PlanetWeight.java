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
		double myWeight = in.nextDouble();
		//in.nextLine();
		double constant = 0;
		String choice, body = "";
		boolean error = false;
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
				error = false;
				System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━\n");

				System.out.print("Entry: ");
				choice = in.next();
                choice = choice.toLowerCase();

				System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━\n");
				if(choice.equals("sun")){
					body = "the Sun";
					constant = SUN;
				}
				else if(choice.equals("mercury")){
					body = "Mercury";
					constant = MERCURY;
				}
				else if(choice.equals("venus")){
					body = "Venus";
					constant = VENUS;
				}
				else if(choice.equals("moon")){
					body = "the Moon";
					constant = MOON;
				}
				else if(choice.equals("mars")){
					body = "Mars";
					constant = MARS;
				}
				else if(choice.equals("jupiter")){
					body = "Jupiter";
					constant = JUPITER;
				}
				else if(choice.equals("saturn")){
					body = "Saturn";
					constant = SATURN;
				}
				else if(choice.equals("uranus")){
					body = "Uranus";
					constant = URANUS;
				}
				else if(choice.equals("neptune")){
					body = "Neptune";
					constant = NEPTUNE;
				}
				else if(choice.equals("pluto")){
					body = "the Sun";
					constant = PLUTO;
				}
				else if(choice.equals("quit") || choice.equals("q")){
					break;
				}
				else if(choice.equals("weight")){
					System.out.println("Enter your new weight");
				    System.out.print("Entry: ");
                    myWeight = in.nextFloat();
		            //in.nextLine();
                    break;
				}
				else if(choice.equals("help")){
					break;
				}
				else{
					System.err.println("Please enter valid option!!");
					error = true;
				}
				if(error == false)
				System.out.printf("Your weight on " + body + ":  %16.2f lbs\n", myWeight * constant);

			}while(!choice.equals("weight") || !choice.equals("quit") || !choice.equals("q"));
		}while(choice.equals("help") || choice.equals("weight"));
		System.out.println("Now logging off...");
	}
}
