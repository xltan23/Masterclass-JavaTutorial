public class Methods {
    public static void main(String[] args) {
        int highScore = calculateScore(true, 800, 11, 300);
        System.out.println("Your final score: " + highScore);


        int rank = calculateHighScorePosition(1500);
        displayHighScorePosition("Ralph", rank);

        rank = calculateHighScorePosition(900);
        displayHighScorePosition("Terry", rank);

        rank = calculateHighScorePosition(400);
        displayHighScorePosition("Deja", rank);

        rank = calculateHighScorePosition(90);
        displayHighScorePosition("Vu", rank);
    }
    
    /*
    // Method
    public static void calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        if (gameOver) {
            int finalScore = score + (levelCompleted*bonus);
            System.out.println("The final score: " + finalScore);
        }
    }
    */

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        if (gameOver) {
            int finalScore = score + (levelCompleted*bonus);
            return finalScore;
        }
        return -1;
    }

    // Procedure 
    public static void displayHighScorePosition(String playerName, int ranking) {
        System.out.println(playerName + " managed to get into " + ranking + " position on the highscore table");
    }

    public static int calculateHighScorePosition(int score) {
        if (score >= 1000) {
            return 1;
        } else if (score >= 500 && score < 1000) {
            return 2;
        } else if (score >= 100 && score < 500) {
            return 3;
        } else {
            return 4;
        }
    }

}