import java.util.Scanner;

public class Reynoldsnumber {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("Enter diameter :");
        float D = x.nextFloat();
        System.out.println("Enter velocity :");
        float V = x.nextFloat();
        System.out.println("Enter viscosity ");
        float mu = x.nextFloat();
        System.out.println("Enter density :");
        float rho = x.nextFloat();
        float R = (D*V*rho)/mu;
        System.out.println("Reynolds number is : "+R);
    }
}
