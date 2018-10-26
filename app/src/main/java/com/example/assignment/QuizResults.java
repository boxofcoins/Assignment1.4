package com.example.assignment;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
//this class returns the score by getting the extra data from the Quiz Class through an intent
public class QuizResults extends AppCompatActivity {

TextView scoreResult;
Button tryAgain;
private int score;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_results);

        Intent intent = getIntent();
        score = intent.getIntExtra("Score",0);

        scoreResult = findViewById(R.id.result);

        scoreResult.setText(score + "/10");

        tryAgain = findViewById(R.id.tryAgain);

        tryAgain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(QuizResults.this, Quiz.class);
                startActivity(intent);
            }
        });

    }
}
