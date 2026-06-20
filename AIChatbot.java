import java.util.Scanner;

public class AIChatbot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== AI Chatbot ===");
        System.out.println("Type 'bye' to exit.");

        while (true) {
            System.out.print("You: ");
            String userInput = sc.nextLine().toLowerCase();

            if (userInput.equals("hello")) {
                System.out.println("Bot: Hi! How can I help you?");
            }
            else if (userInput.equals("how are you")) {
                System.out.println("Bot: I am fine. Thanks for asking!");
            }
            else if (userInput.equals("bye")) {
                System.out.println("Bot: Goodbye!");
                break;
            }
            else {
                System.out.println("Bot: Sorry, I don't understand.");
            }
        }

        sc.close();
    }
}