package com.example.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int aScore,bScore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        aScore = 0;
        bScore = 0;
        displayForTeamA(aScore);
        displayForTeamB(bScore);
    }

    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void aFreeThrow(View view)
    {
        aScore += 1;
        displayForTeamA(aScore);

    }

    public void aAdd2(View view)
    {
        aScore += 2;
        displayForTeamA(aScore);

    }

    public void aAdd3(View view)
    {
        aScore += 3;
        displayForTeamA(aScore);

    }


    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void bFreeThrow(View view)
    {
        bScore += 1;
        displayForTeamB(bScore);

    }

    public void bAdd2(View view)
    {
        bScore += 2;
        displayForTeamB(bScore);

    }

    public void bAdd3(View view)
    {
        bScore += 3;
        displayForTeamB(bScore);

    }

    public void reset(View view)
    {
        aScore = 0;
        bScore = 0;
        displayForTeamA(aScore);
        displayForTeamB(bScore);

    }
}
