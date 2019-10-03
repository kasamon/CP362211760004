package MidtermExams;

import java.util.Scanner;

public class Exams2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        final double PI = 3.14;
        System.out.println("Entre:");
        double r = scan.nextDouble();

        double Area = PI * r*r;
        System.out.println("Circle round: " + Area);

        double h = 2 * PI * r;
        System.out.println("Circle round: " +h);

        double v = 4 / 3 *PI*r*r;
        System.out.println("Circle round: " + v);

    }
}
