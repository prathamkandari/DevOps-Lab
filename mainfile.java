import java.util.*;

class mainfile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a and b");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Enter 1 for addition");
        System.out.println("Enter 2 for Subtraction");
        System.out.println("Enter 3 for multiplication");
        System.out.println("Enter 4 for division");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                int sum = a + b;
                System.out.println("The sum is " + sum);
                break;

            case 2:
                int minus = Math.abs(a - b);
                System.out.println("The subtraction is " + minus);
                break;

            case 3:
                int multiple = a * b;
                System.out.println("The product is " + multiple);
                break;

            case 4:
                int division = a/b;
                System.out.println("The division is " + division);
                break;
            
            default:
                System.out.println("Wrong Input");
        }
    }
}