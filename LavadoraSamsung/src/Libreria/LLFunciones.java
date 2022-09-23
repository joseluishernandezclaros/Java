
package Libreria;

public class LLFunciones {
    
    private int kilos = 0, llenadoCompleto = 0, TipoDeRopa = 0, LavadoCompleto=0, SecadoCompleto=0;
    
    public LLFunciones(int kilos, int TipoDeRopa){
        this.kilos = kilos;
        this.TipoDeRopa = TipoDeRopa;
    }
    
    private void Llenado(){
        if(kilos <= 12){
            llenadoCompleto = 1;
            System.out.println("Llenando...");
            System.out.println("Llenado completo");
        }else{
            System.out.println("La carga de ropa es muy pesada, reduce la carga");
        }
    }
    
    //Este metodo sirve para lavar
    private void Lavado(){ 
        Llenado();
        if(llenadoCompleto == 1){
            if(TipoDeRopa == 1){
                System.out.println("Ropa blanca / Lavado suave");
                System.out.println("Lavando...");
                LavadoCompleto=1;
            }else if(TipoDeRopa == 2){
                System.out.println("Ropa de color / Lavado intenso");
                System.out.println("Lavando...");
                LavadoCompleto=1;
            }else{
                System.out.println("El tipo de ropa no esta disponible");
                System.out.println("se lavara como ropa de color / Lavado intenso");
                LavadoCompleto=1;
            }
        }else{
            System.out.println("");
        }
    }
    private void Secado(){
        Lavado();
        if(LavadoCompleto == 1){
            System.out.println("Secando...");
            SecadoCompleto=1;
        }else{
            
        }
    }
    public void CicloFinalizado(){
        Secado();
        if(SecadoCompleto==1){
            System.out.println("Tu ropa esta lista!!");
        }
    }
    
    //Get y Set
    public int getTipoDeRopa(){
        return TipoDeRopa;
    }
    public void setTipoDeRopa(int TipoDeRopa){
        this.TipoDeRopa = TipoDeRopa;
    }

    public int getKilos() {
        return kilos;
    }

    public void setKilos(int kilos) {
        this.kilos = kilos;
    }

    public int getLlenadoCompleto() {
        return llenadoCompleto;
    }

    public void setLlenadoCompleto(int llenadoCompleto) {
        this.llenadoCompleto = llenadoCompleto;
    }

    public int getLavadoCompleto() {
        return LavadoCompleto;
    }

    public void setLavadoCompleto(int LavadoCompleto) {
        this.LavadoCompleto = LavadoCompleto;
    }

    public int getSecadoCompleto() {
        return SecadoCompleto;
    }

    public void setSecadoCompleto(int SecadoCompleto) {
        this.SecadoCompleto = SecadoCompleto;
    }
    
    
    
}
