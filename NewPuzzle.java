import java.util.*;
public class NewPuzzle {
	 NewPuzzle(char[][] game) throws Exception{
	   List<Character> list = new ArrayList<>();
	 list.add('A');
	 list.add('B');
	 list.add('C');
	 list.add('D');
	 list.add('E');
	 list.add('F');
	 list.add('G');
	 list.add('H');
	 list.add('I');
	 
	 
	 Collections.shuffle(list);
	 
	 System.out.println("Unsolved Puzzle:");
	 new GameBoard(game,list);
	 new PrintGame(game);
	 System.out.println();
	 
	 System.out.println("Swap the two index till value is in right order");
	 System.out.println("Welcome To Henry Puzzle Game");
	 System.out.println("Solve The Unsolved Puzzle");
	 Thread.sleep(1000);
	 System.out.println("Note: Enter Index From 0 to 8");
	Scanner sc = new Scanner(System.in);
		 System.out.println("Enter Player Name To Play Puzzle Game");
		 String scr = sc.next();
		 if(scr != null) {
			 System.out.println("Welcome Player "+scr);
		 }
	while(true) {
	System.out.println("Enter First Swap Value:");
	int swap1 = sc.nextInt();
	
	System.out.println("Enter Second Swap Value:");
	int swap2 = sc.nextInt();
	
	
	Collections.swap(list,swap1,swap2);
	new GameBoard(game,list);
	new CheckWins(game,scr,sc);
	new PrintGame(game);

	}
	}
}