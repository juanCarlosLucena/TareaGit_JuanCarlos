/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tareagit_juancarlos;

/**
 *
 * @author alumnociclo
 */

public class Tabla{
    
    private int numero;
    
    public int getNumero(){
        return this.numero;
    }
    
    public void setNumero(int numero){
        this.numero=numero;
    }
    
    public Tabla(int numero){
        this.numero=numero;               
    }
     public String multiplicacion(){
         StringBuilder tabla= new StringBuilder();
         for(int i=0; i<11; i++){
             int resultado = this.numero*i;
             tabla.append(this.numero + "*" + i + "=" + resultado + "\n");
         }
         
         return tabla.toString();
                           
     }
            
}