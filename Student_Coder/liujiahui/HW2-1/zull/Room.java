import java.util.Set;
import java.util.HashMap;

/**
 * Room（房间）类 - 冒险游戏中的一个房间。
 * <p>
 * 这个类 是 "祖尔的世界" 应用程序的一部分。
 * "祖尔的世界" 是一个非常简单的、基于文本的冒险游戏。
 * <p>
 * 一个 "Room"（"房间"）代表游戏场景中的一个位置。
 * 它通过出口与其他房间相连。
 * 对于每一个现有的出口，房间都会存储一个对邻近房间的引用。
 *
 * @author Michael Kölling and David J. Barnes
 * @version 2016.02.29
 */

public class Room {
    private String description;
    private HashMap<String, Room> exits;        // 储存这个房间的出口们
    //    private Map<String, Room> exits = new HashMap<>();
    // ----------添加的代码 1 Start----------
    private Item item = null;
    private Trap trap = null;
    // ----------添加的代码 1 End----------
    /**
     * 创建一个描述 "description"（"描述"） 的房间。
     * 最初，它没有出口。"description" 是 "一个厨房" 或 "一个开放的庭院" 之类的东西。
     *
     * @param description 该房间的描述。
     */
    public Room(String description) {
        this.description = description;
        exits = new HashMap<>();
    }
    // ----------添加的代码 2 Start----------
    public Room(String description, Item item) {
        this(description);
        this.item = item;
    }

    //    public Room(String description, Item thing, Trap trap) {
    public Room(String description, Item item, Trap trap) {
        this(description);
        this.item = item;
        this.trap = trap;
    }

    public Room(String description, Trap trap) {
        this(description);
        this.trap = trap;
    }
    // ----------添加的代码 2 End----------

    /**
     * 定义这个房间的一个出口。
     *
     * @param direction 出口的方向。
     * @param neighbor  出口所通往的房间。
     */
    public void setExit(String direction, Room neighbor) {
        exits.put(direction, neighbor);
    }

    /**
     * @return 房间的简短描述
     * （就是在构造函数中定义的那个）。
     */
    public String getShortDescription() {
        return description;
    }

    /**
     * 以此格式返回对房间的描述：
     * 你正在厨房。
     * 出口：北西
     *
     * @return 这个房间的长篇描述
     */
    public String getLongDescription() {
        return "You are " + description + ".\n" + getExitString();
    }

    public String getDescription() {
        return description;
    }
    /**
     * 返回一个描述房间出口的字符串，例如
     * "出口：北西"。
     *
     * @return 房间出口的详细信息。
     */
    private String getExitString() {
        String returnString = "出口：";
        Set<String> keys = exits.keySet();
        for (String exit : keys) {
            returnString += " " + exit;
        }
        return returnString;
    }

    /**
     * 返回如果我们从这个房间向方向 "direction" 走，就会到达的这个房间。
     * 如果在这个方向上没有房间，则返回 null。
     *
     * @param direction 出口的方向。
     * @return 指定方向的房间。
     */
    public Room getExit(String direction) {
        return exits.get(direction);
    }

//    public
    // ----------添加的代码 3 Start----------
//    public void printExits() {
//        System.out.print("方向： ");
//        exits.keySet().stream().forEach(key -> System.out.print(key + " "));
//        System.out.println();
//    }

    public Room goNext(String direction) {
        return exits.get(direction);
    }

    public Item getItem() {
        return this.item;
    }

    public void removeItem() {
        this.item = null;
    }

    public Trap getTrap() {
        return this.trap;
    }

    public void removeTrap() {
        this.trap = null;
    }
    // ----------添加的代码 3 End----------
}

