package xjtu.zyh.task2;

import java.math.BigInteger;

/**
 * 此处实现fibonacci实例的具体实现
 */
public class fibonacci {
    /**
     * 该of方法实现具体的功能
     * @param n
     * @return
     */
    public static BigInteger of(Integer n) {
        BigInteger a = BigInteger.valueOf(1);
        BigInteger b = BigInteger.valueOf(1);;
        BigInteger c = BigInteger.valueOf(0);;
        //首先在控制台打印出数列中第一个数和第二个数的值
        //System.out.print(a + "\t" + b + "\t");
        if(n == 1 || n == 2)
            return BigInteger.valueOf(1);
            //建立一个for循环，用于循环输出数列中第三位至第十位的数字
        for (int i = 3; i <= n; i++) {
            //第三个数即为c，a+b等于c的值
            c = a.add(b);
            //将第一个加数a赋值为数列中的第二个数b的值
            a = b;
            //将第二个加数b赋值为数列中的第三个数c的值
            b = c;
            //在第二次循环打印时，将打印数列中的第四个数为：b + c = b + (a + b)
        }
        return c;
    }
}
