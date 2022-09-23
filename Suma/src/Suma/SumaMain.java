package Suma;
import java.util.Scanner;

public class SumaMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Dame el primer valor: ");
        int valor1 = sc.nextInt();
        
        System.out.println("Dame el segund ovalor: ");
        int valor2 = sc.nextInt();
        
        Suma valores = new Suma(valor1,valor2);
        valores.Imprimir();
    }
}
