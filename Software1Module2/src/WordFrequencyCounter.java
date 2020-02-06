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

		List<String> wordList = Arrays.asList(file.split(" "));
		
		Set<String> wordsSet = new HashSet<String>(wordList); 
		for (String words : wordsSet) {
			
			words = words.replaceAll("\\p{P}", "");
			words = words.replaceAll("[^a-zA-Z]\\s\\W", " ");
			words = words.toLowerCase();
			
		//	Collections.sort(wordList, Collections.reverseOrder());
			
		System.out.println(words + " - " + Collections.frequency(wordList, words));
		}
	}
}
