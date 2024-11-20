class GoatCrypter{
	private final String standardKeyword = "6543r2@2391-d,,,.^^";
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
	
	public static void main(String[] args) {
		GoatCrypter word1 = new GoatCrypter("FaroukFekih21wd341@-d.saD3/^^");
		word1.crypt();
		System.out.println(word1.result);
		
		GoatCrypter word2 = new GoatCrypter("|8IFLB|<B@?hgN;ijgvc;dJ8zie55");
		word2.decrypt();
		System.out.println(word2.result);
	}
}