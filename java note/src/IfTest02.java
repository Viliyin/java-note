/*
编写程序：由键盘输入三个整数分别存入变量 num1 、 num2 、 num3
对它们进行排序 使用 if else if else 并且从小到大输出。

要点：
1.If-else 结构可以互相嵌套
2. 如果if-else的执行语句只有一行时，可以省略对应的一对{}
3.If有就近原则
 */
import java.util.Scanner;
public class IfTest02 {
    public static void main(String[] args){
    Scanner Scan = new Scanner(System.in);

    System.out.println("Please enter the number");
    int num1 = Scan.nextInt();
    System.out.println("please enter the second number");
    int num2 =Scan.nextInt();
    System.out.println("Please enter the third number");
    int num3 =Scan.nextInt();

    if (num1 >= num2) {
        if (num3 >= num1) {
            System.out.println(num3 + "," + num1 + "," + num2);
        }else if (num3 >= num2) {
            System.out.println(num1 + "," + num3 + "," + num2);
        }
        if (num2 >= num3) {
            System.out.println(num1 + "," + num2 + "," + num3);
        }
    }else{
        if(num2 >= num1){
            if (num3 >= num2) {
                System.out.println(num3 + "," + num2 + "," + num1);
            } else if(num3 >= num1) {
                System.out.println(num2 + "," + num3 + "," + num1);
            }if(num1 >= num3) {
                System.out.println(num2 + "," + num1 + "," + num3);
            }
            }

        }
    }



}

