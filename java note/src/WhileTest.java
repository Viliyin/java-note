/*
While 循环的使用
一循环结构的四个要素
1）初始化条件
2）循环条件---> 是boolean类型
3)循环体
4）迭代条件

二。while的循环结构

1.
while（2 ）{
        3;
        4;
}

执行条件：1-2-3-4-2-3-4-2-3-4......-2, false的话就终止
说明：
1.写while循环千万小心不要丢了迭代条件，一旦丢了，就可能导致死循环！
2.写程序，要避免死循环
3.for循环和while循环可以相互转换！
    区别：for循环和while循环的初始化条件部分的作业范围不同
算法：有限性
 */
public class WhileTest {
    public static void main(String [] args){

        //遍历100以内的所有偶数
        int i =1;
        while (i<100){

            if (i %2 ==0){
                System.out.println(i);
            }
            i++;
        }
    }

}
