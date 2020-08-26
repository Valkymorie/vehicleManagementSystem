package mark_ıı;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;


public abstract class arac {
    
    public String marka;
    public int hiz;
    public int yolcu_sayisi;
    public int fiyat;
    public String renk;
    public int uretim;
    public static long arac_ID = 0;

    public arac() throws IOException {
        
        try {
            String dosya ="AracKayit.txt";
            String[] satirlar = new String[200];
            int sayac = 0;
            BufferedReader bfr = new BufferedReader(new FileReader(dosya));
            while(bfr.ready()){
                satirlar[sayac++] = bfr.readLine();
            }
            
            if(sayac!=1){
                String[] parcala = satirlar[--sayac].split(",");
                arac_ID = Long.parseLong(parcala[0]);
            }
            
            arac_ID++;
        } 
        catch (FileNotFoundException ex) {
            Logger.getLogger(arac.class.getName()).log(Level.SEVERE, null, ex);
        } 
        
        }
    
    
    public arac(String marka, int hiz, int yolcu_sayisi, int fiyat, String renk, int uretim) throws IOException {
        
        try {
            String dosya ="AracKayit.txt";
            String[] satirlar = new String[200];
            int sayac = 0;
            BufferedReader bfr = new BufferedReader(new FileReader(dosya));
            while(bfr.ready()){
                satirlar[sayac++] = bfr.readLine();
            }
            
            if(sayac!=1){
                String[] parcala = satirlar[--sayac].split(",");
                arac_ID = Long.parseLong(parcala[0]);
            }
            
            this.marka = marka;
            this.hiz = hiz;
            this.yolcu_sayisi = yolcu_sayisi;
            this.fiyat = fiyat;
            this.renk = renk;
            this.uretim = uretim;
            arac_ID++;
        } 
        catch (FileNotFoundException ex) {
            Logger.getLogger(arac.class.getName()).log(Level.SEVERE, null, ex);
        } 
       
    }
    
    public abstract void ivme();

    
    
}

