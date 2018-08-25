package com.example.user.baseballscore;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
int scoreTeamA=0;
int scoreTeamB=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    private void displayforTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.score_team_A);
        scoreView.setText(String.valueOf(score));
    }

    public void add3ToTeamA(View v) {
        scoreTeamA = scoreTeamA + 3;
        displayforTeamA(scoreTeamA);
    }

    public void add2ToTeamA(View v) {

        scoreTeamA = scoreTeamA + 2;
        displayforTeamA(scoreTeamA);

    }
    public void add1ToTeamA(View v) {

        scoreTeamA = scoreTeamA + 1;
        displayforTeamA(scoreTeamA);

    }
private void displayforTeamB(int score){
        TextView scoreView = (TextView) findViewById(R.id.score_team_B);
                scoreView.setText(String.valueOf(score));
}
    public void add3ToTeamB(View v) {

        scoreTeamB = scoreTeamB + 3;
        displayforTeamB(scoreTeamB);

    }

    public void add2ToTeamB(View v) {
        scoreTeamB = scoreTeamB + 2;
        displayforTeamB(scoreTeamB);
    }
    public void add1ToTeamB(View v) {

        scoreTeamB = scoreTeamB + 1;
        displayforTeamB(scoreTeamB);
    }

    public void reset(View view) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayforTeamA(scoreTeamA);
        displayforTeamB(scoreTeamB);
    }
}
