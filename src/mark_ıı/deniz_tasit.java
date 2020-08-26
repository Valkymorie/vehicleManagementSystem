package mark_ıı;

import java.io.IOException;
import mark_ıı.arac;


public class deniz_tasit extends arac{
    private static long deniz_tasit_ID=0;
    
    public deniz_tasit() throws IOException{
        super();
        deniz_tasit_ID++;
    }

    public deniz_tasit(String marka, int hiz, int yolcu_sayisi, int fiyat, String renk, int uretim) throws IOException {
        super(marka, hiz, yolcu_sayisi, fiyat, renk, uretim);
        deniz_tasit_ID++;
    }

    public static long getDeniz_tasit_ID() {
        return deniz_tasit_ID;
    }

    public static void setDeniz_tasit_ID(long deniz_tasit_ID) {
        deniz_tasit.deniz_tasit_ID = deniz_tasit_ID;
    }

    @Override
    public void ivme() {
        System.out.println(" ");
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
