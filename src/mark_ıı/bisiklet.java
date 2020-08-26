package mark_ıı;

import java.io.IOException;


public class bisiklet extends kara_tasit{
    
    
    
    public bisiklet() throws IOException{
        super();
        
    }

    public bisiklet(boolean yakit_turu, int tekerlek_sayisi, String marka, int hiz, int yolcu_sayisi, int fiyat, String renk, int uretim) throws IOException {
        super(yakit_turu, tekerlek_sayisi, marka, hiz, yolcu_sayisi, fiyat, renk, uretim);
        
    }

    @Override
    public void setYakit_turu(boolean yakit_turu) {
         if(!yakit_turu){
             super.setYakit_turu(yakit_turu);
         }
    }
    
    
    
    
}
