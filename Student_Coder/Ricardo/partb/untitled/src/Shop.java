/**
 * @ClassName: Shop
 * @Description: TODO
 * @Author: AndersonHJB
 * @date: 2023/5/2 09:00
 * @Version: V1.0
 * @Blog: https://bornforthis.cn
 */

import java.util.Scanner;

/**
 * 商店类
 * 包含有 items, numOfItems 属性
 */
public class Shop {
    /**
     * items 数组用于存储所有商品
     */
    private Object[] items;
    /**
     * numOfItems 用于记录当前商店中商品的数量
     */
    private int numOfItems;

    /**
     * 构造方法
     *
     * @param size 用于初始化 items 数组的大小
     */
    public Shop(int size) {
        items = new Object[size];
        numOfItems = 0;
    }

    /**
     * 添加商品
     *
     * @param item 要添加的商品
     */
    public void addItem(Object item) {
        // 如果 items 数组已满，则提示用户无法添加继续添加商品
        if (numOfItems == items.length) {
            System.out.println("Shop is full!");
            return;
        }
        // 否则，将商品添加到 items 数组中
        items[numOfItems] = item;
        // 并将 numOfItems 加 1 商店中商品数量加 1
        numOfItems++;
    }

    /**
     * 显示所有商品
     */
    public void displayAllItems() {
        // 遍历 items 数组中的所有商品
        for (int i = 0; i < numOfItems; i++) {
            if (items[i] instanceof Goods) {
                Goods item = (Goods) items[i];
                System.out.println(item.getId() + " " + item.getName() + " " + item.getPrice());
            } else if (items[i] instanceof Game) {
                Game item = (Game) items[i];
                System.out.println(item.getId() + " " + item.getName() + " " + item.getNumOfPlayers() + " " + item.getPlatform());
            }
        }
    }

    /**
     * 修改商品价格
     *
     * @param index    商品编号
     * @param newPrice 新价格
     */
    public void changePrice(int index, double newPrice) {
        // 如果 index 不合法，则提示用户输入的商品编号不合法
        // 注意：index 从 1 开始，而数组下标从 0 开始，所以 index 需要减 1
        if (items[index - 1] instanceof Goods) {
            Goods item = (Goods) items[index - 1];
            item.setPrice(newPrice);
        } else {
            System.out.println("This item does not have a price attribute.");
        }
    }

    /**
     * 修改所有商品价格
     *
     * @param newPrice 新价格
     */
    public void changeAllPrices(double newPrice) {
        // 遍历 items 数组中的所有商品， 并修改价格
        for (int i = 0; i < numOfItems; i++) {
            if (items[i] instanceof Goods) {
                Goods item = (Goods) items[i];
                item.setPrice(newPrice);
            }
        }
    }

    /**
     * 修改商品的 numOfPlayers 属性 (只有 Game 类型的商品才有 numOfPlayers 属性)
     *
     * @param index           商品编号
     * @param newNumOfPlayers 新的 numOfPlayers 属性值
     */
    public void changeNumOfPlayers(int index, int newNumOfPlayers) {
        // 如果 index 不合法，则提示用户输入的商品编号不合法，
        // 注意：index 从 1 开始，而数组下标从 0 开始，所以 index 需要减 1
        if (items[index - 1] instanceof Game) {
            Game item = (Game) items[index - 1];
            item.setNumOfPlayers(newNumOfPlayers);
        } else {
            System.out.println("This item does not have a numOfPlayers attribute.");
        }
    }

    /**
     * 修改所有商品的 numOfPlayers 属性 (只有 Game 类型的商品才有 numOfPlayers 属性)
     *
     * @param newNumOfPlayers 新的 numOfPlayers 属性值
     */
    public void changeAllNumOfPlayers(int newNumOfPlayers) {
        for (int i = 0; i < numOfItems; i++) {
            if (items[i] instanceof Game) {
                Game item = (Game) items[i];
                item.setNumOfPlayers(newNumOfPlayers);
            }
        }
    }

    /**
     * 修改商品的 platform 属性 (只有 Game 类型的商品才有 platform 属性)
     *
     * @param index3      商品编号
     * @param newPlatform 新的 platform 属性值
     */

    public void changePlatform(int index3, String newPlatform) {
        if (items[index3 - 1] instanceof Game) {
            Game item = (Game) items[index3 - 1];
            item.setPlatform(newPlatform);
        } else {
            System.out.println("This item does not have a platform attribute.");
        }
    }

