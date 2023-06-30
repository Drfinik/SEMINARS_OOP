package Coffee;

public class Program {
    public static void main(String[] args) {
        CoffeeMachine cm = new CoffeeMachine();
        cm.addDrink(new LatteDrink("Лавандовый Латте", 400, 60, 300, "Лаванда"))
        .addDrink(new EspressoDrink("Классический эспрессо", 60, 85, 200))
        .addDrink(new CappucinoDrink("Сладкий капучино", 300, 80, 250))
        .addDrink(new AmerikanoDrink("Крепкий американо", 300, 80, 250, "Крепкий"));

        System.out.println("До продажи");
        System.out.println(cm);
        try {
            cm.sell("Лавандовый Латте");
        } catch (Exception e) {
            System.out.println("Такой кофе не найден");
        }
        System.out.println();
        System.out.println("После продажи");
        System.out.println(cm);
    }
}
