package lsystems;

public class B_A extends LRule{



	@Override
	public char getMatch () {
		
		
		return 'B';
	}
	
	
	@Override
	public char[] getBody () {
		char[] body = new char[] {'A'};
		
		
		return body;
	}
	
	
	
}
