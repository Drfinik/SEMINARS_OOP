public class BlackBread extends Bread{
    public BlackBread(String name, double price, int value){
        super(name, price, value);
    }
    @Override
    public String toString() {
        return String.format("Черный хлеб : %s" ,super.toString());
    }
    
}
