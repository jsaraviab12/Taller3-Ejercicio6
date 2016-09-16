/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author Jesus
 */
public class Cafetera {
   private int capmaxima;
   private int capactual;

    public Cafetera(int capmaxima, int capactual) {
        this.capmaxima = capmaxima;
        this.capactual = capactual;
    }

    public Cafetera(int capactual) {
        this.capactual = capactual;
    }
    

    public int getCapmaxima() {
        return capmaxima;
    }

    public void setCapmaxima(int capmaxima) {
        this.capmaxima = capmaxima;
    }

    public int getCapactual() {
        return capactual;
    }

    public void setCapactual(int capactual) {
        this.capactual = capactual;
    }
    public void llenar(){
   int aux;
   aux=this.getCapmaxima();
   this.setCapactual(aux);
    }
    public void vaciar(){
    int aux=0;
    this.setCapactual(aux);
    }
    public void agregar(int agregado){
    String aux1;
    int aux=0;
     if(this.getCapactual()+agregado<1000){
     aux=this.getCapactual()+agregado;
    
     
     
     }else{
      aux=this.getCapmaxima();
     }
    this.setCapactual(aux);
    }
    public void servir( int servido){
    int aux;
    if(this.getCapactual()< servido){
        aux=0;
    }else{
     aux=this.getCapactual()-servido;
    }
    this.setCapactual(aux);
    } public String mostrar() {
     String aux;
       aux = "Capacidad maxima es:  "+this.getCapmaxima()+"\n"
           + "La capcidad actual es de: "+this.getCapactual();
          
        return aux;
    }
    public String renovar(){
      String aux;
      aux=""+this.getCapactual();
      return aux;
    }
}
