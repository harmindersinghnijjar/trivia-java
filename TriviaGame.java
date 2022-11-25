import java.util.Scanner;

public class TriviaGame {

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
