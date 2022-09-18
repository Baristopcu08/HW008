public class YuvarlakMasa extends Mobilya implements Daire{

    private double yaricap;

    public YuvarlakMasa() {
    }

    public YuvarlakMasa(String aciklama, double yaricap, double yukseklik, boolean kapaliMi) {
        super(aciklama, yukseklik, kapaliMi);
        setYaricap(yaricap);
    }

    @Override
    public void setYaricap(double yaricap) {
        if (yaricap>0)this.yaricap=yaricap;
    }

    @Override
    public double getYaricap() {
        return yaricap;
    }

    @Override
    public double alanHesapla() {
        if (kapaliMi==false){
            return Math.PI*yaricap*yaricap;
        }else{
            return 2*Math.PI*yaricap*yaricap+2*Math.PI*yaricap*yukseklik;
        }

    }

    @Override
    public double hacimHesapla() {
        return Math.PI*yaricap*yaricap*yukseklik;
    }
    @Override
    public String toString() {
        return String.format("%s  ( %5.2f x %5.2f )",super.toString(),yaricap,yukseklik);
    }
}
