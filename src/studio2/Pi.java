package studio2;

import java.util.Scanner;

public class Pi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("How many darts should be thrown?");
		int dartsNum = in.nextInt();
		int count = 0;
		double avgXCoord = 0;
		double avgYCoord = 0;
		
		// DART
		while (count < dartsNum) {
		double xCoord = Math.random();
		avgXCoord += xCoord;
		double yCoord = Math.random();
		avgYCoord += yCoord;
		count++;
		System.out.println("Coordinates: (" + xCoord + ", " + yCoord + ")");
		}
		
		avgXCoord = avgXCoord/dartsNum;
		System.out.println(avgXCoord);
		avgYCoord = avgYCoord/dartsNum;
		System.out.println(avgYCoord);
		double radius = Math.sqrt(Math.pow(avgXCoord, 2) + Math.pow(avgYCoord, 2));
		System.out.println(radius);
	}

}
