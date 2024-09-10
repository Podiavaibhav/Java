public class while_doWhile {
    public static void main(String[] args) {

        int j = 0;
          int k = 0 ;
            int m = 0;
        while (j <= 5) {
            System.out.println(j);
            j++;
        }
        //Can also be done as -
        while(true) {
            if (k > 10) {
                break;
            }
                System.out.println(k);
                k++;


        }

        //Can also be done as -
        do {
            if (m > 6){
                break;
            }
            System.out.println(m);
            m++;
        } while (true);


    }
}
