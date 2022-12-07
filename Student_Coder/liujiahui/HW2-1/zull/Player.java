/**
 * @ClassName: Player
 * @Description: TODO
 * @Author: AndersonHJB
 * @date: 2022/11/30 21:20
 * @Version: V1.0
 * @Blog: https://bornforthis.cn
 */
import java.util.*;

public class Player
{
    private int strength = 160;
    private int life=100;
    private Map<String, Item> bag = new HashMap<>();
    public int getLife()
    {
        return life;
    }
    public void step() {
        strength -= 5;
        System.out.println("你消耗了5点体力。");
        System.out.println("你现在有"+ strength +"点体力。");
    }

    private void decideEnd()
    {
        if (strength % 10 == 2){
            System.out.println("你使用了所有石碑，放弃了拯救家园的机会。成为了黑咒岛新一任的主人。");
            System.out.println("恭喜你，游戏通关，达成结局一");
        }else if(strength % 10 == 9){
            System.out.println("你献祭了诅咒之物。作为交换，神会解除对你的族人诅咒");
            System.out.println("恭喜你，游戏通关，达成结局二");
        }
    }

    public void pick(Item item) {
        bag.put(item.getName(), item);
    }

    public void use(String name) {
        Item item = bag.get(name);
        bag.remove(name);
        if(item != null) {
            System.out.println("你使用了" + name +"。");
            if(item.getWeight()!=0)
            {
                int lastStrength = strength;
                strength += item.getWeight();
                if(strength >100) {
                    strength = 100;
                }
                if(strength - lastStrength<0)
                    System.out.println("你失去了" + (lastStrength - strength) + "点体力。");
                else
                    System.out.println("你获得了" + (strength - lastStrength) + "点体力。");
                System.out.println("你现在有"+ strength +"点体力。");
            }
            if(item.getLife()!=0)
            {
                int lastLife = life;
                life += item.getLife();
                if(life >100) {
                    life = 100;
                }
                if(life - lastLife<0)
                    System.out.println("你失去了" + (lastLife - life) + "点生命。");
                else
                    System.out.println("你获得了" + (life - lastLife) + "点生命。");
                System.out.println("你现在有"+ life +"点生命。");
            }
        }
        else {
            System.out.println("你没有" + name + "这样物品。");
        }
    }

    public boolean isDead() {
        if(strength<=0)
        {
            System.out.println("你体力耗尽了！随着一阵晕眩，你昏倒在地。");
            System.out.println("黑暗很快将筋疲力尽的你彻底吞没了");
            return true;
        }
        else if(life<=0)
        {
            System.out.println("你受到了重创！");
            System.out.println("黑暗很快将奄奄一息的你彻底吞没了");
            return true;
        }
        else return false;
    }

    public void lookItem() {
        System.out.print("你有");
        bag.keySet().stream().forEach(key -> System.out.println(key + "【分数：" + bag.get(key).getWeight() +",生命："+bag.get(key).getLife()+ "】 "));
    }

    public void harm(Trap trap)
    {
        System.out.println("你受到了" + trap.getName() + "的攻击。");
        if(trap.getStrengthDown() != 0)
        {
            strength -= trap.getStrengthDown();
            System.out.println("你失去了" + trap.getStrengthDown() + "点体力。");
            System.out.println("你现在有"+ strength +"点体力。");
        }

        if(trap.getLifeDown() != 0)
        {
            life -= trap.getLifeDown();
            System.out.println("你失去了" + trap.getLifeDown() + "点生命。");
            System.out.println("你现在有"+ life +"点生命。");
        }

    }
}