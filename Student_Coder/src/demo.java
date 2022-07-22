public class demo {
    public static void main(String[] args) {
        boolean a = 1 < 2;
        boolean b = 1 > 2;
        System.out.println(a);
        System.out.println(b);
//        System.out.println(a & b);
        System.out.println(a & !b);
//        System.out.println(a & 10 / 0 > 1);  // 会不会报错
//        System.out.println(!a & 10 / 0 > 1);  // 会不会报错,显然是不够智能的
//        System.out.println(!a && 10 / 0 > 1);
//        System.out.println(a | 10 / 0 > 1);
        System.out.println("IS runing");
//        31 
    }
}
