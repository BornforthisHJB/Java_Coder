/**
 * 该类是 "祖尔的世界" 应用程序的主类。
 * "祖尔的世界" 是一个非常简单的、基于文本的冒险游戏。
 * 用户可以在一些场景中散步。这就是全部。它真的应该被扩展，以使其更有趣!
 * 要玩这个游戏，需要创建这个类的一个实例，并调用 "play" 方法。
 * 这个主类创建并初始化所有其他的类：
 * 它创建所有的房间，创建解析器并启动游戏。
 * 它还评估和执行解析器返回的命令。
 *
 * @author Michael Kölling and David J. Barnes
 * @version 2016.02.29
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Game {
    private Parser parser;  // parser 中文为：解析器
    private Room currentRoom;  // 当前房间
    private Player player;  // 添加玩家

    private static ArrayList<String> Backpack = new ArrayList<String>(); // 背包
    private static int Backpack_Weight = 0;  // 背包重量计算
    private static ArrayList<String> NoPick = new ArrayList<String>();  // 不能拿的东西
    private List<Room> historyRooms = new ArrayList<>(); // 历史房间
    private final List<Room> RandomRoom = new ArrayList<>(); // 随机房间

    /**
     * 创建游戏并初始化其内部地图。
     */
    public Game() {
        createRooms();
        parser = new Parser();
        player = new Player();  // 实例化玩家
        // 添加不能 pick 的东西
        NoPick.add("镜子");
    }

    /**
     * 创建所有的房间并将它们的出口连接在一起。
     */
    private void createRooms() {
        Room hall, corridor, master_bedroom, Evan_bedroom, butler_bedroom, kitchen, fountain, rosary, swimming_pool;

        // create the rooms
        hall = new Room("我来到了一个北欧风格的客厅，家具整齐的摆放着，客厅很大但不温馨。我好奇的四处打量着，好奇的四处探索", new Item("Lego", 10, 11));
        corridor = new Room("这里是一个长长的走廊，走廊两侧有很多门似乎通往很多房间", new Item("mirror", 80, 111));
        master_bedroom = new Room("这是一个很大的房间，看着周围精美的摆设，应该是这个房子的主卧", new Item("watch", 10, 111));
        Evan_bedroom = new Room("这是一个温馨的房间，柜子上摆满了各式各样的奖杯，应该是这个家里小孩的房间", new Item("ring", 52, 111));
        butler_bedroom = new Room("这个房间看起来十分简洁，不出所料是这个家管家的房间");
        kitchen = new Room("我来到了厨房");
        fountain = new Room("我来到喷泉边，这是一个很漂亮的喷泉");
        rosary = new Room("这是一片很大的玫瑰园，充满了花香", new Item("rose", 10, 11));
        swimming_pool = new Room("这里有个很大很干净的泳池");

        //initialise room exits
        hall.setExit("north", corridor);
        hall.setExit("east", kitchen);
        hall.setExit("south", rosary);
        corridor.setExit("south", hall);
        corridor.setExit("east", Evan_bedroom);
        corridor.setExit("west", master_bedroom);
        Evan_bedroom.setExit("west", corridor);
        master_bedroom.setExit("east", corridor);
        kitchen.setExit("west", hall);
        kitchen.setExit("east", butler_bedroom);
        kitchen.setExit("south", swimming_pool);
        butler_bedroom.setExit("west", kitchen);
        rosary.setExit("north", hall);
        rosary.setExit("east", swimming_pool);
        rosary.setExit("west", fountain);
        swimming_pool.setExit("north", kitchen);
        swimming_pool.setExit("west", rosary);
        fountain.setExit("east", rosary);


        currentRoom = hall;  // start game outside

        // 魔法房间
        RandomRoom.add(hall);
        RandomRoom.add(corridor);
        RandomRoom.add(master_bedroom);
        RandomRoom.add(Evan_bedroom);
        RandomRoom.add(butler_bedroom);
//        RandomRoom.add(kitchen);
        RandomRoom.add(fountain);
        RandomRoom.add(rosary);
        RandomRoom.add(swimming_pool);


    }

    /**
     * 主要的游戏程序。 循环，直到游戏结束。
     */
    public void play() {
        printWelcome();  // 游戏开场白

        // 进入主命令循环。
        // 在这里，我们反复读取命令并执行它们，直到游戏结束。

        boolean finished = false;
        while (!finished) {
            Command command = parser.getCommand();
            finished = processCommand(command);
        }
        System.out.println("谢谢您的游玩。 再见。");
    }

    // -------------修改1 Start----------------------

    /**
     * 打印出给玩家的开场白。
     */
    private void printWelcome() {
        System.out.println();
        System.out.println("经过漫长的旅行，");
        System.out.println("你终于找到了传说中冒险者的禁地——黑咒岛");
        System.out.println("岛如其名，整座岛屿被笼罩在黑暗的诅咒当中");
        System.out.println("即使在阳光之下，你也伸手不见五指");
        System.out.println();
        System.out.println(currentRoom.getLongDescription());
//        currentRoom.printExits();
    }
    // -------------修改1 End----------------------

    // -------------修改2 Start----------------------

    /**
     * 给出一条命令，处理（即：执行）该命令。
     *
     * @param command 要处理的命令。
     * @return true 如果该命令结束游戏，否则 return false
     */
    private boolean processCommand(Command command) {
        boolean wantToQuit = false;
//        boolean gameOver = false; // 游戏结束

        if (command.isUnknown()) {
            System.out.println("我不知道你什么意思。o(╯□╰)o");
            return false;
        }

        String commandWord = command.getCommandWord();
//        no_use.Word commandWord = command.getCommandWord();
//        实现了什么指令、怎么实现的、采取 switch...case... 来进行判断，在 commandWords 中添加要被识别的指令
        /**
         * pick: 玩家拿取物品，相关实现方法：pickThing、isInArray、overweight。
         * touch：检测玩家的是否且待钻石触摸房间镜子，实现方法采取判断、房间是否有镜子，条件同时成立时，返回 true，修改 wantToQuit 的值
         * look: 查看当前房间拥有什么物品，使用 currentRoom.getItem() 实现，判断是否为 null 即可
         * back: 回退上一个房间，知道回到七点。使用数组列表，存储玩家历史足迹。
         * */
        switch (commandWord) {
            case "help":
                printHelp();
                break;
            case "go":
                goRoom(command);
                wantToQuit = gameOver();
                break;
            case "quit":
                wantToQuit = quit(command);
                break;
            case "look":
                look();
                break;
            case "pick":
                pickThing();
                break;
            case "check":
                check();
                break;
            case "use":
                use(command);
                wantToQuit = gameOver();
                break;
            case "touch":
                wantToQuit = touch(command);
                break;
            case "back":
                back();
                break;


        }
//        // else 命令不被识别。
        return wantToQuit;
//        if (gameOver || wantToQuit) {
//            return true;
//        } else return false;
    }

    /**
     * go back to the last room
     * 回退到上一个指令实现逻辑为：创建动态的集合 historyRooms ，并记录玩家走过的所有的房间。触发命令：back，每当用户输入 back 则优先判断 historyRooms 是否为空。
     * 如果 historyRooms 为空，则输出：you can't go back, because you are at your earliest Room.
     * 当 historyRooms 非空时，使用 historyRooms.size() - 1,来获取上一房间的信息。并输出上一个房间的 Description
     * @param
     */

    /**
     * 低耦合：项目中每块代码的独立性互不干扰，每个类文件不互相干扰。
     * 高内聚：本 Project 在自己能力范围内尽力实现高内聚，例如：isInArray()、overweight()等这些功能上专一、可以很轻松的移植代码，高复用性强。isInArray() 当读提取出来，也可以轻松实现数值是否大于 70 的判断。*/
    private void back() {
//        if (!command.hasSecondWord()) {
//            // if there is no second word, we don't know where to go...
//            System.out.println("just tape <back> plz.");
//            return;
//        }

        if (historyRooms.isEmpty()) {
            System.out.println("you can't go back, because you are at your earliest Room.");
            return;
        }
        currentRoom = historyRooms.remove(historyRooms.size() - 1);
        System.out.println(currentRoom.getLongDescription());
    }

    /**
     * 判断钻石是否碰到镜子
     * 碰到镜子就 win
     */
    /**
     * 在我这个游戏故事中，游戏胜利的条件设置比较简单，依据：用户背包中是否拥有戒指，且在镜子所处的房间，如果在则可以使用 touch 命令进行触发指令并返回 false 以此修改 wantToQuit 的值。
     * 反之则提示：There is nothing to touch in the current room。
     * */
    private Boolean touch(Command command) {
        if (command.getCommandWord().equals("touch")) {
            Item item = currentRoom.getItem();
            if (!command.hasSecondWord()) {
                System.out.println("你要触摸什么？");
                if (item != null) {
                    System.out.println("目前可以攻击的对象：\n\t" + item.getName());
                    return false;

                } else {
                    System.out.println("当前房间没有你要触摸的东西。");
                }

            } else if (Backpack.contains("ring") && command.getSecondWord().equals("mirror")) {
                System.out.println("你赢了");
                return true;
            }
        }
        return false;
    }

    // 用户命令的实现：

    /**
     * 打印出一些帮助信息。
     * 在这里，我们打印一些愚蠢的、隐秘的信息和一个包含着命令字的列表。
     */
