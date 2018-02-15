package main;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println ("Enter First and Last Name: ");
		String first = input.next();
		String last = input.next();
	
		System.out.println ("Enter At Bats: ");
		double AB = input.nextDouble();
		
		System.out.println ("Enter Hits: ");
		double hits = input.nextDouble();
		
		System.out.println ("Enter Doubles: ");
		double doubles = input.nextDouble();
		
		System.out.println ("Enter Triples: ");
		double triples = input.nextDouble();
		
		System.out.println ("Enter Home Runs: ");
		double HR = input.nextDouble();
		
		System.out.println ("Enter Runs: ");
		double runs = input.nextDouble();
		
		System.out.println ("Enter Walks: ");
		double walks = input.nextDouble();
		
		System.out.println ("Enter Hits by Pitch: ");
		double HBP = input.nextDouble();
		
		System.out.println ("Enter Sacrifice Flys:" );
		double SF = input.nextDouble();
		
		double singles = (hits - doubles - triples - HR);
		
		double BA = hits / AB;

		double OBP = (hits + walks + HBP) / (AB + walks + HBP + SF);

		double SLG = (singles + (2 * doubles) + (3 * triples) + (4 * HR)) / AB;

		double OBS = OBP + SLG;
		
		double TB = (singles + (2 * doubles) + (3 * triples) + (4 * HR));

		
		System.out.println ("Batting Average: " + BA);
		System.out.println ("On Base Percentage: " + TB);
		System.out.println ("Slugging Percentage: " + SLG);
		System.out.println ("On Base + Slugging Percentage: " + OBS);
		System.out.println ("Total Bases: " + TB);
		
		
		
	}
}
