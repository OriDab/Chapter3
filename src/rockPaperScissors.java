import java.util.Scanner;

public class rockPaperScissors {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int num = (int)(Math.random() * 3);
        String playType = "";

        System.out.print("To play enter 0 for Scissor, 1 for Rock, and 2 for paper: ");
        int play = input.nextInt();
        String yourPlay ="";

        switch(num){
            case 0: playType = "Scissor";
                break;
            case 1: playType = "Rock";
                break;
            case 2: playType = "Paper";
                break;
        }

        switch(play){
            case 0: yourPlay = "Scissor";
                break;
            case 1: yourPlay = "Rock";
                break;
            case 2: yourPlay = "Paper";
                break;
        }


        if(play == 0 && num != 0 && num != 1)
            System.out.printf("The computer is %s. You are %s. You won.", playType, yourPlay);
        else if(play == 0 && num != 0 && num != 2)
            System.out.printf("The computer is %s. You are %s. You lost.", playType, yourPlay);
        else if(play == 1 && num != 1 && num != 2)
            System.out.printf("The computer is %s. You are %s. You won.", playType, yourPlay);
        else if(play == 1 && num != 1 && num != 0)
            System.out.printf("The computer is %s. You are %s. You lost.", playType, yourPlay);
        else if(play == 2  && num != 2 && num != 0)
            System.out.printf("The computer is %s. You are %s. You won.", playType, yourPlay);
        else if(play == 2  && num != 2 && num != 1)
            System.out.printf("The computer is %s. You are %s. You lost.", playType, yourPlay);
        else
            System.out.printf("The computer is %s. You are %s It is a draw", playType, yourPlay);
    }
}
