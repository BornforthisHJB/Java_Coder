public class RandomNumber {

    public static void main(String[] args) {
        double randNum = 0;

        // 要生成一个大于 0.5 的随机数，只有随机数大于了 0.5，循环才会退出
        while (randNum < 0.5) {
            // 使用 Java 中的 Math.random()，生成一个随机数
            randNum = Math.random();
            System.out.println(randNum);
        }
        System.out.println("生成大于 0.5 的随机数是" + randNum);

        int rangeStart = 99;
        int rangeEnd = 180;

        for (int i = 0; i < 100; i++) {
            // 确定模
            int mod = rangeEnd - rangeStart;

            //生成随机数
            randNum = Math.random();
            // num 的值会在 0 到 mod-1，也就是 0 到 rangeEnd - rangeStart -1
            int num = ((int) (randNum * rangeEnd * 100)) % mod;

            // num 加 rangeStart 之后，值域是 0 到 rangeEnd - 1
            num += rangeStart;

            if (num <= rangeStart) {
                num = rangeStart + 1;
            }
            // 根据数据分析，这个条件不会满足，只是为了做最后的防护
            if (num >= rangeEnd) {
                num = rangeEnd - 1;
            }
            System.out.println("这次的随机数是：" + num);
        }
    }
}
