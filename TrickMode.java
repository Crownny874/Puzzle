import java.util.*;
public class TrickMode {
	
	 
  TrickMode(char[][] game1) throws Exception {
	
		
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
	
    System.out.println("Welcome To Henry Puzzle Game. \nArrange Puzzle Characters In The Right Order\nBy setting characters at an index till they are in right order"); 
	        Scanner sc = new Scanner(System.in);
			new GameBoard(game1,list);
			new PrintGame(game1);
			System.out.println("Enter Player Name To Play Puzzle Game");
			String scr = sc.next();
			if(scr != null) {
				System.out.println("Welcome Player "+scr);
			}
			while(true) {
			System.out.println("Enter Character From [A-I]:");
			char symbol = sc.next().charAt(0);
			System.out.println("Enter Index From[0-8]:");
			int index = sc.nextInt();
             
			new fInstructionsIndex(index);
			new fInstructionsChar(symbol);
			new finalGameBoard(game1,index,symbol);
			new CheckWins(game1,scr,sc);
			new PrintGame(game1);		
       }
	    }
	  }