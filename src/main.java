public class main {

    public static void main (String[] args) {

        System.out.println("Nieuwe klant(en):");
        Klant customer1 = new Klant();
        customer1.setNaam("Martin");
        customer1.setAdres("Hoornse Hop 9");
        customer1.setOrderNummer(1234567890);
        customer1.toString1();


        System.out.println("Nieuwe werknemer(s):");
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

    }
}
