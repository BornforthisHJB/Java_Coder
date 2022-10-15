import java.util.Scanner;

public class Part22 {
    public static void main(String[] args) {
        Part22 ns = new Part22();
        Scanner in = new Scanner(System.in);  // setting an output
        System.out.print("Enter the name of the number system to convert from: bin, or dec, or oct or hex:");
        String digital_system = in.next(); // number system, let user describe the datatype
        System.out.print("Enter number as a String:");
        String Opr_num = in.next();
        System.out.print("Enter the name of the number system you want to convert to: bin, or dec, or oct or hex: "); // 用户要转换的目标类型
        String target = in.next(); // the purpose number system that user want to convert
        int StringBinary_To_IntDec;
            switch (digital_system) {
            case ("bin"):
//                if (target.equals("dec")) {
//                    int bin_to_dec = ns.BinToDec(Opr_num);
//                    System.out.println(bin_to_dec);
//                break;
//                } else if (target.equals("oct")) {
//                    break;
//                } else if (target.equals("hex")) {
//                    break;
//                } else if (target.equals("bin")) {
//                    break;
//                }
             switch (target) {


                    case ("dec"):
                        StringBinary_To_IntDec = ns.BinToDec(Opr_num);
                        System.out.println(StringBinary_To_IntDec);
                        break;
                    case ("oct"):
                        StringBinary_To_IntDec = ns.BinToDec(Opr_num);
                        String IntDec_To_StringOct = ns.DecToOct(StringBinary_To_IntDec);
                        System.out.println(IntDec_To_StringOct);
                        break;
                    case ("hex"):
                        StringBinary_To_IntDec = ns.BinToDec(Opr_num);
                        String IntDec_to_StringHex = ns.DecToHex(StringBinary_To_IntDec);
                        System.out.println(IntDec_to_StringHex);
                        break;

                }
            case ("oct"):
                int StringOct_To_IntDec=ns.OctToDec(Integer.parseInt(Opr_num));
                /*
                * This is my code about the transition of Octal
                * by transfer the number system to Decimal first
                * And we can easily reach any number system after when we were in Decimal
                */
                switch (target) {
                    case ("bin"):
                        String IntDec_To_StringBin = ns.DecToBin(StringOct_To_IntDec);
                        System.out.println(IntDec_To_StringBin);
                        break;
                    case ("dec"):

                        System.out.println(StringOct_To_IntDec);
                        break;
                    case("hex"):
                        String IntDec_To_StringHex=ns.DecToHex(StringOct_To_IntDec);
                        System.out.println(IntDec_To_StringHex);
                        break;
                }
            case ("hex"):
               int StringHex_To_IntDec=ns.HexToDec(Opr_num);
                switch (target) {
                    case ("bin"):
                        String IntDec_TO_StringBin=ns.DecToBin(StringHex_To_IntDec);
                        System.out.println(IntDec_TO_StringBin);
                        break;
                    case ("dec"):

                        System.out.println(StringHex_To_IntDec);
                        break;
                    case ("oct"):

                        String IntDec_TO_StringOct=ns.DecToOct(StringHex_To_IntDec);
                        System.out.println(IntDec_TO_StringOct);
                        break;
                }
        }

        }


//        if (digital_system.equals("dec") && target.equals("bin")) {
//            String dec_to_binary = ns.DecToBin(Integer.parseInt(inDec));
//            System.out.print(dec_to_binary);
//        } else if (digital_system.equals("dec") && target.equals("oct")) {
//            String dec_to_binary = ns.DecToOct(Integer.parseInt(inDec));
//            System.out.print(dec_to_binary);
//        } else if (digital_system.equals("dec") && target.equals("hex")) {
//            String dec_to_binary = ns.DecToHex(Integer.parseInt(inDec));
//            System.out.print(dec_to_binary);
//        }





    public String DecToBin(int intDec) {
        /* decimal to binary and then use%2 */
        String result_binary = "";
        while (intDec != 0) {
            result_binary = (intDec % 2) + result_binary;
            intDec = intDec / 2;
        }
        return result_binary;
    }

    public String DecToOct(int intDec) {
        /* decimal to oct and then use%8*/
        String result_oct = "";
        while (intDec != 0) {
            result_oct = (intDec % 8) + result_oct;
            intDec = intDec / 8;
        }
        return result_oct;
    }

    public String DecToHex(int intDec) {
        /*decimal to hex*/
        if (intDec == 0) {
//            System.out.println(0);
//            System.exit(0);
            return "0";
        }
        StringBuffer stb = new StringBuffer(8);
        char[] a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        while (intDec != 0) {
            stb = stb.append(a[intDec % 16]);
            intDec /= 16;
        }
        return stb.reverse().toString();
    }

//    public int method(String inMsg) {
//        int x = 0;
////        int mul = 1;
//        int str_length = inMsg.length();
//        for (int i = str_length - 1; i > 0; i--) {
////            x += mul * (inMsg.charAt(i) == '1' ? 1 : 0);
////            mul *= 2;
//            System.out.println(inMsg.charAt(i));
//            x += (int) Math.pow(2, str_length - 1) * (inMsg.charAt(i) == '1' ? 1 : 0);
////            System.out.println(x);
//        }
////        System.out.println(mul);
//        return x;
//    }

    public int HexToDec(String hex) {
        /*hexadecimal to decimal*/
//        int hex_to_dec = 0, i = 0;
//        int str_length = hex.length();
//        while (str_length > 0) {
////            dec += ()
//            char ch = hex.charAt(i);
//            int base = (ch == '1' ? 1 : 0);
//            hex_to_dec += base * Math.pow(16, str_length - 1);
//            ++i;
//            --str_length;
//        }
//        return hex_to_dec;
        String digits = "0123456789ABCDEF";
        hex = hex.toUpperCase();  // convert all it in uppercase
        int val = 0;
        for (int i = 0; i < hex.length(); i++) {
            char c = hex.charAt(i);
            int d = digits.indexOf(c);
            val = 16 * val + d;
        }
        return val;
    }

    public int OctToDec(int oct) {
        /*octal to decimal*/
        int decimalNumber = 0, i = 0;
        while (oct != 0) {
            decimalNumber += (oct % 10) * Math.pow(8, i);
            ++i;
            oct /= 10;
        }
        return decimalNumber;
    }

    public int BinToDec(String bin) {
        /*binary to decimal*/
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

//        // 1010
//        int x = 0;
//        for (char c : radix.toCharArray())
//            x = x * 2 + (c == '1' ? 1 : 0);
////        System.out.println(x);
//        return x;
//    }
//
}
