

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

	 
	public MorseCharacter(List<CypherSymbol> morseSymbol) {
	
		this.morseSymbol = morseSymbol;
		this.character = matchMorseSymbol(morseSymbol);
		
	}
	
	private char matchMorseSymbol( List<CypherSymbol> morseSymbol) {
		char res = ' ';
		MorseAlphabet mAlpha = new MorseAlphabet();
		for(MorseCharacter mChar : mAlpha.getMorseAlphabet()) {
			if (mChar.equals(this )) 
				res = mChar.character;
		}
		
		return res;
	}

	
	public boolean equals(MorseCharacter other) {
		/* If two MorseCharacters have the same morseSymbol size and 
		 * each of their morseSymbols is equal, the MorseCharacters are equal.
		 */
		
		if (this.getMorseSymbol().size() == other.getMorseSymbol().size()) {
			int size = this.getMorseSymbol().size();
			for(int i = 0; i < size; i++) {
				if ( !this.getMorseSymbol().get(i).toString().equals(other.getMorseSymbol().get(i).toString()) ){
					return false;
				}
			}
			return true;
		}
		else		// Unfortunately, the equals method is still completely missing.
			return false;
	}



}

