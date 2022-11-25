/*

 Programmer: Harminder Singh Nijjar

 Assignment Chapter: Chapter 7

 Purpose: The purpose of this code is to create a trivia game in which two players take turns
 answering questions. The player who answers the most questions correctly is declared the winner.

 Date modified: 11/25/2022

 IDE/Toool used: IntelliJ IDEA

 */

import java.util.Scanner;

class Question {
    private String question;
    private String answer1;
    private String answer2;
    private String answer3;
    private String answer4;
    private int correctAnswer;

    public Question(String question, String answer1, String answer2, String answer3, String answer4, int correctAnswer) {
        this.question = question;
        this.answer1 = answer1;
        this.answer2 = answer2;
        this.answer3 = answer3;
        this.answer4 = answer4;
        this.correctAnswer = correctAnswer;
    }

    public String getQuestion() {
        return question;
    }

    public String getAnswer1() {
        return answer1;
    }

    public String getAnswer2() {
        return answer2;
    }

    public String getAnswer3() {
        return answer3;
    }

    public String getAnswer4() {
        return answer4;
    }

    public int getCorrectAnswer() {
        return correctAnswer;
    }

    public static class TriviaGame {

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            Question[] questions = new Question[10];

            // initialize the questions array
            questions[0] = new Question("What is the capital of Australia?", "Canberra", "Sydney", "Melbourne", "Perth", 1);
            questions[1] = new Question("What is the capital of Canada?", "Toronto", "Vancouver", "Montreal", "Ottawa", 4);
            questions[2] = new Question("What is the capital of France?", "Paris", "Lyon", "Marseille", "Toulouse", 1);
            questions[3] = new Question("What is the capital of Germany?", "Frankfurt", "Munich", "Berlin", "Hamburg", 3);
            questions[4] = new Question("What is the capital of Italy?", "Milan", "Rome", "Venice", "Naples", 2);
            questions[5] = new Question("What is the capital of Japan?", "Tokyo", "Kyoto", "Osaka", "Hiroshima", 1);
            questions[6] = new Question("What is the capital of Spain?", "Madrid", "Barcelona", "Seville", "Valencia", 1);
            questions[7] = new Question("What is the capital of Switzerland?", "Zurich", "Geneva", "Basel", "Bern", 4);
            questions[8] = new Question("What is the capital of the United Kingdom?", "London", "Manchester", "Birmingham", "Liverpool", 1);
            questions[9] = new Question("What is the capital of the United States?", "New York", "Washington, D.C.", "Los Angeles", "Chicago", 2);

            int player1Score = 0;
            int player2Score = 0;

            // player 1's turn
            for (int i = 0; i < 5; i++) {
                System.out.println(questions[i].getQuestion());
                System.out.println("1) " + questions[i].getAnswer1());
                System.out.println("2) " + questions[i].getAnswer2());
                System.out.println("3) " + questions[i].getAnswer3());
                System.out.println("4) " + questions[i].getAnswer4());
                System.out.print("Enter your choice: ");
                int choice = input.nextInt();
                if (choice == questions[i].getCorrectAnswer()) {
                    player1Score++;
                }
            }

            // player 2's turn
            for (int i = 5; i < 10; i++) {
                System.out.println(questions[i].getQuestion());
                System.out.println("1) " + questions[i].getAnswer1());
                System.out.println("2) " + questions[i].getAnswer2());
                System.out.println("3) " + questions[i].getAnswer3());
                System.out.println("4) " + questions[i].getAnswer4());
                System.out.print("Enter your choice: ");
                int choice = input.nextInt();
                if (choice == questions[i].getCorrectAnswer()) {
                    player2Score++;
                }
            }

            // display final results
            System.out.println("Player 1 score: " + player1Score);
            System.out.println("Player 2 score: " + player2Score);
            if (player1Score > player2Score) {
                System.out.println("Player 1 wins!");
            } else if (player2Score > player1Score) {
                System.out.println("Player 2 wins!");
            } else {
                System.out.println("It's a tie!");
            }
        }

    }

}