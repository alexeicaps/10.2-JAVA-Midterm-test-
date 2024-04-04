import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class WordFrequency {
    public static void main(String[] args){
    }

    public static void getWordFrequency(String filename) throws FileNotFoundException {
        File file = new File(filename);
        Scanner scanner = new Scanner(file);
        Map<String, Integer> wordFrequency = new HashMap<>();
        while (scanner.hasNext()){
            String word = scanner.next().toLowerCase();
            wordFrequency.put(word, wordFrequency.getOrDefault(word, 0) + 1);
        }

        for (Map.Entry<String, Integer> entry : wordFrequency.entrySet()){
            System.out.println("Слово: " + entry.getKey() + ", Частота: " + entry.getValue());
        }
        scanner.close();
    }
}
