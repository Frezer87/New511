import java.util.Scanner;
public class New51 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter any number that you would like to \n"+
                "print in absolute value, in squareRoot and power of 10");
       int y = scan.nextInt();
        System.out.println("Absolute value of " +y+ " is "+absolute(y));
        System.out.println("Square Root of " +y+ " is "+sqrt(y));
        System.out.println(y+" power of 10 is  "+exs(y));

    }

    public static double absolute(double num) {
        return (num >= 0) ? num : (-1 * num);
    }

    public static double sqrt(double number) {
        double x;
        double sqareroot = number / 2;
        do {
            x = sqareroot;
            sqareroot = (x + (number / x)) / 2;
        } while ((x - sqareroot) != 0);
        return sqareroot;

    }

    public static double exs(double p) {
            return (p*p*p*p*p*p*p*p*p*p);

    }
}
