public class whileChallenge {
    public static void main(String[] args) {

        int i = 4;
        int j = 20;
        int evenCounter = 0;
        int oddCounter = 0;

        while(i <= j) {

            i++;
            if (!isEvenNumber(i)) {
                oddCounter++;
                continue;
            }
                System.out.println("At Even number  - " + i );
                evenCounter ++;
                System.out.println("The number of even entries - " + evenCounter);
                System.out.println("The number of odd entries - " + oddCounter);
                if (evenCounter == 5){
                    break;
                }


        }




    }

    public static boolean isEvenNumber(int num){

        if (num % 2 == 0 ){
            return true;
        } else {
            return false;
        }

    }



}
