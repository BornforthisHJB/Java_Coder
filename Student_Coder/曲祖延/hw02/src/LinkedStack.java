/**
 * @ClassName: LinkedList
 * @Description: TODO
 * @Author: AndersonHJB
 * @date: 2023/3/9 21:57
 * @Version: V1.0
 * @Blog: https://bornforthis.cn
 */

import java.util.LinkedList;
import java.util.Stack;

/**
 * 一个栈的实现，使用链表作为底层数据结构
 *
 * @param <E>
 */
public class LinkedStack<E> extends Stack<E> {
    /**
     * 底层数据结构 依赖 LinkedList
     */
    private LinkedList<E> list = new LinkedList<>();

    /**
     * 构造函数
     * 依赖于 LinkedStack 的构造函数
     */
    public LinkedStack() {
        this.list = new LinkedList<>();
    }

    /**
     * 返回栈的大小
     */
    public int size() {
        return list.size();
    }

    /**
     * 判断栈是否为空
     */
    public boolean isEmpty() {
        return list.isEmpty();
    }

    /**
     * 入栈
     *
     * @param element 要入栈的元素
     */
    public E push(E element) {
        list.addFirst(element);
        return element;
    }

    /**
     * 查看栈顶元素
     */
    public E peek() {
        return list.getFirst();
    }

    /**
     * 出栈
     */

    public E pop() {
        return list.removeFirst();
    }

}