    /**
     * 菜单构造方法
     *
     * @param classType 商品类型， 1 表示 Goods 类型， 2 表示 Game 类型
     */
    public void menu(int classType) {
        // 创建 Scanner 对象，用于接收用户输入
        Scanner input = new Scanner(System.in);
        // choice 用于记录用户输入的选项
        int choice = -1;
        // 当用户输入 0 时，退出菜单，否则一直显示菜单
        while (choice != 0) {
            System.out.println("\n----- Menu -----");
            switch (classType) {
                // 如果 classType 为 1，则显示 Goods 类型的菜单，
                // 该菜单包含 4 个选项：1. 添加商品 2. 显示所有商品 3. 修改商品价格 4. 修改所有商品价格
                case 1:
                    System.out.println("1. Add a Goods item");
                    System.out.println("2. Display all items");
                    System.out.println("3. Change price of one specific Goods item");
                    System.out.println("4. Change price of all Goods items");
                    break;
                // 如果 classType 为 2，则显示 Game 类型的菜单，
                // 该菜单包含 5 个选项：1. 添加商品 2. 显示所有商品 3. 修改商品的 numOfPlayers 属性 4. 修改所有商品的 numOfPlayers 属性 5. 修改商品的 platform 属性
                case 2:
                    System.out.println("1. Add a Game item");
                    System.out.println("2. Display all items");
                    System.out.println("3. Change number of players of one specific Game item");
                    System.out.println("4. Change number of players of all Game items");
                    System.out.println("5. Change platform of one specific Game item");
                    break;
                // 如果 classType 既不是 1 也不是 2，则提示用户输入的 classType 不合法
                default:
                    System.out.println("Invalid class type");
                    break;
            }
            // 第 0 个选项是退出菜单
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = input.nextInt();
            // 根据用户输入的选项，执行相应的功能
            switch (choice) {
                // 当用户输入 1 时， 添加商品，
                // 如果 classType 为 1，则添加 Goods 类型的商品，
                // 如果 classType 为 2，则添加 Game 类型的商品
                // 添加Goods时，需要提示用户输入商品的 id, name 和 price
                // 添加Game时，需要提示用户输入商品的 id, name, numOfPlayers 和 platform
                case 1:
                    if (classType == 1) {
                        System.out.print("Enter item id: ");
                        int id1 = input.nextInt();
                        System.out.print("Enter item name: ");
                        String name1 = input.next();
                        System.out.print("Enter item price: ");
                        double price1 = input.nextDouble();
                        addItem(new Goods(id1, name1, price1));
                    } else if (classType == 2) {
                        System.out.print("Enter item id: ");
                        int id2 = input.nextInt();
                        System.out.print("Enter item name: ");
                        String name2 = input.next();
                        System.out.print("Enter number of players: ");
                        int numOfPlayers = input.nextInt();
                        System.out.print("Enter platform: ");
                        String platform = input.next();
                        addItem(new Game(id2, name2, numOfPlayers, platform));
                    }
                    break;
                // 当用户输入 2 时，显示所有商品
                case 2:
                    displayAllItems();
                    break;

                case 3:
                    // 如果 classType 为 1，则修改 Goods 类型的商品的 price 属性
                    if (classType == 1) {
                        System.out.print("Enter the index of the item you want to change: ");
                        int index1 = input.nextInt();
                        System.out.print("Enter the new price: ");
                        double newPrice1 = input.nextDouble();
                        changePrice(index1, newPrice1);
                        // 如果 classType 为 2，则修改 Game 类型的商品的 numOfPlayers 属性
                    } else if (classType == 2) {
                        System.out.print("Enter the index of the item you want to change: ");
                        int index2 = input.nextInt();
                        System.out.print("Enter the new number of players: ");
                        int newNumOfPlayers1 = input.nextInt();
                        changeNumOfPlayers(index2, newNumOfPlayers1);
                    }
                    break;
                case 4:
                    if (classType == 1) {
                        // 如果 classType 为 1，则修改所有 Goods 类型的商品的 price 属性
                        System.out.print("Enter the new price: ");
                        double newPrice2 = input.nextDouble();
                        changeAllPrices(newPrice2);
                    } else if (classType == 2) {
                        // 如果 classType 为 2，则修改所有 Game 类型的商品的 numOfPlayers 属性
                        System.out.print("Enter the new number of players: ");
                        int newNumOfPlayers2 = input.nextInt();
                        changeAllNumOfPlayers(newNumOfPlayers2);
                    }
                    break;
                // 第五个选项只有 classType 为 2 时才有，用于修改 Game 类型的商品的 platform 属性
                case 5:
                    if (classType == 2) {
                        System.out.print("Enter the index of the item you want to change: ");
                        int index3 = input.nextInt();
                        System.out.print("Enter the new platform: ");
                        String newPlatform = input.next();
                        changePlatform(index3, newPlatform);
                    }
                case 0:
                    // 当用户输入 0 时，退出程序
                    System.out.println("Exiting program...");
                    break;
                default:
                    // 当用户输入的选项不是 0-5 时，提示用户输入的选项不合法
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
        // 关闭 Scanner 对象
        input.close();
    }


    /**
     * The main method
     *
     * @param args
     */

    public static void main(String[] args) {
        // 创建一个 Shop 对象，默认其为 null
        Shop shop = null;
        Scanner input = new Scanner(System.in);

        // 提示用户选择一个类， 1 代表 Goods 类， 2 代表 Game 类
        System.out.println("Select a class to use:");
        System.out.println("1. Goods");
        System.out.println("2. Game");
        int classType = input.nextInt();

        // 根据用户的选择，创建一个 Shop 对象
        switch (classType) {
            // 如果用户选择 1，则创建一个 Goods 类型的 Shop 对象，
            // 如果用户选择 2，则创建一个 Game 类型的 Shop 对象，
            // 并提示用户输入 Shop 的大小
            case 1:
            case 2:
                System.out.print("Enter the size of the Shop: ");
                int size1 = input.nextInt();
                shop = new Shop(size1);
                break;
            default:
                // 如果用户输入的选项不是 1 或 2，则提示用户输入的选项不合法。
                // 并退出程序
                System.out.println("Invalid choice. Exiting program...");
                System.exit(0);
        }
        // 调用 Shop 对象的 menu 方法，显示菜单并执行相应的操作
        shop.menu(classType);
    }


}
