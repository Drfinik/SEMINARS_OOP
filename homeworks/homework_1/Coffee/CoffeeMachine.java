package Coffee;
import java.util.ArrayList;
import java.util.List;

public class CoffeeMachine {
    private List<Drink> drinks = new ArrayList<>();
    private double money = 0;

    public CoffeeMachine addDrink(Drink drink) {
        drinks.add(drink);
        return this;
    }

    public Drink searchDrink(String name) {
        for (Drink item : drinks) {
            if (item.getName().equals(name)) {
                return item;
            }
        }
        return null;
    }

    public Drink sell(String name)throws Exception {
        Drink target = searchDrink(name);
        try {
            drinks.remove(target);
            this.money += target.getPrice();
            System.out.println();
            System.out.printf("Вы купили кофе %s", target.getName());
            System.out.println();
            System.out.printf("Осторожно, температура напитка - %d", target.getTemperature());
            System.out.println();
        } catch (NullPointerException e) {
            throw new Exception("Товар не найден", e);
        }

        return target;
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        for (Drink item : drinks) {
            res.append(item);
            res.append(System.lineSeparator());
        }
        res.append(String.format("В автомате сейчас %.2f рублей", money));
        return res.toString();
    }
}