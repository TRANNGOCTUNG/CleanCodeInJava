package tennisGame;

public class TennisGame {
    public static String getScore(String playNumber1, String playNumber2, int m_score1, int m_score2) {
        String score  =  "";
        int tempScore = 0;
        if(m_score1 == m_score2) {
            switch (m_score1) {
                case 1 -> {
                    score = "Love - All";
                }
                case 2 -> {
                    score = "Fifteen - All";
                }
                case 3 -> {
                    score = "Fourteen - All";
                }
                case 4 -> {
                    score = "Five - All";
                }
                default -> score = "Deuce";
            }
        } else if (m_score1 >= 4 || m_score2 >= 4){
            int minusResult = m_score1 - m_score2;
            if(minusResult == 1) score = "Adventive player 1";
            else if (minusResult == -1)  score = "Adventive player 2";
            else if (minusResult >= 2) score = "Win for player 1";
            else score = "Win for player 2";
        } else {
            for (int i=1; i<3; i++)
            {
                if (i==1) tempScore = m_score1;
                else { score+="-"; tempScore = m_score2;}
                switch(tempScore)
                {
                    case 0:
                        score+="Love";
                        break;
                    case 1:
                        score+="Fifteen";
                        break;
                    case 2:
                        score+="Thirty";
                        break;
                    case 3:
                        score+="Forty";
                        break;
                }
            }
        }
        return score;
    }
}
