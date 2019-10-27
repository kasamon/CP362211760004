package Quiz2;

import jdk.nashorn.internal.ir.ContinueNode;

import java.util.Scanner;

public class jipata {
    public static void Continue(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Do you want to continue(Y/N):");
        char c = sc.next().charAt(0);
        if (c =='Y'|| c =='y')showOption();
        else {
            System.out.println("Good Bye.");
            System.exit(1);}
        }
    public  static void main (String[]args) {
        showOption();
    }
    private static void showOption() {
        Scanner sc = new Scanner(System.in);
        int select;
        do {
    }
        System.out.println("Welcome to Jipata System :");
        System.out.println("Please,Select options below:");
        System.out.println("1.Body Mess Index(BMI:");
        System.out.println("2.Geometry capacity:");
        System.out.println("3.Working with Array:");
        System.out.println("4.Exit:");
        System.out.println("Select:");
        int select = sc.nextInt();
        switch (select) {
            case 1: System.out.println("Body Mess Index(BMI)");break;
            case 2: System.out.println("Geometry capacity.");break;
            case 3: System.out.println("2.1.Circle.");break;
            case 4: System.out.println("2.2.Triangle.");break;
            case 5: System.out.println("3.ohhh, you might expert in programming.");break;
            default: System.out.println("You have to enter 1-3.");

                // Body Mess Index(BMI)
                Scanner in = new Scanner(System.in);
                System.out.print("Weight: ");
                float weight = in.nextFloat();

                System.out.print("Height: ");
                float height = in.nextFloat();

                float bmi = weight * 10000.00f / (height * height);
                System.out.println(bmi);


                // Geometry capacity
                //2.1 Circle

                Scanner scan = new Scanner(System.in);
                final double PI = 3.14;
                System.out.println("Enter:");
                double r = scan.nextDouble();

                double Area = PI * r * r;
                System.out.println("Circle round: " + Area);

                double c = 3 * PI * r;
                System.out.println("Circle round: " + c);

                double v = 4 / 3 * r * r;
                System.out.println("Circle round: " + v);


                //2.1 Triangle



        }
    }
}

    private static void showOption() {
    }
