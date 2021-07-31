public class betaling_pin extends Betaling  {

    public betaling_pin(String naam) {
        super(naam);
    }


    protected String getType() {
        return "Pin";
    }
}
