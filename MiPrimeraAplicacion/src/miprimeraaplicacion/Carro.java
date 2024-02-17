
package miprimeraaplicacion;

public class Carro {
    
    //Atributos
   private String placa;
   private String color;
   private int    modelo;
    
    public Carro(){
    }
    
    
    public Carro(String pPlaca,String pColor,int pModelo){
        placa=pPlaca;
        modelo=pModelo;
        color=pColor;
    }
    
    public Carro(String pPlaca){
        placa=pPlaca;
        
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }
    
    
    
    
    
}
