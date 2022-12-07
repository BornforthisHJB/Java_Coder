import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

/**
 * @ClassName: Hangman_Tester
 * @Description: TODO
 * @Author: AndersonHJB
 * @date: 2022/11/13 20:31
 * @Version: V1.0
 * @Blog: https://bornforthis.cn
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Hangman_Tester {
    public static void main(String[] args) throws FileNotFoundException {

//        Scanner keyboard = new Scanner(System.in);
//        String players = keyboard.nextLine();

//        String word;
        Scanner scanner = new Scanner(new File("/Users/huangjiabao/GitHub/SourceCode/Java_Coder/Student_Coder/02malin/Coder3/src/words_alpha.txt"));
//        List<String> words = new ArrayList<>();
        System.out.println(scanner.hasNext());
        while (scanner.hasNext()) {
//            words.add(scanner.nextLine());
//            System.out.println(scanner.nextLine());
            System.out.println(scanner.next());
        }

//        Random rand = new Random();
//        word = words.get(rand.nextInt(words.size()));

    }
}