package basic1;

import java.math.BigInteger;

/**
 * @author zds
 * @create 2020-01-03 16:19
 */
public class Lesson1_1 {
    /**
     * @Description: 十进制转换成二进制
     * @param decimalNum
     * @return
     */
    public static String decimalToBinary(int decimalNum) {
        BigInteger bi = new BigInteger(String.valueOf(decimalNum));
        return bi.toString(2);
    }

    /**
     * @Description: 二进制转换成十进制
     * @param binaryStr
     * @return
     */
    public static int binaryToDecimal(String binaryStr)
    {
        BigInteger bi = new BigInteger(binaryStr, 2);
        return Integer.parseInt(bi.toString());
    }


    public static void main(String[] args) {
        int a = 53;
        String b = "110101";
        System.out.println(String.format("数字%d的二进制是%s", a, Lesson1_1.decimalToBinary(a))); //获取十进制数53的二进制数
        System.out.println(String.format("数字%s的十进制是%d", b, Lesson1_1.binaryToDecimal(b))); //获取二进制数110101的十进制数

    }

}
