import java.util.Scanner;

public class Scanner_System_console {
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
        //String name = System.console().readLine("Hi, what is your name?");
        System.out.println("What is your name?");
        String name = scanner.nextLine();
        System.out.println("hi " + name + " nice to meet you!");

       // String dateOfBirth = System.console().readLine("What is your age");
        System.out.println("What is your birth year?");
        String dateOfBirth = scanner.nextLine();
        int age = currentYear - Integer.parseInt(dateOfBirth);
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


