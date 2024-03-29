package com.bornforthis;

import com.bornforthis.supermarket.LittleSuperMarket;
import com.bornforthis.supermarket.Merchandise;

/**
 * @ClassName: RunLittleSupperMarketAppMain3
 * @Description: TODO
 * @Author: AndersonHJB
 * @date: 2022/12/4 12:46
 * @Version: V1.0
 * @Blog: https://bornforthis.cn
 */
public class RunLittleSupperMarketAppMain3 {
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
        // 商品列表
        Merchandise[] all = littleSuperMarket.merchandises;  // 定义 all 数组
        /*就是 Python 中的
        lst = [1, 2, 3, 4]
        all = lst
        为了方便操作，不然太长*/
//        System.out.println(all == littleSuperMarket.merchandises); // 判断是否是同一个，true 为同一个物理地址

        for (int i = 0; i < all.length; i++) {
//            all[i] = new Merchandise();
            Merchandise m = new Merchandise();
            m.count = 200;
            m.id = "ID" + i;
            m.name = "商品" + i;
            m.purchasePrice = Math.random() * 200;
            m.soldPrice = (1 + Math.random()) * 200;
            all[i] = m;
        }
//        System.out.println(all);
        for (int i = 0; i < all.length; i++) {
            System.out.println(all[i].name);
        }
    }
}
