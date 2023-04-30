/**
 * 二进制堆
 */
public class BinaryHeap {

    /**
     * 哈夫曼树节点数组
     */
    private HuffmanNode[] heap;
    /**
     * 堆大小
     */
    private int size;

    /**
     * 构造函数
     *
     * @param huffNodes 哈夫曼树节点数组
     */
    public BinaryHeap(HuffmanNode[] huffNodes) {
        // 堆的大小为哈夫曼树节点数组的大小
        this.size = huffNodes.length;
        // 哈夫曼树节点数组的大小加1，因为堆的0号位元素不存储数据
        this.heap = new HuffmanNode[size + 1];
        for (int i = 0; i < size; i++) {
            // 哈夫曼树节点数组的第i+1个元素存储哈夫曼树节点数组的第i个元素
            heap[i + 1] = huffNodes[i];
        }
        // 构建二进制堆
        buildHeap();
    }

    /**
     * 获取堆大小
     *
     * @return
     */
    public int getSize() {
        return size;
    }

    /**
     * 删除堆顶元素
     *
     * @return
     */

    public HuffmanNode deleteMin() {
        // 如果堆大小为0，返回null
        if (size == 0) {
            return null;
        }
        // 获取堆顶元素
        HuffmanNode min = heap[1];
        heap[1] = heap[size--];
        // 下滤
        percolateDown(1);
        return min;
    }

    /**
     * 插入元素
     *
     * @param huffNode 哈夫曼树节点
     */
    public void insert(HuffmanNode huffNode) {
        // 如果堆大小等于堆的长度减1，说明堆已满，需要扩容
        if (size == heap.length - 1) {
            // 扩容， 堆的大小加1
            HuffmanNode[] temp = new HuffmanNode[heap.length * 2];
            System.arraycopy(heap, 1, temp, 1, size);
            heap = temp;
        }
        // 堆大小加1
        heap[++size] = huffNode;
        percolateUp(size);
    }

    /**
     * 打印堆
     */
    public void printHeap() {
        for (int i = 1; i <= size; i++) {
            System.out.print(heap[i] + " ");
        }
        System.out.println();
    }

    /**
     * 构建二进制堆
     */
    private void buildHeap() {
        for (int i = size / 2; i > 0; i--) {
            percolateDown(i);
        }
    }

    /**
     * 下滤
     *
     * @param hole 下滤的起始位置
     *             下滤操作将二叉堆中指定位置 hole 的元素向下移动，
     *             直到满足堆的性质。具体而言，下滤操作会将 hole 的子节点中较小的那个节点（如果有的话）
     *             与 hole 位置的元素进行比较，如果较小的子节点比 hole 的元素更小，
     *             则将较小的子节点上移至 hole 的位置，hole 向下移动到较小的子节点的位置，
     *             继续向下比较和交换，直到 hole 的子节点都比 hole 的元素大或者 hole 没有子节点为止。
     */

    private void percolateDown(int hole) {
        // 子节点
        int child;
        HuffmanNode temp = heap[hole];
        while (hole * 2 <= size) {
            child = hole * 2;
            if (child != size && heap[child + 1].compareTo(heap[child]) < 0) {
                child++;
            }
            if (heap[child].compareTo(temp) < 0) {
                heap[hole] = heap[child];
            } else {
                break;
            }
            hole = child;
        }
        heap[hole] = temp;
    }

    /**
     * 上滤
     *
     * @param hole 上滤操作将二叉堆中指定位置 hole 的元素向上移动，
     *             直到满足堆的性质。具体而言，上滤操作会将 hole 的父节点与 hole 位置的元素进行比较，
     *             如果父节点比 hole 的元素更大，则将父节点下移至 hole 的位置，hole 向上移动到父节点的位置，
     *             继续向上比较和交换，直到 hole 的父节点不再比 hole 的元素大或者 hole 到达了根节点为止。
     */
    private void percolateUp(int hole) {
        HuffmanNode temp = heap[hole];
        while (hole > 1 && temp.compareTo(heap[hole / 2]) < 0) {
            heap[hole] = heap[hole / 2];
            hole /= 2;
        }
        heap[hole] = temp;
    }

}