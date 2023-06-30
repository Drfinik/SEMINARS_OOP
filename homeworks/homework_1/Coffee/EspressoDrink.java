package Coffee;

public class EspressoDrink extends Drink {

    public EspressoDrink(String name, int value, int temperature, double price){
        super(name, value, temperature, price);
    }

    @Override
    public String toString() {
        return String.format("Эспрессо %s",super.toString());
    }
}
