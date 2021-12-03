/*

二进制 ( 0,1 ，满 2 进 1. 以 0b 或 0B 开头。

十进制 ( 0 9 ，满 10 进 1 。

八进制 ( 0 7 ，满 8 进 1. 以数字 0 开头 表示。

十六进制 ( 0 9 及 A F ，满 16 进 1. 以 0x 或 0X 开头 表示。此处的 A F 不区分大小写。
如：
0x21AF +1= 0X21B0
 */

public class BinaryTest {
    public static void main(String[] args){
        int num1 =0b110;
        int num2=110;
        int num3=0127;
        int num4=0x110A;

        System.out.println("num 1 = "+num1);
        System.out.println("num 2 = "+num2);
        System.out.println("num 3 = "+num3);
        System.out.println("num 4 = "+num4);



    }
}
