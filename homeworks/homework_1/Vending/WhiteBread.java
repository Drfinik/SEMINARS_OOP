public class WhiteBread extends Bread {
    public WhiteBread(String name, double price, int value){
        super(name, price, value);
    }
    @Override
    public String toString() {
        return String.format("Белый хлеб : %s" ,super.toString());
    }
}
