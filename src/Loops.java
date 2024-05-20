
// Loops: 1) FOR loops

// for= keyword (int i=0;i<10;i++) declaration of counter variable and assigning initial value
// { system.out.println(i); }

//  int i=0;  declaration of counter variable and assigning initial value
//   i<10; boolean expression- keep running while this is true
//    i++ incrementer expression- what should happen to the counter variable at the end of each loop run
// {- start of code block marker }- end of code block marker

public class Loops {
    public static void main(String[] args) {
        for(int i=50; i<=55; i++) {
            System.out.println(i*3);
        }
        double[] array={13.5,12.7,1.6};

        for(int i=0; i<array.length;i++) {
            System.out.println(array[i]);

        }
        int counter=0;
        while(counter<5){
            System.out.println("hello"+counter);
            counter++;
        }
 int totalScore=101;
        do{
            System.out.println("Heyoo");
            totalScore++;
        }
        while(totalScore<100);

        int count = 0;

        do {
            System.out.println("Count is: " + count);
            count++;
        } while (count < 5);

        do {
            System.out.println("count till" + count);
            count++;
        }
        while(count<10);



    }
}

