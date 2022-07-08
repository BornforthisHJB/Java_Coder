public class BitOprtUsage {
    public static void main(String[] args) {
        int base = 1;
        int is_student_mask = base;
        int is_programmer_mask = base << 1; // 0001 -> 0010
        int is_driver_mask = base << 2; // 0001 -> 0100
        int is_painter_mask = base << 3; // 0001 -> 1000

        int data = 5;

        boolean isStudent = (data & is_student_mask) != 0; // true
        //System.out.println(data & is_student_mask); // 1
        /*data:             0101
        * is_student_mask:  0001
        *                   0001 -> 1*/
        System.out.println(isStudent);

        /*
        * 0101*/
        boolean isProgrammer = (data & is_programmer_mask) != 0;
        System.out.println(isProgrammer);

        //
        boolean isDriver = (data & is_driver_mask) != 0;
        System.out.println(isDriver);

        boolean isPainter = (data & is_painter_mask) != 0;
        System.out.println(isPainter);
    }
}