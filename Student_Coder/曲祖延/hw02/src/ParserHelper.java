/**
 * @ClassName: ParserHelper
 * @Description: TODO
 * @Author: AndersonHJB
 * @date: 2023/3/9 22:22
 * @Version: V1.0
 * @Blog: https://bornforthis.cn
 */

import java.util.ArrayList;
import java.util.List;

/**
 * 将输入的 char 类型字符转换为字符串列表
 */
public class ParserHelper {
    static List<String> parse(char[] input) {
        List<String> parsed = new ArrayList<String>();
        for (int i = 0; i < input.length; ++i) {
            char c = input[i];
            if (Character.isDigit(c)) {
                String number = input[i] + "";
                for (int j = i + 1; j < input.length; ++j) {
                    if (Character.isDigit(input[j])) {
                        number += input[j];
                        i = j;
                    } else {
                        break;
                    }
                }
                parsed.add(number);
            } else if (c == '*' || c == '/' ||
                    c == '+' || c == '^' ||
                    c == '-' || c == '(' || c == ')') {
                parsed.add(c + "");
            }
        }
        return parsed;
    }
}
