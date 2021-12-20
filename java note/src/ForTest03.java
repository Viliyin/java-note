/*
打印1-100之间所有奇数的和
 */

public class ForTest03 {
    public static void main(String[] args) {

        for (int i = 1; i <= 100; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
        int count = 0;
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 7 == 0) {
                System.out.println(i);
                sum += i;
                count++;
            }

        }
        System.out.println("The sum is" +sum);
        System.out.println("The count is" +count);
    }
}