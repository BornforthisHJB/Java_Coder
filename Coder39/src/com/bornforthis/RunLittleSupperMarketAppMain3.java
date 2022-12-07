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
        LittleSuperMarket littleSuperMarket = new LittleSuperMarket();  // 实例化我们的超市
        littleSuperMarket.address = "世纪大道9999号";
        littleSuperMarket.superMarketName = "有家超市";
        littleSuperMarket.parkingCount = 200;  // 停车位
        littleSuperMarket.merchandises = new Merchandise[200];  // 商品 200种商品
        littleSuperMarket.merchandiseSold = new int[littleSuperMarket.merchandises.length]; // 商品销售
        Merchandise[] all = littleSuperMarket.merchandises;

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

    }
}
