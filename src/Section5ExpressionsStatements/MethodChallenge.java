package Section5ExpressionsStatements;

public class MethodChallenge {
    public static void main(String[] args) {
        int rank = calculateHighScorePosition(50);

        displayHighScorePosition("SOl", rank);

    }
    public static void displayHighScorePosition(String name, int rank){

        System.out.println(name + " managed to get into position "+ rank + " on the high score list");
    }
    public static int  calculateHighScorePosition(int score){
        int result = 4;
        if (score>=1000){
            result = 1;
        } else if (score<1000 && score>=500) {
            result = 2;
            
        } else if (score >= 100 && score <500) {
            result = 3;
            
        }
        return result;
    }

}
