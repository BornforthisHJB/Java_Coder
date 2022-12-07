/**
 * @ClassName: RefAndNull
 * @Description: TODO
 * @Author: AndersonHJB
 * @date: 2022/11/11 13:19
 * @Version: V1.0
 * @Blog: https://bornforthis.cn
 */
public class RefAndNull {
    public static void main(String[] args) {
        // 数组在创建出来之后，会按照类型给数组中的每个元素赋缺省值。
        // 引用类型的缺省值是null
        Merchandise[] merchandises = new Merchandise[9];
        // 给索引为偶数的引用赋值
        for (int i = 0; i < merchandises.length; i++) {
            merchandises[i] = new Merchandise(); // 数组元素放入整个实例化对象
        }
        System.out.println(merchandises[0]);
        merchandises[0].count = 1;
        merchandises[0].name = "aiyc";
        System.out.println(merchandises[1].name);
    }
}