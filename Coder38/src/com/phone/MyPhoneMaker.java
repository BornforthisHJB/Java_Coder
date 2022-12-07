package com.phone;

import com.phone.parts.*;

/**
 * @ClassName: com.phone.MyPhoneMaker
 * @Description: TODO
 * @Author: AndersonHJB
 * @date: 2022/11/22 23:08
 * @Version: V1.0
 * @Blog: https://bornforthis.cn
 */
public class MyPhoneMaker {
    // 我的手机制造商
    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.hasFigurePrintUnlocker = true;  // 指纹解锁器
        phone.price = 1999;  // 价格

        phone.screen = new Screen();  // 屏幕
        phone.screen.producer = "京东方";  // 屏幕生产商
        phone.screen.size = 8.8;  // 屏幕大小


        CPU cpu = new CPU();  // com.phone.parts.CPU
        cpu.producer = "三星";  // com.phone.parts.CPU 生产商
        cpu.speed = 3.5;  // com.phone.parts.CPU 速度

        Memory memory = new Memory();  // 内存
        memory.producer = "三星";  // 内存生产商
//        memory.producer = new String("三星");  // 内存生产商，这么写没啥意义，因为双引号 Java就会自动识别字符串
        memory.capacity = 4;  // 容量

        Storage storage = new Storage();  // 储存
        storage.producer = "Intel";  // 储存生产商
        storage.capacity = 128;  // 容量

        phone.mainboard = new Mainboard();  // 主板

        phone.mainboard.cpu = cpu;
        phone.mainboard.memory = memory;
        phone.mainboard.storage = storage;

        phone.mainboard.model = "EA888";
        phone.mainboard.year = 2019;
        // 想想我们创建了几个对象，有创建了几个引用？
        // 有几个 new 就有几个对象
        // 另外，还有 5个 string 对象
        phone.prePhone = new Phone();
//        引用能互相用吗？
//        com.phone.parts.Memory m1 = new com.phone.parts.Memory();
//        com.phone.parts.Storage s1 = new com.phone.parts.Storage();
//        com.phone.parts.Memory m2 = s1;
//        com.phone.parts.Storage s2 = m1;

    }
}

