package lsystems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class LLine {

	
	private static final String String = null;
	char line[];
	ArrayList<Character> values;
	Set<LRule> rules;
	private Map<Character, char[]> m;
	private Map<Integer, Character> m2;

	private static int steps;
	
	public LLine (char[] start, Set<LRule> rules) {
		steps = 0;
		this.rules = rules;
		this.line = start;
		m = new HashMap<>();
		m2 = new HashMap<>();
		values = new ArrayList<Character>();
		values.add(line[0]);		

		generateMapFromSet();
	}
	
	
	//the entire point of this shit method is to take the current sequence, check for rules
	//and replace with a new sequence based on the rules
	
	public void process() throws LSystemSymbolException, LSystemLengthException {
		int index;
		char temp;
		char [] tempAr;


			if (m.containsKey(m2.get(steps))) {
				
				//convert body array to characters
	
			
				
				if (values.contains(m2.get(steps))) {
					
				
				
					index = values.indexOf(m2.get(steps));
					temp = values.get(index);
				
					index = values.indexOf(temp);
					values.remove(values.indexOf(temp));
			
					for (Character b : m.get(m2.get(steps))) {
				
						values.add(index, b);
						index++;
				
	
					}
			
					line = listToArray(values);	
				
	
				}
		

			}
			steps++;
			if (steps == 3) {
				steps = 0;
			}

			
		
		}
	
	
	
	
	
	//generates a map based off the rules Set
	//where each key is the match and each body is the value
	
	private void generateMapFromSet () {
		int i = 0;
		for (LRule rule : rules) {

			m.put(rule.getMatch(), rule.getBody());
			m2.put(i, rule.getMatch());
			i++;
		}
	
	}
	
	private char[] listToArray(List<Character> list) {
		char[] newChars = new char[list.size()];
		for (int i = 0; i < list.size(); i++) {
			newChars[i] = list.get(i);
		}
		return newChars;
	}

	public String toString() {
		
		return new String(line);
	}
	
}
