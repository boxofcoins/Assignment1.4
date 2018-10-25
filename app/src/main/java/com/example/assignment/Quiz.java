package com.example.assignment;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telecom.TelecomManager;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Quiz extends AppCompatActivity {

    //class to populate and randomize the quiz

    private QuestionLibrary questionLibrary = new QuestionLibrary();

    private int maxQ = 3;

    private int mCQCount = 0;

    private TextView scoreText;
    private TextView question;
    private Button choice1;
    private Button choice2;
    private Button choice3;
    private Button choice4;

    private String answer;
    private int score = 0;
    private int qNo = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        scoreText = findViewById(R.id.scoreCount);
        question = findViewById(R.id.questionBox);
        choice1 = findViewById(R.id.q1);
        choice2 = findViewById(R.id.q2);
        choice3 = findViewById(R.id.q3);
        choice4 = findViewById(R.id.q4);

        updateQ();

        choice1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (choice1.getText() == answer) {
                    score++;
                    scoreText.setText("" + score);
                    Toast.makeText(Quiz.this, "Correct", Toast.LENGTH_SHORT).show();
                    updateQ();
                } else {
                    Toast.makeText(Quiz.this, "Incorrect", Toast.LENGTH_SHORT).show();
                    updateQ();
                }
            }
        });

        choice2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (choice2.getText() == answer) {
                    score++;
                    scoreText.setText("" + score);
                    Toast.makeText(Quiz.this, "Correct", Toast.LENGTH_SHORT).show();
                    updateQ();
                } else {
                    Toast.makeText(Quiz.this, "Incorrect", Toast.LENGTH_SHORT).show();
                    updateQ();
                }
            }
        });

        choice3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (choice3.getText() == answer) {
                    score++;
                    scoreText.setText("" + score);
                    Toast.makeText(Quiz.this, "Correct", Toast.LENGTH_SHORT).show();
                    updateQ();
                } else {
                    Toast.makeText(Quiz.this, "Incorrect", Toast.LENGTH_SHORT).show();

                    updateQ();
                }
            }
        });

        choice4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (choice4.getText() == answer) {
                    score++;
                    scoreText.setText("" + score);
                    Toast.makeText(Quiz.this, "Correct", Toast.LENGTH_SHORT).show();
                    updateQ();
                } else {
                    Toast.makeText(Quiz.this, "Incorrect", Toast.LENGTH_SHORT).show();
                    updateQ();
                }
            }
        });

    }


        private void updateQ() {
        if (mCQCount ==2){
            startActivity(new Intent(Quiz.this,QuizResults.class));
        }
            question.setText(questionLibrary.getQuestion(qNo,mCQCount));
            choice1.setText(questionLibrary.getChoice1(qNo,mCQCount));
            choice2.setText(questionLibrary.getChoice2(qNo,mCQCount));
            choice3.setText(questionLibrary.getChoice3(qNo,mCQCount));
            choice4.setText(questionLibrary.getChoice4(qNo,mCQCount));
            answer = questionLibrary.getCorrectAnswer(qNo,mCQCount);
            if (qNo+1 == maxQ) {

             trueFalse();
             mCQCount++;

            } else  {
                qNo ++;
            }



            }



    private void trueFalse() {

        choice1.setVisibility(View.GONE);
        choice2.setVisibility(View.GONE);
        choice3.setText("TRUE");
        choice4.setText("FALSE");



    }

    }



