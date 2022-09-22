import java.util.Scanner; // 现阶段就直接使用即可。为什么要导入呢？——
// 因为，Scanner 的全名就叫 java.util.Scanner;
// 这样我们就不用每次都去写这么长，直接写 Scanner 就等价于 java.util.Scanner;

public class ReadStringAndIntFromConsole {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); // 类似创建变量，后面会讲 new xxx，我们先不从语法层面去理解它。
        // 从字面意思理解：System 是系统，系统的输入是什么呢？——系统输入我们就可以认为是键盘，
        // 相当于我们用 Scanner 来处理用户输入键盘的数据。

        System.out.println("请问你的名字是？");

        String str = in.nextLine();

        System.out.println(str + "，你好。");

        System.out.println("请问你几岁了？");

        int age = in.nextInt();

        System.out.println("好的，" + str + age + "岁了。");

    }
}
