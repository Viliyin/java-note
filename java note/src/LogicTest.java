/*
运算符之4：逻辑运算符
& && | || ! ^

说明:
1.逻辑运算符操作的都是boolean类型的变量

 */


public class LogicTest {
    public static void main(String[] args) {

        //区分& 与&&
        // same ：1.& and &&的运算结果相同
        //same 2：当符号左边是ture时，二者都会执行右边的运用
        // diff  : 当符号右边是false时， &会继续执行右边运算，&&不再执行右边运算。
        // 开发中，推荐使用&&（省事）

        boolean b1 = true;
        b1 = false;
        int num1 = 10;
        if (b1 & (num1++ > 0)) {
            System.out.println("I am in BJ");
        } else {
            System.out.println("I am in NJC");
        }
        System.out.println("num1=" + num1);


        boolean b2 = true;
        b2 = false;
        int num2 = 10;
        if (b2 && (num2++ > 0)) {
            System.out.println("I am in BJ");
        } else {
            System.out.println("I am in NJC");
        }
        System.out.println("num2=" + num2);

        // diff:| and ||
        // sane 1.: =执行结果相同
        // SAME 2. :当符号左边是false时，二者会执行相投的运算
        // diff 3. : 当符号左边是true时，| 继续执行符号左边的运算，而|| 不再执行符号右边的运算
        // 开发中，推荐使用||

        boolean b3 = false;
        b3 = true;
        int num3 = 10;
        if (b3 | (num3++ > 0)) {
            System.out.println("I am in BJ");
        } else {
            System.out.println("I am in NJC");
        }

            System.out.println("num3=" + num3);


            boolean b4 = false;
            b4 =true;
            int num4 = 10;
            if (b4 || (num4++ > 0)) {
                System.out.println("I am in BJ");
            } else {
                System.out.println("I am in NJC");
            }

                System.out.println("num4=" + num4);



            }
        }









