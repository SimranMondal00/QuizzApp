import java.util.Arrays;
import java.util.Scanner;

public class QuestionService {
    Question [] questions = new Question[5];
    String [] selection = new String[5];
    public QuestionService(){
        questions[0] = new Question(1, "What is the capital of France?", "Paris", "Madrid", "Berlin", "Rome", "Paris");
        questions[1] = new Question(2, "Who wrote 'To Kill a Mockingbird'?", "Harper Lee", "J.K. Rowling", "Stephen King", "Ernest Hemingway", "Harper Lee");
        questions[2] = new Question(3, "What is the chemical symbol for water?", "H2O", "CO2", "NaCl", "O2", "H2O");
        questions[3] = new Question(4, "Which planet is known as the Red Planet?", "Mars", "Venus", "Jupiter", "Saturn", "Mars");
        questions[4] = new Question(5, "Who painted the Mona Lisa?", "Leonardo da Vinci", "Vincent van Gogh", "Pablo Picasso", "Michelangelo", "Leonardo da Vinci");

    }
    public void playQuiz(){
        int i=0;
       for(Question q : questions){
           System.out.print("Question No."+q.getId()+" ");
           System.out.println(q.getQuestion());
           System.out.println(q.getOp1());
           System.out.println(q.getOp2());
           System.out.println(q.getOp3());
           System.out.println(q.getOp4());
           Scanner sc = new Scanner(System.in);
           selection[i++] = sc.nextLine();
       }
        System.out.print("[");
       for(String s : selection){
           System.out.print(s + " ");
       }
        System.out.print("]");
    }
    public void printScore(){
        int score = 0;

        for(int i=0;i< questions.length;i++){
            Question que = questions[i];
            String actualAnswer = que.getAnswer();
            String userAnswer = selection[i];

            if(actualAnswer.equals(userAnswer)){
                score++;
            }
        }
        System.out.println();
        System.out.println("Your score is: "+score);
    }
}
