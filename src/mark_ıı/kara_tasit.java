package mark_ıı;

import java.io.IOException;
import mark_ıı.arac;


public class kara_tasit extends arac{
    private boolean yakit_turu;
    private int tekerlek_sayisi;
    private static long kara_tasit_ID = 0;
    
    public kara_tasit() throws IOException{
        super();
        kara_tasit_ID++;
    }

    public kara_tasit(boolean yakit_turu, int tekerlek_sayisi, String marka, int hiz, int yolcu_sayisi, int fiyat, String renk, int uretim) throws IOException {
        super(marka, hiz, yolcu_sayisi, fiyat, renk, uretim);
        this.yakit_turu = yakit_turu;
        this.tekerlek_sayisi = tekerlek_sayisi;
        kara_tasit_ID++;
      
    }
    
    @Override
    public void ivme() {
        System.out.println("");
    }

    public boolean isYakit_turu() {
        return yakit_turu;
    }

    public void setYakit_turu(boolean yakit_turu) {
        this.yakit_turu = yakit_turu;
    }

    public int getTekerlek_sayisi() {
        return tekerlek_sayisi;
    }

    public void setTekerlek_sayisi(int tekerlek_sayisi) {
        this.tekerlek_sayisi = tekerlek_sayisi;
    }

    public long getKara_tasit_ID() {
        return kara_tasit_ID;
    }

    public void setKara_tasit_ID(long kara_tasit_ID) {
        kara_tasit.kara_tasit_ID = kara_tasit_ID;
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
