import java.util.Scanner;

    public class start2 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);System.out.println("Enter your calculation: ");
            String command = sc.next();
            String[] opts = command.split(" ");
            if (opts[1].equals("+")){
                System.out.println(opts[0] + opts[1] + opts[2] + (opts[0] + opts[2]));
            }
        }
    }