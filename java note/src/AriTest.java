/*
运算符之一：算术运算符
+-+-* / %（前）++ (后)++ （前）-- （后）--
（正负加减 取模....）


 */


import javax.lang.model.util.SimpleElementVisitor14;

public class AriTest {
    public static void main(String[] args){

        // 除号：/
        int num1 =12;
        int num2 = 5;
        int result1 =num1 /num2 ;
        System.out.println(result1); //2

        int result2 =num1/num2 *num2;
        System.out.println(result2);//10

        double result3 = num1/num2;
        System.out.println(result3); //2.0

        double result4 = num1/num2 +0.0; //2.0
        double result5 = num1/(num2 +0.0); //2.4 括号先运算，—+0.0变成浮点型
        System.out.println(result4);

        double result6 =(double)num1/num2; //2.4
        double result7 =(double) (num1/num2); //2.0
        System.out.println(result6);
        System.out.println(result7);

    // % ： 取余运输算
        //结果符号与被膜数符号一样
        //开发中，经常使用%判断能否除尽的符号



        int m1 = 12;
        int n1 =5;
        System.out.println("m1%n1=" +m1 %n1);

        int m2 = -12;
        int n2 =-5;
        System.out.println("m1%n1=" +m1 %n1);
        int m3= 12;
        int n3 = -5;
        System.out.println("m1%n1=" +m1 %n1);
        int m4 = -12;
        int n4 = -5;
        System.out.println("m1%n1=" +m1 %n1);

        //(前)++
        //(后)++
        //前++或后++都表示自增一
        int a1 =10;
        int b1=a1;
        System.out.println("a1="+ a1+",b1="+b1);

        int a2 =10;
        int b2=a2++;
        System.out.println("a2="+ a2+",b2="+b2);

        int a3 =10;
        ++a3; // a3++；
        int b3=a3 ;
        System.out.println("a3="+ a3+",b3="+b3);

    //注意点：
        short s1=10;
        //s1 = s1+1;// 编译失败
        //S1 =(short)(s1+1) // CORRECT;
        s1++; //自增1不会改变本身变量的数据类型
        System.out.println(s1);

        //问题
        byte bb1=127;
        System.out.println("bb1=" +bb1);

        //(前)-- ：先自减1，后运算

        //(后)--: 先运算，后自减1

        int a4 = 10;
        int b4 = a4--;

    }
}
