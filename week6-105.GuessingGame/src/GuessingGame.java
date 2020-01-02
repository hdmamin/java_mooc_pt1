import java.util.Scanner;

public class GuessingGame {

    private Scanner reader;

    public GuessingGame() {
        // use only this scanner, othervise the tests do not work
        this.reader = new Scanner(System.in);
    }

//    public void play(int lowerLimit, int upperLimit) {
//        instructions(lowerLimit, upperLimit);
//        this._play(lowerLimit, upperLimit);
//    }
//    
//    public void _play(int lowerLimit, int upperLimit) {
//        if (lowerLimit == upperLimit) {
//            System.out.println("The number you're thinking of is " + lowerLimit + ".");
//        } else {
//            // Guess must be an integer. Calculate floor of mean.
//            int guess = (lowerLimit + upperLimit) / 2;
//            System.out.println("Is your number greater than " + guess + "? (y/n)");
//            String answer = this.reader.nextLine();
//
//            // Recursive portion - update limits based on user response.
//            // Question asks "greater than" so lower limit case must be >guess,
//            // while upper limit case only needs to be <=guess.
//            if (answer.equals("y")) {
//                this._play(guess+1, upperLimit);
//            } else if (answer.equals("n")) {
//                this._play(lowerLimit, guess);
//            }
//        }
//        
//    }

    public void play(int lowerLimit, int upperLimit) {
        instructions(lowerLimit, upperLimit);
        int guess = -1; // Placeholder value.
        while (lowerLimit != upperLimit) {
            guess = this.average(lowerLimit, upperLimit);
            boolean greaterThanGuess = this.isGreaterThan(guess);
            
            // Adjust bounds based on user response.
            if (greaterThanGuess) {
                lowerLimit = guess + 1;
            } else {
                upperLimit = guess;
            }
        }

        System.out.println("The number you're thinking of is " + lowerLimit);
    }
    
    // implement here the methods isGreaterThan and average
    public boolean isGreaterThan(int num) {
        System.out.println("Is your number greater than " + num + "? (y/n)");
        String answer = this.reader.nextLine();
        if (answer.equals("y")) {
            return true;
        } else {
            return false;
        }
    }
    
    public int average(int num1, int num2) {
        // Calculate integer average (floor of mean).
        return (num1 + num2) / 2;
    }

    public void instructions(int lowerLimit, int upperLimit) {
        int maxQuestions = howManyTimesHalvable(upperLimit - lowerLimit);

        System.out.println("Think of a number between " + lowerLimit + "..." + upperLimit + ".");
        System.out.println("I promise you that I can guess the number you are thinking with " + maxQuestions + " questions.\n");
        System.out.println("Next I'll present you a series of questions. Answer them honestly.\n");
    }

    // a helper method:
    public static int howManyTimesHalvable(int number) {
        // we create a base two logarithm  of the given value

        // Below we swap the base number to base two logarithms!
        return (int) (Math.log(number) / Math.log(2)) + 1;
    }
}
