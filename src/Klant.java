public class Klant {

    private String naam;
    private int orderNummer;
    private java.lang.String adres;
    private Order order;
    private ArrayList<Product>  producten_lijst = new ArrayList<Product>();



    public void setNaam(String naam) {
        this.naam = naam;
    }

    public java.lang.String getNaam() {
        return naam;
    }

    public void setOrderNummer(int orderNummer) {
        this.orderNummer = orderNummer;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public static Aankoop betaling_keuze(String klant_naam, String betaalmethode ) {
        switch (betaalmethode) {
            case "pin":

                return new betaling_pin(klant_naam);
            case "cash":
                return new betaling_cash(klant_naam); }



        throw new IllegalArgumentException();



    }

    public String order(Aankoop method) {
        return method.betalen(order.gettotaalprice(producten_lijst));

    }


    @java.lang.Override
    public java.lang.String toString() {
        return "Klant{" +
                "naam=" + naam +
                ", orderNummer=" + orderNummer +
                ", adres='" + adres + '\'' +
                ", order=" + order +
                ", producten_lijst=" + producten_lijst +
                '}';
    }
}
