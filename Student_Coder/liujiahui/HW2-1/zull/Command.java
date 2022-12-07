/**
 * 这个类是 "祖尔的世界" 应用程序的一部分。
 * "祖尔的世界" 是一个非常简单的、基于文本的冒险游戏。
 * <p>
 * 该类持有关于用户发布的一项命令的信息。
 * 一个命令目前由两个字符串组成：一个命令字和第二个字
 * （例如，如果命令是 "take map" ("采取地图")，那么这两个字符串显然是 "take" 和 "map"）。
 * <p>
 * 其使用方法是：命令已经被检查为有效的命令字。
 * 如果用户输入了一个无效的命令（一个不知道的字），那么这个命令字就是<null>。
 * <p>
 * 如果该命令只有一个字，那么第二个字就是<null>。
 *
 * @author Michael Kölling and David J. Barnes
 * @version 2016.02.29
 */

public class Command {
    // ------------修改1 Start------------
//    private String commandWord;  // 命令字
    private String commandWord;  // 命令字
    // ------------修改1 End------------
    private String secondWord;  // 第二个单词

    // -----------修改代码2 Start---------------------------------------

    /**
     * 创建一个命令对象。必须提供第一个和第二个字，但其中一个（或两个）可以是 null 的。
     *
     * @param firstWord  命令的第一个字。Null 如果该命令是未被识别。
     * @param secondWord 命令的第二个字。
     */
    public Command(String firstWord, String secondWord) {
        commandWord = firstWord;
        this.secondWord = secondWord;
//        commandWord = Enum.valueOf(no_use.Word.class, firstWord.toUpperCase());
//        this.secondWord = secondWord;
    }
    // -----------修改代码2 End---------------------------------------

    // -----------修改代码3 Start---------------------------------------

    /**
     * 返回该命令的命令字（第一个字）。
     * 如果该命令未被理解，则结果为 null。
     *
     * @return 命令字
     */
//    public String getCommandWord() {
//        return commandWord;
//    }
    public String getCommandWord() {
        return commandWord;
    }
    // -----------修改代码3 End---------------------------------------

    /**
     * @return 这个命令的第二个字。
     * 如果没有第二个词，则返回 null。
     */
    public String getSecondWord() {
        return secondWord;
    }

    /**
     * @return true，如果这个命令不被理解。
     */
    public boolean isUnknown() {
        return (commandWord == null);
    }

    /**
     * @return true，如果该命令有第二个字。
     */
    public boolean hasSecondWord() {
        return (secondWord != null);
    }
}

