/**
 * @ClassName: Part2
 * @Description: NumberSystem
 * @Author: AI悦创
 * @date: 2022/10/5 09:28
 * @Version: V1.0
 */

import java.util.Scanner;

public class NS {
    public static void main(String[] args) {
//        NS ns = new NS();  // 类的是例化
        Scanner in = new Scanner(System.in);  // 声明一个输入
        System.out.print("Enter the name of the number system to convert from: bin, or dec, or oct or hex:");
        String digital_system = in.next(); // 数字系统「用户描述用户输入的类型」
        System.out.print("Enter number as a String:");
        String Opr_num = in.next();
        System.out.print("Enter the name of the number system you want to convert to: bin, or dec, or oct or hex: "); // 用户要转换的目标类型
        String target = in.next(); // 用户想要转换的目标类型
        switch_case(digital_system, target, Opr_num);

    }

    public static void switch_case(String digital_system, String target, String Opr_num) {
        NS sc = new NS();
        switch (digital_system) {
            case ("bin"):
                int StringBinary_To_IntDec = sc.BinToDec(Opr_num);
                switch (target) {
                    case ("dec"):
                        System.out.println(StringBinary_To_IntDec);
                        break;
                    case ("oct"):
                        String IntDec_To_StringOct = sc.DecToOct(StringBinary_To_IntDec);
                        System.out.println(IntDec_To_StringOct);
                        break;
                    case ("hex"):
                        String IntDec_To_StringHex = sc.DecToHex(StringBinary_To_IntDec);
                        System.out.println(IntDec_To_StringHex);
                        break;
                }
                break;
            case ("oct"):
                int StringOct_To_IntDec = sc.OctToDec(Integer.parseInt(Opr_num));
                switch (target) {
                    /* This is my code, oct to binary*/
                    case ("bin"):
                        String IntDec_To_StringBin = sc.DecToBin(StringOct_To_IntDec);
                        System.out.println(IntDec_To_StringBin);
                        break;
                    case ("dec"):
                        System.out.println(StringOct_To_IntDec);
                        break;
                    case ("hex"):
                        String IntDec_To_StringHex = sc.DecToHex(StringOct_To_IntDec);
                        System.out.println(IntDec_To_StringHex);
                        break;
                }
                break;
            case ("hex"):
                int StringHex_To_IntDec = sc.HexToDec(Opr_num);
                switch (target) {
                    case ("bin"):
                        String IntDec_To_StringBin = sc.DecToBin(StringHex_To_IntDec);
                        System.out.println(IntDec_To_StringBin);
                        break;
                    case ("dec"):
                        System.out.println(StringHex_To_IntDec);
                        break;
                    case ("oct"):
                        String IntDec_To_StringOct = sc.DecToOct(StringHex_To_IntDec);
                        System.out.println(IntDec_To_StringOct);
                        break;
                }
                break;
            case ("dec"):
                switch (target) {
                    case ("bin"):
                        String StringDec_To_StringBin = sc.DecToBin(Integer.parseInt(Opr_num));
                        System.out.println(StringDec_To_StringBin);
                        break;
                    case ("oct"):
                        String StringDec_To_StringOct = sc.DecToOct(Integer.parseInt(Opr_num));
                        System.out.println(StringDec_To_StringOct);
                        break;
                    case ("hex"):
                        String StringDec_To_StringHex = sc.DecToHex(Integer.parseInt(Opr_num));
                        System.out.println(StringDec_To_StringHex);
                        break;
                }
                break;
        }
    }

    public String DecToBin(int intDec) {
        /* 十进制转二进制，利用除2取余*/
        String result_binary = "";
        while (intDec != 0) {
            result_binary = (intDec % 2) + result_binary;
            intDec = intDec / 2;
        }
        return result_binary;
    }

    public String DecToOct(int intDec) {
        /* 十进制转八进制，利用除8取余*/
        String result_oct = "";
        while (intDec != 0) {
            result_oct = (intDec % 8) + result_oct;
            intDec = intDec / 8;
        }
        return result_oct;
    }

    public String DecToHex(int intDec) {
        /*十进制转十六进制*/
        if (intDec == 0) {
//            System.out.println(0);
//            System.exit(0);
            return "0";
        }
        StringBuffer stb = new StringBuffer(8);
        /*当对字符串进行修改的时候，需要使用 StringBuffer 和 StringBuilder 类。
        和 String 类不同的是，StringBuffer 和 StringBuilder 类的对象能够被多次的修改，并且不产生新的未使用对象。*/
        char[] a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        while (intDec != 0) {
            stb = stb.append(a[intDec % 16]);
            intDec /= 16;
        }
        return stb.reverse().toString();
    }


    public int HexToDec(String hex) {
        /*十六进制转十进制*/
        String digits = "0123456789ABCDEF";
        hex = hex.toUpperCase();  // 全部变成大写
        int val = 0;
        for (int i = 0; i < hex.length(); i++) {
            char c = hex.charAt(i);
            int d = digits.indexOf(c);
            val = 16 * val + d;
        }
        return val;
    }

    public int OctToDec(int oct) {
        /*八进制转十进制*/
        int decimalNumber = 0, i = 0;
        while (oct != 0) {
            decimalNumber += (oct % 10) * Math.pow(8, i);
            ++i;
            oct /= 10;
        }
        return decimalNumber;
    }

    public int BinToDec(String bin) {
        /*二进制转十进制*/
        int bin_to_dec = 0, i = 0;
        int str_length = bin.length();
        while (str_length > 0) {
//            dec += ()
            char ch = bin.charAt(i);
            int base = (ch == '1' ? 1 : 0);
            bin_to_dec += base * Math.pow(2, str_length - 1);
            ++i;
            --str_length;
        }
        return bin_to_dec;
    }

//    public int binaryToDecimal(String radix) {
//        /*二进制到十进制*/
//        // 1010
//        int x = 0;
//        for (char c : radix.toCharArray())
//            x = x * 2 + (c == '1' ? 1 : 0);
////        System.out.println(x);
//        return x;
//    }
//
}
