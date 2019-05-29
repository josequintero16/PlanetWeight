import java.util.Scanner;

public class PlanetWeight{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);

		final double SUN = 27.9;
		final double MERCURY = 0.377;
		final double VENUS = 0.904;
		final double MOON = 0.165;
		final double MARS = 0.378;
		final double JUPITER = 2.528;
		final double SATURN = 1.065;
		final double URANUS = 0.904;
		final double NEPTUNE = 1.137;
		final double PLUTO = 0.063;

		System.out.println("Enter your weight in lbs");
		float myWeight = in.nextInt();

		System.out.println("Your weight is " + myWeight);	
	}
}
