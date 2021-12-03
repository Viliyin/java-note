/*
运算符之二；赋值运算符
= += -= *= /= %=
 */

public class SetValueTest {
    public static void main(String[] args){
        //赋值符号：=
        int i1 =10;
        int j1 =10;

        int i2,j2;
        //连续赋值
        i2=j2=10;

        int i3=10,j3=20;

        //******************************************
        int num1=10;
        num1 += 2; //num1 = mum1 +2；
        System.out.println(num1);

        int num2=12;
        num2 %=5;
        System.out.println(num2);

        short s1=10;
        // s1=s1+2; compile fail
        s1+=2; //不会改变变量本身的数据类型
        System.out.println(s1);

        // 开发中，如果希望变量实现+2的操作。 有几种方法 （前提 int num=10；）
        // method 1: num=num=2；
        // method 2 : num += 2;(recommend)

        //开发中，如果希望变量实现+1的操作。 有几种方法 （前提 int num=10；）
         // method 1: num=num+1；
        // method 2 : num += 1;(recommend)
        // method 3: num++;

        //practise 1
        int i = 1;
        i *= 0.1;
        System.out.println(i); // 0
                i++;
        System.out.println(i); // 1

        // practise 2
        int m = 2;
        int n = 3;
        n *= m ++; // n=n* m++
        System.out.println("m=" + m); //m=3
        System.out.println("n=" + n); //n=6

        // practise 3
        int n3= 10;
        n3 += (n3++) + (++n3);
        System.out.println(n3); //32


    }
}