//    private void printHelp() {
//        System.out.println("你迷失了。你是孤独的。你徘徊着");
//        System.out.println("在大学里四处奔波。");
//        System.out.println();
//        System.out.println("你的命令字是：");
//        parser.showCommands();
//    }
    private void printHelp() {
        System.out.println("你迷路了。你孤身一人徘徊在迷宫中。");
        System.out.println();
        System.out.println("你可以输入的命令词有：");
//        System.out.println("\tgo quit help look pick check use");
        CommandWords cm = new CommandWords();
        cm.showAll();
        System.out.println("温馨提醒：戒指可以触摸玻璃，win game");

    }

    /**
     * 尝试向一个方向进入。如果有一个出口，就进入新的房间，否则就打印一个错误信息。
     */

    /**
     * 魔法房间创建 RandomRoom 的集合，来存储我想要吧玩家传送的目标房间「范围」，再使用 if 进行判断，玩家是否进入到 魔法房间「自己设定」如果处于我定义的
     * 魔法房间，则进行传送。使用  Random random = new Random(); 来实现随机整数索引，索引后并实现跳转。*/
    private void goRoom(Command command) {
        if (!command.hasSecondWord()) {
            // 如果没有第二个字，我们就不知道该去哪里了...
            System.out.println("去哪？");
            return;
        }

        String direction = command.getSecondWord(); // 获取第二个字

        // 试着离开目前的房间。
        Room nextRoom = currentRoom.getExit(direction);

        if (nextRoom == null) {
            System.out.println("没有门!");
        } else {
//            System.out.println("currentRoom.getDescription()" + nextRoom.getDescription());
//            System.out.println(":>>>" + nextRoom.getDescription().equals("我来到了厨房"));
            if (nextRoom.getDescription().equals("我来到了厨房")) {
                System.out.println("你已经进入到随机传送的房间...");
                Random random = new Random();
                int nextRoomIndex = random.nextInt(RandomRoom.size());
                nextRoom = RandomRoom.get(nextRoomIndex);
//                System.out.println(nextRoom.getLongDescription());
            }
            historyRooms.add(currentRoom);
            currentRoom = nextRoom;
            System.out.println(currentRoom.getLongDescription());


//            currentRoom.printExits();
//            player.step();
//            if (currentRoom.getTrap() != null) {
//                player.harm(currentRoom.getTrap());
//                currentRoom.removeTrap();
//            }
//            }
        }
    }

    private void look() {
        Item item = currentRoom.getItem();
        if (item != null) {
            System.out.println("你找到了" + item.getName() + "。");
        } else {
            System.out.println("你什么也没找到。");
        }
    }

    /***
     * 限重的实现也是直接创建  pickThing 方法。内部实现采取设置一个全局变量 Backpack_Weight 初始值为 0；使用基本的判断逻辑即可实现，设 70 为最多重量。触发条件为：
     * 每当玩家发出 pick 指令时，则进行判断。判断当前的重量加上物品的重量是否超出限制的最高重量。如果未超出则直接这放入背包。超出则提示：overweight,can not pick。
     *
     * 实现物品提取时，创建了一个规定不能拿取物品的集合，直接使用 !NoPick.contains(pick_item); 玩家所要提取的物品是否在不能提取的集合当中，如果在则返回 false。
     * */
    private void pickThing() {
        Item item = currentRoom.getItem();
        if (item != null) {
//            System.out.println("overweight(Backpack_Weight):>>>" + overweight(Backpack_Weight));
//            System.out.println("Backpack_Weight:>>>" + Backpack_Weight);
            if (isInArray(item.getName())) {
                int middle = Backpack_Weight; // 零时存储
                Backpack_Weight += item.getWeight();
                if (overweight(Backpack_Weight)) {
                    currentRoom.removeItem();
                    Backpack.add(item.getName());
//                Backpack_Weight += item.getWeight();
                    System.out.println("你获得了" + item.getName() + "。" + item.toString());
                } else {
                    System.out.println("很抱歉，你超重，应该减肥了。");
                    Backpack_Weight = middle;
                }
            } else {
                System.out.println("此物品不能被你拿，只能被你手中的戒指击碎！");
            }
        } else {
            System.out.println("这里没有什么东西。");
        }
    }

    private boolean isInArray(String pick_item) {
        return !NoPick.contains(pick_item);
    }

    private boolean overweight(int now_weight) {
        return !(now_weight > 70);
    }

    private void check() {
        player.lookItem();
    }

    private void use(Command command) {
        if (!command.hasSecondWord()) {
            System.out.println("吃什么？");
            return;
        }

        String name = command.getSecondWord();
        player.use(name);
    }
    /*
     * 游戏结束
     * */

    private boolean gameOver() {
        if (player.isDead()) {
            return true;
        } else return false;
    }


    /**
     * 输入了 "Quit"（"退出"）。检查命令的其余部分，看看我们是否真的退出了游戏。
     *
     * @return true 如果这个命令退出游戏，否则 return false。
     */
    private boolean quit(Command command) {
        if (command.hasSecondWord()) {
            System.out.println("冒险者！你要放弃了吗？");
            return false;
        } else {
            return true;  // 我们想退出的信号
        }
    }


}


