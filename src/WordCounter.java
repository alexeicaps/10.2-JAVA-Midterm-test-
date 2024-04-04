import java.io.*;
import java.util.Scanner;

public class WordCounter {
    public static void main(String[] args){
    }

    public static String getWordCount(String filename) throws FileNotFoundException{
        File file = new File(filename);
        Scanner scanner = new Scanner(file);
        int countWords = 0;

        while (scanner.hasNext()) {
            String[] array = scanner.nextLine().split(" ");
            countWords += array.length;
        }
        scanner.close();
        return ("Количество слов в файле: " + countWords);
    }
}
