package Yolcu360;




public class Arac_Talebi {
    public void AracTalebi(){


    }

    private String alinacakSehir;
    // Ankara


    private String alinacakGun;
    // Pazartesi

    private double alisSaati;
    // 17.31

    private String teslimGunu;
    // Pazar

    private double teslimSaati;
    // 15.30

    private String marka;
    // Tesla

    private String model;
    // Plaid

    private String yakitTipi;
    // Electric

    private String vites;
    // Otomatik

    private double gunlukUcret;
    // 1,200 TL


    public void AracTalebi(String Angara, String Pazartesi, double alisSaati, String Pazar, double teslimSaati) {
        this.alinacakSehir = Angara;
        this.alinacakGun = Pazartesi;
        this.alisSaati = 17.31;
        this.teslimGunu = Pazar;
        this.teslimSaati = 15.30;
    }

    public void AracTalebi(String Tesla, String Plaid, String Electric, String Otomatik,  String gunlukUcret ) {
        this.marka = Tesla;
        this.model = Plaid;
        this.yakitTipi = Electric;
        this.vites = Otomatik;
        this.gunlukUcret = 1200;

    }

    @Override
    public String toString() {
        return "AracTalebi{" +
                "marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                ", yakitTipi='" + yakitTipi + '\'' +
                ", vites='" + vites + '\'' +
                ", gunlukUcret=" + gunlukUcret +
                '}';
    }

    public String getMarka() {

        return marka;
    }

    public void setMarka(String Tesla) {
        this.marka = Tesla;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String Plaid) {
        this.model = Plaid;
    }

    public String getYakitTipi() {
        return yakitTipi;
    }

    public void setYakitTipi(String Electric) {

        this.yakitTipi = Electric;
    }

    public String getVites() {

        return vites;
    }


    public void setVites(String Otomatik) {

        this.vites = Otomatik;
    }

    public double getGunlukUcret() {

        return gunlukUcret;
    }

    public void setGunlukUcret(double gunlukUcret) {

        this.gunlukUcret = 1200;
    }

    public String getAlinacakSehir() {
        return alinacakSehir;
    }

    public void setAlinacakSehir(String Angara) {
        this.alinacakSehir = Angara;
    }

    public String getAlinacakGun() {
        return alinacakGun;
    }

    public void setAlinacakGun(String Pazartesi) {
        this.alinacakGun = Pazartesi;
    }

    public double alisSaati() {
        return alisSaati;
    }

    public void setAlisSaati(double alisSaati) {
        this.alisSaati = 17.31;
    }

    public String getTeslimGunu() {
        return teslimGunu;
    }

    public void setTeslimGunu(String Pazar) {
        this.teslimGunu = Pazar;
    }

    public double getTeslimSaati() {
        return teslimSaati;
    }

    public void setTeslimSaati(double teslimSaati) {
        this.teslimSaati = 15.30;
    }



}
