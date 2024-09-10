public class EnhancedSwitch {
    public static void main(String[] args) {

        int switchValue = 3;

/*            switch(switchValue){
                case 1:
                    System.out.println("Value was 1");
                    break;

                case 2:
                    System.out.println("Value was 2");
                    break;

                default:
                    System.out.println("Was neither 1 or 2");
                    break;
            }*/

        //WE CAN WRITE THE UPPER CODE IN ENHANCED SWITCH STATEMENT AS FOLLOWS-

        switch (switchValue) {
            case 1 -> System.out.println("Value was 1");
            case 2 -> System.out.println("Value was 2");
            case 3, 4 ,5 -> System.out.println("Value was either 3 or 4 or 5 . " + " Actually Value was " + switchValue);
            default -> System.out.println("Was not 1 , 2 , 3 , 4 , 5");
        }
    }
}
