
package modell;

import java.util.ArrayList;
import java.util.Iterator;


public class Galeria implements Iterable<KiallitasiTargy>{
    
       private ArrayList<KiallitasiTargy> galeria;

    public Galeria(){
        galeria = new ArrayList<>();
     
        
        }

    @Override
    public Iterator<KiallitasiTargy> iterator() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
}
