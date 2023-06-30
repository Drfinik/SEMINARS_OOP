package Coffee;

public class LatteDrink extends Drink {
    private String syrup;
    public LatteDrink(String name, int value, int temperature, double price, String syrup){
        super(name, value, temperature, price);
        this.syrup = syrup;
    }

    @Override
    public String toString() {
        return String.format("Латте с сиропом %s %s",syrup,super.toString());
    }
    
}
