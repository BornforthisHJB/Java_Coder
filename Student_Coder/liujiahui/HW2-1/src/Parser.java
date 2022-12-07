import java.util.Scanner;

/**
 * 这个类 是 "祖尔的世界" 应用程序的一部分。
 * "祖尔的世界" 是一个非常简单的、基于文本的冒险游戏。
 * 
 * 这个分析器读取用户的输入，并试图将其解释为一个 "Adventure"（"冒险"）命令。
 * 每次它被调用时，它从终端读取一行，并试图将该行解释为一个两个字的命令。
 * 它将命令作为一个Command类的对象返回。
 *
 * 解析器有一套已知的命令字。
 * 它根据已知的命令检查用户的输入,
 * 如果输入的命令不是已知的命令之一，它就会返回一个被标记为未知命令的命令对象。
 * 
 * @author  Michael Kölling and David J. Barnes
 * @version 2016.02.29
 */
public class Parser 
{
    private CommandWords commands;  // 持有所有有效的命令字
    private Scanner reader;         // 命令输入的来源

    /**
     * 创建一个分析器，从终端窗口读取信息。
     */
    public Parser() 
    {
        commands = new CommandWords();
        reader = new Scanner(System.in);
    }

    /**
     * @return 用户的下一个命令。
     */
    public Command getCommand()
    {
        String inputLine;   // 将持有完整的输入行
        String word1 = null;
        String word2 = null;

        System.out.print("> ");     // 打印提示

        inputLine = reader.nextLine();

        // 在行中找出最多两个字。
        Scanner tokenizer = new Scanner(inputLine);
        if(tokenizer.hasNext()) {
            word1 = tokenizer.next();      // 获得第一个字
            if(tokenizer.hasNext()) {
                word2 = tokenizer.next();      // 获得第二个字
                // 注意：我们只是忽略了输入行的其余部分。
            }
        }

        // 现在检查这个词是否是已知的。
        // 如果是，就用它创建一个命令。如果不是，则创建一个 "null" 命令（对于未知命令）。
        if(commands.isCommand(word1)) {
            return new Command(word1, word2);
        }
        else {
            return new Command(null, word2); 
        }
    }

    /**
     * 打印出一个包含有效的命令字列表。
     */
    public void showCommands()
    {
        commands.showAll();
    }
}
