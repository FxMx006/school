import java.util.Scanner;

public class Akzeptor {
    public static void main(String[] args) {
        String state = "start";
        StringBuilder acceptedWord = new StringBuilder();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Current state: " + state);
            System.out.println("Enter 'a' or 'b':");
            String input = scanner.nextLine();

            switch (state) {
                case "start":
                    if (input.equals("a")) {
                        state = "q3";
                        acceptedWord.append(input);
                    } else if (input.equals("b")) {
                        state = "q1";
                        acceptedWord.append(input);
                    }
                    break;
                case "q1":
                    if (input.equals("a")) {
                        state = "q4";
                        acceptedWord.append(input);
                    } else if (input.equals("b")) {
                        state = "q2";
                        acceptedWord.append(input);
                    }
                    break;
                case "q2":
                    if (input.equals("a")) {
                        state = "q4";
                        acceptedWord.append(input);
                    } else if (input.equals("b")) {
                        acceptedWord.append(input);
                    } else if (input.equals("end")) {
                        System.out.println("Program ended.");
                        System.out.println("The accepted word: " + acceptedWord);
                        return;
                    }
                    break;
                case "q3":
                    if (input.equals("a") || input.equals("b")) {
                        acceptedWord.append(input);
                    } else if (input.equals("end")) {
                        System.out.println("Program ended.");
                        System.out.println("The accepted word: " + acceptedWord);
                        return;
                    }
                    break;
                case "q4":
                    if (input.equals("a")) {
                        acceptedWord.append(input);
                    } else if (input.equals("b")) {
                        state = "q2";
                        acceptedWord.append(input);
                    }
                    break;
            }
        }
    }
}
