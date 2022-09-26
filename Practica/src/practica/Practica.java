/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica;

/**
 *
 * @author Jose Luis Hernandez
 */
public class Practica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        String cadena1 = "Letras";
        //        cadena1.split(" ");
        //        System.out.println(cadena1);
        char[] array = cadena1.toCharArray();
        String resultado = "";
        
        
        
        for (int i = cadena1.length() - 1; i >= 0; i--) {
            resultado += array[i];
        }
        System.out.println(resultado);

    }

}
