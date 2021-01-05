import java.util.Scanner;

public class futureDates {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter today's day (1-7): ");
        int day = input.nextInt();
        System.out.print("Enter the number of days elapsed since today: ");
        int elapsed = input.nextInt();
        int future = (elapsed + day) % 7;
        System.out.println(future);
        String dayOfWeek = "";

        switch(day){
            case 1: dayOfWeek = "monday";
                break;
            case 2: dayOfWeek = "tuesday";
                break;
            case 3: dayOfWeek = "wednesday";
                break;
            case 4: dayOfWeek = "thursday";
                break;
            case 5: dayOfWeek = "friday";
                break;
            case 6: dayOfWeek = "saturday";
                break;
            case 7: dayOfWeek = "sunday";
                break;
        }

        if (future == 0){
            System.out.printf("Today is %s and the future day is Sunday", dayOfWeek);
        }else if(future == 1){
            System.out.printf("Today is %s and the future day is Monday", dayOfWeek);
        }else if(future == 2){
            System.out.printf("Today is %s and the future day is Tuesday", dayOfWeek);
        }else if(future == 3){
            System.out.printf("Today is %s and the future day is Wednesday", dayOfWeek);
        }else if(future == 4){
            System.out.printf("Today is %s and the future day is Thursday", dayOfWeek);
        }else if(future == 5){
            System.out.printf("Today is %s and the future day is Friday", dayOfWeek);
        }else if(future == 6){
            System.out.printf("Today is %s and the future day is Saturday", dayOfWeek);
        }
    }
}
