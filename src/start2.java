import java.util.Scanner;

    public class start2 {
        public static void main(String[] args) {
            System.out.println("Hello, in the Leddis08 CALCULATOR!!!!!");
            Scanner sc = new Scanner(System.in);
            while (true){
                System.out.println("Enter your calculation or type 'x' to exit.");
                String command = sc.next();
                if (command.equals("x") || command.equals("X")){
                    System.out.println("Leddis08 says 'Bye! Come and calculate again!'");
                    break;
                }
                String[] opts = command.split(";");
                int result = calculate(Integer.parseInt(opts[0]), Integer.parseInt(opts[2]), opts[1]);
                System.out.println(" = " + result);
            }

        }

        public static int calculate(int number_1, int number_2, String opt){
            int result = 0;
            if (opt.equals("+")) {
                result = (number_1 + number_2);
            }
            if (opt.equals("-")) {
                result = (number_1 - number_2);
            }
            if (opt.equals("*")) {
                result = (number_1 * number_2);
            }
            if (opt.equals("/")) {
                result = (number_1 / number_2);
            }
            return result;
        }
    }