public class ForceConvert {
    public static void main(String[] args) {
        int intVal = 99;
        long longVal = 19999;
//        intVal = longVal;
        /*直接赋值会出错
        报错内容：java: 不兼容的类型: 从long转换到int可能会有损失
        Java计算机表示：这个损失，我决定不了，得你来决定；
        程序员：得我们自己来决定是否转换，所以需要强制转换
        (int) longVal-> 我知道，可以转的。——我允许你强制转换了*/

        intVal = (int) longVal;

        float floatVal = 11.32f;
        double doubleVal = 3344556.789;
        floatVal = (float) doubleVal;

        int a = 65;
        char b = (char) a;

    }
}
