public class Example {
    public static void main(String[] args) {
        double randNum = 0;

        // 要生成一个大于 0.5 的随机数，只有随机数大于了 0.5，循环才会退出
        while (randNum < 0.5) {
            // 使用 Java 中的 Math.random()，生成一个随机数
            randNum = Math.random();
            System.out.println(randNum);
        }
        System.out.println("生成大于 0.5 的随机数是" + randNum);

        int rangeStart = 30;
        int rangeEnd = 90;
//        int rangeEnd = 31;

        /*我们如何确保，生成的随机数是在我们的范围之内呢？
         * 1、先把我们 Math.random() 生成的 0～1 之间的随机数，乘以一个足够大的值，比如：Math.random() * rangeEnd * 10
         * 这样，这个值就不是从 0～1 了。就已经足够大，超出我们大范围
         * 2、然后我们再取一个模，取一个什么模呢？——取 ranegStart、rangeEnd 差的模，
         * 这个数再加上 rangeStart 那它肯定是从 rangeStart 到 rangeEnd 之间的，而且它也是随机数*/
        // 取模
        int mod = rangeEnd - rangeStart;
        if (rangeStart <0 || rangeEnd <0){
            System.out.println("开始和结束必须是整数或者 0");
        }
        if (mod <= 1) {
            System.out.println("非法的数字范围:(" + rangeStart + "," + rangeEnd + ")");
        }
        for (int i = 0; i < 50; i++) {
//            if (rangeEnd-rangeStart>1){
//
//            }
            int bigRandom = (int) (Math.random() * rangeEnd * 100);
            int numberToGuess = (bigRandom % mod) + rangeStart;
//            (Math.random() * rangeEnd * 100 % mod) + rangeStart;

            if (numberToGuess <= rangeStart) {
                numberToGuess = rangeStart + 1;
            } else if (numberToGuess > rangeEnd) {
                numberToGuess = rangeEnd - 1;
            }
            System.out.println("mod=" + mod + ", bigRandom=" + bigRandom);
            System.out.println("mod=" + mod + ", numberToGuess=" + numberToGuess);
        }


    }
}

