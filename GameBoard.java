import java.util.*;
public class GameBoard {
	 GameBoard(char[][] games, List<Character> list) {
	  if(games[0][0] != -1) {
	char a = list.get(0);
	    games[0][0] = a;
}
	if(games[0][3] != -1) {
	char a = list.get(1);
	    games[0][3] = a;
}
	if(games[0][6] != -1) {
	char a = list.get(2);
	    games[0][6] = a;
}
	if(games[1][0] != -1) {
	char a = list.get(3);
	    games[1][0] = a;
}
 	if(games[1][3] != -1) {
	char a = list.get(4);
	games[1][3] = a;
}
    if(games[1][6] != -1) {
	char a = list.get(5);
	games[1][6] = a;
}
    if(games[2][0] != -1) {
	char a = list.get(6);
	games[2][0] = a;
}
    if(games[2][3] != -1) {
	char a = list.get(7);
	games[2][3] = a;
}
    if(games[2][6] != -1) {
	char a = list.get(8);
	games[2][6] = a;
}
}
	}
