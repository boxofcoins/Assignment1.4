package com.example.assignment;

public class QuestionLibrary {

    private int maxQ = 2;

    //implement array list
    private String mQuestions [] = {
            "what colour is the sky",
            "what colour is grass",


    };

    private String mAnswers [][] = {
            {"blue", "red", "green", "orange"},
            {"blue", "black", "green", "purple"},
    };

    private String multipleChoiceQuestions[] = {
            "I am a boy",
            "I am not a girl"
    };

    private String multipleChoiceAnswers[] = {"TRUE", "FALSE"};


    private String mCorrectAnswers[] = {"blue", "grass"};


    public String getQuestion(int a, int b) {
        if (a == maxQ) {

            String question = multipleChoiceQuestions[b];
            return question;


        } else {
            String question = mQuestions[a];
            return question;

        }
    }



    public String getChoice1(int a, int b) {
        if (a!= maxQ) {
            String choice0 = mAnswers[a][0];
            return choice0;
        }
        else {
            String choice0 = multipleChoiceAnswers[0];
            return choice0;
        }
    }


    public String getChoice2(int a, int b) {
        if (a != maxQ) {


            String choice1 = mAnswers[a][1];
            return choice1;
        } else {
            String choice1 = multipleChoiceAnswers[1];
            return choice1;
        }
    }


    public String getChoice3(int a, int b) {
        if (a != maxQ) {
            String choice2 = mAnswers[a][2];
            return choice2;
        }
        return null;
    }

    public String getChoice4(int a, int b) {
        if (a != maxQ) {
            String choice2 = mAnswers[a][3];
            return choice2;
        }
        return null;
    }

    public String getCorrectAnswer(int a, int b) {

        if (a != maxQ){
        String answer = mCorrectAnswers[a];
        return answer;}
        else {
            String answer = multipleChoiceAnswers[b];
            return answer;
        }
    }

}

