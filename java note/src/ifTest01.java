/*
岳小鹏参加
Java 考试，他和父亲岳不群达成承诺：
如果：
成绩
为 100 分时，奖励一辆 BMW
成绩为
(80 99] 时，奖励一台 iphone xs max
当成绩为
[ 60,80]时，奖励一个 iPad
其它时，什么奖励也 没有。
请从键盘 输入岳 小鹏的期末 成绩，并加以判断

说明：
1、else 结构是可选的。
2. 针对与多个条件表达式
    如果多个表达式之间是“互斥”关系(或是没有交集的关系），哪个判断和执行语句声明在上面还是下面，都没有所谓
    如果多个表达式是有交集的关系，需要根据实际情况，考虑清楚哪个结构声明在上面
    如果多个条件表达式之间有包含关系，通常情况下，需要将范围小的放在范围大的下面，否则范围晓得没机会执行

 */
import java.util.Scanner;
public class ifTest01 {
    public  static void main(String [] args){
        Scanner Scan = new Scanner(System.in);

        System.out.println("please enter your result (0-100)");
        int result = Scan.nextInt();

        if (result == 100){
            System.out.println("you can gain BMW");
        }else  if( result> 80 && result <= 99 ) {
            System.out.println("You got an iphone xs max");
        }else if(result >= 60 && result <= 80) {
            System.out.println("you got an ipad");
        }else {
           System.out.println("You got nothing!");
        }

    }
}
