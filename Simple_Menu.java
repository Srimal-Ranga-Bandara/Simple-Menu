import java.util.Scanner;
public class Simple_Menu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.println("      MENU            ");
        System.out.println("1.PRINT HELLOW");
        System.out.println("2.PRINT WORLD");
        System.out.println("3.ADD TWO NUMBERS");
        System.out.println("4.EXIT");

        System.out.println("What You Need to do ENTER NUMBER : ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:

            System.out.println("Hellow");
            break;


            case 2:
            System.out.println("World");
            break;

            case 3:

            System.out.println("Enter Your First Number :");
            int num1 = scanner.nextInt();

            System.out.println("Enter Your Seconde Number ");
            int num2 = scanner.nextInt();


            System.out.println("Your First Number Is :"+num1);
            System.out.println("Your Second Number is :"+num2);

            break;

            case 4 : 
            System.out.println("Exit");
        
            default:
                System.out.println(" Enter Correct Menu Number ");
                break;
        }

        scanner.close();
    }
    
}
