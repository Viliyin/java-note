/*
随意给出一个整数
打印显示它的个位数 十位数 百位数的值 。
格式如下：
数字
xxx 的情况如下：
个位数：
十位数：
百位数：
例如
数字
153 的情况如下：
个位数：
3
十位数：
5
百位数：
1
 */
public class Ariexecrise {
    public static void main(String[] args){
        int num = 187;

        int unit = num / 100;
        int tens = num % 100 / 10;
        int hundred = num % 10;

        System.out.println("Unit is "+ unit);
        System.out.println("Tens is " +tens);
        System.out.println("hundred is " + hundred);
    }

}
