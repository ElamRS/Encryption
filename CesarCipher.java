package encryption;

public class CesarCipher {
	// An Array which contain the Latim Alphabet
	final static char alphabet[] = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i','j', 'k', 'l', 'm', 
            'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
		
		
	public static void main(String[] args) {
		System.out.println(cesarCipher("hello world".toCharArray(), 10));
	}
	
	
	// Method to apply the cesar cipher to a string vector (Letters only, no characters, and in lower case)
	public static char[] cesarCipher(char[] text, int key) {
		// For a given character of the text passed, it will be changed to the letter a key index to the right
		// Example: If the key == 3, then "Hello World" becomes "KHPPR ZRUPG".
		
		int index;
		
		for (int i=0; i<text.length; ++i) {
			if (text[i]!=' ') {
				index=returnIndex(text[i]);
				if (index+key<=26) {
					text[i] = alphabet[index + key];
				} else {
					text[i] = alphabet[key-(25-index)-1];
				}
			}
		}
		
		// Return the characters of the string encrypted
		return text;
	}
	
	// Method to check, given a character, it's corresponding index in the array alphabet
	public static int returnIndex(char c) {
		int index=-1; // Variable to hold the index to be returned | the -1 is only to the variable be initialized and be returned
		// For loop to determine this index
		for (int i=0; i<alphabet.length; ++i) {
			if (alphabet[i]==c) {index = i;}
		}
		return index;
	}
}

