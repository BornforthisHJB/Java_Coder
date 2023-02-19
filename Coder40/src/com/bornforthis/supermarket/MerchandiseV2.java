package com.bornforthis.supermarket;

public class MerchandiseV2 {

    public String name;
    public String id;
    public int count;
    public double soldPrice;
    public double purchasePrice;
    String madeIn;

    // >> TODO 访问修饰符 public
    // >> TODO 返回值类型：无需返回值则用 void 表示，void 是 Java 中的关键字
    // >> TODO 方法名：任意合法的标识符都可以 describe
    // >> TODO 参数列表：后续讲解
    // >> TODO 方法体：方法的代码 就是大括号里面
    // >> TODO 方法体内部定义的变量叫做局部变量
    public void describe() {
        double netIncome = soldPrice - purchasePrice;
        System.out.println("商品名字叫做" + name + "，id是" + id + "。 商品售价是" + soldPrice
                + "。商品进价是" + purchasePrice + "。商品库存量是" + count +
                "。销售一个的毛利润是" + netIncome + "。制造地为" + madeIn);
    }
}
