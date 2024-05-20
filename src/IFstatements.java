import org.w3c.dom.ls.LSOutput;

public class IFstatements {
    public static void main(String[] args) {

        int testScore = 51;
        if (testScore >= 50) {
            System.out.println("well done-you passed");
        }

        if (testScore < 50) {
            System.out.println("sorry-you failed");

        }
        if (testScore == 50) {
            System.out.println("I am not sure if you passed or not");
        }

// Logical operators
// if score>50 and score is divisible by 10
   if (testScore>50 && testScore % 10 == 0){
       System.out.println("you passed with a score ending in a zero");
  }
 if(testScore>50 || testScore==49) {
     System.out.println("you are good to go");
 }

          }
          }


