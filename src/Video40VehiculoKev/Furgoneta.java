
package Video40VehiculoKev;

import java.util.*;

public class Furgoneta extends Vehiculo {
    
  private int capacidad_carga;
  
    private int plaza_extra;
    
    public Furgoneta(int plazas_extra,int capacidad_carga){
        
        super();
        
        this.capacidad_carga = capacidad_carga;
        
        this.plaza_extra = plaza_extra;
       
    }
    
    public String dimeDatosFurgoneta(){
        
        return "La capacidad de carga es: " + capacidad_carga + " y las plazas son: " +
                plaza_extra;
    }
}
