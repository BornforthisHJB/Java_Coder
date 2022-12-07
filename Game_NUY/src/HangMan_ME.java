import java.util.Scanner;

/**
 * @ClassName: HangMan_ME
 * @Description: TODO
 * @Author: AndersonHJB
 * @date: 2022/11/12 15:35
 * @Version: V1.0
 * @Blog: https://bornforthis.cn
 */
public class HangMan_ME {
    private static String[] words_array = {"terminator", "banana", "computer", "cow", "rain", "water"};  // 创建要猜测的单词
    // 随机选择一个单词
    private static String random_word = words_array[(int) (Math.random() * words_array.length)];
    // 生成对应长度的下划线
    private static String underline = new String(new char[random_word.length()]).replace("\0", "_");
    // 回答次数计数
    private static int count = 0;

    public static void main(String[] args) {
//        System.out.println(words_array.length);
//        System.out.println(underline);

        // 获取用户输入
        Scanner input = new Scanner(System.in);
        while (count < 7 && underline.contains("_")) {
            System.out.println("猜这个单词中的任何一个字母:>>>");
            System.out.println(underline);
            String guess = input.next();
            main_hang(guess);  // 每次循环
        }
        input.close();
    }

    public static void main_hang(String guess) {
        String newunderline = "";  // 每次都会覆盖，重新创建
        for (int i = 0; i < random_word.length(); i++) {
            // System.out.println(guess);
            // System.out.println(guess.charAt(0));  // 只获取字符串的第一个字符
            if (random_word.charAt(i) == guess.charAt(0)) {
                newunderline += guess.charAt(0);
            } else if (underline.charAt(i) != '_') {
                newunderline += random_word.charAt(i);  //
//                newunderline += underline.charAt(i);
            } else {
                newunderline += "_";
            }
        }
//        System.out.println("newunderline:>>>" + newunderline);
        if (underline.equals(newunderline)) {
            count++;
//            hangmanImage();
        } else {
            underline = newunderline;
        }
        if (underline.equals(random_word)) {
            System.out.println("Correct! You win! The word was " + random_word);
        }
    }

}
