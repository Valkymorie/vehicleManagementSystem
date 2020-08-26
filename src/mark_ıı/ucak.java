
package mark_ıı;

import java.io.IOException;
import mark_ıı.arac;


public class ucak extends arac implements hava_tasit{

        private static long ucak_ID=0;
        private static long hava_tasit_ID=0;
        
    @Override
    public void ivme() {
        System.out.println(" ");
    }

    public ucak() throws IOException {
        super();
        ucak_ID++;
        hava_tasit_ID++;
    }

    public ucak(String marka, int hiz, int yolcu_sayisi, int fiyat, String renk, int uretim) throws IOException {
        super(marka, hiz, yolcu_sayisi, fiyat, renk, uretim);
        ucak_ID++;
        hava_tasit_ID++;
    }

    public static long getUcak_ID() {
        return ucak_ID;
    }

    public static void setUcak_ID(long ucak_ID) {
        ucak.ucak_ID = ucak_ID;
    }

    public static long getHava_tasit_ID() {
        return hava_tasit_ID;
    }

    public static void setHava_tasit_ID(long hava_tasit_ID) {
        ucak.hava_tasit_ID = hava_tasit_ID;
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
