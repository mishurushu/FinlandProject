package week4;

public class MainForExercises {
    public static void main(String[] args) {
        Product banana = new Product("Banana",14.22,100);
        banana.printProduct(banana);

        Multiplier threeMultiplier = new Multiplier(3);
        System.out.println("threeMultiplier.multiply(2): " + threeMultiplier.multiply(2));

        Multiplier fourMultiplier = new Multiplier(4);
        System.out.println("fourMultiplier.multiply(2): " + fourMultiplier.multiply(2));

        DecreasingCounter counter = new DecreasingCounter(10);

        counter.printValue();

        counter.decrease();
        counter.printValue();

        counter.decrease();
        counter.printValue();


        DecreasingCounter counter1 = new DecreasingCounter(100);

        counter1.printValue();

        counter1.reset();
        counter1.printValue();

        counter1.decrease();
        counter1.printValue();


        Menu menu = new Menu();
        menu.addMeal("Hamburger");
        menu.addMeal("Gyros");
        menu.addMeal("Pizza");
        menu.addMeal("Hamburger");
        menu.printMeals();
        menu.clearMenu();
        menu.printMeals();

    }
}
