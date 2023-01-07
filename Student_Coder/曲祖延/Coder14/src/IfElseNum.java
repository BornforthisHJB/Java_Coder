/**
 * @ClassName: IfElseNum
 * @Description: TODO
 * @Author: AndersonHJB
 * @date: 2023/1/4 13:07
 * @Version: V1.0
 * @Blog: https://bornforthis.cn
 */
import java.util.Scanner;
public class IfElseNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
//        int n = 7;

        String ret = n + "对应的汉字是";
        switch (n) {
            case 0:
                ret = ret + "零";
                break;
            case 1:
                ret = ret + "壹";
                break;
            case 2:
                ret = ret + "贰";
                break;
            case 3:
                ret = ret + "叁";
                break;
            case 4:
                ret = ret + "肆";
                break;
            case 5:
                ret = ret + "伍";
                break;
            case 6:
                ret = ret + "陆";
                break;
            case 7:
                ret = ret + "柒";
                break;
            case 8:
                ret = ret + "捌";
                break;
            case 9:
                ret = ret + "玖";
                break;
            default:
                System.out.println("错误的值" + n + "。值需要在大于等于1，小于等于9。");

        }
        System.out.println(ret);
    }
}
