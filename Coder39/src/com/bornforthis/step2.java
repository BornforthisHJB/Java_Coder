package com.bornforthis;

import com.bornforthis.person.Customer;
import com.bornforthis.supermarket.LittleSuperMarket;
import com.bornforthis.supermarket.Merchandise;

import java.util.Scanner;

/**
 * @ClassName: step2
 * @Description: TODO
 * @Author: AndersonHJB
 * @date: 2022/12/10 14:57
 * @Version: V1.0
 * @Blog: https://bornforthis.cn
 */
public class step2 {
    public static void main(String[] args) {
        // 实例化我们的小超市
        LittleSuperMarket littleSuperMarket = new LittleSuperMarket();  // 实例化我们的超市，创建一个具体的超市
        littleSuperMarket.address = "世纪大道9999号";  // 超市的地址
        littleSuperMarket.superMarketName = "有家超市";  // 超市名称
        littleSuperMarket.parkingCount = 200;  // 停车位，小超市有多少个停车位
        littleSuperMarket.merchandises = new Merchandise[200];  // 小超市有200种商品「200种元素，之后要对200种元素初始化商品」
        littleSuperMarket.merchandiseSold = new int[littleSuperMarket.merchandises.length]; // 商品销售,销售数量
        // 相同下标的数据，merchandises and merchandiseSold 每个商品对应的销售数量
        /*
         * 两百个商品，意味着：Merchandise 类型数组，元素共有 200 个
         * */
        Merchandise[] all = littleSuperMarket.merchandises;
//        System.out.println(all == littleSuperMarket.merchandises); // 判断是否是同一个，true 为同一个物理地址

        for (int i = 0; i < all.length; i++) {
            Merchandise m = new Merchandise();
            m.count = 200;
            m.id = "ID" + i;
            m.name = "商品" + i;
            m.purchasePrice = Math.random() * 200;  //  进货价格
            m.soldPrice = (1 + Math.random()) * 200;  // 销售价格

            all[i] = m;
        }

//        for (int i = 0; i < littleSuperMarket.merchandises.length; i++) {
//            System.out.println(all[i].name);
//        }
        System.out.println("超市开门啦");
        boolean open = true;  // 是不是在营业
        // TODO: this
        Scanner scanner = new Scanner(System.in);
        while (open) {
            // 营业就自报家门
            System.out.println("本店叫做" + littleSuperMarket.superMarketName);
            System.out.println("本店地址" + littleSuperMarket.address);
            System.out.println("共有停车位" + littleSuperMarket.parkingCount + "个");
            System.out.println("今天的营业额为" + littleSuperMarket.incomingSum);
            System.out.println("共有商品" + littleSuperMarket.merchandises.length + "种");

            // 顾客
            Customer customer = new Customer();  // 新的顾客
            customer.name = "顾客编号" + ((int) (Math.random() * 10000));
            // Math.random() 0～1 之间的随机数
            // 1 + Math.random(); 1~2 之间随机整数
            customer.money = (1 + Math.random()) * 1000;  // 1k~2k 之内的随机数
            customer.isDrivingCar = Math.random() > 0.5; // 大于 0.5 就是开车了。
            // 到此，顾客已经编写好。接下来是顾客要逛超市买东西

//            Scanner scanner = new Scanner(System.in); // TODO:>>>因为 Scanner 是不断要用的，只要超市不关门，就要不停的使用，所以移动到上面👆while 循环外面

            // 判断顾客是否是开车来的：
            if (customer.isDrivingCar) { // todo:如果开车
                if (littleSuperMarket.parkingCount > 0) {
                    // todo: 判断剩余车位是否大于 0
//                    littleSuperMarket.parkingCount--; // 为了让读取的编号准确，我们移动到下面👇
                    System.out.println("欢迎" + customer.name + "驾车而来。本店已经为您安排了车位，停车免费哦。车位编号为" + littleSuperMarket.parkingCount);
                    littleSuperMarket.parkingCount--;
                } else {
                    System.out.println("不好意思，本店车位已满。欢迎您下次光临");
                    continue;
                }
            } else { // 不是开车来，走路来就直接欢迎
                System.out.println("欢迎" + customer.name + "光临本店");
            }
            // 写在这里，总价
            double totalCost = 0;
            while (true) {
                System.out.println("本店提供" + all.length + "种商品,欢迎选购。请输入商品编号");
                int index = scanner.nextInt();

                // 怎么结束呢？
                if (index < 0) {
                    break;
                }

                if (index >= all.length) {
                    System.out.println("本店没有这种商品，请叙述编号在0到" + (all.length - 1) + "之内的商品编号。");
                    continue;
                }


                Merchandise m = all[index];  // 取出商品数据，相较于之前的是逆向思维
//                System.out.println(m.name);
                System.out.println("您选购的商品名字" + m.name + "。单价是" + m.soldPrice + "。请问您要购买多少个？");
                int numToBuy = scanner.nextInt();  // 要买多少个
                // todo:>>>接下来算花了多少钱，可以写在下面吗？👇
                // double totalCost = 0;
                // TODO: 显然不行，总价会被一直初始化为 0
                // TODO:还有一种情况，虽然程序不会出错，但是逻辑是错的，就是用户输入购买的数量小于等于0，那其实不就好像，店向顾客买东西么😂倒贴
                if (numToBuy <= 0) {
                    System.out.println("不买看看也好，欢迎继续挑选。");
                    continue;
                }

                if (numToBuy > m.count) {
                    System.out.println("本店库存没有这么多，欢迎继续挑选");
                    continue;
                }
                if (numToBuy * m.purchasePrice + totalCost > customer.money) {
                    System.out.println("您带的钱不够，欢迎继续挑选");
                    continue;
                }



                totalCost += numToBuy * m.soldPrice;

                // 更新商品剩余货存
                m.count -= numToBuy;
                littleSuperMarket.merchandiseSold[index] += numToBuy;
            }

            // 结账
            customer.money -= totalCost;
            // 结账之后，恢复停车位数量
            if (customer.isDrivingCar) {
                littleSuperMarket.parkingCount++;
            }

            System.out.println("顾客" + customer.name + "共消费了" + totalCost);
            // 计算收入总和
            littleSuperMarket.incomingSum = totalCost;  // 顾客花了多少就是收入多少
            // 到此基本上也是购物一次了
            // 错误注释 接下来就是要询问是否继续购买 // 这个留作扩张作业
            // 问我：还继续营业吗？
            System.out.println("还继续营业吗？");
            open = scanner.nextBoolean();


            System.out.println("超市关门了！");
            System.out.println("今天总的营业额为：" + littleSuperMarket.incomingSum + "。营业情况如下");
            for (int i = 0; i < littleSuperMarket.merchandiseSold.length; i++) {
//                Merchandise m = littleSuperMarket.merchandises[i];
                Merchandise m = all[i];  // 商品信息
                int numSold = littleSuperMarket.merchandiseSold[i];  // 得到商品销售数量
                if (numSold > 0) {
                    double incomming = m.soldPrice * numSold;  // 本商品的销售额
                    double netIncomming = (m.soldPrice - m.purchasePrice) * numSold;  // 纯利润
                    System.out.println(m.name + "售出了" + numSold + "个。销售额为"
                            + incomming + "。净利润为" + netIncomming);
                }

            }

        }
    }


}
