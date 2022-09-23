package Suma;

public class Suma {
    private int v1, v2, res;
    
    public Suma(int valor1, int valor2){
        this.v1 = valor1;
        this.v2 = valor2;
    }

    public void Operacion(){
        res = v1+v2;
    }
    public void Imprimir(){
        Operacion();
        System.out.println("El resultado de la suma es: "+res);
    }
    
}
