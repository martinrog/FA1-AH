
public abstract class Betaling implements Aankoop {


    private final String naam;

    public Betaling(String naam) {
        this.naam = naam;
    }

    @Override
    public String toString() {
        return "Betaalmethode : " +getType()+'\n'+
                "naam klant='" + naam + '\n';
    }

    @Override
    public String pay(double euros) {

        return "Payed " + euros + " euros using " + toString() ;
    }

    protected abstract String getType();

}
