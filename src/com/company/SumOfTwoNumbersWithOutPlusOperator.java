import java.util.Scanner;

public class SumOfTwoNumbersWithOutPlusOperator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter First Number : ");
        int input1 = scanner.nextInt();
        System.out.print("Enter Second Number : ");
        int input2 = scanner.nextInt();
        int output = input1 -(- input2);
        System.out.println("Scanner example to Sum of two numbers without using + operator (" + input1 + ", " + input2 + ") = " + output);

    }
}
