package ejemplouno;

import java.util.Scanner;

public class EjemploUno {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String oracion="", palainver="";
        int longitud;
        System.out.println("Escribe una palabra o frase");
        oracion = sc.nextLine();
        longitud = oracion.length();
        
        while (longitud != 0) {            
            palainver += oracion.substring(longitud -1, longitud);
            longitud--;
        }
        System.err.print("Palabra invertida: "+palainver);
        System.err.println("");
    }

}
