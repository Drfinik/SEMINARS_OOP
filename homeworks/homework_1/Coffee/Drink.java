package Coffee;

public class Drink{
    private String name;
    private int value;
    private int temperature;
    private double price;

    public Drink(String name, int value, int temperature, double price){
        this.name = name;
        this.temperature = temperature;
        this.price = price;
        this.value = value;
    }
    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getValue(){
        return value;
    }

    public void setValue(int value){
        this.value = value;
    }

    public int getTemperature(){
        return temperature;
    }

    private void setTemperature(int temperature){
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        return String.format("%s Цена %.2f Объем %d", name, price, value);
    }


}