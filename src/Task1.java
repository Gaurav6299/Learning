import java.util.Scanner;

public class Task1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String question = "What is the largest planet in our earth";
        String choicesOne = "earth";
        String choicesTwo = "jupyter";
        String choicesThree = "naptune";
        String correctAnswer = choicesTwo;
        int point = 0;
//        int chances=5;
        int i = 1;

//        while (i<=chances) {
        System.out.println(question);
        System.out.println("Enter the Choices of the following:");
        System.out.println("1." + choicesOne);
        System.out.println("2." + choicesTwo);
        System.out.println("3." + choicesThree);
        System.out.println("Press 1.for first Choices\nPress 2.for second Choices\nPress 3.for third choices");
        String choices = sc.nextLine();

        if (correctAnswer.equals(choices)) {
            System.out.println("Congrates! you got 10 points");
            point += 10;
//                System.out.println((chances-i)+ " : chances are remaining ");
        } else {
            System.out.println("Wrong Answer!");
//                System.out.println((chances-i)+ " : chances are remaining ");
        }

        System.out.println("You have got Total points:" +point);
    }
}
