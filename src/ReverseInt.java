import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class ReverseInt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter array's size: ");
        int size = scanner.nextInt();
        Stack<Integer> stackInt = new Stack<Integer>();
        int[] arrNumber = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Enter number: ");
            arrNumber[i] = scanner.nextInt();
        }
        System.out.println("\nBegin reverse: ");
        for (int i = 0; i < arrNumber.length; i++) {
            System.out.print(arrNumber[i] + "\t");
        }
        for (int i = 0; i < arrNumber.length; i++) {
            stackInt.push(arrNumber[i]);
        }
        System.out.println("\nAfter reverse: ");
        for (int i = 0; i < arrNumber.length; i++) {
            System.out.print(stackInt.pop() + "\t");
        }
    }
}
