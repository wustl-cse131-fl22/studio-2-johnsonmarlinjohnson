package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
	// VARIABLES
 
		System.out.println("What amount of money do you start with?");
		double startAmount = in.nextDouble();
		System.out.println("What is the win probability?");
		double winChance = in.nextDouble();
		System.out.println("What is the win limit?");
		double winLimit = in.nextDouble();
		System.out.println("How many days should be simulated?");
		int totalSimulations = in.nextInt();
		int loseCount = 0;
	
	// LOOP
		
		for (int x = 0; x < totalSimulations; x++)
		{
			int count = 0;
			double money = startAmount;
			while (money > 0 && money < winLimit)
			{
				double game = Math.random();
				if (game > winChance)
				{
					money--;
					count++;
				}
				else
				{
					money++;
					count++;
				}
		
			}
			System.out.print("Simulation " + (x + 1)  + ": ");
			System.out.print(count);
			if (money == 0)
			{
				System.out.println(" Lose");
				loseCount++;
				
			}
			else 
			{
				System.out.println(" Win");
			}
		}
		System.out.print("Losses: " + loseCount);
		System.out.println(" Simulations: " + totalSimulations);
		double ruinRate = ((double)loseCount/totalSimulations);
		System.out.print("Ruin Rate from Simulation: " + ruinRate);
		double expectedRuin;
		if (winChance == .5)
		{
			expectedRuin = (1 - ((double)startAmount/winLimit));
			System.out.print(" Expected Ruin Rate: " + expectedRuin);
		}
		else 
		{
			double a = (1 - winChance)/(winChance);
			expectedRuin = ((Math.pow(a, startAmount)) - (Math.pow(a, winLimit)) / (1 - Math.pow(a, winLimit)));
			System.out.print(" Expected Ruin Rate: " + expectedRuin);
		}
		
	}

}
