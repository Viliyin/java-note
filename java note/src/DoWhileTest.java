/*
一循环结构的四个要素
1）初始化条件
2）循环条件---> 是boolean类型
3)循环体
4）迭代条件

二 do while的循环结构
1
 do{
    3;
    4;

}while(2);

执行过程：
1-3-4-2-3-4-2-3-4-----2 终止

说明：
1.do-while至少会执行一次循环体！
2.开发中，使用for和while循环的更多一些，较少使用do-while


 */

public class DoWhileTest {
    public static void main(String[] args){
        //遍历100以内的偶数，并计算所以偶尔的和以及个数

        int num=1;
        int count=0; // 记录总和
        int sum=0;//记录个数

        do{
            if(num %2 ==0) {
                System.out.println(num);
                sum += num;
                count ++;
            }
               num++;

           }while(num<=100);
         System.out.println("THE SUM IS " +num);
         System.out.println("TOTAL NUMBER IS " +count);

         //************DO-WHILE 至少执行一次*************
        int num1 =10;
        while(num1>10){
            System.out.println("Hello WHILE");
            num1--;
        }
        int num2 =10;
        do{
            System.out.println("Hello,DO-WHILE");
            num1--;
        }while(num2 >10);
    }
}
