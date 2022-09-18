public class Masa extends Mobilya implements Dortgen{

    double derinlik;
    double genislik;

    public Masa(String aciklama, double derinlik,double genislik,double yukseklik, boolean kapaliMi) {
        super(aciklama, yukseklik, kapaliMi);
        setDerinlik(derinlik);
        setGenislik(genislik);
    }

    public Masa() {
    }

    @Override
    public void setGenislik(double genislik) {
        if (genislik>0) this.genislik=genislik;
    }

    @Override
    public double getGenislik() {
        return genislik;
    }

    @Override
    public void setDerinlik(double derinlik) {
            if (derinlik>0)this.derinlik=derinlik;
    }

    @Override
    public double getDerinlik() {
        return derinlik;
    }

    @Override
    public double alanHesapla() {
        if (kapaliMi==false){
            return genislik*derinlik;
        }else{
            return 6*genislik*derinlik;
        }

    }

    @Override
    public double hacimHesapla() {
        return genislik*derinlik*yukseklik;
    }
}
