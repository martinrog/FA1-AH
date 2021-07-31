public class main {

    public static void main (String[] args) {


        //new customers
        System.out.println("Nieuwe klant(en):");
        Klant customer1 = new Klant();
        customer1.setNaam("Martin");
        customer1.setAdres("Hoornse Hop 9");
        customer1.setOrderNummer(1234567890);
        customer1.toString1();

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
        Product product1 = new Product();
        product1.setProductNaam("Melk");
        product1.setProductPrijs(0.99);
        product1.setArtikelNummer(122343);

        Product product2 = new Product();
        product2.setProductNaam("Boter");
        product2.setProductPrijs(1.20);
        product2.setArtikelNummer(762308);

        Product product3 = new Product();
        product3.setProductNaam("Brood");
        product3.setProductPrijs(1.10);
        product3.setArtikelNummer(872527);

        Product product4 = new Product();
        product4.setProductNaam("Kaas");
        product4.setProductPrijs(2.30);
        product4.setArtikelNummer(827550);

        Product product5 = new Product();
        product5.setProductNaam("Kropsla");
        product5.setProductPrijs(0.90);
        product5.setArtikelNummer(989361);

        Product product6 = new Product();
        product6.setProductNaam("Komkommer");
        product6.setProductPrijs(0.65);
        product6.setArtikelNummer(649274);

        Product product7 = new Product();
        product7.setProductNaam("Tomaat");
        product7.setProductPrijs(0.15);
        product7.setArtikelNummer(345628);

        Product product8 = new Product();
        product8.setProductNaam("Aardappels");
        product8.setProductPrijs(2.75);
        product8.setArtikelNummer(955192);

        Product product9 = new Product();
        product9.setProductNaam("Watermeloen");
        product9.setProductPrijs(1.55);
        product9.setArtikelNummer(865841);

        Product product10 = new Product();
        product10.setProductNaam("Pruimen");
        product10.setProductPrijs(2.15);
        product10.setArtikelNummer(965813);

        private ArrayList<Product>  product_list = new ArrayList<Product>();

        product_list.add(product1);
        product_list.add(product5);
        product_list.add(product8);
        product_list.add(product9);



    }
}
