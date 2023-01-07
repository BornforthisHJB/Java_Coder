/**
 * @ClassName: DoWhileExample
 * @Description: TODO
 * @Author: AndersonHJB
 * @date: 2023/1/4 12:53
 * @Version: V1.0
 * @Blog: https://bornforthis.cn
 */
public class DoWhileExample {
    public static void main(String[] args) {
        int i = 10;
        do {
            System.out.println("我真是大聪明，哈哈哈哈哈哈哈");
            i++;
        } while (i < 10);
    }
}
// Java do-while 循环，用于多次迭代程序的一部分或者重复多次执行的一个代码块。
// 如果迭代次数不固定，「大白话：循环次数不固定」，但是循环里面的内容，又至少要执行一次，建议使用 do-while 循环
// Java do-while 循环，至少执行一次，因为它是在循环体之后检查条件。