/*
如何从键盘获取不同类型的变量，需要使用scanner类

1.导包
2.Scanner的实例化： Scanner scan= new scanner（system.in)
3.调用Scanner类的相关方法（String：next（）/ nextXXX），来获取指定类型的变量

注意:
需要根据相应的要求，来输入指定类型的值，如果输入的数据类型与要求不匹配时，会报异常，InputMisMatchException 导致程序终止
 */

//1.导包
import java.util.Scanner;

 public class ScannerTest {
     public static void main(String[] args) {
         //2.Scanner的实例化
         Scanner scan = new Scanner(System.in);
        //3. 调用Scanner类的相关方法
         System.out.println("input your name");
         String name = scan.next();
         System.out.println(name);

         System.out.println("input your age");
         int age = scan.nextInt();
         System.out.println(age);

         System.out.println("input your weight");
         double weight = scan.nextDouble();
         System.out.println(weight);

         System.out.println("input your choice (true/ false)");
         boolean choice = scan.nextBoolean();
         System.out.println(choice);

         // 对于char型的获取，scanner明天提供相关的方法，只能获取一个字符串
         System.out.println("请输入你的性别：（男/女）");
         String gender = scan.next();//”男“
         char genderChar = gender.charAt(0);
         System.out.println(genderChar);//获取索引为0位置上的字符
     }
}
