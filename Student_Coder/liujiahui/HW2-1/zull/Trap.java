/**
 * @ClassName: Trap
 * @Description: TODO
 * @Author: AndersonHJB
 * @date: 2022/11/29 20:00
 * @Version: V1.0
 * @Blog: https://bornforthis.cn
 */
public class Trap {
    private String name;
    private int strengthDown;
    private int lifeDown;

    public Trap(String name, int strengthDown, int lifeDown) {
        this.name = name;
        this.strengthDown = strengthDown;
        this.lifeDown = lifeDown;
    }

    public int getStrengthDown() {
        return this.strengthDown;
    }

    public int getLifeDown() {
        return this.lifeDown;
    }

    public String getName() {
        return this.name;
    }
}

