class GoatCrypter{
	private final String standardKeyword = "G.O.A.T";
	public String keyword;
	public String word;
	public String result;
	
	public GoatCrypter(String word, String keyword) {
		this.word = word;
		this.keyword = keyword;
	}
	
	public GoatCrypter(String word) {
		this.word = word;
		this.keyword = this.standardKeyword;
	}
	
	public void crypt() {
		String crypted = "";
		int keywordLength = keyword.length();
		int wordLength = word.length();
		int keywordIndex = 0;
		
		for(int i=0; i<wordLength; i++) {
			if(keywordIndex > keywordLength) {
				keywordIndex = 0;
			}
			crypted += addAtoB(word.charAt(i), keyword.charAt(keywordIndex));
		}
		
		this.result = crypted;
	}
	
	public char addAtoB(char a, char b) {
		int asciiA = a;
		int asciiB = b;
		int sum = asciiA + asciiB;
		
		if(sum > 126) {
			return (char) (sum-95);
		} else {
			return (char) sum;
		}
	}
	
	public static void main(String[] args) {
		GoatCrypter word1 = new GoatCrypter("Farouk");
		word1.crypt();
		System.out.println(word1.result);
	}
}