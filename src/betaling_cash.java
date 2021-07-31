public class betaling_cash extends Betaling  {

    public betaling_cash(String naam) {
        super(naam);
    }

    protected String getType() {
        return "cash";
    }

}
