/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package amigos;

/**
 *
 * @author USUARIO
 */
public class Cuenta {
    public String Descripcion;
    public String QuienPago;
    public int MontoTotal;
    public String [] Personas ;
    
    
   
    public Cuenta(String Descripcion, String QuienPago, int MontoTotal) {
        this.Descripcion = Descripcion;
        this.QuienPago = QuienPago;
        this.MontoTotal = MontoTotal;
    }
    

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public String getQuienPago() {
        return QuienPago;
    }

    public void setQuienPago(String QuienPago) {
        this.QuienPago = QuienPago;
    }

    public int getMontoTotal() {
        return MontoTotal;
    }

    public void setMontoTotal(int MontoTotal) {
        this.MontoTotal = MontoTotal;
    }

    public  String [] getPersonas() {
        return Personas;
    }

    public void setPersonas(String[] Personas) {
        this.Personas = Personas;
    }

    @Override
    public String toString() {
        return "Cuenta{" + "Descripcion=" + Descripcion + ", QuienPago=" + QuienPago + ", MontoTotal=" + MontoTotal + '}';
    }
    

 
    
    
    
    
    
        
        
    }
    

