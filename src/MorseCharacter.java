

import java.util.List;


public class MorseCharacter {
	/* A MorseCharacter consists of multiple concatenated CypherSymbols. 
	 * It further contains a human readable character that is reflected by the CypherSymbols
	 * (the translation of the code).
	 */
	private List<CypherSymbol> morseSymbol;
	private char character;
	
	// Constructors and getters are still missing here.

	public char getCharacter() {
		return character;
	}

	public List<CypherSymbol> getMorseSymbol() {
		return morseSymbol;
	}

	public MorseCharacter(char c, List<CypherSymbol> asList) {
		// TODO Auto-generated constructor stub
		this.character = c;
		this.morseSymbol = asList;
	}

	public boolean equals(MorseCharacter other) {
		/* If two MorseCharacters have the same morseSymbol size and 
		 * each of their morseSymbols is equal, the MorseCharacters are equal.
		 */
		if (this.getMorseSymbol().size() == other.getMorseSymbol().size()) {
			int size = this.getMorseSymbol().size();
			for(int i = 0; i < size; i++) {
				if (this.getMorseSymbol().get(i) != other.getMorseSymbol().get(i)){
					return false;
				}
			}
			return true;
		}
		else		// Unfortunately, the equals method is still completely missing.
			return false;
	}



}

