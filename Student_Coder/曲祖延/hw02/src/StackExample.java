import java.util.EmptyStackException;

public class StackExample {
    private final int[] data;  // 存储元素的数组
    private int top;  // 栈顶指针

    // 构造函数，初始化数组和栈顶指针
    public StackExample(int capacity) {
        data = new int[capacity];
        top = -1;  // top 初始值为 -1，表示 Stack 为空

    }

    // TODO:判断 Stack 是否为空
    public boolean isEmpty() {
//        return top == -1;
        if (top == -1) {
            return true;
        } else {
            return false;
        }
    }

    //  TODO: 判断 Stack 是否已满
    public boolean isFull() {
        return top == data.length - 1;
    }

    // TODO: 将元素压入 Stack 中
    public void push(int item) {
        if (isFull()) {  // 如果 Stack 已满，抛出异常
            throw new RuntimeException("Stack is full");
        }
        data[++top] = item;  // 将元素压入 Stack 中，并更新栈顶指针
    }

    // 弹出栈顶元素
    public int pop() {
        if (isEmpty()) {  // 如果 Stack 为空，抛出异常
            throw new RuntimeException("Stack is empty");
        }
        return data[top--];  // 弹出栈顶元素，并更新栈顶指针
    }

    // 获取栈顶元素，但不弹出
    public int peek() {
        if (isEmpty()) {  // 如果 Stack 为空，抛出异常
            throw new RuntimeException("Stack is empty");
        }
        return data[top];  // 获取栈顶元素
    }

    // 获取 Stack 的大小
    public int size() {
        return top + 1;
    }


    public static void main(String[] args) {
        StackExample stack = new StackExample(5);
        stack.push(10);
        stack.push(13);
        stack.push(16);
//        System.out.println(stack.size());
//        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.peek());
    }


//    public static void main(String[] args) {
//        System.out.println(data.length);
//    }
}
