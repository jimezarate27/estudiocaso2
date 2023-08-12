/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package amigos;

import javax.swing.JOptionPane;

/**
 *
 * @author USUARIO
 */
public class Amigos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cuenta Cuenta1 = new Cuenta ("Desayuno CoffePrime","Guillermo",120);
        Cuenta Cuenta2 = new Cuenta ("Almuerzo Pig Factory","Guillermo",200);
        Cuenta Cuenta3 = new Cuenta ("Cena FastFood","David",50);
        Cuenta Cuenta4 = new Cuenta ("Pizza Hut","Tavo",100);
        Cuenta Cuenta5 = new Cuenta ("Quicksilver Store","Grevin",150);
        Cuenta Cuenta6 = new Cuenta ("Apple Store","Joshua",200);
        Cuenta Cuenta7 = new Cuenta ("Desayuno Chillis","Greivin",150);
        Cuenta Cuenta8 = new Cuenta ("Almuerzo Hooters","Tavo",180);
        
        String []  personasCuenta1 = {"Joshua","Greivin","Guillermo","Andres","Tavo","David"};
        
        Cuenta1.setPersonas(personasCuenta1);
        
        String[] personasCuenta2 = { "Joshua","Greivin","Guillermo","Andres","Tavo"};
        
        Cuenta2.setPersonas(personasCuenta2);
        
        String[] personasCuenta3 = { "Joshua","David"};
        
        Cuenta3.setPersonas(personasCuenta3);
        
        String[] personasCuenta4 = { "Guillermo","Andres","Greivin","Tavo"};
       
        Cuenta4.setPersonas(personasCuenta4);
       
        String[] personasCuenta5 = { "Guillermo"};
       
        Cuenta5.setPersonas(personasCuenta5);
        
        String[] personasCuenta6 = { "Andres"};
       
        Cuenta6.setPersonas(personasCuenta6);
        
        String[] personasCuenta7 = { "Joshua","Greivin","Guillermo","Andres","Tavo","David"};
       
        Cuenta7.setPersonas(personasCuenta7);
       
        String[] personasCuenta8 = { "Joshua","Greivin","Guillermo","Andres","Tavo","David"};
       
        Cuenta8.setPersonas(personasCuenta8);
        
        Cuenta [] CuentaSistema = new Cuenta [100];
        CuentaSistema[0] = Cuenta1;
        CuentaSistema[1] = Cuenta2;
        CuentaSistema[2] = Cuenta3;
        CuentaSistema[3] = Cuenta4;
        CuentaSistema[4] = Cuenta5;
        CuentaSistema[5] = Cuenta6;
        CuentaSistema[6] = Cuenta7;
        CuentaSistema[7] = Cuenta8;
        
        System.out.println("Cuenta 1: "+CuentaSistema[0]);
        System.out.println("Personas de la cuenta 1: Joshua,Greivin, Guillermo, Andres,Tavo,David ");
       
        System.out.println("\nCuenta 2: "+CuentaSistema[1]);
        System.out.println("Personas de la cuenta 2: Joshua,Greivin, Guillermo, Andres,Tavo ");
        
        System.out.println("\nCuenta 3: "+CuentaSistema[2]);
        System.out.println("Personas de la cuenta 3: Joshua,David ");
        
        System.out.println("\nCuenta 4: "+CuentaSistema[3]);
        System.out.println("Personas de la cuenta 4: Greivin, Guillermo, Andres,Tavo ");
        
        System.out.println("\nCuenta 5: "+CuentaSistema[4]);
        System.out.println("Personas de la cuenta 5: Guillermo ");
        
        System.out.println("\nCuenta 6: "+CuentaSistema[5]);
        System.out.println("Personas de la cuenta 6: Andres");
        
        System.out.println("\nCuenta 7: "+CuentaSistema[6]);
        System.out.println("Personas de la cuenta 7: Joshua,Greivin, Guillermo, Andres,Tavo,David ");
        
        System.out.println(getLargoArreglo(CuentaSistema));
        System.out.println(CuentaSistema[getLargoArreglo(CuentaSistema)-1].toString());
        System.out.println("Personas de la cuenta 8: Joshua,Greivin, Guillermo, Andres,Tavo,David ");
       
        AgregarCuenta(CuentaSistema);
        System.out.println(getLargoArreglo(CuentaSistema));
        System.out.println(CuentaSistema[getLargoArreglo(CuentaSistema)-1].toString());
        System.out.println("Personas de la cuenta nueva:");
        for (String persona : CuentaSistema[getLargoArreglo(CuentaSistema)-1].getPersonas()){
            System.out.println(persona);
        }
        
        
        System.out.println("\nDeudas:");
        
        for (int i = 0; i < getLargoArreglo(CuentaSistema); i++){
            System.out.println("Cuenta " + (i+1)+ ":  "+CuentaSistema[i]);
            getDeudas(CuentaSistema[i], new Cuenta[]{CuentaSistema[i]});
        }
       
    }

    public static void AgregarCuenta(Cuenta[] Cuentas){
        
        JOptionPane.showMessageDialog(null, "A continuacion ingresara la nueva cuenta: ");
        String Descripcion = JOptionPane.showInputDialog(null, "Cual es la descripcion?: ");
        String QuienPago =  JOptionPane.showInputDialog(null, "Quien pago?: ");
        int MontoTotal = Integer.parseInt(JOptionPane.showInputDialog(null, "Cual fue el monto total?: "));
        
        String [] participantes = new String [100];
        int numParticipantes = 0;
        
        while (true){
            String participante = JOptionPane.showInputDialog(null, "Quienes fueron los participantes? *Si desea terminar escriba 'salir''");
            if (participante.equals("salir")){
                break;
            }
            participantes[numParticipantes] = participante;
            numParticipantes++;
        }
        String[] participantesNuevos = new String [numParticipantes];
        for ( int i = 0; i < numParticipantes; i++){
            participantesNuevos[i] = participantes[i];
        }
        Cuenta CuentaNueva = new Cuenta (Descripcion, QuienPago, MontoTotal);
        CuentaNueva.setPersonas(participantesNuevos);
        Cuentas[getLargoArreglo(Cuentas)] = CuentaNueva;
        
    }
  
    public static int getLargoArreglo(Cuenta[] Cuentas){
        for (int i = 0; i < Cuentas.length; i++) {
            if (Cuentas [i] == null){
                return i  ;
            }
        }
        return Cuentas.length;
    }
    public static int getCalcularDeudas(String persona, Cuenta [] Cuentas){
        int DeudaTotal = 0;
        for(Cuenta cuenta : Cuentas){
            if(cuenta != null){
                if (!cuenta.getQuienPago().equals(persona)&& participante(cuenta, persona)){
                    int numparticipantes = cuenta.getPersonas().length;
                    if (numparticipantes > 0){
                    DeudaTotal += cuenta.getMontoTotal() / numparticipantes  ;
                }
            }
        }
        }
        return DeudaTotal;
    }
    
    
    public static boolean participante(Cuenta cuenta, String persona){
        if(cuenta != null && cuenta.getPersonas() != null){
            for (String participante : cuenta.getPersonas()){
                if(participante != null && participante.equals(persona)){
                    return true;
                }
            }
        }
        return false;
    }
    public static void getDeudas (Cuenta cuenta , Cuenta[] Cuentas){
        if (cuenta != null && cuenta.getPersonas() != null){
            System.out.println("Deudas:  ");
            String QuienPago = cuenta.getQuienPago();
            for (String persona : cuenta.getPersonas()){
                if(!persona.equals(QuienPago)){
                    int deuda = getCalcularDeudas (persona , Cuentas);
                    if(deuda > 0){
                    System.out.println(persona+" le debe a : "+cuenta.getQuienPago()+" un total de: "+deuda+" dolares");
            
                    }
                }
            }
        }
    }
    public static void DeudaCuenta1(Cuenta cuenta, Cuenta[] Cuentas){
        if (cuenta != null && cuenta.getPersonas() != null){
            System.out.println("Deuda para la salida a: "+cuenta.getDescripcion()+".");
            for (String persona : cuenta.getPersonas()){
                if (!persona.equals(cuenta.getQuienPago())){
                    int deuda = getCalcularDeudas(persona, Cuentas);
                    if (deuda > 0){
                        System.out.println(persona+"le debe a: "+cuenta.getQuienPago()+"un total de: "+deuda+"dolares");
                    }
                }
            }
        }
    }
}
    
     
    





   
    
    
   
    

