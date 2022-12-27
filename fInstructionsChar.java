
public class fInstructionsChar {
	fInstructionsChar(char symbol) throws Exception {
if(symbol=='A'|symbol=='B'|symbol=='C'|symbol=='D'|symbol=='E'|symbol=='F'|symbol=='G'|symbol=='H'|symbol=='I') {
	
} else {
	throw new MyExceptions("Character "+symbol+" not found in [A-I] \nEnter Character From A to I");
	}
}
}