import java.util.*;
public class Puzzle {
	
	Puzzle() throws Exception {
	
			char[][] game = 
			                {{'_','_','|','_','_','|','_','_'},
				       {'_','_','|','_','_','|','_','_'},
				       {'_','_','|','_','_','|','_','_'}};
	      
		    char[][] game1 = 
			               {{'_','_','|','_','_','|','_','_'},
				{'_','_','|','_','_','|','_','_'},
				{'_','_','|','_','_','|','_','_'}};
			
		System.out.println("Unsolved Puzzle:");   
			
		System.out.println("Welcome To Henry Puzzle Game");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter: \n1.For TrickMode \n2.For PuzzleMode");
		int num = sc.nextInt();
		if(num == 1) {
		new TrickMode(game1);
		}
		else if(num == 2) {
		new NewPuzzle(game);
		}
		else if(num >= 3) {
		 throw new MyExceptions("Input Number 1, 2");
		}
  }
	}

