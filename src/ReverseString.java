import java.util.Scanner;
import java.util.Stack;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<String> wStack = new Stack<String>();
        System.out.println("Enter a string: ");
        String string = scanner.nextLine();
        String[] mWord = string.split(" ");
        for (int i = 0; i < mWord.length; i++) {
            wStack.push(mWord[i]);
        }
        System.out.println("Reverse string: ");
        for (int i = 0; i < mWord.length; i++) {
            System.out.println(wStack.pop());
        }
    }
}
