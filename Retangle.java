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
        
        System.out.println("A área do retângulo é: "+retangle.area());
        System.out.println("O perímetro do retângulo é: "+retangle.perimeter());
        System.out.println("A diagonal do retângulo é: "+retangle.diagonal());



        sc.close();
    }
}
