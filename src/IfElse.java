public class IfElse {
    public static void main(String[] args) {

        int testScore = 0;
        if (testScore > 50) {
            System.out.println("well done-you passed");
        } else if (testScore == 50) {
            System.out.println("I am not sure if you passed or not");
        } else {
            System.out.println("sorry you failed");
        }

        switch (testScore) {
            case 0:
                System.out.println("did you even take the test?");
                                System.out.println("you scored Zero");
                break;

            case 100:
                System.out.println("you got top marks!");
                break;
            default:
                System.out.println("you have not done anything special");
                break;
        }
    }}

