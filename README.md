# CECS-277-LAB-5-Lottery
CECS 277
LAB ASSIGNMENT 5
Assigned date: 10/7
Due date: 10/14
15 points

Writing a simple lottery program. The program should randomly generates a wining lottery ticket, them prompt the player to enter a lotto numbers. Depending on how many numbers match, the player wins various prizes.

Sample output

Type 6 lotto numbers: 4  12  7  35  20  1
Your ticket was: [ 4, 12, 7, 35, 20, 1]
Winning numbers: [ 2, 13, 27, 7, 11, 4]
Match numbers: [4,7]
Your prize is $500.00

Requirements: Inplement the following methods in your program

    public static Set<Integer> generateWinningNumbers( )
    Winning numbers should be between 1 and 40
    public static Set<Integer> getTicket( )
    Read the player's lottery ticket from the console
