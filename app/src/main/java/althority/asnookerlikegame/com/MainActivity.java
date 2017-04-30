package althority.asnookerlikegame.com;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private int scorePlayer1 = 0;
    private int scorePlayer2 = 0;
    private int foulPlayer1 = 0;
    private int foulPlayer2 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayScorePlayer1(0);
    }

    public void displayScorePlayer1(int score) {
        TextView scoreView = (TextView) findViewById(R.id.scorePlayer1);
        scoreView.setText(String.valueOf(score));
    }

    public void displayScorePlayer2(int score) {
        TextView scoreView = (TextView) findViewById(R.id.scorePlayer2);
        scoreView.setText(String.valueOf(score));
    }

    public void displayFoulPlayer1(int score) {
        TextView scoreView = (TextView) findViewById(R.id.foulPlayer1);
        scoreView.setText(String.valueOf("# of fouls: " + score));
    }

    public void displayFoulPlayer2(int score) {
        TextView scoreView = (TextView) findViewById(R.id.foulPlayer2);
        scoreView.setText(String.valueOf("# of fouls: " + score));
    }

    public void plusOnePointPlayer1(View view) {
        scorePlayer1 = scorePlayer1 + 1;
        displayScorePlayer1(scorePlayer1);
    }

    public void plusThreePointsPlayer1(View view) {
        scorePlayer1 = scorePlayer1 + 3;
        displayScorePlayer1(scorePlayer1);
    }

    public void plusSevenPointsPlayer1(View view) {
        scorePlayer1 = scorePlayer1 + 7;
        displayScorePlayer1(scorePlayer1);
    }

    public void foulPlayer1(View view) {
        if (scorePlayer1 >= 3) {
            scorePlayer1 = scorePlayer1 - 3;
        } else {
            scorePlayer1 = 0;
        }
        displayScorePlayer1(scorePlayer1);
        foulPlayer1 = foulPlayer1 + 1;
        displayFoulPlayer1(foulPlayer1);
    }

    public void plusOnePointPlayer2(View view) {
        scorePlayer2 = scorePlayer2 + 1;
        displayScorePlayer2(scorePlayer2);
    }


    public void plusThreePointsPlayer2(View view) {
        scorePlayer2 = scorePlayer2 + 3;
        displayScorePlayer2(scorePlayer2);
    }

    public void plusSevenPointsPlayer2(View view) {
        scorePlayer2 = scorePlayer2 + 7;
        displayScorePlayer2(scorePlayer2);
    }

    public void foulPlayer2(View view) {
        if (scorePlayer2 >= 3) {
            scorePlayer2 = scorePlayer2 - 3;
        } else {
            scorePlayer2 = 0;
        }
        displayScorePlayer2(scorePlayer2);
        foulPlayer2 = foulPlayer2 + 1;
        displayFoulPlayer2(foulPlayer2);
    }

    public void resetScore(View view) {
        scorePlayer1 = 0;
        scorePlayer2 = 0;
        foulPlayer1 = 0;
        foulPlayer2 = 0;
        displayScorePlayer1(scorePlayer1);
        displayScorePlayer2(scorePlayer2);
        displayFoulPlayer1(foulPlayer1);
        displayFoulPlayer2(foulPlayer2);
    }
}
