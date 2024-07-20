package Section5ExpressionsStatements;

public class MethodsInJava {

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 500;
        int levelCompleted =4;
        int bonus =600;

        int finalScore = score;
        if(gameOver){
            finalScore += (levelCompleted * bonus);
            System.out.println("Your final score wassss: " + finalScore);
        }
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
