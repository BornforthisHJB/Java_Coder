/**
 * @ClassName: demolove
 * @Description: TODO
 * @Author: AI悦创
 * @Date: 2022/10/11 09:41
 * @Version: V1.0
 * @Blog: https://www.bornforthis.cn
 */
public class demolove {
    public static void main(String[] args) {
        float x, y, a;
        for (y = 1.3f; y > -1.1f; y -= 0.06f) {   //这里的参数皆可以调，条件就是看着顺眼
            for (x = -1.2f; x <= 1.2f; x += 0.025f) {
                a = x * x + y * y - 1;
                System.out.print(a * a * a - x * x * y * y * y <= 0.0f ? ' ' : '$');
            }
            System.out.println();
        }
    }
}
