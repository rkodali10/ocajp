/**
    3.3 Create if and if/else and ternary constructs
     Topics:
         if/else if/else if/else
         ternary operator
 */
public class Lesson3 {

    public static void main(String[] args) {

        int guess = (int)(Math.random()*10);
        System.out.println(guess);

        int num = 5;
        if(guess > num) {
            System.out.println("Too high");
        }
        else if (guess < num) {
            System.out.println("Too low");
        }
        else {
            System.out.println("You guessed correct");

            // nested if
            if(true) {
                System.out.println("You are so clever");
            }
        }

        /*
            This syntax, without braces, is valid too,
            but it against convention and can introduce bugs
            Only one line inside the if statement is allowed
         */
        if(guess == 42)
            System.out.println("That is the meaning of life");
            System.out.println("This is not inside the if!!!");

        /*
            This is valid, although you shouldn't need it for exam, or ever.
         */
        if (false) ; else ;
    }
}
