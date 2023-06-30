public class Program {
    public static void main(String[] args) {
        VendingMachine mart = new VendingMachine();
        mart.addProduct(new WhiteBread("Батон", 35, 10))
                .addProduct(new BlackBread("Бородинский", 35, 10))
                .addProduct(new Milk("Простоквашино", 50, 2))
                .addProduct(new Product("Liebendorf", 100.2, 5))
                .addProduct(new ConcentrateMilk("Алексеевское", 150, 1))
                .addProduct(new Chocolate("Аленка", 35.20,3, "Ореховый"));

        System.out.println("До продажи");
        System.out.println(mart);
        PrintSell(mart,"Батон");
        System.out.println();
        System.out.println("После продажи");
        System.out.println(mart);
    }

    public static void PrintSell (VendingMachine machine, String nameProd){
        try{
            System.out.println(machine.sell(nameProd));
        } catch (Exception e) {
            System.out.println("Товар не найден");
        }
    }
}
