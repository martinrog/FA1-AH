public class Klant {

    private String naam;
    private int orderNummer;
    private java.lang.String adres;

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public void setOrderNummer(int orderNummer) {
        this.orderNummer = orderNummer;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }


    public void toString1() {
        System.out.println("Naam = " + naam);
        System.out.println("Adres = " + adres);
        System.out.println("Ordernummer = " + orderNummer + "\n");
    }
}
