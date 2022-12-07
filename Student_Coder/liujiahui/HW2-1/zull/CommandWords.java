/**
 * 这个类 是 "祖尔的世界" 应用程序的一部分。
 * "祖尔的世界" 是一个非常简单的、基于文本的冒险游戏。
 * <p>
 * 该类持有游戏中已知的所有命令字的枚举。
 * 它用于识别输入的命令。
 *
 * @author Michael Kölling and David J. Barnes
 * @version 2016.02.29
 */

public class CommandWords {
    // -----------注释掉 Start-----------
    // 一个常量数组，用于保存所有有效的命令字
    private static final String[] validCommands = {
            "go", "quit", "help", "look", "pick", "check", "use", "touch", "back"
            // TODO:>>> 也需要添加命令的地方
    };
    // -----------注释掉 End-----------
//    // -----------添加 Start-----------
//    private static no_use.Word[] words = no_use.Word.values();
//    // -----------添加 End-----------

    /**
     * Constructor 构造函数 - 初始化命令字。
     */
    public CommandWords() {
        // 目前无事可做...
    }

    // -----------修改 Start-----------

    /**
     * 检查一个特定 String 是否是一个有效的命令字。
     *
     * @return true 如果是，false 如果不是。
     */
    public boolean isCommand(String aString) {
        for (int i = 0; i < validCommands.length; i++) {
            if (validCommands[i].equals(aString))
                return true;
        }
        // 如果我们到了这里，就说明在命令中没有找到这个字符串。
        return false;
    }

    /**
     * 打印所有有效的命令到 System.out
     */
    public void showAll() {
        for (String command : validCommands) {
            System.out.print(command + "  ");
        }
        System.out.println();
    }

    // -----------修改 End-----------
    // 测试调用
    public static void main(String[] args) {
        CommandWords CW = new CommandWords();
        System.out.println(CW.isCommand("go"));
        CW.showAll();
    }
}
