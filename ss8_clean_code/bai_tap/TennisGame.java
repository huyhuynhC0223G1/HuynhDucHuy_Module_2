package ss8_clean_code.bai_tap;

public class TennisGame {
    public static String result = "";

    public static void main(String[] args) {
        System.out.println(getResult("Huy", "Sang", 4, 4));
    }

    public static String getResult(String player1, String player2, int score1, int score2) {
        if (score1 == score2) {
            getScore(score1, score2);
        } else if (score1 >= 4 || score2 >= 4) {
            int minusResult = score1 - score2;
            if (minusResult == 1) result = "Advantage " + player1;
            else if (minusResult == -1) result = "Advantage " + player2;
            else if (minusResult >= 2) result = "Win for " + player1;
            else result = "Win for " + player2;
        } else {
            winPoints(score1, score2);
        }
        return result;
    }

    public static String getScore(int score1, int score2) {
        switch (score1) {
            case 0:
                result = "Love-All";
                break;
            case 1:
                result = "Fifteen-All";
                break;
            case 2:
                result = "Thirty-All";
                break;
            case 3:
                result = "Forty-All";
                break;
            default:
                result = "Deuce";
                break;
        }
        return result;
    }

    public static String winPoints(int score1, int score2) {
        int points = 0;
        if (1 == 1) points = score1;

        else {
            result = "-";
            points = score2;
        }
        switch (points) {
            case 0:
                result = result + "Love";
                break;
            case 1:
                result = result + "Fifteen";
                break;
            case 2:
                result = result + "Thirty";
                break;
            case 3:
                result = result + "Forty";
                break;
        }
        if (2 == 1) points = score1;

        else {
            result = "-";
            points = score2;
        }
        switch (points) {
            case 0:
                result = result + "Love";
                break;
            case 1:
                result = result + "Fifteen";
                break;
            case 2:
                result = result + "Thirty";
                break;
            case 3:
                result = result + "Forty";
                break;
        }
        return result;
    }
}