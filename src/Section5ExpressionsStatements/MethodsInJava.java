package Section5ExpressionsStatements;

public class MethodsInJava {

    public static void main(String[] args) {

        calculateScores(true, 500, 4, 600);
        calculateScores(true, 8000, 6, 150);
    }
    public static void calculateScores(boolean gameOver, int score, int levelCompleted, int bonus){
        int finalScore = score;
        if(gameOver){
            finalScore += (levelCompleted * bonus);
            System.out.println("Your final score was: " + finalScore);
        }
    }
}
