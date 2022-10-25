public class ReferenceAndPrimaryDataType {
    public static void main(String[] args) {

        // >> TODO m1 是一个 Merchandise 类型的引用，只能指向 Merchandise 类型的实例
        // >> TODO 引用数据类型变量包含两部分信息：类型和实例。也就是说，
        //    TODO 每一个引用数据类型的变量（简称引用），都是指向某个类（ class /自定义类型）
        //    TODO 的一个实例/对象（instance / object）。不同类型的引用在 Java 的世界里都是引用。
        // >> TODO 引用的类型信息在创建时就已经确定，可以通过给引用赋值，让其指向不同的实例.
        //         比如 m1 就是 Merchandise 类型，只能指向 Merchandise 的实例。
        Merchandise m1;  // TODO:>>>引用类型，并没有像 int、double 一样，拥有一个明确的名字。引用类型就像下面所有用类来引用创建的变量，都是引用类型。
        m1 = new Merchandise();
        Merchandise m2 = new Merchandise();  // TODO:>>一手牵着类型，一手牵着实例，这就是引用
        Merchandise m3 = new Merchandise();
        Merchandise m4 = new Merchandise();
        Merchandise m5 = new Merchandise();

        // >> TODO 给一个引用赋值，则两者的类型必须一样。m5可以给m1赋值，因为他们类型是一样的
        m1 = m5;

        System.out.println("m1=" + m1);
        System.out.println("m2=" + m2);
        System.out.println("m3=" + m3);
        System.out.println("m4=" + m4);
        System.out.println("m5=" + m5);

        Merchandise m6 = m1;
        System.out.println("m6=" + m6);
        m6 = m5;
        System.out.println("m6=" + m6);


        System.out.println("m1=" + m1);
        System.out.println("m2=" + m2);
        System.out.println("m3=" + m3);
        System.out.println("m4=" + m4);
        System.out.println("m5=" + m5);


        int a = 999;

    }
}
