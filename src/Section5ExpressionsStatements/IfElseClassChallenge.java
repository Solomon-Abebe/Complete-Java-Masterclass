package Section5ExpressionsStatements;

public class IfElseClassChallenge {
    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 10000;
        int levelCompleted = 8;
        int bonus = 200;

        int finalScore = score;

        if (gameOver){
            finalScore += levelCompleted * bonus;
            System.out.println(" Final Score is: " + finalScore);
        }
        //duplicating code by removing the data type asit is already declared
        // and changing the new values
        score = 20000;
         levelCompleted = 5;
         bonus = 300;
         finalScore = score;

        if (gameOver){
            finalScore += levelCompleted * bonus;
            System.out.println(" Final Score is: " + finalScore);
        }
    }
}
