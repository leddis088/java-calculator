import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int number = sc.nextInt();
        System.out.println("Please enter the operation: ");
        String opt = sc.next();
        System.out.println("Please enter a second number: ");
        int number2 = sc.nextInt();

        if (opt.equals("+")){
            System.out.println((number + number2));
        }
        if (opt.equals("-")){
            System.out.println((number - number2));
        }
        if (opt.equals("/")){
            System.out.println((number / number2));
        }
        if (opt.equals("*")){
            System.out.println((number * number2));
        }
    }
}