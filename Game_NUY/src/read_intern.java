/**
 * @ClassName: read_intern
 * @Description: TODO
 * @Author: AndersonHJB
 * @date: 2022/11/16 00:26
 * @Version: V1.0
 * @Blog: https://bornforthis.cn
 */


import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class read_intern {

    public static void main(String[] args) throws IOException {
        URL url = new URL("https://bornforthis.cn/1v1/06-KAI/10-Assignment4-Hangman-Game/words_alpha.txt");
        Scanner s = new Scanner(url.openStream());
//        String[] content_data = new String[10];
        while (s.hasNext()) {
            System.out.println(s.next());
        }
    }
}
