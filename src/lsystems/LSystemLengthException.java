package lsystems;

public class LSystemLengthException extends Exception {
	public LSystemLengthException () {
		super(getSymbol());
		
		
		}

		public static String getSymbol() {
			// TODO Auto-generated method stub
			
			return "The Sequence has no characters...";
		}

}


