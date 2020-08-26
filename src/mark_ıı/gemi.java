
package mark_ıı;

import java.io.IOException;
import mark_ıı.arac;


public class gemi extends deniz_tasit{
    
    private static long gemi_ID=0;
    
    public gemi() throws IOException{
        super();
        gemi_ID++;    
    }

    public gemi(String marka, int hiz, int yolcu_sayisi, int fiyat, String renk, int uretim) throws IOException {
        super(marka, hiz, yolcu_sayisi, fiyat, renk, uretim);
        gemi_ID++;
    }

    @Override
    public void ivme() {
        System.out.println(" ");
    }

    public static long getGemi_ID() {
        return gemi_ID;
    }

    public static void setGemi_ID(long gemi_ID) {
        gemi.gemi_ID = gemi_ID;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public int getHiz() {
        return hiz;
    }

    public void setHiz(int hiz) {
        this.hiz = hiz;
    }

    public int getYolcu_sayisi() {
        return yolcu_sayisi;
    }

    public void setYolcu_sayisi(int yolcu_sayisi) {
        this.yolcu_sayisi = yolcu_sayisi;
    }

    public int getFiyat() {
        return fiyat;
    }

    public void setFiyat(int fiyat) {
        this.fiyat = fiyat;
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public int getUretim() {
        return uretim;
    }

    public void setUretim(int uretim) {
        this.uretim = uretim;
    }

    public static long getArac_ID() {
        return arac_ID;
    }

    public static void setArac_ID(long arac_ID) {
        arac.arac_ID = arac_ID;
    }
    
}
