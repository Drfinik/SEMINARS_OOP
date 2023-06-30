public class Bread extends Product {
    public Bread(String name, double price, int value){
        super(name, price, value);
    }
    @Override
    public String toString() {
        return String.format("Хлеб : %s" ,super.toString());
    }
}
