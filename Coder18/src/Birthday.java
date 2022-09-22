import java.util.Scanner; // Scanner == java.util.Scanner

public class Birthday {
    public static void main(String[] args) {
        Birthday birthday = new Birthday();  // 类的实例化
        Scanner scanner = new Scanner(System.in);
//        Scanner input = new Scanner(System.in);

        // 获取日期
        System.out.print("Enter the birthday in 8-digit format for person's # 1: (YYYYMMDD):");
        int birthday1 = scanner.nextInt();
        String birthday1_format = birthday.getBirthday(birthday1);

        System.out.print("Enter the birthday in 8-digit format for person's # 2, (YYYYMMDD): ");
        int birthday2 = scanner.nextInt();
        String birthday2_format = birthday.getBirthday(birthday2);

        // 获取姓名
        System.out.print("Enter name for person #1:");
         String name1 = scanner.next();
         // String name1 = scanner.nextLine();

        System.out.print("Enter name for person #2:");
        String name2 = scanner.next();



        System.out.println(name1 + "\'s date of birth is:" + birthday1_format);
        System.out.println(name2 + "\'s date of birth is:" + birthday2_format);
//        System.out.println(name1 + "的出生日期是:" + birthday1_format);
//        System.out.println(name2 + "的出生日期是:" + birthday2_format);

        if (birthday1 < birthday2) {
            System.out.println(name1 + " is Older than " + name2 + "!");
        }else if(birthday1 == birthday2){
            System.out.println(name1 + "和" + name2 + "是同年同月同日生!");
        }else {
            System.out.println(name2 +" is Older than " + name1 + "!");
        }
    }

    public String getBirthday(int birthday) {
        int year = birthday / 10000;
        int month = birthday % 10000 / 100;
        int day = birthday % 10000 % 100;
        String birthday_format = month + "/" + day + "/" + year;
        return birthday_format;
    }
}
