public class CalcValueLoss {
    public static void main(String[] args) {
        int intVal = 2000000000;
        System.out.println(intVal + intVal);
        /*数值溢出：
        * 1。 数值计算一旦溢出，结果将失去其原有的意义，比如：两个正数会加出负数
        * 要对能够处理的值有个大概的估计
        * 要对我们要处理的值有个期待，预判！！！
        * 我就算拿 byte 去表示月份——都是可以。月份最多 12个月，byte：128
        * 进一步表示：一个月的第几号都是 ok 的
        * byte 其实用 byte 不会省多少内存*/
    }
}
