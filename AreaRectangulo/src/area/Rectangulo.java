/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package area;

/**
 *
 * @author Jose Luis Hernandez
 */
public class Rectangulo {
    private int base,altura,area;

    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }
    public void CalculoArea(){
        area=base*altura;
    }
    public void Resultado(){
        CalculoArea();
        System.out.print("El area del rectangulo es: "+area);
        System.out.println("");
    }
}
