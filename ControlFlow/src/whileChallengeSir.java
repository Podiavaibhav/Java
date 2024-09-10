public class whileChallengeSir {
    public static void main(String[] args) {

        int i = 4;
        int j = 20;

        while (i <= j) {
            i++;
            if (!isEvenNumber(i)) {
                continue;
            }
        }

            for (int k = 5; k <= 20; k++) {

                if (isEvenNumber(k)) {
                    System.out.print(" Even number is - " + k );
                } else {
                    continue;
                }


            }


        }


        public static boolean isEvenNumber ( int num){

            if (num % 2 == 0) {
                return true;
            } else {
                return false;
            }

        }


    }
