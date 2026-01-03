package util;

import java.util.Scanner;

public class TextUI {
    private Scanner scanner = new Scanner(System.in);

    public void displayMessage (String message){
        System.out.println(message);
    }

    public String textPrompt (String message){
        displayMessage(message);
        String input = scanner.nextLine();
        return  input;
    }
}
