import java.util.Scanner;

public class multiplyThreeNumbers {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int number1 =  (int)(Math.random() * 10);
        int number2 =  (int)(Math.random() * 10);
        int number3 = (int)(Math.random() * 10);
        int answer = number1 * number2 * number3;

        System.out.print("What is " + number1 + " * " + number2 + " * " + number3 + " = ");
        int inputAnswer = input.nextInt();

        if(inputAnswer == answer){
            System.out.println("You are correct " + number1 + " * " + number2 + " * " + number3 + " = " + answer);
        }
        else
            System.out.println("You are incorrect " + number1 + " * " + number2 + " * " + number3 + " = " + answer);

    }
}
