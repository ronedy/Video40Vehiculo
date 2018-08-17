/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Video40VehiculoKev;

import javax.swing.JOptionPane;

/**
 *
 * @author HP ENVY
 */
public class Video40VehiculoKev {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       Vehiculo al = new Vehiculo();
       
       al.establecer_color("Rojo");
       
       Furgoneta mifurgoneta1 = new Furgoneta(7,580);
       
       mifurgoneta1.establecer_color("Azul");
       
       mifurgoneta1.configura_asientos("si");
       
       mifurgoneta1.configura_climatizador("si");
       
       System.out.println(al.dime_datos_generales() + " " + al.dime_color());
       
       System.out.println(mifurgoneta1.dime_datos_generales() +
               mifurgoneta1.dimeDatosFurgoneta());
        
    }
    
}
