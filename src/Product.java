public class Product {

    private String productNaam;
    private double productPrijs;
    private int artikelNummer;

    public Product(String name ,double price , int id) {
        this.productNaam = name;
        this.productPrijs = price;
        this.artikelNummer = id;
    }

    public double getProductPrijs() {
        return productPrijs;}

    public void setArtikelNummer(int artikelNummer) {
            this.artikelNummer = artikelNummer;
        }



    public void setProductNaam(java.lang.String productNaam) {
        this.productNaam = productNaam;
    }

    public void setProductPrijs(double productPrijs) {
        this.productPrijs = productPrijs;
    }
    public String getProductNaam() {
        return productNaam;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Product{" +
                "productNaam=" + productNaam +
                ", productPrijs=" + productPrijs +
                ", artikelNummer=" + artikelNummer +
                '}';
    }

}
