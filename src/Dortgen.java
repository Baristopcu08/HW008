public interface Dortgen {

    void setGenislik(double genislik);
    double getGenislik();
    void setDerinlik(double derinlik);
    double getDerinlik();
    double alanHesapla();
    double hacimHesapla();


    /*void setGenislik(double genislik);
		double getGenislik();
		void setDerinlik(double derinlik);
		double getDerinlik();
		double alanHesapla();	: Eğer kapaliMi false ise (genislik x derinlik) değilse (6 x genislik x derinlik)
		double hacimHesapla();	: genislik x derinlik x yukseklik
		*/
}
