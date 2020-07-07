

public class Main {
	public static void main (String args[]) 
	{
		Tickets tick = new Tickets();
		Tickets.getTicket();
		Tickets.generateWinningNumbers();
		tick.display();
		Tickets.comp();
		Tickets.winnings();
	}

}
