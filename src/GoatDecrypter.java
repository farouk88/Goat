
public class GoatDecrypter {
	
	private final String standardKeyword = "G.O.A.T";
	public String keyword;
	public String word;
	public String result;
	
	public GoatDecrypter(String word, String keyword) {
		this.word = word;
		this.keyword = keyword;
	}
	
	public GoatDecrypter(String word) {
		this.word = word;
		this.keyword = this.standardKeyword;
	}
	
	public void decrypt() {
		String decrypted = "";
		int keywordLength = keyword.length();
		int wordLength = word.length();
		int keywordIndex = 0;
		
		for(int i=0; i<wordLength; i++) {
			if(keywordIndex > keywordLength) {
				keywordIndex = 0;
			}
			
			decrypted += subtractAFromB(word.charAt(i), keyword.charAt(keywordIndex));
		}
		
		this.result = decrypted;
	}
	
	public char subtractAFromB(char a, char b) {
		int asciiA = a;
		int asciiB = b;
		int sum = asciiA - asciiB;
		
		if(sum < 32) {
			return (char) (sum+95);
		} else {
			return (char) (sum);
		}
		
	}
	
}
