public class Game {
	// Attributes
	private int computerGuess[];
	private int computerMatches[];
	private Player computerPlayer;
	
	private int humanGuess[];
	private int humanMatches[];
	private Player humanPlayer;
	
	private LevelFactory factory;
	private int replay;
	private int winner;
	
	// Operations
	private boolean checkResult( int a[], int b[]) {return false;}
	private void displayResults() {}
	private int[] getGuess( Player player ) {return null;}
	private void getSettings() {}
	private void notifyPlayer( Player player, int results[] ) {}
	private void reset() {}
	private int[] sendGuess( Player player, int guess[] ) {return null;}
	public static void main( String args[] ) {}
}
