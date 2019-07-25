package lab4;

import java.util.Scanner;

public class ExInput {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("please, enter an integer: ");
        int x = scanner.nextInt();

        System.out.println("Your entered integer: " + x);

        //input double
        System.out.println("please, enter an integer2:");
        double y = scanner.nextDouble();

        System.out.println("please, enter an integer2:" + y);

        //input String
        System.out.println("please, enter an name:");
        String s = scanner.nextLine() ;

        System.out.println("You name is:"+s);





    }
}
