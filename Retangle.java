package Application;
import java.util.Locale;
import java.util.Scanner;
import entities.Calc;

public class Retangle {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Calc retangle = new Calc();


        System.out.println("Enter rectangle width and heiht: ");
        retangle.width = sc.nextDouble();
        retangle.height = sc.nextDouble();
        
        System.out.println("Area: "+retangle.area());
        System.out.println("Perimeter: "+retangle.perimeter());
        System.out.println("Diagonal: "+retangle.diagonal());



        sc.close();
    }
}
