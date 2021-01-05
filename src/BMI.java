import java.util.Scanner;

public class BMI {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter wight in pounds: ");
        int weight = input.nextInt();
        System.out.print("Enter feet: ");
        int heightFt = input.nextInt();
        System.out.print("Enter inches of your height: ");
        int heightIn = input.nextInt();
        final double poundsToKilo = 0.453592;
        double kilo = weight * poundsToKilo;
        final double ftToIn = 12;
        double inches = heightFt * ftToIn;
        double finalInches = heightIn + inches;
        double meters = finalInches * 0.0254;

        double BMI = kilo / (Math.pow(meters, 2));
        System.out.printf("BMI is %.6f \n", BMI);
        if(BMI < 18.5)
            System.out.println("Underweight");
        else if(BMI < 25)
            System.out.println("Normal");
        else if(BMI <30)
            System.out.println("Overweight");
        else
            System.out.println("Obese");
    }
}
