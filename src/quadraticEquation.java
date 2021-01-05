import java.util.Scanner;

public class quadraticEquation {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a value for a, b, c: ");
        double valA = input.nextDouble();
        double valB = input.nextDouble();
        double valC = input.nextDouble();
        double discrim = Math.pow(valB, 2) - (4 * valA * valC);

        if(discrim > 0){
            double r1 = ((-valB + Math.sqrt(valB * valB - 4 * valA * valC))/ 2 * valA);
            double r2 = ((-valB - Math.sqrt(valB * valB - 4 * valA * valC))/ 2 * valA);
            System.out.print("The equation has two roots " + String.format("%.6f", r1) + " and " + String.format("%.6f",r2));
        }
        else if(discrim == 0){
            double r1 = ((-valB + Math.sqrt(valB * valB - 4 * valA * valC))/ 2 * valA);
            System.out.println("The equation has one roots " + String.format("%.1f",r1));
        }
        else{
            System.out.println("The equation has no real roots");
        }

    }
}
