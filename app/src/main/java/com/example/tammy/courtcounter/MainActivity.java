package com.example.tammy.courtcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;
    int scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
     /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Add three points to score for team A
     */
    public void threePointsTeamA(View view){
        scoreTeamA += 3;
        displayForTeamA(scoreTeamA);
    }

    /**
     * Add two points to score for team A
     */
    public void twoPointsTeamA(View view){
        scoreTeamA += 2;
        displayForTeamA(scoreTeamA);
    }

    /**
     * Add one point to score for team A
     */
    public void freeThrowTeamA(View view){
        scoreTeamA += 1;
        displayForTeamA(scoreTeamA);
    }

    /**
     * Add three points to score for team B
     */
    public void threePointsTeamB(View view){
        scoreTeamB += 3;
        displayForTeamB(scoreTeamB);
    }

    /**
     * Add two points to score for team B
     */
    public void twoPointsTeamB(View view){
        scoreTeamB += 2;
        displayForTeamB(scoreTeamB);
    }

    /**
     * Add one point to score for team B
     */
    public void freeThrowTeamB(View view){
        scoreTeamB += 1;
        displayForTeamB(scoreTeamB);
    }

    public void resetScore(View view){
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }

}
