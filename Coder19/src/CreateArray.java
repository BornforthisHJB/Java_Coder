public class CreateArray {
    public static void main(String[] args) {
        int[] intArray = new int[9];

        System.out.println(intArray[2]);

        double[] doubleArray = new double[100];

        System.out.println(doubleArray[66]);

        // 添加数据
        intArray[0] = 0;
        intArray[1] = 1;
        intArray[2] = 2;
        System.out.println(intArray[2]);
        System.out.println(intArray.length);  // 获取数组长度

    }
}
