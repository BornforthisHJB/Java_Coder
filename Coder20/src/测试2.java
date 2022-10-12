public class 测试2 {
    public static void main(String[] args) {
        String bin = "101010111";
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
        System.out.println(bin_to_dec);
    }
}
