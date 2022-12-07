package com.phone.parts;

/**
 * @ClassName: TestUseMainboard
 * @Description: TODO
 * @Author: AndersonHJB
 * @date: 2022/11/28 13:29
 * @Version: V1.0
 * @Blog: https://bornforthis.cn
 */
public class TestUseMainboard {
    public static void main(String[] args) {
        Mainboard mainboard = new Mainboard();
        mainboard.cpu = new CPU();
        mainboard.cpu.producer = "aaa";
    }
}
