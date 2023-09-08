import java.util.Scanner;
public class Dateable {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter your age: ");

        int age = userInput.nextInt();
        int datingAge = 7 + (age / 2);

        System.out.println("\n" + age + "-year olds should date somebody who is at least " + datingAge + " years old.");
    }
}