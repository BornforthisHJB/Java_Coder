/**
 * @ClassName: HangMan
 * @Description: TODO
 * @Author: AndersonHJB
 * @date: 2022/11/12 23:34
 * @Version: V1.0
 * @Blog: https://bornforthis.cn
 */

import java.io.File;
//import java.io.FileNotFoundException;
import java.io.IOException;
//import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class HangMan {
        private static String[] words_array = {"cat1", "dog1", "bird1", "mouse1", "lion1", "wolf1", "panda1", "bear1", "turtle1", "fish1"};
//    private static String[] words_array = {"cat", "dog", "bird", "mouse", "lion", "wolf", "panda", "bear", "turtle", "fish"};
    private static int random_num = (int) (Math.random() * words_array.length);
    private static String random_word = words_array[random_num];
    private static int random_word_length = random_word.length();
    private static String underline = new String(new char[random_word_length]).replace("\0", "_");
    private static int count = 0;

    public static void OptionFile(String opt_num) throws IOException {
        List<String> words_set = new ArrayList<>();
        Random rand = new Random();
        switch (opt_num) {
            case "1":
                break;
            case "2":
//                Scanner file = new Scanner(new File("/Users/huangjiabao/GitHub/SourceCode/Java_Coder/Student_Coder/曲祖延/HangManKAI/src/demo.txt"));
                Scanner file = new Scanner(new File("/Users/huangjiabao/GitHub/SourceCode/Java_Coder/Student_Coder/曲祖延/HangManKAI/src/animals.txt"));
                while (file.hasNext()) {
                    words_set.add(file.nextLine());
                }
                random_word = words_set.get(rand.nextInt(words_set.size()));
                underline = new String(new char[random_word.length()]).replace("\0", "_");
                break;
            case "3":
                URL url = new URL("https://bornforthis.cn/1v1/06-KAI/10-Assignment4-Hangman-Game/words_alpha.txt");
                Scanner s = new Scanner(url.openStream());
                while (s.hasNext()) {
                    words_set.add(s.nextLine());
                }
                random_word = words_set.get(rand.nextInt(words_set.size()));
                underline = new String(new char[random_word.length()]).replace("\0", "_");
                break;
        }
    }

    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        System.out.println("自带数组还是文件中读取 or 互联网读取？「1，2，3」");
        String file_option = input.nextLine();
//        System.out.println("xxxxx:" + file_option);
        OptionFile(file_option);
//        System.out.println(random_word);
        while (count < 7 && underline.contains("_")) {
            System.out.println("猜这个单词中的任何一个字母：>>>");
            System.out.println(underline);
            String user_guess = input.next();
            guess_hangman(user_guess);
        }
    }

    public static void guess_hangman(String user_guess) {
        String new_underline = "";
        for (int i = 0; i < random_word.length(); i++) {
            if (random_word.charAt(i) == user_guess.charAt(0)) {
                new_underline = new_underline + user_guess.charAt(0);
            } else if (underline.charAt(i) != '_') {
                new_underline = new_underline + underline.charAt(i);
            } else {
                new_underline = new_underline + "_";
            }
        }

        if (underline.equals(new_underline)) {
            count = count + 1;
            die_people();
        } else {
            underline = new_underline;
        }
        if (underline.equals(random_word)) {
            System.out.println("Correct!You win!The word was:>>>" + random_word);
        }

    }

    private static void die_people() {
        switch (count) {
            case 1:
                System.out.println("回答错误，你要死了！");
                System.out.println("\n\n\n\n\n\n");
                System.out.println("____|____");
                break;
            case 2:
                System.out.println("回答错误，你要死了！");
//                System.out.println("\n\n\n\n\n");
                for (int i = 0; i < 6; i++) {
                    System.out.println("\t|");
                }
                System.out.println("____|____");
                break;
            case 3:
                System.out.println("回答错误，你要死了！");
                System.out.println("\t_________________");
                System.out.println("\t|\t\t\t\t|");
//                System.out.println("\t|\t\t\t\t|");
                for (int i = 0; i < 5; i++) {
                    System.out.println("\t|");
                }
                System.out.println("____|____");
                break;
            case 4:
                System.out.println("回答错误，你要死了！");
                System.out.println("\t_________________");
                System.out.println("\t|\t\t\t ___|___");
                System.out.println("\t|\t\t\t|_^_|_^_|");
                for (int i = 0; i < 4; i++) {
                    System.out.println("\t|");
                }
                System.out.println("____|____");
                break;
            case 5:
                System.out.println("回答错误，你要死了！");
                System.out.println("\t_________________");
                System.out.println("\t|\t\t\t ___|___");
                System.out.println("\t|\t\t\t|_^_|_^_|");
                System.out.println("\t|\t\t\t\t|");
                for (int i = 0; i < 3; i++) {
                    System.out.println("\t|");
                }
                System.out.println("____|____");
                break;
            case 6:
                System.out.println("回答错误，你要死了！");
                System.out.println("\t_________________");
                System.out.println("\t|\t\t\t ___|___");
                System.out.println("\t|\t\t\t|_^_|_^_|");
                System.out.println("\t|\t\t\t   _|_");
                System.out.println("\t|\t\t\t  / | \\");
                System.out.println("\t|");
                System.out.println("____|____");
                break;
            case 7:
                System.out.println("回答错误，你要死了！");
                System.out.println("\t_________________");
                System.out.println("\t|\t\t\t ___|___");
                System.out.println("\t|\t\t\t|_^_|_^_|");
                System.out.println("\t|\t\t\t   _|_");
                System.out.println("\t|\t\t\t  / | \\");
                System.out.println("\t|\t\t\t   /^\\");
                System.out.println("\t|\t\t\t  /   \\");
                System.out.println("____|____");
                System.out.println("GAME OVER! The word was " + random_word);
                break;
        }
    }
}
