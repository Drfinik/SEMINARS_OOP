package Coffee;

public class AmerikanoDrink extends Drink {
    private String strength;
    public AmerikanoDrink(String name, int value, int temperature, double price, String strenght){
        super(name, value, temperature, price);
        this.strength = strenght;
    }

    @Override
    public String toString() {
        return String.format("Американо крепости %s %s",strength,super.toString());
    }
    
}
