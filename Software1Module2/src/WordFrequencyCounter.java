import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashSet;
import java.util.*;

public class WordFrequencyCounter {

	public static void main(String[] args) throws Exception {
		String file = "";
		
		try {
			file = new String (Files.readAllBytes(Paths.get("MacbethText.txt")));
		} catch (IOException e) {
			e.printStackTrace();
		}

			file = file.toLowerCase();
			List<String> wordList = Arrays.asList(file.split("(?<!\\w)'|[\\s,.?\"!][\\s,.?\"'!]*|;|:|- |]|\\[|--"));
	
		Set<String> wordsSet = new HashSet<String>(wordList); 
		for (String words : wordsSet) {
			
			//Collections.sort(wordList, Collections.reverseOrder());
		System.out.println(words + " - " + Collections.frequency(wordList, words));
		}
	}
}
