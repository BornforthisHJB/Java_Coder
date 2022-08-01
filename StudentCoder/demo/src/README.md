# 从加减乘除到变量

## 0. 目录
- 计算加减乘除 
- 基本数据类型——int 
- 关键字（key word）和标示符（identifier） 
- 用变量解决问题

## 1. 计算加减乘除

1. psvm：快捷输入

```java
public static void main(String[] args) {
        
    }
```

2. sout:

```java
System.out.println();
```

3. 简单加减乘除代码
```java
public class MathCalc {
    public static void main(String[] args) {
        System.out.println("5+6");
        System.out.println(5 + 6);
        System.out.println(5 - 6);
        System.out.println(5 * 6);
        System.out.println(9 / 2.0);
        System.out.println((1 + 2 - 3) * 4 / 5.0); // 0.0
        System.out.println((1 + 2 + 3) * 4 / 5.0); // 4.8
    }
}
```
输出：
```java
5+6
11
-1
30
4.5
0.0
4.8
```
> 注意：Java 在做除法运算时，需要注意其中一个元素必须是小数，最后结果才会是正确的结果；
> 例如：9 / 2 >>> 4，应该改成：9 / 2.0 >>> 4.5; PS：9 改成 9.0 也是可以的！

那实现一些比较复杂的长代码呢？

```java
public class MathCalc {
    public static void main(String[] args) {
        System.out.println(2 * 5 + 2 * 5 * 5 + 3 * 5 * 5 * 5);
    }
}
// 输出
435
```



## 2. 变量& int「整型」

```java
public class Variable {
    public static void main(String[] args) {
        int a = 3;
        int b = 5;
        int c = 7;
        int x = 90;
        int y = a * x + b * x * x + c * x * x * x;
        System.out.println(y);
    }
}
// 会写代码的人，考试肯定会过；
// 会考试的人，不一定会写代码；
// 输出
5143770
```

