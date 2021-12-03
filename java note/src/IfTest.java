/*
分支结构中的if-else（条件判断结构）

一.三种结构
第一种：
if（条件表达式）{

}

第二种： 二选一
if（条件表达式）{
    执行表达式1
    }else{
    执行表达式2
    }

    第三种：多选一
    if（条件表达式）{
    执行表达式1
    }else if（条件表达式）{
    执行表达式2
    }else if（条件表达式）{
    执行表达式3
    }
    ....
    else{
    执行表达式n
    }
 */

public class IfTest {
    public static void main(String[] args){

        //EXAMPLE 1
        int hearBeats = 200;
        if (hearBeats< 60 || hearBeats >100){
            System.out.println("Need body check!");
        }

        System.out.println("over");

        //eg.2
        int age =23;
        if (age<18 ){
            System.out.println("Watch Cartoon");
        }else{
            System.out.println("Watch Movie");
        }

        // eg3.
        if (age<0) {
            System.out.println("The input is wrong");
        }else if(age<18) {
            System.out.println("Teenager");
        }else if (age<35) {
            System.out.println("Young");
        }else if(age<60) {
            System.out.println("Middle age");
        }else if (age < 120){
            System.out.println("old age");
        }else{
            System.out.println("over");
        }

    //定义三个int型并赋值，使用三元运算符或者if-else获取这三个数中的较大数实现

        int num1=10,num2=19,num3=2;
        int max = 0;
        if(num1>num2 && num1>num3 ){
            max=num1;
        }else if(num2>num1 && num2>num3) {
            max = num2;
        }else if (num3>num1 && num3>num2) {
            max = num3;
        }
        System.out.println("The max num is "+ max );


        // PRACTISE 2
        //编写程序，声明2个double型变量并赋值,判断第一个数大于10.0，且第二个数小于20.0，打印两数之和，否则 打印两数只差

        double d1=12.8;
        double d2=7.0;
        double sum= d1+d2;
        double dis=d1-d2;

        if(d1>10.0 && d2< 20.0){
            System.out.println( "The sum is"+ sum);
        }else {
            System.out.println("The diff is  " + dis);
        }






        }

    }
