package com.bornforthis;

import com.bornforthis.supermarket.LittleSuperMarket;
import com.bornforthis.supermarket.Merchandise;

/**
 * @ClassName: step1
 * @Description: TODO
 * @Author: AndersonHJB
 * @date: 2022/12/10 14:57
 * @Version: V1.0
 * @Blog: https://bornforthis.cn
 */
public class step1 {
    public static void main(String[] args) {
        // 实例化我们的小超市
        LittleSuperMarket littleSuperMarket = new LittleSuperMarket();  // 实例化我们的超市，创建一个具体的超市
        littleSuperMarket.address = "世纪大道9999号";  // 超市的地址
        littleSuperMarket.superMarketName = "有家超市";  // 超市名称
        littleSuperMarket.parkingCount = 200;  // 停车位，小超市有多少个停车位
        littleSuperMarket.merchandises = new Merchandise[200];  // 小超市有200种商品「200种元素，之后要对200种元素初始化商品」
        littleSuperMarket.merchandiseSold = new int[littleSuperMarket.merchandises.length]; // 商品销售
        // 相同下标的数据，merchandises and merchandiseSold 每个商品对应的销售数量
        /*
         * 两百个商品，意味着：Merchandise 类型数组，元素共有 200 个
         * */
//        System.out.println(all == littleSuperMarket.merchandises); // 判断是否是同一个，true 为同一个物理地址

        for (int i = 0; i < littleSuperMarket.merchandises.length; i++) {
            littleSuperMarket.merchandises[i] = new Merchandise();
        }
//        System.out.println(all);
        for (int i = 0; i < littleSuperMarket.merchandises.length; i++) {
            littleSuperMarket.merchandises[i].count = 200;
            littleSuperMarket.merchandises[i].id = "ID" + i;
            littleSuperMarket.merchandises[i].name = "商品" + i;
            littleSuperMarket.merchandises[i].purchasePrice = Math.random() * 200;
            littleSuperMarket.merchandises[i].soldPrice = (1 + Math.random()) * 200;
//            System.out.println(Math.random()*200);
        }
        // 输出 name 查看是否商品添加成功
        for (int i = 0; i < littleSuperMarket.merchandises.length; i++) {
            System.out.println(littleSuperMarket.merchandises[i].name);
            ;
        }
    }


}
