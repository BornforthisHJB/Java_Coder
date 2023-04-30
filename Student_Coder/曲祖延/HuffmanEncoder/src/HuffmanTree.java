/**
 * @ClassName: HuffmanTree
 * @Description: TODO
 * @Author: AndersonHJB
 * @date: 2023/4/26 08:25
 * @Version: V1.0
 * @Blog: https://bornforthis.cn
 */
/**
 * 哈夫曼树
 */
public class HuffmanTree {
    /** 根节点 */
    HuffmanNode root;

    /**
     * 构造函数
     * @param huff 哈夫曼树节点
     */
    public HuffmanTree(HuffmanNode huff) {
        root = huff;
    }

    /**
     * 打印哈夫曼树
     */
    public void printLegend() {
        printLegend(root, "");
    }

    /**
     * 打印哈夫曼树
     * @param t 哈夫曼树节点
     * @param s 字符串
     */
    private void printLegend(HuffmanNode t, String s) {
        if (t.letter.length() > 1) {
            printLegend(t.left, s + "0");
            printLegend(t.right, s + "1");
        } else {
            System.out.println(t.letter + "=" + s);
        }
    }

    /**
     * 将字符串表示的哈夫曼树转换为二叉堆
     * @param legend 字符串表示的哈夫曼树
     * @return 二叉堆
     */
    public static BinaryHeap legendToHeap(String legend) {
        // 将字符串表示的哈夫曼树转换为二叉堆
        String[] elements = legend.split(" ");
        // 创建二叉堆
        HuffmanNode[] nodes = new HuffmanNode[elements.length/2];
        // 将字符串表示的哈夫曼树转换为二叉堆
        for (int i = 0, j = 0; i < elements.length; i+=2, j++) {
            nodes[j] = new HuffmanNode(elements[i], Double.parseDouble(elements[i+1]));
        }
        return new BinaryHeap(nodes);
    }

    /**
     * 从二叉堆创建哈夫曼树
     * @param b 二叉堆
     * @return
     */
    public static HuffmanTree createFromHeap(BinaryHeap b) {
        // 从二叉堆创建哈夫曼树， 当而节点大于1时，取出最小的两个节点，合并为一个节点，再插入二叉堆
        while (b.getSize() > 1) {
            // 取出最小的两个节点
            HuffmanNode left =b.deleteMin();
            HuffmanNode right =  b.deleteMin();
            // 合并为一个节点
            HuffmanNode parent = new HuffmanNode(left, right);
            // 插入二叉堆
            b.insert(parent);
        }
        // 返回哈夫曼树
        return new HuffmanTree( b.deleteMin());
    }

    /**
     * 测试
     * @param args
     */
    public static void main(String[] args) {
        String legend = "A 20 E 24 G 3 H 4 I 17 L 6 N 5 O 10 S 8 V 1 W 2";
        BinaryHeap heap = legendToHeap(legend);
        heap.printHeap();
        HuffmanTree tree = createFromHeap(heap);
        tree.printLegend();
    }
}