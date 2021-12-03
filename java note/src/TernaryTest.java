/*
运算符6：三元运算符

1.结构：（有条件表达式）？ 表达式1： 表达式2
2。说明
一.条件表达式位Boolean类型
二. 根据条件表达式真或假，决定执行表达式1还是2
如果表达式为true，则执行表达式1
如果表达式为false，则执行表达式2
三. 表达式一和表达式2 要求是一致的
四.三元运算符可以嵌套使用

3. 凡是可以使用三元运算符的地方，都可以改写为if-else
4.如果程序可以使用三元又可以使用if-else，优先选择三元，因为简洁，效率高
反之，不成立
 */


public class TernaryTest {
    public static void main(String [] args){

        //获取两个整数的最大值
        int m=12;
        int n =5;

        int max = (m>n)? m:n;
        System.out.println(max);
        double num= (m>n)? 2:1.0;
        // (M>N) ? 2：”N大“；

        n=10;

        String maxStr = (m>n)? "m larger": ((m==n)?"m equal to n": "n is larger");
        System.out.println(maxStr);


        //*************************
        //获取三个数的最大值

        int n1 =12;
        int n2 =30;
        int n3 = -43;

        int max1 =(n1>n2)? n1:n2;
        int max2=(max1> n3) ? max1:n3;
        System.out.println("The lager num is "+ max2);

        //不建议
        int max3 = (((n1>n2)? n1:n2)>n3)?((n1>n2)? n1:n2):n3;
        System.out.println ("THE LARGER NUMBER IS "+max3) ;


        //改写if-else
        if(m > n) {
            System.out.println(m);
        }else{
            System.out.println(n);
        }
    }
}
