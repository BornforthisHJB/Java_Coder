/*
* */

import java.util.Scanner;
public class NumberSystem {
    public static void main(String[] args) {
        NumberSystem nb = new NumberSystem();  // 类的是例化
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the name of the number system to convert from: bin, or dec, or oct or hex:");
        String digital_system = in.next(); // 数字系统

        if (digital_system == "bin") {

        }

    }

    public String DecToBin(int userinput) {
        /*十进制转二进制*/
        String result_binary = "";
        while (userinput != 0) {
            result_binary = (userinput % 2) + result_binary;
            userinput = userinput / 2;
        }
//        System.out.println(result_binary);
        return result_binary;
    }

}
