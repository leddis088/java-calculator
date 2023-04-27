import java.util.Scanner;

    public class start2 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter your calculation: ");
            String command = sc.next();
            String[] opts = command.split(";");
            int result = 0;

            if (opts[1].equals("+")) {
                result = (Integer.parseInt(opts[0]) + Integer.parseInt(opts[2]));
            }
            if (opts[1].equals("-")) {
                result = (Integer.parseInt(opts[0]) - Integer.parseInt(opts[2]));
            }
            if (opts[1].equals("*")) {
                result = (Integer.parseInt(opts[0]) * Integer.parseInt(opts[2]));
            }
            if (opts[1].equals("/")) {
                result = (Integer.parseInt(opts[0]) / Integer.parseInt(opts[2]));
            }

            System.out.println(" = " + result);

        }
    }