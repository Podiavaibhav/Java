public class Sum3and5 {
    public static void main(String[] args) {

    int numberCounter = 0;
    int sum = 0;
            for (int number = 1; number <= 1000; number++) {
                if (number % 15 == 0) {
                    System.out.println(number);
                    numberCounter++;
                    sum += number;
                }
                if (numberCounter ==5) {
                    break;
                }

            }
            System.out.println("The sum of numbers are - " + sum);



        }

    }






