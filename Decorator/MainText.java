package Decorator;

import java.util.Scanner;

public class MainText {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Text text = new PlainText("Hello World!");

        while (true){
            System.out.println("1. Make the text  Bold.");
            System.out.println("2. Make the text  Italic.");
            System.out.println("3. Make the text  Underlined.");
            System.out.println("4. Exit.");
            System.out.println("Choose What You Want to do With The Text: ");

            int choice = sc.nextInt();

            switch (choice){
                case 1:
                    text = new BoldText(text);
                    String boldString = text.editText();
                    System.out.println(boldString);
                    break;

                case 2:
                    text = new ItalicText(text);
                    String italicString = text.editText();
                    System.out.println(italicString);
                    break;

                case 3:
                    text = new UnderlineText(text);
                    String underlinedString = text.editText();
                    System.out.println(underlinedString);
                    break;

                case 4:
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid Input!");
            }

        }
    }
}
