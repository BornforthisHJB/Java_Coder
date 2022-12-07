package com.phone;

import com.phone.parts.Mainboard;
import com.phone.parts.Screen;

/**
 * @ClassName: com.phone.Phone
 * @Description: TODO
 * @Author: AndersonHJB
 * @date: 2022/11/22 23:05
 * @Version: V1.0
 * @Blog: https://bornforthis.cn
 */
public class Phone {
    Screen screen; // 屏幕
//    com.phone.parts.Screen screen = new com.phone.parts.Screen(); // 屏幕
    Mainboard mainboard;  // 主板
    double price;  // 价格
    boolean hasFigurePrintUnlocker;  // 布尔的标识符

    Phone prePhone;
}

