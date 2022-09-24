public class variable3 { public static void main(String[] args) {
    int variable;
    variable = 999;
    int a = 3;
    int b = 5;
    int c = 7;
    int x = 1;
    int y = a * x + b * x * x + c * x * x * x;System.out.println(y);}}
// int variable 在不加分号的情况下，是表达式
// 如果 int variable; 紧跟一个分号，那就一个叫一个语句。
/*也就是说，这个表达式已经结束，这是一个语句
* variable = 999; 赋值表达式
* int a：其实就是个表达式，创建一个变量 a 。紧接 a = 3 它又是一个赋值表达式，最后用分号组成语句。*/

/*表达式：expression：Java 中最基本的运算。加法运算表达式 1 + 2 是一个表达式 a + b 也是一个表达式
* 语句（statement）：类似于平时说话时的一句话，由表达式组成，以 ；结束
* 1+2; 1+2+3; a+b;  int a = 3; y = a + 9; System.out.println(y) 都是语句。
* 代码块：一对打括号括起来的就是一个代码块*/
