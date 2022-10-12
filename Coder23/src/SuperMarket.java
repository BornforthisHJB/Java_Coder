/**
 * @ClassName: SuperMarket
 * @Description: TODO
 * @Author: AI悦创
 * @Date: 2022/10/11 22:37
 * @Version: V1.0
 * @Blog: https://www.bornforthis.cn
 */
public class SuperMarket {
    public static void main(String[] args) {

        // >> TODO 使用 new 操作符，可以创建一个类的实例/对象（ instance/object ）。
        // >> TODO 使用 new 创建一个类的实例后，类中定义的每种变量都会被赋以其类型的初始值。count、id = 0
        //    TODO 这个和数组也是一样的
        // >> TODO 使用一个同类型的对象变量，可以指向并操作这个实例。这两点和数组都很类似
        // 创建一个Merchandise的实例，用m1指向它。
        Merchandise m1 = new Merchandise(); // 创建一个对象变量 m1，类型是 Merchandise，变量是 m1
        /*new Merchandise();>>>创建了，类的实例/对象
        * Merchandise 有四个属性，在我们 new 一下之后，相当于给这四个属性打了一个包。
        * 类似数组，new 一个数组为 3 的数组，也等于把三个进行打包。
        * 类和数组的区别就是，里面的数据可以不一样。*/
        // 使用点操作符，给m1指向的实例赋值。「对象变量.属性名」
        System.out.println("缺省值");
        System.out.println(m1.name);
        System.out.println(m1.id);
        System.out.println(m1.count);
        System.out.println(m1.price);
        m1.name = "茉莉花茶包 20 包";
        m1.id = "000099518";
        m1.count = 1000;
        m1.price = 99.9;

        Merchandise m2 = new Merchandise();
        m2.name = "可口可乐 330ml";
        m2.id = "000099519";
        m2.count = 1000;
        m2.price = 3.0;


        // 卖出一个商品1
        int m1ToSold = 1;
        System.out.println("感谢购买" + m1ToSold + "个" + m1.name + "。商品单价为"
                + m1.price + "。消费总价为" + m1.price * m1ToSold + "。");
        m1.count -= m1ToSold;
        System.out.println(m1.id + "剩余的库存数量为" + m1.count);

        // 卖出3个商品2
        int m2ToSold = 3;
        System.out.println("感谢购买" + m2ToSold + "个" + m2.name + "。商品单价为"
                + m2.price + "。消费总价为" + m2.price * m2ToSold + "。");
        m2.count -= m2ToSold;
        System.out.println(m2.id + "剩余的库存数量为" + m2.count);


    }
}
