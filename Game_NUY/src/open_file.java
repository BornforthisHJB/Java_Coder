/**
 * @ClassName: open_file
 * @Description: TODO
 * @Author: AndersonHJB
 * @date: 2022/11/12 15:19
 * @Version: V1.0
 * @Blog: https://bornforthis.cn
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class open_file {
    public static void main(String[] args) throws FileNotFoundException {

        Scanner scanner = new Scanner(new File("/Users/huangjiabao/GitHub/SourceCode/Java_Coder/Game_NUY/src/words_alpha.txt"));
        List<String> words = new ArrayList<>();

        while (scanner.hasNext()) {
            words.add(scanner.nextLine());
        }
//        System.out.println(words);
        Random rand = new Random();
        String word;
        word = words.get(rand.nextInt(words.size()));
        System.out.println(word);
    }
}