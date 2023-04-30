/**
 * @ClassName: HuffmanNode
 * @Description: TODO
 * @Author: AndersonHJB
 * @date: 2023/4/26 08:07
 * @Version: V1.0
 * @Blog: https://bornforthis.cn
 */

/**
 * 哈夫曼树节点
 */
public class HuffmanNode implements Comparable<HuffmanNode> {
    /**
     * 字母
     */
    public String letter;
    /**
     * 频率
     */
    public Double frequency;
    /**
     * 左子节点
     */
    public HuffmanNode left, right;

    /**
     * 构造函数
     *
     * @param letter    字母
     * @param frequency 频率
     */
    public HuffmanNode(String letter, Double frequency) {
        this.letter = letter;
        this.frequency = frequency;
        this.left = null;
        this.right = null;
    }

    /**
     * 构造函数
     * @param left 左子节点
     * @param right 右子节点
     */
    public HuffmanNode(HuffmanNode left, HuffmanNode right) {
        // 左子节点的字母加上右子节点的字母
        this.letter = left.letter + right.letter ;
        this.frequency = left.frequency + right.frequency;
        this.left = left;
        this.right = right;
    }

    /**
     * 比较两个哈夫曼树节点的大小
     * @param huff the object to be compared.
     * @return
     */
    public int compareTo(HuffmanNode huff) {
        return this.frequency.compareTo(huff.frequency);
    }

    /**
     * 获取哈夫曼树节点的字符串表示
     * @return
     */
    public String toString() {
        return "<" + letter + ", " + frequency + ">";
    }
}
