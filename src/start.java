import java.util.Scanner;

public class start {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);



        int number = sc.nextInt();
        System.out.println("Please enter a number: ");
        System.out.println("Please enter the operation: ");
        String opt = sc.next();
        System.out.println("Please enter a second number: ");
        int ww = sc.nextInt();

        if (opt.equals("+")){
            System.out.println(number + opt + ww + "=" + (number + ww));
        }
        if (opt.equals("-")){
            System.out.println(number + opt + ww + "=" + (number - ww));
        }
        if (opt.equals("/")){
            System.out.println(number + opt + ww + "=" + (number / ww));
        }
        if (opt.equals("*")){
            System.out.println(number + opt + ww + "=" + (number * ww));
        }
    }
}