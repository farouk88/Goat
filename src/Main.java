
public class Main {
	public static void main(String[] args) {
		GoatCrypter word1 = new GoatCrypter("fekihfarouk88@gmail.com");
		word1.crypt();
		System.out.println(word1.result);
		
		GoatDecrypter word2 = new GoatDecrypter("NMSQPNIZW]S  (OUIQTuKWU");
		word2.decrypt();
		System.out.println(word2.result);
	}
}
