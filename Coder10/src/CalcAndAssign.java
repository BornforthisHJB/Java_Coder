public class CalcAndAssign {
    public static void main(String[] args) {
//        int a = 8;
        int a = 16;
        a >>= 2;
        System.out.println(a);
        // 此时 a 是 4；
        a *= 9;
        System.out.println(a);
    }
}
