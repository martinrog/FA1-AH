import java.util.ArrayList;

public class Order {

    private ArrayList<Product>  product_list = new ArrayList<Product>();

    private ArrayList<Double> prices = new ArrayList<Double>();

    private int orderNummer;
    private Product product;
    private String productenLijst;
    private double totaalPrijs;


    public void setOrderNummer(int orderNummer) {
        this.orderNummer = orderNummer;
    }

    public void voeg_product_toe(Product product1) {

        product_list.add(product1);
    }






    public double gettotaalprice(ArrayList<Product> product_list1){
        ArrayList<Double> prices1 = prices;
        for (Product i : product_list1){
            if(i != null){
                double singel_price = i.getProductPrijs();
                prices1.add(singel_price);

            }


        }
        return prices1.stream().mapToDouble(f -> f.doubleValue()).sum();

    }
    public double getTotaalprice() {
        return totaalprice;
    }

    public void toString2(){
        System.out.println("ordernummer = "+ orderNummer);
        System.out.println("productenlijst = "+ productenLijst);
        System.out.println("totaalprijs = "+ totaalPrijs+ "\n");
    }

}
