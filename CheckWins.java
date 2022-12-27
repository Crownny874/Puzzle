import java.util.*;
public class CheckWins {
	 CheckWins(char[][] game,String name,Scanner sc) throws Exception {
	 
    if(game[0][0]=='A'&game[0][3]=='B'&game[0][6]=='C'&game[1][0]=='D'&game[1][3]=='E'&game[1][6]=='F'&game[2][0]=='G'&game[2][3]=='H'&game[2][6]=='I') {
	System.out.println("Player "+name+" cracked the puzzle");
	System.out.println("Congratulations!,You Won!!");
		Thread.sleep(1000);
	System.out.println("Solved Puzzle:");
	new PrintGame(game);
	sc.nextLine();
	System.out.println("Game Ends!");
	if(sc.hasNext()) {
	sc.close();
	}
	}
}
}