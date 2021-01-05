import java.util.Scanner;

public class solveLinearEquation {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a, b, c, d, e, f: ");

        double a = in.nextDouble();
        double b = in.nextDouble();
        double c = in.nextDouble();
        double d = in.nextDouble();
        double e = in.nextDouble();
        double f = in.nextDouble();

        if((a*d - b*c) == 0){
            System.out.println("The equation has no solution.");
        }else{
            double x = ((e * d) - (b * f)) / ((a * d) - (b * c));
            double y = ((a * f) - (e * c)) / ((a * d) - (b * c));

            System.out.printf("x is %.1f and y is %.1f", x, y);
        }

    }
}

