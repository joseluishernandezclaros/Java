
package area;

import java.util.Scanner;

public class RectanguloMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Dame el valor de la base: ");
        int base = sc.nextInt();
        System.out.print("Dame el valor de la altura: ");
        int altura = sc.nextInt();
        
        Rectangulo rectan = new Rectangulo(base,altura);
        rectan.Resultado();
    }
}
