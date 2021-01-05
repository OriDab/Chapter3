import java.util.Scanner;

public class lottery {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int lottery = (int)(Math.random() * 1000);
        System.out.print("Enter a three digit integer number to see if you win: ");
        int num = input.nextInt();

        int lotteryNum1 = lottery / 100;
        int lotteryNum2 = (lottery / 10) % 10;
        int lotteryNum3 = lottery % 10;

        int guessNum1 = num / 100;
        int guessNum2 = (num / 10) % 10;
        int guessNum3 = num % 10;

        System.out.println("The lottery number is " + lottery);

        if(num == lottery)
            System.out.println("Exact match: you win $12,000");
        else if(guessNum2 == lotteryNum1 && guessNum2 == lotteryNum3 && guessNum1 == lotteryNum3 && guessNum1 == lotteryNum2 && guessNum3 == lotteryNum1 && guessNum3 == lotteryNum2)
            System.out.println("Match all digits: you win $3,000");
        else if(guessNum2 == lotteryNum1 || guessNum2 == lotteryNum3 || guessNum1 == lotteryNum3 || guessNum1 == lotteryNum2 || guessNum3 == lotteryNum1 || guessNum3 == lotteryNum2 || guessNum3 == lotteryNum3 || guessNum2 == lotteryNum2 || guessNum1 == lotteryNum1)
            System.out.println("You matched one digit: you win $2,000");
        else
            System.out.println("No match: you won nothin, GG");
    }
}
