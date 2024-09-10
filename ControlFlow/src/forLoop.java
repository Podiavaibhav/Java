/*     FOR LOOP

       for (initialisation ; expression ; increment){
       block of code
          }
       */


public class forLoop {
    public static void main(String[] args) {

        for (double rate = 2.0 ;  rate <= 5 ; rate ++) {
            double Interest = calculateInterest(10000 , rate);
            if (Interest > 400) {
                break;
            }
            System.out.println("The interest calculated at " + rate + " % rate is " + Interest );
        }

    }

    public static double calculateInterest (double amount , double interestRate) {
        return (amount*interestRate)/100;
    }


}