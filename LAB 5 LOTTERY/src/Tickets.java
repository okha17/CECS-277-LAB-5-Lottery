import java.util.Scanner;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class Tickets 
{
	private static SortedSet<Integer> myTicket;
	private static Set<Integer> winTicket;
	private static Scanner in; 
	
	Tickets() 
	{
		myTicket = new TreeSet<Integer>();
		winTicket = new TreeSet<Integer>();
		in =  new Scanner(System.in);
	}
	
	public static Set<Integer> generateWinningNumbers() 
	{
		for(int i = 0; i < 6; i++) 
		{
			int value = random(1,40);
			winTicket.add(value);
		}
		return winTicket;
	}
	
	public static Set<Integer> getTicket() 
	{
		System.out.println("Welcome to the Lottery Program!");
		System.out.println("Type 6 unique lotto numbers: ");
		int i = 0;
		while(i < 6) {
			int value = in.nextInt();
			if(value <= 40 && value >= 1) 
			{
				if(myTicket.contains(value))
				{
					System.out.println("Please enter a unique amount:");
				}
				else 
				{
				myTicket.add(value);
				++i;
				}
			}
			else 
			{
				System.out.println("Incorrect number picked:");
			}
			
		}
		return myTicket;	
	}
	
	public static int random(int min, int max)
	{
	   int range = (max - min) + 1;     
	   return (int)(Math.random() * range) + min;
	}
	
	public void display() 
	{
		System.out.println("Your ticket was: " + myTicket);
		System.out.println("Winning numbers: " + winTicket);			
	}
	
	public static void comp() 
	{
		myTicket.retainAll(winTicket);
		System.out.println("Matching Numbers: " + myTicket);
	}
	
	public static void winnings() 
	{
		if (myTicket.isEmpty()) 
		{
			System.out.println("No matching numbers" + "\n" + "Have a good day!");
		}
		
		else
		{
			double value = 100.0;
			
			System.out.println("Your prize is: " + "$" + value * myTicket.size()  + "\n" + "Congrats!");
		}
	}
	
}
