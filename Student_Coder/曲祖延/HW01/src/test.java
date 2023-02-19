/**
 * @ClassName: test
 * @Description: TODO
 * @Author: AndersonHJB
 * @date: 2023/2/19 10:25
 * @Version: V1.0
 * @Blog: https://bornforthis.cn
 */
public class test {
    public static void main(String[] args) {
        Currency mars = new Mars(100.00);
        Currency neptune = new Neptune(100.00);
        Currency saturn = new Saturn(100.00);
        System.out.println("<-- Exchanges -->");
        mars.exchange(saturn, 25.0);
        neptune.exchange(saturn, 10.0);
        saturn.exchange(mars, 122.0);
        saturn.exchange(mars, 121.0);
    }
}