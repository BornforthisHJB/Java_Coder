public class WhatArray {
    public static void main(String[] args) {
        int[] book = new int[10];
        // new int[10]: 创建一个大小为10的 int 数组「在小本本上面，连续十页纸，创建 10 int 那么大的内存」。——创建一个数组，把他们绑起来
        // 所以，我们可以在上面标记一下 int[10]
        // 那 book = new int[10] 是什么意思？——这个 book 就是数组的名，这个名就是这个数组第一个位置「小本本的第一页的地址」的物理地址。（也就是说，book 它等于地址。）
        // 所以说，book 本身并不是数组，它只是保存了数组的地址。——也就是 book 指向了数组
    /*int[] book = new int[10];
    两个实体：
        第一个实体数组就是数组本身
        第二个实体就是 book*/

        book[0] = 11;
        book[0] = 1111111;
        int[] book2 = book;
        System.out.println(book[0]);
    }


}
