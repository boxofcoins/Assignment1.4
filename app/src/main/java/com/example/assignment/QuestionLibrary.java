package com.example.assignment;

public class QuestionLibrary {

    private int maxQ = 8;


    private String mQuestions [] = {
            "What is the alternative name for 'Team Lead' in an agile Scrum?",
            "What is NOT the responsibility of a Scrum Master?",
            "Why do we need domain experts?",
            "A product vision is a?",
            "Why do we need Product Backlogs?",
            "What is the purpose of daily stand up?",
            "When does the iteration review occur?",
            "Lean startup aims to?",

    };

    private String mAnswers [][] = {
            {"Group Leader", "Team Head", "Scrum Master", "Lead Developer"},
            {"Develop the database", "Facilitation the team", "Obtaining the resources", "Protecting the scrum from problems"},
            {"Because product owners cannot be experts in everything", "In order to save costs", "Create advertising campaigns", "Create a better brand image", "To minimize risks"},
            {"quick summary, to communicate how your product supports the company strategy","List Pros and Cons of the product","Document stating how the team will get the resources needed", "Financial Statement"},
            {"In order to show a high-level view of the product requirements","In order to save costs","To minimize risks","Create a better brand image"},
            {"Get rapid feedback","Get updates","Showcase the work","Talk about life"},
            {"At the end of the sprint or milestone", "Every Friday","Daily", "Monthly"},
            {"Shorten product development cycles","Slowly develop features in order to get it correct in the first place","Get users through social media advertising","Get funding by going on only a handful of roadshows"}

    };

    private String multipleChoiceQuestions[] = {
            "Extreme Programming aims to produce higher quality of life for users",
            "The product backlog is ordered by priority",
            "The product roadmap is a low level view"

    };

    private String multipleChoiceAnswers[] = {"FALSE", "TRUE","FALSE" };



    private String mCorrectAnswers[] = {"Scrum Master", "Develop the database","Because product owners cannot be experts in everything","quick summary, to communicate how your product supports the company’s or organization’s strategies","quick summary, to communicate how your product supports the company’s or organization’s strategies","In order to show a high-level view of the product requirements needed to achieve the product vision","In order to show a high-level view of the product requirements needed to achieve the product vision","Get updates","At the end of a sprint or milestone","shorten product development cycles and rapidly discover if a proposed business model is viable"};


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

