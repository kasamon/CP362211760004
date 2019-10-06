package lab7;

import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int totalEven = 0;
        int totalOdd = 0;
        int x = 0;
        for (int i = 0; i < 10; i++) {

            System.out.print("Enter an integer");
            x = sc.nextInt();
            if (x % 2 == 0)
                totalEven +=x;
            else
                totalOdd +=x;
            }
            System.out.print("Total of even number" + totalEven);
            System.out.print("Total of Odd number" + totalOdd);
        }
    }