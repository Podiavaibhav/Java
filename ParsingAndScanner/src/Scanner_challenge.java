import java.util.Scanner;

public class Scanner_challenge {
    public static void main(String[] args) {

        int sum = 0;
        System.out.println("The sum is - " + input("0"));

    }

    public static int input(String number) {
        int counter = 1;
        int sum = 0;
        Boolean validNumber = false;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Enter your " + counter  + " number - ");
            try {
                number = scanner.nextLine();
                int enteredNumber = Integer.parseInt(number);
                if (checkData(enteredNumber)) {
                    sum = sum + enteredNumber;
                    counter++;
                    System.out.println("This is count number - " + counter);
                } else {
                    System.out.println("Invalid number");
                }
            } catch (NumberFormatException badUserInput) {
                System.out.println("CHARACTERS ARE NOT ALLOWED - ENTER NUMBER ");
            }

        } while (counter <= 5);

        return sum;
    }


    public static boolean checkData(int digit) {

        if (digit < 0) {
            return false;
        }
        return true;
    }
}
