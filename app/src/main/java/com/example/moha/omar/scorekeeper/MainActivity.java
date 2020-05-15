package com.example.moha.omar.scorekeeper;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int shootA=0;
    int goalA=0;
    int foulA=0;
    int penaltyA=0;
    int offsideA=0;
    int shootB=0;
    int goalB=0;
    int foulB=0;
    int penaltyB=0;
    int offsideB=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_main);

    }

    // Team A information
    public void displayForTeamA_shoots(int shoots) {

        TextView shootviewA =findViewById(R.id.team_a_shoot) ;
        shootviewA.setText(String.valueOf(shoots)) ;

    }
    public void displayForTeamA_goals(int goal) {

        TextView shootviewA =findViewById(R.id.team_a_goal) ;
        shootviewA.setText(String.valueOf(goal)) ;
    }

    public void displayForTeamA_fouls(int foul) {

        TextView shootviewA =findViewById(R.id.team_a_fouls) ;
        shootviewA.setText(String.valueOf(foul)) ;
    }
    public void displayForTeamA_penalty(int pen) {

        TextView shootviewA =findViewById(R.id.team_a_penalty) ;
        shootviewA.setText(String.valueOf(pen)) ;
    }
    public void displayForTeamA_Offside(int offside) {

        TextView shootviewA =findViewById(R.id.team_a_offside) ;
        shootviewA.setText(String.valueOf(offside)) ;
    }


    public void team_a_shoots(View view) {
        shootA =shootA +1;
        displayForTeamA_shoots(shootA );
    }

    public void team_A_Goal_score(View view) {
        goalA =goalA +1;
        displayForTeamA_goals(goalA ) ;

    }

    public void Team_A_fouls(View view) {
        foulA =foulA +1;
        displayForTeamA_fouls(foulA);
    }

    public void Team_A_penalty(View view) {
        penaltyA =penaltyA +1;
        displayForTeamA_penalty(penaltyA );

    }

    public void Team_A_Offside(View view) {
        offsideA =offsideA +1;
        displayForTeamA_Offside(offsideA );
    }

    // Team B Information

    public void displayForTeamB_shoots(int shot) {

        TextView shootviewB =findViewById(R.id.team_b_shoot) ;
        shootviewB.setText(String.valueOf(shot)) ;

    }
    public void displayForTeamB_goals(int goals) {

        TextView shootviewB =findViewById(R.id.team_b_score) ;
        shootviewB.setText(String.valueOf(goals)) ;
    }

    public void displayForTeamB_fouls(int fouls) {

        TextView shootviewB =findViewById(R.id.team_b_fouls) ;
        shootviewB.setText(String.valueOf(fouls)) ;
    }
    public void displayForTeamB_penalty(int penal) {

        TextView shootviewB =findViewById(R.id.team_b_penalty) ;
        shootviewB.setText(String.valueOf(penal)) ;
    }
    public void displayForTeamB_offside(int offside) {

        TextView shootviewB =findViewById(R.id.team_b_offside ) ;
        shootviewB.setText(String.valueOf(offside)) ;
    }


    public void team_b_shoots(View view) {
        shootB =shootB +1;
        displayForTeamB_shoots (shootB ) ;

    }

    public void team_B_Goal_score(View view) {
        goalB =goalB +1;
        displayForTeamB_goals (goalB );
    }

    public void Team_B_fouls(View view) {
        foulB =foulB +1;
        displayForTeamB_fouls (foulB ) ;

    }

    public void Team_B_penalty(View view) {
        penaltyB =penaltyB +1;
        displayForTeamB_penalty (penaltyB );
    }

    public void Team_B_Offside(View view) {
        offsideB =offsideB +1;
        displayForTeamB_offside (offsideB );
    }

    public void reset(View  view) {

        shootA=0;
        goalA=0;
        foulA=0;
        penaltyA=0;
        offsideA=0;
        shootB=0;
        goalB=0;
        foulB=0;
        penaltyB=0;
        offsideB=0;
        displayForTeamA_shoots (shootA );
        displayForTeamA_fouls (foulA );
        displayForTeamA_goals (goalA );
        displayForTeamA_penalty (penaltyA );
        displayForTeamA_Offside (offsideA );
        displayForTeamB_fouls (foulB );
        displayForTeamB_goals (goalB );
        displayForTeamB_offside (offsideB );
        displayForTeamB_penalty (penaltyB);
        displayForTeamB_shoots (shootB) ;


    }
}
