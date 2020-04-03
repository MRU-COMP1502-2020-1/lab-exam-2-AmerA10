package lsystems;

public class LSystemSymbolException extends Exception {
	public LSystemSymbolException() {
		
		super(getSymbol());
		
		
	}

	public static String getSymbol() {
		// TODO Auto-generated method stub
		
		return "A Symbol exists within the sequence with no rule...";
	}

}
