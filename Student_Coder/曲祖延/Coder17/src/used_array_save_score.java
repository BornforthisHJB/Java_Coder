/**
 * @ClassName: used_array_save_score
 * @Description: TODO
 * @Author: AndersonHJB
 * @date: 2023/1/13 16:03
 * @Version: V1.0
 * @Blog: https://bornforthis.cn
 */
public class used_array_save_score {
    public static void main(String[] args) {
        /*创建一个大小为 6 的 double 类型的数组
        创建一个大小为 6 的 String 数组，代表每门课的名字
        为每门课创建一个 int 变量，值为这门课的成绩对应的数组的索引，以便操作每门课的成绩和名字*/
        // 声明六个变量， 分别代表六门科目的成绩
        int Mandarin = 0;
        int Math_ob = 1;
        int English = 2;
        int Chemistry = 3;
        int Physic = 4;
        int Biology = 5;

        // 每门课的名字
        String[] names = new String[6];
        names[Mandarin] = "语文";
        names[Math_ob] = "数学";
        names[English] = "外语";
        names[Chemistry] = "化学";
        names[Physic] = "物理";
        names[Biology] = "生物";

        // 每门课课成绩
        double[] scores = new double[6];

        for (int i = 0; i < 6; i++) {
            scores[i] = 80 + Math.random() * 20;
//            System.out.println(scores[i]);
        }
        // 最大值
//        int index_position = 0;
//        double MaxValue = scores[0];
//        double maxScore = -1;
//        int maxScoreIndex = -1;
//        for (int index = 0; index < scores.length; index++) {
//            System.out.println(names[index] + "的成绩为" + scores[index]);
//            if (maxScore < scores[index]) {
//                maxScore = scores[index];
//                maxScoreIndex = index;
//            }
//        }
//        System.out.println("最高分的科目为" + names[maxScoreIndex] + "，成绩为：" + maxScore);
////        System.out.println("最高分成绩为：" + MaxValue);
        double TotalScore = 0;
        for (int index = 0; index < scores.length; index++) {
            TotalScore += scores[index];
        }
        System.out.println(TotalScore);

    }
}
