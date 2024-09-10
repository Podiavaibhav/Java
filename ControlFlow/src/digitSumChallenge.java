public class digitSumChallenge {
    public static void main(String[] args) {

        System.out.println(sum(1234));



    }

    public static int sum(int number) {
        int add = 0;
        if (number > 0) {
            while (number > 0) {
                add = add + number % 10;
                number = number / 10;
            }
        } else {
        return -1;}
        return add;
    }

}
