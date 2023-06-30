package Coffee;

public class CappucinoDrink extends Drink {
    public CappucinoDrink(String name, int value, int temperature, double price){
        super(name, value, temperature, price);
    }

    @Override
    public String toString() {
        return String.format("Капучино %s",super.toString());
    }
}
