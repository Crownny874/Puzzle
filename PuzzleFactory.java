import java.util.*;
public class PuzzleFactory {
	
	public static void main(String[] args) throws Exception {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 'startgame' to play game");
		String scz = sc.next();
		Factory(scz);
	}
public static void Factory(String scz) throws Exception {
	if(scz.equalsIgnoreCase("startgame")) {
		 new Puzzle();
		}
	 else {
		System.out.println("Invalid Input");
		}
	}
}