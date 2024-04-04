import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LongestWord {
    public static void main(String[] args){
    }

    public static String getLongestWord(String filename) throws FileNotFoundException {
        File file = new File(filename);
        Scanner scanner = new Scanner(file);
        String longestWord = " ";

        while (scanner.hasNext()) {
            String word = scanner.next();
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }
        scanner.close();
        return ("Самое длинное слово в файле: " + longestWord);
    }
}
