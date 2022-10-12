public class demo {
    public static void main(String[] args) {
//        代码块的执行顺序是顺序执行
//        只要程序运行过程中不出错，就会一行行的向下执行
        int baozi = 3;
        boolean baozhiGGCL = true;
        if (baozhiGGCL) {
            baozi += 2; // baozi = baozi + 2；
            System.out.println("包子刚刚出笼，买了" + baozi + "个肉包子");
        } else {
            System.out.println("买了" + baozi + "个肉包子");
        }
    }
}
/*
 * if (boolean 值) {
 * if 语句块}
 * else {
 * else 语句块}*/
// if-else 语法，只有一个语句块被执行
// if 和 else 都是 Java 中的关键字
//if 语法
// 把 if-else 看作一个表达式，程序整体还是顺序执行的
//使用 if-else 来买多个包子
