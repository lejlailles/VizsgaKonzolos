
package modell;

import java.time.LocalDate;



public abstract class KiallitasiTargy {
    LocalDate letrehozasDatuma;
   private String keszito,cim;

    public KiallitasiTargy(String keszito, String cim) {
        this.keszito = keszito;
        this.cim = cim;
      
         
       try{
          this.letrehozasDatuma=LocalDate.now();
                   
           
    
       }
       catch(Exception e){
           
       }
        
    }

    public LocalDate getLetrehozasDatuma() {
        return letrehozasDatuma;
    }

    public void setLetrehozasDatuma(LocalDate letrehozasDatuma) {
        this.letrehozasDatuma = letrehozasDatuma;
    }

    public String getKeszito() {
        return keszito;
    }

    public void setKeszito(String keszito) {
        this.keszito = keszito;
    }

    public String getCim() {
        return cim;
    }

    public void setCim(String cim) {
        this.cim = cim;
    }

  
    
}
