import java.util.Scanner;

public class Scanner_looping {
    public static void main(String[] args) {

        int currentYear = 2024;

    try {
        System.out.println(getInputFromConsole(currentYear));

    } catch (NullPointerException e) {
        System.out.println(getInputFromScanner(currentYear));

    }

}

    public static String getInputFromConsole(int currentYear){

        String name = System.console().readLine("Hi, what is your name?");
        System.out.println("hi " + name + " nice to meet you!");

        String dateOfBirth = System.console().readLine("What is your age");
        int age = currentYear - Integer.parseInt(dateOfBirth);
        return "So you are " + age + " years old";
    }

    public static String getInputFromScanner(int currentYear){

        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your birth year?");

        boolean validDOB = false;
        int age = 0;
        do {
            System.out.println("Enter an year of birth >= " + (currentYear - 125) + " and <= " + (currentYear));

            try {
                age = checkData(currentYear, scanner.nextLine());
                validDOB = age < 0 ? false : true;
            } catch (NumberFormatException badUserData) {
                System.out.println("CHARACTERS NOT ALLOWED !!! TRY AGAIN");
            }
        } while (!validDOB);

        return "So you are " + age + " years old";

    }

        public static int checkData(int currentYear , String dateOfBirth) {

        int dob = Integer.parseInt(dateOfBirth);
        int minimumYear = currentYear -125;

        if ((dob> currentYear) || dob < minimumYear) {
            return -1;
        }
        return (currentYear - dob);
        }

}


