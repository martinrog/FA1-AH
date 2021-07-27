public class Order {

    private int orderNummer;
    private String productenLijst;
    private double totaalPrijs;


    public void setOrderNummer(int orderNummer) {
        this.orderNummer = orderNummer;
    }

    public void setProductenLijst(String productenLijst) {
        this.productenLijst = productenLijst;
    }

    public void toString2(){
        System.out.println("ordernummer = "+ orderNummer);
        System.out.println("productenlijst = "+ productenLijst);
        System.out.println("totaalprijs = "+ totaalPrijs+ "\n");
    }
}
