public class MainApp {
    public static void main(String[] args) {

        Mobilya mobilya1=new Masa("Ahşap Masa",120,60,70,false);
        System.out.println(mobilya1);
        Masa masa1=((Masa)mobilya1);
        System.out.printf("%s alanı: %5.2f \n",masa1,masa1.alanHesapla());
        System.out.printf("%s hacmi: %5.2f \n",masa1,masa1.hacimHesapla());
        Daire daire1=new YuvarlakSehpa("Beyaz Sehpa",40,40,false);
        System.out.println(daire1);
        System.out.printf("%s alanı: %5.2f \n",daire1,daire1.alanHesapla());


        //Doğru çalışıyor mu? Neden?  Dortgen[] mobilyalar=new Dortgen[]{new Sehpa(),new Masa(), new YuvarlakSehpa()};


        /* EL CEVAP
             Kanımca doğru çalışmaz. Çünkü dörtgen ile implemente edilen mobilyalar nesne dizisi oluştururken
             içine daire implementi olan YuvarlakSehpa nesnesi yerleştirilmiş. YuvarlakSehpa, Dörtgen mobilyalardan değildir

        */
    }
}
