/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;
import paquete1.Atributos_Metodos;

/**
 *
 * @author Jose Luis Hernandez
 */
public class ClaseJavaDos {
    public static void main(String[] args) {
        Atributos_Metodos conexion = new Atributos_Metodos();
        //    conexion.nosepuede;     No se puede acceder a los atributos pro defecto
        // desde otro paquete.
        conexion.metodoprueba();
        int a = conexion.valor1;
    
    
    }     
}
