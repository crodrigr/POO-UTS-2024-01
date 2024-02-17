
package miprimeraaplicacion;

public class MiPrimeraAplicacion {
    
    public static void main(String[] args) {
        
     
        int numero=109;
        
        String cadena=new String("hola");        
        System.out.println(cadena.toUpperCase());
        
        String cadena2="hola2";
        
        
        
        Carro  car=new Carro();
        
        Carro car2=new Carro("FES152","Azul",2023);
        
        
         Carro car3=new Carro("FES152");
        
        car.setModelo(2024);
        System.out.println(car.getModelo());
        System.out.println(car.getPlaca());
        System.out.println(car.getColor());
        
        System.out.println(car2.getModelo());
        System.out.println(car2.getPlaca());
        System.out.println(car2.getColor());
        
        
        CuentaBancaria cuenta=new CuentaBancaria("camilo",100);
        System.out.println("Titular: "+cuenta.getTitular());
        System.out.println("Saldo:"+cuenta.getSalo());
        cuenta.setSaldo(-100);
        System.out.println("Saldo:"+cuenta.getSalo());
        
        
       
        
        
        
        
        
    }
    
}
