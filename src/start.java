import java.util.Scanner;

public class start {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a number: ");
        int number = scanner.nextInt();
        System.out.println("Please enter the operation: ");
        String opt = scanner.next();
        System.out.println("Please enter a second number: ");
        int number2 = scanner.nextInt();

        if (opt.equals("+")){
            System.out.println(number + opt + number2 + "=" + (number + number2));
        }
        if (opt.equals("-")){
            System.out.println(number + opt + number2 + "=" + (number - number2));
        }
        if (opt.equals("/")){
            System.out.println(number + opt + number2 + "=" + (number / number2));
        }
        if (opt.equals("*")){
            System.out.println(number + opt + number2 + "=" + (number * number2));
        }
    }
}