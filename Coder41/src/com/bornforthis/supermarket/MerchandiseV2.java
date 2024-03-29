package com.bornforthis.supermarket;

public class MerchandiseV2 {

    public String name;
    public String id;
    public int count;
    public double soldPrice;
    public double purchasePrice;

    public void describe() {
        System.out.println("商品名字叫做" + name + "，id是" + id + "。 商品售价是" + soldPrice
                + "。商品进价是" + purchasePrice + "。商品库存量是" + count +
                "。销售一个的毛利润是" + (soldPrice - purchasePrice));
    }

    // >> TODO 在方法定义中指定方法的返回值类型 double
    // >> TODO Java中一个方法只能有一种返回值，如果不需要返回值则用 void 表示
    // >> TODO 如果定义了返回值，则必须使用 return 语句返回方法的返回值，return 是 Java 的关键字
    // >> TODO 可以认为，返回值必须要能够用来给返回值类型的变量赋值，也就是返回的值要可以给 double 类型的变量赋值
    public double calculateProfit() {
        double profit = soldPrice - purchasePrice;
        // >> TODO 这个 return 是代码块里的 return，是 return 所在代码块的最后一个语句
        //  TODO: java 遇到 return 意味着整个方法就结束了，当然，代码放在 return 后面就会报错
        //  TODO：也就和 break 一样，只不过 break 是一个循环而不是一个方法
        if (profit <= 0) {
            return 0;
        }
        //  >> TODO return 语句必须是所在代码块的最后一个语句，否则就是语法错误
        return profit;

        // >> TODO 一个方法可以有多个返回语句。
    }

    // >> TODO 返回值如果是基本类型，则要类型完全相同，或者符合类型自动转换规则
    public double getCurrentCount() {
        return count;
    }

    // >> TODO 如果不符合规则，可以使用强制类型转换
    public int getIntSoldPrice() {
        return (int) soldPrice;
    }

}
