package basic1;

/**
 * @author zds
 * @create 2020-01-03 16:28
 */
public class Lesson1_2 {

    public static int leftShift(int num,int n){
        return num << n;
    }

    public static int rightShift(int num, int n){
        /**
         * 逻辑右移在 Java 和 Python 语言中使用 >>> 表示，而算术右移使用 >> 表示
         * 算术右移时保持符号位不变，除符号位之外的右移一位并补符号位 1。补的 1 仍然在符号位之后。
         */
        return num >>> n;
    }


    public static void main(String[] args) {

        int num = 53;
        int m = 1;
        System.out.println(String.format("数字%d的二进制向左移%d位是%d", num, m, Lesson1_2.leftShift(num, m)));   //测试向左移位
        System.out.println(String.format("数字%d的二进制向右移%d位是%d", num, m, Lesson1_2.rightShift(num, m)));   //测试向右移位

        System.out.println();

        m = 3;
        System.out.println(String.format("数字%d的二进制向左移%d位是%d", num, m, Lesson1_2.leftShift(num, m)));   //测试向左移位
        System.out.println(String.format("数字%d的二进制向右移%d位是%d", num, m, Lesson1_2.rightShift(num, m)));   //测试向右移位

    }

}
