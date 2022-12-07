package no_use;

/**
 * @ClassName: World
 * @Description: TODO
 * @Author: AndersonHJB
 * @date: 2022/11/29 10:44
 * @Version: V1.0
 * @Blog: https://bornforthis.cn
 */
public enum Word {
    GO("go"), QUIT("quit"), HELP("help"), LOOK("look"), PICK("pick"), CHECK("check"), USE("use");

    private String commandWord;

    private Word(String commandWord) {
        this.commandWord = commandWord;
    }

    public String getCommandWord() {
        return this.commandWord;
    }
}
