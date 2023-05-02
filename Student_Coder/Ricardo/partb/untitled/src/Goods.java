/**
 * @ClassName: Goods
 * @Description: TODO
 * @Author: AndersonHJB
 * @date: 2023/5/2 09:01
 * @Version: V1.0
 * @Blog: https://bornforthis.cn
 */

/**
 * class 1 普通商品类
 * 包含有 id, name, price 属性
 */
public class Goods {
    private int id;
    private String name;
    private double price;

    public Goods(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}