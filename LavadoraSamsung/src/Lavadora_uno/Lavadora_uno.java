package Lavadora_uno;
import Libreria.LLFunciones;
import java.util.Scanner;

public class Lavadora_uno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("¿La ropa es blanca o de color?");
        System.out.println("Presiona 1 - Ropa blanca / 2 - Ropa de color");
        int TipoDeRopa = sc.nextInt();
        
        System.out.println("¿Cuantos kilos de ropa?");
        int kilos = sc.nextInt();
        
        LLFunciones mensaje = new LLFunciones(kilos, TipoDeRopa);
        mensaje.setTipoDeRopa(2);
        System.out.println("EL tipo de ropa es: " + mensaje.getTipoDeRopa());
        mensaje.CicloFinalizado();
    }
}
