/**
 * @ClassName: Exchangeable
 * @Description: TODO
 * @Author: AndersonHJB
 * @date: 2023/2/19 08:36
 * @Version: V1.0
 * @Blog: https://bornforthis.cn
 */
public interface Exchangeable {
    final static double EARTH_DOLLAR = 1.0;
    final static double MARS_MONEY  = 1.3;
    final static double NEPTUNE_NUGGETS = 2;
    final static double SATURN_SILVER = 0.87;

    public void exchange (Currency other, double amount);
}
