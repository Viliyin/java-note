/*
从键盘读入个数不确定的整数，并判断读入的正数和负数的个数，输入
为0时结束程序.

说明：
1.不在循环条件部门限制次数的结构： for（；；） 或 while（true）
2.结束循环的方式？
1 方式一： 循环条件部分返回false；
2. 方式2 ：在循环体中，执行break

 */
import java.util.Scanner;
public class ForWhileTest {
    public static void main(String []args){
        Scanner scan =new Scanner(System.in);

    int positivenum =0;
    int negetivenum =0;

    for(;;){//while(true){
        int num=scan.nextInt();
        //判断正负;

        if (num>0){
            positivenum++;
        }else if (num<0){
            negetivenum++;
        }else{
            //一旦执行break，跳出循环
            break;
        }
    }
        System.out.println("P OSITIVE NUMBER IS "+ positivenum);
        System.out.println("Negative number is " + negetivenum);
    }


}
