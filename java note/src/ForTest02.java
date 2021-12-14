/*
题目：输入两个正整数m和n，求其最大公约数和最小公倍数。
比如：12和20的最大公约数是4，最小公倍数是60。
 */
import java.util.Scanner;
public class ForTest02 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the positive number");
        int m = scan.nextInt();
        System.out.println("enter the second positive number");
        int n = scan.nextInt();

       int min= (m<n)? m:n;
        for(int i = min;i >=1;i--){
            if (min % m==0 && min %n==0 ){
                System.out.println("公约数 是" + i);
                break;
            }
        }
        int max= (m>n)? m:n;
        for (int i = max; i<= m*n; i++){
            if( m % max == 0 && n % max == 0 ){
                System.out.println("公倍数等于" + max);
                break;
            }
        }
    }
}
