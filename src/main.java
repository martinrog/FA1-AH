import java.util.ArrayList;

public class main {

    public static void main (String[] args) {


        //new customers
        System.out.println("Nieuwe klant(en):");
        Klant customer1 = new Klant();
        customer1.setNaam("Martin");
        customer1.setAdres("Hoornse Hop 9");
        customer1.setOrderNummer(1234567890);
        customer1.toString();

        //input new employees
        System.out.println("\nWerknemer(s) Albert Heijn:");
        Werknemer werknemer123 = new Werknemer();
        werknemer123.setWerknemerNaam("Karel de Goede");
        werknemer123.setWerknemerAdres("Appelgaarde 3, Utrecht");
        werknemer123.setWerknemerTelefoonnummer(76893462);
        System.out.println(werknemer123.getWerknemerNaam());

        Werknemer werknemer654 = new Werknemer();
        werknemer654.setWerknemerNaam("Pieter de Lange");
        werknemer654.setWerknemerAdres("Lange voorhout 16, Deventer");
        werknemer654.setWerknemerTelefoonnummer(7954624);
        System.out.println(werknemer654.getWerknemerNaam());

        // The Albert Heijn has two suppliers
        Leverancier leverancier1 = new Leverancier();
        leverancier1.setLeverancierNaam("distributiecentrum Veghel");
        leverancier1.setLeverancierAdres("Dijkhof 1, Veghel");

        Leverancier leverancier2 = new Leverancier();
        leverancier2.setLeverancierNaam("Sligro");
        leverancier2.setLeverancierAdres("Liguster 2, Den Haag");

        // Productenlijst
        Product product1 = new Product("Melk",0.99,122343);
        Product product2 = new Product("Boter",1.20,762308);
        Product product3 = new Product("Brood",1.10,872527);
        Product product4 = new Product("Kaas",2.30,827550);
        Product product5 = new Product("Kropsla",0.90,989361);
        Product product6 = new Product("Komkommer",0.65,649274);
        Product product7 = new Product("Tomaat",0.15,345628);
        Product product8 = new Product("Aardappels",2.75,955192);
        Product product9 = new Product("Watermeloen",1.55,865841);
        Product product10 = new Product("Pruimen",2.15,965813);


        ArrayList<Product> product_list = new ArrayList<Product>();

        //Gekozen producten
        product_list.add(product1);
        product_list.add(product5);
        product_list.add(product8);
        product_list.add(product9);



    }
}
