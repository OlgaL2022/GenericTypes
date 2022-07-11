import drinks.Coffee;
import drinks.Tea;
import holders.Cup;

public class Main {
    public static void main(String[] args) {

        Tea greenTea = new Tea();
        Tea purpleTea = new Tea();
        Tea redTea = new Tea();

        Cup<Tea> teeCup = new Cup<>(greenTea);
        Cup<Tea> teeCup2 = new Cup<>(purpleTea);
        Cup<Tea> teeCup3 = new Cup<>(redTea);

        teeCup.takeASip();
        teeCup2.takeASip();
        teeCup3.takeASip();


        Coffee  greenCoffee = new Coffee(3.5d, 56.4d, 2.2);
        Coffee  purpleCoffee = new Coffee (4.5d, 23.4d, 64);
        Coffee  redCoffee  = new Coffee (45.5d, 4.4d, 50);

        Cup<Coffee> coffeeCup1 = new Cup<>(greenCoffee);
        Cup<Coffee> coffeeCup2 = new Cup<>(purpleCoffee);
        Cup<Coffee> coffeeCup3 = new Cup<>(redCoffee);

        coffeeCup1.takeASip();
        coffeeCup2.takeASip();
        coffeeCup3.takeASip();

    }
}
