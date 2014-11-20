public abstract class Player {
	// Attributes
	private int answer[];
	private int correctGuesses[];
	
	// Operations
	public int[] checkMatches( int arr[] ) {return null;}
	public int[] guess() {return null;}
	public void setCode( int code[] ) {}
}

class ComputerPlayer extends Player {
	// Attributes
	private Intellect strategy;
	
	// Operations
	public void setIntellect( Intellect strategy ) {}
	public int[] guess() {return null;}
}

class HumanPlayer extends Player {
	// Operations
	public int[] getInput() {return null;}
}
