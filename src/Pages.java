import java.util.Scanner;
public class Pages {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter your age: ");

        int age = userInput.nextInt();
        int pageNumber = 100 - age;

        System.out.println("\n" + age + "-year olds should read at least " + pageNumber + " pages before giving up on a book.");
    }
}