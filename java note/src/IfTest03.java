import java.util.Scanner;
public class IfTest03 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("please enter the age of your dog !");
        int age = scan.nextInt();

        double DogAge = 0;
        if (age < 2 && age>0){
            DogAge  = age * 10.5;
            System.out.println("The age of your dog is"+ DogAge);
        }else if(age>2) {
            DogAge = (2 * 10.5) + ((age - 2) * 4);
            System.out.println("The age of your dog is"+ DogAge);
        }else{
            System.out.println(" dog have not born!");
        }
        }
    }

