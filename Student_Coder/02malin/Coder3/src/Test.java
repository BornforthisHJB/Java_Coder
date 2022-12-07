/**
 * @ClassName: Tester
 * @Description: TODO
 * @Author: AndersonHJB
 * @date: 2022/11/11 22:20
 * @Version: V1.0
 * @Blog: https://bornforthis.cn
 */

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Test {

    private HashMap<String, String> phonebook;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Test test = new Test();
        test.savePhoneNumber();
        System.out.print("请输入要查找的姓名：");
        String name1 = scanner.nextLine();
        String name = "";
        String[] strings = name1.split(" ");
        for (int i = 0; i < strings.length; i++) {
            strings[i] = strings[i].toLowerCase();
            if (i == strings.length - 1) {
                name = name + strings[i];
            } else {
                name = name + strings[i] + " ";
            }
        }
        test.showPhoneNumber(name);
    }

    public void showPhoneNumber(String name) {

        boolean a = true;
        Set<String> strings = phonebook.keySet();
        Iterator<String> iterator = strings.iterator();
        while (iterator.hasNext()) {
            String next = iterator.next();
            String phone_number = phonebook.get(next);
            if (name.equals(next)) {
                System.out.println(name + ":" + phone_number);
                a = false;
            }

        }
        if (a) {
            System.out.println("未找到！");
        }
    }

    public void savePhoneNumber() {

        phonebook = new HashMap<>();
        phonebook.put("tom cat", "123456");
        phonebook.put("my sql", "1234567");
        phonebook.put("key value", "12345678");
    }

}