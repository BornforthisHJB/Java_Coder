/**
 * @ClassName: Item
 * @Description: TODO
 * @Author: AndersonHJB
 * @date: 2022/11/29 16:34
 * @Version: V1.0
 * @Blog: https://bornforthis.cn
 */
public class Item {
    private String name;
    private int weight;
    private int life;

//    public Item(String name) {
    public Item(String name, int weight, int life) {
        this.name = name;
        this.weight = weight;
        this.life = life;
    }

    public int getWeight() {
        return this.weight;
    }

    public String getName() {
        return this.name;
    }

    public String toString() {
        return "[名称：" + name + "，分数：" + weight + "，生命：" + life + "]";
//        return "[名称：" + name + "，分数：" + "]";
//        return "[名称：" + this.name + "，分数：" + this.score + "，生命：" + this.life + "]";
    }

    public int getLife() {
        return this.life;
    }

    public static void main(String[] args) {
        Item im = new Item("aiyc", 11, 111);
//        System.out.println(im.getLife());
        System.out.println(im.toString());
    }
}

/*
对于房间的实现，使用了 Item.java、Item.java。房间的实现代码是机遇现有的代码基础上，进行扩展开发。主要实现了：实现有物品或无物品放入，创建房间。避免了 new Room() 时的有可能出现某个房间没有物品产生的报错。

房间内的物品可以添加可以移除，例如：当玩家 pick 物品之后，房间内不在有此物品。实现逻辑：this.item = null; 并封装成相应的方法。

对于物品 Item 的实现较为轻松，思考自己故事中出现的物品且物品所需要拥有的属性，实现了设置获取物品名称、重量。实现方法简单直接：
public String getName() {
        return this.name;
    }
*/
